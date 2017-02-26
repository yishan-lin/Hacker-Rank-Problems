import java.util.*;

public class stockdataparsing {
	
	static void stockparse(String[] stock) {
		
		for (int x = stock.length-1; x >= 0; x--) {
		
			String[] stocksplit = stock[x].trim().split(",");
			System.out.println(stocksplit[6]);
			
		}
			
	}
		

	public static void main(String[] args) {
		
		String[] KELLOG = {"2017-01-03,73.709999,73.730003,71.050003,72.709999,1618600,72.709999",
				"2016-12-01,71.610001,74.489998,70.739998,73.709999,1506800,73.709999",
				"2016-11-01,75.620003,78.370003,71.830002,72.00,1766000,72.00",
				"2016-10-03,77.209999,77.419998,73.660004,75.129997,1881400,74.601273",
				"2016-09-01,81.879997,82.779999,76.900002,77.470001,1694500,76.924812",
				"2016-08-01,82.620003,84.279999,80.57,82.209999,1684500,81.631447",
				"2016-07-01,81.440002,87.160004,80.639999,82.709999,3366300,81.614075",
				"2016-06-01,74.400002,82.57,74.260002,81.650002,2805100,80.568123",
				"2016-05-02,77.00,77.940002,73.699997,74.370003,2342300,73.384583",
				"2016-04-01,75.709999,78.099998,74.720001,76.809998,1670500,75.289185",
				"2016-03-01,74.559998,77.050003,73.110001,76.550003,1855200,75.034332",
				"2016-02-01,73.32,76.239998,70.330002,74.019997,2735800,72.55442",
				"2016-01-04,71.589996,73.889999,68.730003,73.440002,2035300,71.505424",
				"2015-12-01,69.389999,73.68,68.199997,72.269997,1734500,70.366241",
				"2015-11-02,70.720001,70.860001,64.650002,68.769997,2491300,66.958435",
				"2015-10-01,66.260002,72.339996,65.029999,70.519997,1785900,68.166084",
				"2015-09-01,65.309998,69.589996,65.00,66.550003,1997700,64.328606",
				"2015-08-03,65.93,69.849998,63.52,66.279999,2249000,64.067612",
				"2015-07-01,62.700001,66.459999,61.990002,66.169998,1189000,63.486515",
				"2015-06-01,62.599998,63.880001,61.130001,62.700001,1861200,60.157238",
				"2015-05-01,63.419998,65.639999,62.240002,62.77,1782100,60.2244",
				"2015-04-01,65.690002,67.00,63.029999,63.330002,1767800,60.290894",
				"2015-03-02,64.370003,66.379997,61.529999,65.949997,2764300,62.785156",
				"2015-02-02,65.650002,67.32,61.82,64.480003,2234400,60.921238",
				"2015-01-02,65.629997,69.889999,64.139999,65.580002,2147600,61.960526",
				"2014-12-01,65.849998,67.440002,63.669998,65.440002,1710000,61.828255",
				"2014-11-03,63.639999,66.639999,63.099998,66.25,1792700,62.593548",
				"2014-10-01,60.50,64.82,58.830002,63.959999,2053600,59.975365",
				"2014-09-02,64.93,65.379997,60.540001,61.599998,1814800,57.76239",
				"2014-08-01,59.66,65.379997,59.650002,64.970001,1884600,60.922447",
				"2014-07-01,65.480003,66.730003,59.779999,59.830002,2185300,55.681545",
				"2014-06-02,69.00,69.50,64.470001,65.699997,1792200,61.144531",
				"2014-05-01,66.940002,69.00,64.800003,68.980003,2094500,64.197113",
				"2014-04-01,62.470001,67.489998,62.310001,66.830002,2846000,61.775574",
				"2014-03-03,60.34,62.75,60.099998,62.709999,1759200,57.967171",
				"2014-02-03,58.009998,61.259998,55.689999,60.689999,2683600,55.674591",
				"2014-01-02,60.98,61.360001,57.509998,57.98,1902500,53.188545",
				"2013-12-02,60.639999,62.310001,59.580002,61.07,1656600,56.02319",
				"2013-11-01,63.16,64.919998,60.59,60.639999,2298500,55.628723",
				"2013-10-01,58.52,64.400002,58.009998,63.25,1811300,57.590664",
				"2013-09-03,61.240002,61.43,58.59,58.73,1908100,53.475094",
				"2013-08-01,65.940002,66.239998,60.279999,60.709999,1905600,55.277931",
				"2013-07-01,64.029999,67.980003,64.029999,66.239998,1385300,59.858902",
				"2013-06-03,61.970001,65.120003,61.029999,64.230003,2027900,58.042538",
				"2013-05-01,64.82,66.480003,62.049999,62.049999,2085200,56.07254",
				"2013-04-01,64.089996,66.839996,63.189999,65.040001,1628900,58.367954",
				"2013-03-01,60.310001,64.75,60.049999,64.43,1557100,57.82053",
				"2013-02-01,58.849998,60.790001,58.00,60.50,2107200,54.293682",
				"2013-01-02,56.330002,58.900002,56.040001,58.50,1366400,52.116974",
				"2012-12-03,55.57,57.209999,54.529999,55.849998,1572700,49.756119",
				"2012-11-01,52.720001,55.880001,52.16,55.459999,2560000,49.408672",
				"2012-10-01,51.490002,53.060001,51.27,52.32,1568600,46.243607",
				"2012-09-04,50.810001,52.150002,49.919998,51.66,1938900,45.660259",
				"2012-08-01,47.77,51.91,47.509998,50.650002,2076600,44.767563",
				"2012-07-02,49.16,49.889999,46.330002,47.700001,2180700,41.799408",
				"2012-06-01,48.50,49.759998,47.880001,49.330002,1628800,43.227772",
				"2012-05-01,50.57,51.16,48.779999,48.779999,2026700,42.745808",
				"2012-04-02,53.439999,54.200001,50.049999,50.57,2344800,43.936901",
				"2012-03-01,52.450001,53.860001,51.639999,53.630001,1543100,46.595535",
				"2012-02-01,49.599998,53.450001,49.27,52.349998,3043600,45.483425",
				"2012-01-31,49.529999,49.700001,49.290001,49.52,4534600,42.6749"};
		
		String[] AAPL = {"2017-01-03,115.800003,122.440002,114.760002,121.349998,30607400,120.826149",
				"2016-12-01,110.370003,118.019997,108.25,115.82,30445600,115.320023",
				"2016-11-01,113.459999,113.769997,104.080002,110.519997,36072200,110.0429",
				"2016-10-03,112.709999,118.690002,112.279999,113.540001,33968200,112.472404",
				"2016-09-01,106.139999,116.18,102.529999,113.050003,47828300,111.987015",
				"2016-08-01,104.410004,110.230003,104.00,106.099998,28686500,105.102364",
				"2016-07-01,95.489998,104.550003,94.370003,104.209999,35675600,102.673927",
				"2016-06-01,99.019997,101.889999,91.50,95.599998,37040500,94.190842",
				"2016-05-02,93.970001,100.730003,89.470001,99.860001,44886900,98.388046",
				"2016-04-01,108.779999,112.389999,92.510002,93.739998,44806000,91.799339",
				"2016-03-01,97.650002,110.419998,97.419998,108.989998,35088000,106.73362",
				"2016-02-01,96.470001,98.889999,92.589996,96.690002,42303900,94.688271",
				"2016-01-04,102.610001,105.849998,92.389999,97.339996,70286300,94.810341",
				"2015-12-01,118.75,119.860001,104.82,105.260002,43734700,102.524529",
				"2015-11-02,120.800003,123.82,111.00,118.300003,39491000,115.225647",
				"2015-10-01,109.07,121.220001,107.309998,119.50,52804000,115.898346",
				"2015-09-01,110.150002,116.889999,107.360001,110.300003,60620000,106.975632",
				"2015-08-03,121.50,122.57,92.00,112.760002,79152700,109.361488",
				"2015-07-01,126.900002,132.970001,119.220001,121.300003,50017800,117.113991",
				"2015-06-01,130.279999,131.389999,124.480003,125.43,41949200,121.101463",
				"2015-05-01,126.099998,132.970001,123.360001,130.279999,50251800,125.784088",
				"2015-04-01,124.82,134.539993,123.099998,125.150002,51396700,120.328499",
				"2015-03-02,129.25,130.279999,121.629997,124.43,53669600,119.636238",
				"2015-02-02,118.050003,133.600006,116.080002,128.460007,63081500,123.510986",
				"2015-01-02,111.389999,120.00,104.629997,117.160004,69419400,112.203506",
				"2014-12-01,118.809998,119.25,106.260002,110.379997,50681700,105.710335",
				"2014-11-03,108.220001,119.75,107.720001,118.93,44485400,113.898628",
				"2014-10-01,100.589996,108.040001,95.18,108.00,61083400,102.984459",
				"2014-09-02,103.059998,103.739998,96.139999,100.75,75318200,96.071152",
				"2014-08-01,94.900002,102.900002,93.279999,102.50,46746200,97.739883",
				"2014-07-01,93.519997,99.440002,92.57,95.599998,49633100,90.709122",
				"2014-06-02,633.959961,651.26001,89.650002,92.93,59829300,88.17572",
				"2014-05-01,592.00,644.169983,580.330017,633.00,74996300,85.802269",
				"2014-04-01,537.76001,599.429993,511.329987,590.089966,82044000,79.541603",
				"2014-03-03,523.419983,549.00,522.809998,536.73999,61552000,72.35025",
				"2014-02-03,502.610016,551.190002,499.300018,526.23999,82267500,70.934898",
				"2014-01-02,555.679993,560.200012,493.549988,500.599976,109889900,67.077225",
				"2013-12-02,558.00,575.140015,538.799988,561.02002,86672400,75.173126",
				"2013-11-01,524.02002,558.330017,512.380005,556.069946,69291000,74.509857",
				"2013-10-01,478.449982,539.25,478.279999,522.699951,88189400,69.63195",
				"2013-09-03,493.099976,507.919983,447.220001,476.749969,111138700,63.510681",
				"2013-08-01,455.749969,513.73999,453.259979,487.220032,94666300,64.905457",
				"2013-07-01,402.690002,457.339966,401.220001,452.529968,77966700,59.888763",
				"2013-06-03,450.72998,454.429993,388.869995,396.529999,94963100,52.477612",
				"2013-05-01,444.459991,465.75,418.899994,449.730042,111725300,59.518211",
				"2013-04-01,441.899994,445.25,385.100006,442.779999,132443500,58.21312",
				"2013-03-01,438.00,469.949982,419.00,442.660004,120246400,58.197346",
				"2013-02-01,459.109985,484.940002,437.660004,441.400024,127191400,58.031689",
				"2013-01-02,553.820007,555.00,435.00,455.48999,160032800,59.537144",
				"2012-12-03,593.650024,594.590027,501.230011,532.169983,159903000,69.55999",
				"2012-11-01,598.219971,603.00,505.75,585.279968,158585300,76.502007",
				"2012-10-01,671.159973,676.75,587.700012,595.320007,150628900,77.460548",
				"2012-09-04,665.76001,705.070007,656.00,667.100037,128080400,86.800262",
				"2012-08-01,615.910034,680.869995,600.25,665.23999,93636100,86.558243",
				"2012-07-02,584.730042,619.869995,570.00,610.76001,111571100,79.129791",
				"2012-06-01,569.159973,590.00,548.50,584.00,98539600,75.662781",
				"2012-05-01,584.900024,596.76001,522.179993,577.730042,131795600,74.850441",
				"2012-04-02,601.830017,644.00,555.00,583.97998,201314100,75.660187",
				"2012-03-01,548.169983,621.450012,516.219971,599.549988,185402000,77.677429",
				"2012-02-01,458.410004,547.610046,453.980011,542.440002,154007000,70.27829",
				"2012-01-31,455.589966,458.240021,453.070007,456.47998,195841800,59.141342"};
		
		String[] sp500 = {"2017-01-03,2251.570068,2300.98999,2245.129883,2278.870117,3728531500,2278.870117",
				"2016-12-01,2200.169922,2277.530029,2187.439941,2238.830078,3710578000,2238.830078",
				"2016-11-01,2128.679932,2214.100098,2083.790039,2198.810059,4468273300,2198.810059",
				"2016-10-03,2164.330078,2169.600098,2114.719971,2126.149902,3672334700,2126.149902",
				"2016-09-01,2171.330078,2187.870117,2119.120117,2168.27002,3878265700,2168.27002",
				"2016-08-01,2173.149902,2193.810059,2147.580078,2170.949951,3451160800,2170.949951",
				"2016-07-01,2099.340088,2177.090088,2074.02002,2173.600098,3678454500,2173.600098",
				"2016-06-01,2093.939941,2120.550049,1991.680054,2098.860107,4157978100,2098.860107",
				"2016-05-02,2067.169922,2103.47998,2025.910034,2096.949951,3971333800,2096.949951",
				"2016-04-01,2056.620117,2111.050049,2033.800049,2065.300049,4087129000,2065.300049",
			"	2016-03-01,1937.089966,2072.209961,1937.089966,2059.73999,4379759000,2059.73999",
			"	2016-02-01,1936.939941,1962.959961,1810.099976,1932.22998,4881887000,1932.22998",
			"	2016-01-04,2038.199951,2038.199951,1812.290039,1940.23999,5153017800,1940.23999",
			"	2015-12-01,2082.929932,2104.27002,1993.26001,2043.939941,3922935900,2043.939941",
			"	2015-11-02,2080.76001,2116.47998,2019.390015,2080.409912,4007931000,2080.409912",
			"	2015-10-01,1919.650024,2094.320068,1893.699951,2079.360107,4095504500,2079.360107",
			"	2015-09-01,1970.089966,2020.859985,1871.910034,1920.030029,4024497100,1920.030029",
			"	2015-08-03,2104.48999,2112.659912,1867.01001,1972.180054,4216280400,1972.180054",
			"	2015-07-01,2067.00,2132.820068,2044.02002,2103.840088,3709178600,2103.840088",
			"	2015-06-01,2108.639893,2129.870117,2056.320068,2063.110107,3513296300,2063.110107",
			"	2015-05-01,2087.379883,2134.719971,2067.929932,2107.389893,3455756000,2107.389893",
			"	2015-04-01,2067.629883,2125.919922,2048.379883,2085.51001,3521458000,2085.51001",
			"	2015-03-02,2105.22998,2117.52002,2039.689941,2067.889893,3638745400,2067.889893",
			"	2015-02-02,1996.670044,2119.590088,1980.900024,2104.50,3806470500,2104.50",
			"	2015-01-02,2058.899902,2072.360107,1988.119995,1994.98999,4091934500,1994.98999",
			"	2014-12-01,2065.780029,2093.550049,1972.560059,2058.899902,3788631300,2058.899902",
			"	2014-11-03,2018.209961,2075.76001,2001.01001,2067.560059,3479201500,2067.560059",
			"	2014-10-01,1971.439941,2018.189941,1820.660034,2018.050049,4260310800,2018.050049",
			"	2014-09-02,2004.069946,2019.26001,1964.040039,1972.290039,3364623800,1972.290039",
			"	2014-08-01,1929.800049,2005.040039,1904.780029,2003.369995,2875718500,2003.369995",
			"	2014-07-01,1962.290039,1991.390015,1930.670044,1930.670044,3214440400,1930.670044",
			"	2014-06-02,1923.869995,1968.170044,1915.97998,1960.22998,3158130000,1960.22998",
			"	2014-05-01,1884.390015,1924.030029,1859.790039,1923.569946,3185100900,1923.569946",
			"	2014-04-01,1873.959961,1897.280029,1814.359985,1883.949951,3589287600,1883.949951",
			"	2014-03-03,1857.680054,1883.969971,1834.439941,1872.339966,3579015700,1872.339966",
			"	2014-02-03,1782.680054,1867.920044,1737.920044,1859.449951,3875949400,1859.449951",
			"	2014-01-02,1845.859985,1850.839966,1770.449951,1782.589966,3806266600,1782.589966",
			"	2013-12-02,1806.550049,1849.439941,1767.98999,1848.359985,3203412300,1848.359985",
			"	2013-11-01,1758.699951,1813.550049,1746.199951,1805.810059,3261324500,1805.810059",
			"	2013-10-01,1682.410034,1775.219971,1646.469971,1756.540039,3498866500,1756.540039",
			"	2013-09-03,1635.949951,1729.859985,1633.410034,1681.550049,3474152000,1681.550049",
			"	2013-08-01,1689.420044,1709.670044,1627.469971,1632.969971,3069868600,1632.969971",
			"	2013-07-01,1609.780029,1698.780029,1604.569946,1685.72998,3270645900,1685.72998",
			"	2013-06-03,1631.709961,1654.189941,1560.329956,1606.280029,3996199000,1606.280029",
			"	2013-05-01,1597.550049,1687.180054,1581.280029,1630.73999,3661220400,1630.73999",
			"	2013-04-01,1569.180054,1597.569946,1536.030029,1597.569946,3674685000,1597.569946",
			"	2013-03-01,1514.680054,1570.280029,1501.47998,1569.189941,3591577500,1569.189941",
			"	2013-02-01,1498.109985,1530.939941,1485.01001,1514.680054,3851884200,1514.680054",
			"	2013-01-02,1426.189941,1509.939941,1426.189941,1498.109985,3802304200,1498.109985",
			"	2012-12-03,1416.339966,1448.00,1398.109985,1426.189941,3479625500,1426.189941",
			"	2012-11-01,1412.199951,1434.27002,1343.349976,1416.180054,3593110000,1416.180054",
			"	2012-10-01,1440.900024,1470.959961,1403.280029,1412.160034,3587115700,1412.160034",
			"	2012-09-04,1406.540039,1474.51001,1396.560059,1440.670044,3857553100,1440.670044",
			"	2012-08-01,1379.319946,1426.680054,1354.650024,1406.579956,3183567800,1406.579956",
			"	2012-07-02,1362.329956,1391.73999,1325.410034,1379.319946,3663113300,1379.319946",
			"	2012-06-01,1309.869995,1363.459961,1266.73999,1362.160034,4103472300,1362.160034",
			"	2012-05-01,1397.859985,1415.319946,1291.97998,1310.329956,4158095900,1310.329956",
			"	2012-04-02,1408.469971,1422.380005,1357.380005,1397.910034,3916786000,1397.910034",
			"	2012-03-01,1365.900024,1419.150024,1340.030029,1408.469971,3980752200,1408.469971",
			"	2012-02-01,1312.449951,1378.040039,1312.449951,1365.680054,4143404000,1365.680054",
			"	2012-01-31,1313.530029,1321.410034,1306.689941,1312.410034,8471100000,1312.410034"};
		
		stockparse(sp500);
		stockparse(KELLOG);
		stockparse(AAPL);

	}

}