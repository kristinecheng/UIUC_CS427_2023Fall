var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":180,"id":10581,"methods":[{"el":30,"sc":5,"sl":22},{"el":38,"sc":5,"sl":32},{"el":42,"sc":5,"sl":40},{"el":51,"sc":5,"sl":44},{"el":57,"sc":5,"sl":53},{"el":64,"sc":5,"sl":59},{"el":70,"sc":5,"sl":66},{"el":75,"sc":5,"sl":72},{"el":80,"sc":5,"sl":77},{"el":85,"sc":5,"sl":82},{"el":95,"sc":5,"sl":87},{"el":111,"sc":5,"sl":97},{"el":123,"sc":5,"sl":113},{"el":135,"sc":5,"sl":125},{"el":159,"sc":5,"sl":137},{"el":166,"sc":5,"sl":161},{"el":179,"sc":5,"sl":168}],"name":"DataUtilTest","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_114":{"methods":[{"sl":87}],"name":"generatesMimeBoundaries","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":92},{"sl":93},{"sl":94}]},"test_12":{"methods":[{"sl":77}],"name":"shouldCorrectCharsetForDuplicateCharsetString","pass":true,"statements":[{"sl":79}]},"test_137":{"methods":[{"sl":72}],"name":"shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags","pass":true,"statements":[{"sl":74}]},"test_203":{"methods":[{"sl":40},{"sl":97}],"name":"wrongMetaCharsetFallback","pass":true,"statements":[{"sl":41},{"sl":99},{"sl":101},{"sl":103},{"sl":110}]},"test_210":{"methods":[{"sl":168}],"name":"supportsXmlCharsetDeclaration","pass":true,"statements":[{"sl":170},{"sl":171},{"sl":177},{"sl":178}]},"test_268":{"methods":[{"sl":40},{"sl":59}],"name":"discardsSpuriousByteOrderMarkWhenNoCharsetSet","pass":true,"statements":[{"sl":41},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]},"test_292":{"methods":[{"sl":40},{"sl":53}],"name":"discardsSpuriousByteOrderMark","pass":true,"statements":[{"sl":41},{"sl":54},{"sl":55},{"sl":56}]},"test_311":{"methods":[{"sl":66}],"name":"shouldNotThrowExceptionOnEmptyCharset","pass":true,"statements":[{"sl":68},{"sl":69}]},"test_527":{"methods":[{"sl":32}],"name":"testQuotedCharset","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_550":{"methods":[{"sl":82}],"name":"shouldReturnNullForIllegalCharsetNames","pass":true,"statements":[{"sl":84}]},"test_552":{"methods":[{"sl":137}],"name":"supportsBOMinFiles","pass":true,"statements":[{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":155},{"sl":156},{"sl":157},{"sl":158}]},"test_676":{"methods":[{"sl":22}],"name":"testCharset","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_770":{"methods":[{"sl":161}],"name":"supportsUTF8BOM","pass":true,"statements":[{"sl":163},{"sl":164},{"sl":165}]},"test_774":{"methods":[{"sl":44},{"sl":125}],"name":"firstMetaElementWithCharsetShouldBeUsedForDecoding","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":127},{"sl":132},{"sl":134}]},"test_798":{"methods":[{"sl":44},{"sl":113}],"name":"secondMetaElementWithContentTypeContainsCharsetParameter","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":115},{"sl":120},{"sl":122}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [676], [], [676], [676], [676], [676], [676], [676], [], [], [527], [527], [527], [527], [527], [527], [], [], [268, 292, 203], [268, 292, 203], [], [], [774, 798], [774, 798], [774, 798], [], [], [], [], [], [], [292], [292], [292], [292], [], [], [268], [268], [268], [268], [268], [], [], [311], [], [311], [311], [], [], [137], [], [137], [], [], [12], [], [12], [], [], [550], [], [550], [], [], [114], [], [114], [114], [], [114], [114], [114], [], [], [203], [], [203], [], [203], [], [203], [], [], [], [], [], [], [203], [], [], [798], [], [798], [], [], [], [], [798], [], [798], [], [], [774], [], [774], [], [], [], [], [774], [], [774], [], [], [552], [], [], [552], [552], [552], [552], [], [552], [552], [552], [552], [], [552], [552], [552], [552], [], [552], [552], [552], [552], [], [], [770], [], [770], [770], [770], [], [], [210], [], [210], [210], [], [], [], [], [], [210], [210], [], []]