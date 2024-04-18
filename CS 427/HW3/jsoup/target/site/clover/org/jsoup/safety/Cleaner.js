var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":175,"id":8988,"methods":[{"el":45,"sc":5,"sl":42},{"el":61,"sc":5,"sl":53},{"el":81,"sc":5,"sl":74},{"el":91,"sc":5,"sl":83},{"el":144,"sc":5,"sl":140},{"el":163,"sc":5,"sl":146}],"name":"Cleaner","sl":35},{"el":138,"id":9012,"methods":[{"el":104,"sc":9,"sl":101},{"el":131,"sc":9,"sl":106},{"el":137,"sc":9,"sl":133}],"name":"Cleaner.CleaningVisitor","sl":96},{"el":173,"id":9069,"methods":[{"el":172,"sc":9,"sl":169}],"name":"Cleaner.ElementMeta","sl":165}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140}],"name":"cleansInternationalText","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":141},{"sl":142},{"sl":143}]},"test_143":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"simpleBehaviourTest2","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_17":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"whitelistedProtocolShouldBeRetained","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_195":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"handlesControlCharactersAfterTagName","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_223":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"basicWithImagesTest","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_226":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testCleanJavascriptHref","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_239":{"methods":[{"sl":42},{"sl":83},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testIsValidBodyHtml","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":129},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_252":{"methods":[{"sl":42},{"sl":83},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testScriptTagInWhiteList","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_256":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testRemoveTags","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_277":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"preservesRelativeLinksIfConfigured","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_295":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testRemoveEnforcedAttributes","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_301":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"basicBehaviourTest","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_314":{"methods":[{"sl":42},{"sl":53},{"sl":83},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"selfClosingOnNonvoidIsError","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_330":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"addsTagOnAttributesIfNotSet","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_360":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"resolvesRelativeLinks","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_433":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"supplyOutputSettings","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_490":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"handlesAllPseudoTag","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_529":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testCleanAnchorProtocol","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_574":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140}],"name":"testDropScript","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":117},{"sl":118},{"sl":120},{"sl":124},{"sl":129},{"sl":134},{"sl":141},{"sl":142},{"sl":143}]},"test_588":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"simpleBehaviourTest","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_589":{"methods":[{"sl":42},{"sl":74},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testIsValidDocument","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":75},{"sl":77},{"sl":78},{"sl":79},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_61":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testRemoveProtocols","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_64":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"handlesNoHrefAttribute","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_643":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testRelaxed","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_660":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testDropsUnknownTags","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_662":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"handlesCustomProtocols","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_663":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"dropsUnresolvableRelativeLinks","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_673":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testDropImageScript","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_690":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testDropXmlProc","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":129},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_691":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"whitelistedProtocolShouldBeRetained","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_707":{"methods":[{"sl":42},{"sl":53},{"sl":83},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"selfClosingVoidIsNotAnError","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_734":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"handlesAttributesWithNoValue","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_752":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testRemoveAttributes","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_799":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testHandlesEmptyAttributes","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]},"test_850":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140}],"name":"handlesFramesets","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":117},{"sl":118},{"sl":134},{"sl":141},{"sl":142},{"sl":143}]},"test_890":{"methods":[{"sl":42},{"sl":53},{"sl":101},{"sl":106},{"sl":133},{"sl":140},{"sl":146},{"sl":169}],"name":"testDropComments","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":102},{"sl":103},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":129},{"sl":134},{"sl":135},{"sl":141},{"sl":142},{"sl":143},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":159},{"sl":160},{"sl":162},{"sl":170},{"sl":171}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [], [], [], [], [], [], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 588, 850, 890, 660, 752, 330, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 588, 850, 890, 660, 752, 330, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 588, 850, 890, 660, 752, 330, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 588, 850, 890, 660, 752, 330, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 588, 850, 890, 660, 752, 330, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 588, 850, 890, 660, 752, 330, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256], [], [], [], [], [], [], [], [], [], [], [], [], [], [589], [589], [], [589], [589], [589], [], [], [], [314, 239, 707, 252], [314, 239, 707, 252], [314, 239, 707, 252], [314, 239, 707, 252], [314, 239, 707, 252], [314, 239, 707, 252], [314, 239, 707, 252], [314, 239, 707, 252], [], [], [], [], [], [], [], [], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [223, 295, 301, 239, 588, 850, 660, 752, 589, 574, 256], [], [734, 690, 663, 360, 295, 490, 662, 61, 64, 301, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 574, 143, 277, 103, 707, 643, 256, 252], [734, 690, 663, 360, 295, 490, 662, 61, 64, 301, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 143, 277, 103, 707, 643, 256, 252], [734, 690, 663, 360, 295, 490, 662, 61, 64, 301, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 143, 277, 103, 707, 643, 256, 252], [734, 690, 663, 360, 295, 490, 662, 61, 64, 301, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 143, 277, 103, 707, 643, 256, 252], [690, 239, 890, 574, 252], [252], [252], [252], [], [690, 239, 890, 574], [], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [], [], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 850, 890, 660, 752, 330, 589, 574, 799, 143, 691, 277, 17, 103, 707, 643, 256, 252], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 529, 226, 239, 588, 752, 330, 799, 691, 277, 17], [223, 360, 295, 490, 662, 301, 529, 239, 330, 799, 691, 277, 17], [], [734, 223, 663, 673, 490, 662, 61, 64, 301, 529, 226, 239, 588, 752, 330, 799, 277], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [], [], [], [], [], [], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [734, 690, 223, 663, 360, 295, 673, 490, 662, 61, 64, 301, 195, 529, 433, 314, 226, 239, 588, 890, 660, 752, 330, 589, 799, 143, 691, 277, 17, 707, 643, 256, 252], [], [], [], []]