/**
 * ---------------------------------------
 * This demo was created using amCharts 4.
 *
 * For more information visit:
 * https://www.amcharts.com/
 * ---------------------------------------
 */
am4core.useTheme(am4themes_animated)

var nofizzbuzz = { name: "nofizzbuzz", children: [] }
var fizz = { name: "fizz", children: [] }
var buzz = { name: "buzz", children: [] }
var fizzbuzz = { name: "fizz\nbuzz", children: [] }
var data = [{name:"fizzbuzz\nchallenge", value:100, children:[nofizzbuzz, fizz, buzz, fizzbuzz]}];

for (var i = 1; i < 101; i++) {
    let item = { name: i, value: 1 }
    if (i % 15 == 0)
        fizzbuzz.children.push(item);
    else if (i % 3 == 0)
        fizz.children.push(item);
    else if (i % 5 == 0)
        buzz.children.push(item);
    else
        nofizzbuzz.children.push(item);
}

var chart = am4core.create("chartdiv", am4plugins_forceDirected.ForceDirectedTree);
var series = chart.series.push(new am4plugins_forceDirected.ForceDirectedSeries())
series.dataFields.value = "value";
series.dataFields.name = "name";
series.dataFields.children = "children";

series.links.template.distance = 2;
series.minRadius = am4core.percent(0.8);
series.nodes.template.label.text = "{name}";
series.nodes.template.label.fontSize = 9;

chart.data = data;