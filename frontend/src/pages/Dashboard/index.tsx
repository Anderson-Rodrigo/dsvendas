import BarCharts from "components/BarCharts";
import DataTable from "components/DataTable";
import DonutsChart from "components/DonutsChart";
import NavBar from "components/NavBar";
import Footer from "components/Footer";

const Dashboard = () => {
    return (
        <>
        <NavBar/>
          <div className="container">
            <h1 className="text-primary py-3">Dashboard de Vendas</h1>
            <div className="row px-3">
              <div className="col-sm-6">
                <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
                <BarCharts />
              </div>
              <div className="col-sm-6">
                <h5 className="text-center text-secondary">Todas vendas</h5>
                <DonutsChart />
              </div>
            </div>
            <div className="py-3">
              <h2 className="text-primary">Todas vendas</h2>
            </div>
            <DataTable />
          </div>
        <Footer />
      </>
    );
  }
  
  export default Dashboard;