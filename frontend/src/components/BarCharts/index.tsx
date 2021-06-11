import { useState } from 'react'
import Chart from 'react-apexcharts'

type SeriesData = [
    name: string,
    data: number[]
]

type ChartData = {
    labels: {
        categories: string[]
    },
    series: SeriesData[]
}

const BarCharts = () => {

    const [ chartData, setChartData ] = useState<ChartData>({
        labels: {
            categories: []
        }
    })

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    
    const mockData = {
        labels: {
            categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
        },
        series: [
            {
                name: "% Sucesso",
                data: [43.6, 67.1, 67.7, 45.6, 71.1]                   
            }
        ]
    };

    return (
        <Chart 
            options={{...options, xaxis: mockData.labels}}
            series={mockData.series}
            type="bar"
            height="240"
        />
    )
}

export default BarCharts