import axios from "axios";
import Pagination from "components/Pagination";
import { useEffect } from "react";
import { useState } from "react";
import { SalePage } from "types/sale";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

const DataTable = () => {

    const [active, setActivePage] = useState(0)
    const [page, setPage] = useState<SalePage>({
        first: true,
        number: 0,
        last: true,
        totalElements: 0,
        totalPages: 0
    })

    useEffect(() => {
        axios.get(`${BASE_URL}/sale?page=${active}&size=10&sort=date,desc`)
            .then(response => {
                setPage(response.data)
            })
    }, [active])

    const changePage = (index: number) => {
        setActivePage(index)
    }

    return (
        <>
            <Pagination 
                page={page} 
                onPageChange={changePage}
            />
            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Data</th>
                            <th>Vendedor</th>
                            <th>Clientes visitados</th>
                            <th>Negócios fechados</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item =>(
                            <tr key={item.id}>
                            <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                            <td>{item.sellerDto.name}</td>
                            <td>{item.visited}</td>
                            <td>{item.deals}</td>
                            <td>{item.amount.toFixed(2)}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    )
}

export default DataTable;