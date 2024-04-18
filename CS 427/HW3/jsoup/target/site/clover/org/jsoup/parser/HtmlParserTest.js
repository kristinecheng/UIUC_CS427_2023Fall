var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1258,"id":20445,"methods":[{"el":46,"sc":5,"sl":37},{"el":56,"sc":5,"sl":48},{"el":68,"sc":5,"sl":58},{"el":75,"sc":5,"sl":70},{"el":89,"sc":5,"sl":77},{"el":101,"sc":5,"sl":91},{"el":112,"sc":5,"sl":103},{"el":124,"sc":5,"sl":114},{"el":131,"sc":5,"sl":126},{"el":139,"sc":5,"sl":133},{"el":148,"sc":5,"sl":141},{"el":155,"sc":5,"sl":150},{"el":160,"sc":5,"sl":157},{"el":178,"sc":5,"sl":162},{"el":186,"sc":5,"sl":180},{"el":195,"sc":5,"sl":188},{"el":207,"sc":5,"sl":197},{"el":213,"sc":5,"sl":209},{"el":220,"sc":5,"sl":215},{"el":231,"sc":5,"sl":222},{"el":241,"sc":5,"sl":233},{"el":262,"sc":5,"sl":243},{"el":270,"sc":5,"sl":264},{"el":275,"sc":5,"sl":272},{"el":281,"sc":5,"sl":277},{"el":286,"sc":5,"sl":283},{"el":291,"sc":5,"sl":288},{"el":297,"sc":5,"sl":293},{"el":303,"sc":5,"sl":299},{"el":321,"sc":5,"sl":305},{"el":329,"sc":5,"sl":323},{"el":339,"sc":5,"sl":331},{"el":353,"sc":5,"sl":341},{"el":367,"sc":5,"sl":355},{"el":382,"sc":5,"sl":369},{"el":389,"sc":5,"sl":384},{"el":403,"sc":5,"sl":391},{"el":414,"sc":5,"sl":405},{"el":420,"sc":5,"sl":416},{"el":430,"sc":5,"sl":422},{"el":437,"sc":5,"sl":432},{"el":444,"sc":5,"sl":439},{"el":451,"sc":5,"sl":446},{"el":458,"sc":5,"sl":453},{"el":464,"sc":5,"sl":460},{"el":470,"sc":5,"sl":466},{"el":476,"sc":5,"sl":472},{"el":482,"sc":5,"sl":478},{"el":489,"sc":5,"sl":484},{"el":496,"sc":5,"sl":491},{"el":507,"sc":5,"sl":498},{"el":516,"sc":5,"sl":509},{"el":524,"sc":5,"sl":518},{"el":531,"sc":5,"sl":526},{"el":540,"sc":5,"sl":533},{"el":548,"sc":5,"sl":542},{"el":555,"sc":5,"sl":550},{"el":560,"sc":5,"sl":557},{"el":566,"sc":5,"sl":562},{"el":572,"sc":5,"sl":568},{"el":579,"sc":5,"sl":574},{"el":585,"sc":5,"sl":581},{"el":590,"sc":5,"sl":587},{"el":597,"sc":5,"sl":592},{"el":603,"sc":5,"sl":599},{"el":609,"sc":5,"sl":605},{"el":615,"sc":5,"sl":611},{"el":621,"sc":5,"sl":617},{"el":629,"sc":5,"sl":623},{"el":636,"sc":5,"sl":631},{"el":654,"sc":5,"sl":648},{"el":676,"sc":5,"sl":656},{"el":683,"sc":5,"sl":678},{"el":690,"sc":5,"sl":685},{"el":707,"sc":5,"sl":692},{"el":713,"sc":5,"sl":709},{"el":719,"sc":5,"sl":715},{"el":728,"sc":5,"sl":721},{"el":736,"sc":5,"sl":730},{"el":746,"sc":5,"sl":738},{"el":756,"sc":5,"sl":748},{"el":772,"sc":5,"sl":758},{"el":782,"sc":5,"sl":774},{"el":788,"sc":5,"sl":784},{"el":793,"sc":5,"sl":790},{"el":798,"sc":5,"sl":795},{"el":803,"sc":5,"sl":800},{"el":808,"sc":5,"sl":805},{"el":813,"sc":5,"sl":810},{"el":821,"sc":5,"sl":815},{"el":835,"sc":5,"sl":823},{"el":847,"sc":5,"sl":837},{"el":856,"sc":5,"sl":849},{"el":862,"sc":5,"sl":858},{"el":876,"sc":5,"sl":864},{"el":884,"sc":5,"sl":878},{"el":892,"sc":5,"sl":886},{"el":900,"sc":5,"sl":894},{"el":906,"sc":5,"sl":902},{"el":912,"sc":5,"sl":908},{"el":926,"sc":5,"sl":915},{"el":942,"sc":5,"sl":928},{"el":954,"sc":5,"sl":944},{"el":961,"sc":5,"sl":956},{"el":979,"sc":5,"sl":963},{"el":997,"sc":5,"sl":981},{"el":1023,"sc":5,"sl":999},{"el":1036,"sc":5,"sl":1025},{"el":1043,"sc":5,"sl":1038},{"el":1049,"sc":5,"sl":1045},{"el":1056,"sc":5,"sl":1051},{"el":1065,"sc":5,"sl":1058},{"el":1072,"sc":5,"sl":1067},{"el":1087,"sc":5,"sl":1074},{"el":1097,"sc":5,"sl":1089},{"el":1108,"sc":5,"sl":1099},{"el":1119,"sc":5,"sl":1110},{"el":1130,"sc":5,"sl":1121},{"el":1135,"sc":5,"sl":1132},{"el":1143,"sc":5,"sl":1137},{"el":1150,"sc":5,"sl":1145},{"el":1158,"sc":5,"sl":1152},{"el":1163,"sc":5,"sl":1160},{"el":1174,"sc":5,"sl":1165},{"el":1186,"sc":5,"sl":1176},{"el":1197,"sc":5,"sl":1188},{"el":1210,"sc":5,"sl":1199},{"el":1215,"sc":5,"sl":1212},{"el":1222,"sc":5,"sl":1217},{"el":1232,"sc":5,"sl":1224},{"el":1245,"sc":5,"sl":1234},{"el":1257,"sc":5,"sl":1247}],"name":"HtmlParserTest","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":48}],"name":"parsesRoughAttributes","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":53},{"sl":54},{"sl":55}]},"test_108":{"methods":[{"sl":197}],"name":"handlesDataOnlyTags","pass":true,"statements":[{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":203},{"sl":204},{"sl":205},{"sl":206}]},"test_109":{"methods":[{"sl":568}],"name":"normalisedBodyAfterContent","pass":true,"statements":[{"sl":569},{"sl":570}]},"test_111":{"methods":[{"sl":491}],"name":"handlesMultiClosingBody","pass":true,"statements":[{"sl":492},{"sl":493},{"sl":494},{"sl":495}]},"test_116":{"methods":[{"sl":77}],"name":"parsesQuiteRoughAttributes","pass":true,"statements":[{"sl":78},{"sl":80},{"sl":85},{"sl":87},{"sl":88}]},"test_127":{"methods":[{"sl":323}],"name":"handlesProtocolRelativeUrl","pass":true,"statements":[{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328}]},"test_14":{"methods":[{"sl":1234}],"name":"fallbackToUtfIfCantEncode","pass":true,"statements":[{"sl":1237},{"sl":1238},{"sl":1240},{"sl":1241},{"sl":1243},{"sl":1244}]},"test_140":{"methods":[{"sl":498}],"name":"handlesUnclosedDefinitionLists","pass":true,"statements":[{"sl":500},{"sl":501},{"sl":502},{"sl":503},{"sl":504},{"sl":505},{"sl":506}]},"test_148":{"methods":[{"sl":188}],"name":"handlesEscapedData","pass":true,"statements":[{"sl":189},{"sl":190},{"sl":191},{"sl":193},{"sl":194}]},"test_152":{"methods":[{"sl":963}],"name":"handlesInvalidDoctypes","pass":true,"statements":[{"sl":965},{"sl":966},{"sl":970},{"sl":971},{"sl":975},{"sl":976}]},"test_154":{"methods":[{"sl":550}],"name":"normalisesDocument","pass":true,"statements":[{"sl":551},{"sl":552},{"sl":553}]},"test_157":{"methods":[{"sl":1132}],"name":"handlesControlCodeInAttributeName","pass":true,"statements":[{"sl":1133},{"sl":1134}]},"test_16":{"methods":[{"sl":748}],"name":"handlesUnclosedTitle","pass":true,"statements":[{"sl":749},{"sl":750},{"sl":751},{"sl":753},{"sl":754},{"sl":755}]},"test_162":{"methods":[{"sl":37}],"name":"parsesSimpleDocument","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45}]},"test_171":{"methods":[{"sl":305}],"name":"handlesBaseTags","pass":true,"statements":[{"sl":307},{"sl":308},{"sl":309},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":316},{"sl":318},{"sl":319},{"sl":320}]},"test_173":{"methods":[{"sl":1224}],"name":"handlesXmlDeclAndCommentsBeforeDoctype","pass":true,"statements":[{"sl":1225},{"sl":1226},{"sl":1228},{"sl":1231}]},"test_176":{"methods":[{"sl":837}],"name":"tracksLimitedErrorsWhenRequested","pass":true,"statements":[{"sl":838},{"sl":839},{"sl":840},{"sl":842},{"sl":843},{"sl":844},{"sl":845},{"sl":846}]},"test_178":{"methods":[{"sl":1160}],"name":"normalizesDiscordantTags","pass":true,"statements":[{"sl":1161},{"sl":1162}]},"test_179":{"methods":[{"sl":795}],"name":"handles0CharacterAsText","pass":true,"statements":[{"sl":796},{"sl":797}]},"test_180":{"methods":[{"sl":685}],"name":"reconstructFormattingElements","pass":true,"statements":[{"sl":687},{"sl":688},{"sl":689}]},"test_184":{"methods":[{"sl":70}],"name":"retainsAttributesOfDifferentCaseIfSensitive","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":74}]},"test_186":{"methods":[{"sl":915}],"name":"createsFormElements","pass":true,"statements":[{"sl":916},{"sl":917},{"sl":918},{"sl":920},{"sl":921},{"sl":922},{"sl":923},{"sl":924},{"sl":925}]},"test_189":{"methods":[{"sl":103}],"name":"parsesUnterminatedComments","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111}]},"test_209":{"methods":[{"sl":774}],"name":"handlesUnclosedRawtextAtEof","pass":true,"statements":[{"sl":775},{"sl":776},{"sl":777},{"sl":778},{"sl":779},{"sl":780},{"sl":781}]},"test_218":{"methods":[{"sl":1217}],"name":"preSkipsFirstNewline","pass":true,"statements":[{"sl":1218},{"sl":1219},{"sl":1220},{"sl":1221}]},"test_224":{"methods":[{"sl":369}],"name":"handlesCdataInScript","pass":true,"statements":[{"sl":370},{"sl":371},{"sl":373},{"sl":374},{"sl":375},{"sl":376},{"sl":377},{"sl":379},{"sl":380}]},"test_25":{"methods":[{"sl":1247}],"name":"characterReaderBuffer","pass":true,"statements":[{"sl":1248},{"sl":1249},{"sl":1251},{"sl":1253},{"sl":1254},{"sl":1255},{"sl":1256}]},"test_250":{"methods":[{"sl":981}],"name":"handlesManyChildren","pass":true,"statements":[{"sl":983},{"sl":984},{"sl":985},{"sl":991},{"sl":994}]},"test_262":{"methods":[{"sl":858}],"name":"handlesCommentsInTable","pass":true,"statements":[{"sl":859},{"sl":860},{"sl":861}]},"test_270":{"methods":[{"sl":864}],"name":"handlesQuotesInCommentsInScripts","pass":true,"statements":[{"sl":865},{"sl":870},{"sl":871}]},"test_272":{"methods":[{"sl":1038}],"name":"testNormalisesIsIndex","pass":true,"statements":[{"sl":1039},{"sl":1040},{"sl":1041}]},"test_275":{"methods":[{"sl":533}],"name":"handlesJavadocFont","pass":true,"statements":[{"sl":534},{"sl":535},{"sl":536},{"sl":537},{"sl":538},{"sl":539}]},"test_28":{"methods":[{"sl":878}],"name":"handleNullContextInParseFragment","pass":true,"statements":[{"sl":879},{"sl":880},{"sl":881},{"sl":882},{"sl":883}]},"test_283":{"methods":[{"sl":1089}],"name":"testHtmlLowerCase","pass":true,"statements":[{"sl":1090},{"sl":1091},{"sl":1092},{"sl":1094},{"sl":1095},{"sl":1096}]},"test_285":{"methods":[{"sl":557}],"name":"normalisesEmptyDocument","pass":true,"statements":[{"sl":558},{"sl":559}]},"test_294":{"methods":[{"sl":758}],"name":"handlesUnclosedScriptAtEof","pass":true,"statements":[{"sl":759},{"sl":760},{"sl":761},{"sl":762},{"sl":763},{"sl":764},{"sl":765},{"sl":766},{"sl":767},{"sl":768},{"sl":769},{"sl":770},{"sl":771}]},"test_303":{"methods":[{"sl":391}],"name":"handleCDataInText","pass":true,"statements":[{"sl":392},{"sl":393},{"sl":394},{"sl":396},{"sl":397},{"sl":398},{"sl":399},{"sl":400},{"sl":402}]},"test_304":{"methods":[{"sl":526}],"name":"ignoresContentAfterFrameset","pass":true,"statements":[{"sl":527},{"sl":528},{"sl":529}]},"test_309":{"methods":[{"sl":605}],"name":"testNoImagesInNoScriptInHead","pass":true,"statements":[{"sl":607},{"sl":608}]},"test_31":{"methods":[{"sl":956}],"name":"convertsImageToImg","pass":true,"statements":[{"sl":958},{"sl":959},{"sl":960}]},"test_310":{"methods":[{"sl":678}],"name":"handlesUnclosedAnchors","pass":true,"statements":[{"sl":679},{"sl":680},{"sl":681},{"sl":682}]},"test_313":{"methods":[{"sl":299}],"name":"ignoresDupeEndTrTag","pass":true,"statements":[{"sl":300},{"sl":301}]},"test_314":{"methods":[{"sl":1176}],"name":"selfClosingOnNonvoidIsError","pass":true,"statements":[{"sl":1177},{"sl":1178},{"sl":1179},{"sl":1180},{"sl":1181},{"sl":1183},{"sl":1184},{"sl":1185}]},"test_315":{"methods":[{"sl":738}],"name":"handlesUnclosedTitleAtEof","pass":true,"statements":[{"sl":739},{"sl":740},{"sl":741},{"sl":742},{"sl":743},{"sl":744},{"sl":745}]},"test_324":{"methods":[{"sl":222}],"name":"preservesSpaceInTextArea","pass":true,"statements":[{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230}]},"test_325":{"methods":[{"sl":141}],"name":"parsesUnterminatedOption","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_33":{"methods":[{"sl":126}],"name":"dropsUnterminatedAttribute","pass":true,"statements":[{"sl":128},{"sl":129},{"sl":130}]},"test_334":{"methods":[{"sl":209}],"name":"handlesTextAfterData","pass":true,"statements":[{"sl":210},{"sl":211},{"sl":212}]},"test_34":{"methods":[{"sl":542}],"name":"handlesBaseWithoutHref","pass":true,"statements":[{"sl":543},{"sl":544},{"sl":545},{"sl":546},{"sl":547}]},"test_340":{"methods":[{"sl":886}],"name":"doesNotFindShortestMatchingEntity","pass":true,"statements":[{"sl":889},{"sl":890},{"sl":891}]},"test_371":{"methods":[{"sl":611}],"name":"testAFlowContents","pass":true,"statements":[{"sl":613},{"sl":614}]},"test_373":{"methods":[{"sl":617}],"name":"testFontFlowContents","pass":true,"statements":[{"sl":619},{"sl":620}]},"test_374":{"methods":[{"sl":790}],"name":"handlesEscapedScript","pass":true,"statements":[{"sl":791},{"sl":792}]},"test_391":{"methods":[{"sl":384}],"name":"handlesUnclosedCdataAtEOF","pass":true,"statements":[{"sl":386},{"sl":387},{"sl":388}]},"test_393":{"methods":[{"sl":592}],"name":"testHeaderContents","pass":true,"statements":[{"sl":595},{"sl":596}]},"test_394":{"methods":[{"sl":692}],"name":"reconstructFormattingElementsInTable","pass":true,"statements":[{"sl":695},{"sl":696},{"sl":697},{"sl":706}]},"test_40":{"methods":[{"sl":902}],"name":"handlesXmlDeclarationAsBogusComment","pass":true,"statements":[{"sl":903},{"sl":904},{"sl":905}]},"test_402":{"methods":[{"sl":810}],"name":"handlesNewlinesAndWhitespaceInTag","pass":true,"statements":[{"sl":811},{"sl":812}]},"test_405":{"methods":[{"sl":518}],"name":"handlesFrames","pass":true,"statements":[{"sl":519},{"sl":520},{"sl":521}]},"test_418":{"methods":[{"sl":815}],"name":"handlesWhitespaceInoDocType","pass":true,"statements":[{"sl":816},{"sl":819},{"sl":820}]},"test_42":{"methods":[{"sl":928}],"name":"associatedFormControlsWithDisjointForms","pass":true,"statements":[{"sl":930},{"sl":931},{"sl":932},{"sl":934},{"sl":935},{"sl":936},{"sl":937},{"sl":938},{"sl":939},{"sl":941}]},"test_434":{"methods":[{"sl":439}],"name":"parsesBodyFragment","pass":true,"statements":[{"sl":440},{"sl":441},{"sl":442},{"sl":443}]},"test_439":{"methods":[{"sl":446}],"name":"handlesUnknownNamespaceTags","pass":true,"statements":[{"sl":448},{"sl":449},{"sl":450}]},"test_448":{"methods":[{"sl":162}],"name":"createsDocumentStructure","pass":true,"statements":[{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177}]},"test_45":{"methods":[{"sl":894}],"name":"relaxedBaseEntityMatchAndStrictExtendedMatch","pass":true,"statements":[{"sl":896},{"sl":897},{"sl":898},{"sl":899}]},"test_454":{"methods":[{"sl":150}],"name":"testSelectWithOption","pass":true,"statements":[{"sl":151},{"sl":152},{"sl":153},{"sl":154}]},"test_470":{"methods":[{"sl":730}],"name":"handlesSpanInTbody","pass":true,"statements":[{"sl":732},{"sl":733},{"sl":734},{"sl":735}]},"test_475":{"methods":[{"sl":721}],"name":"handlesSolidusInA","pass":true,"statements":[{"sl":723},{"sl":724},{"sl":725},{"sl":726},{"sl":727}]},"test_484":{"methods":[{"sl":562}],"name":"normalisesHeadlessBody","pass":true,"statements":[{"sl":563},{"sl":564}]},"test_49":{"methods":[{"sl":623}],"name":"handlesMisnestedTagsBI","pass":true,"statements":[{"sl":625},{"sl":626},{"sl":627}]},"test_501":{"methods":[{"sl":288}],"name":"handlesImplicitCaptionClose","pass":true,"statements":[{"sl":289},{"sl":290}]},"test_505":{"methods":[{"sl":1074}],"name":"testFragment","pass":true,"statements":[{"sl":1076},{"sl":1081},{"sl":1082}]},"test_51":{"methods":[{"sl":293}],"name":"noTableDirectInTable","pass":true,"statements":[{"sl":294},{"sl":295}]},"test_510":{"methods":[{"sl":331}],"name":"handlesCdata","pass":true,"statements":[{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338}]},"test_512":{"methods":[{"sl":341}],"name":"roundTripsCdata","pass":true,"statements":[{"sl":342},{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":349},{"sl":351},{"sl":352}]},"test_515":{"methods":[{"sl":1199}],"name":"testHandlesDeepSpans","pass":true,"statements":[{"sl":1200},{"sl":1201},{"sl":1202},{"sl":1205},{"sl":1207},{"sl":1208},{"sl":1209}]},"test_534":{"methods":[{"sl":800}],"name":"handlesNullInData","pass":true,"statements":[{"sl":801},{"sl":802}]},"test_546":{"methods":[{"sl":422}],"name":"handlesUnknownTags","pass":true,"statements":[{"sl":423},{"sl":424},{"sl":425},{"sl":426},{"sl":427},{"sl":428},{"sl":429}]},"test_549":{"methods":[{"sl":1121}],"name":"canPreserveBothCase","pass":true,"statements":[{"sl":1122},{"sl":1123},{"sl":1124},{"sl":1125},{"sl":1127},{"sl":1128},{"sl":1129}]},"test_554":{"methods":[{"sl":587}],"name":"testRelaxedTags","pass":true,"statements":[{"sl":588},{"sl":589}]},"test_555":{"methods":[{"sl":1058}],"name":"testSupportsNonAsciiTags","pass":true,"statements":[{"sl":1059},{"sl":1060},{"sl":1061},{"sl":1062},{"sl":1063},{"sl":1064}]},"test_57":{"methods":[{"sl":1188}],"name":"testTemplateInsideTable","pass":true,"statements":[{"sl":1189},{"sl":1190},{"sl":1191},{"sl":1193},{"sl":1194},{"sl":1195}]},"test_579":{"methods":[{"sl":478}],"name":"handlesKnownEmptyIframe","pass":true,"statements":[{"sl":479},{"sl":480},{"sl":481}]},"test_580":{"methods":[{"sl":715}],"name":"emptyTdTag","pass":true,"statements":[{"sl":716},{"sl":717},{"sl":718}]},"test_581":{"methods":[{"sl":157}],"name":"testSpaceAfterTag","pass":true,"statements":[{"sl":158},{"sl":159}]},"test_583":{"methods":[{"sl":114}],"name":"dropsUnterminatedTag","pass":true,"statements":[{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":121},{"sl":122},{"sl":123}]},"test_585":{"methods":[{"sl":472}],"name":"handlesKnownEmptyTitle","pass":true,"statements":[{"sl":473},{"sl":474},{"sl":475}]},"test_599":{"methods":[{"sl":1099}],"name":"canPreserveTagCase","pass":true,"statements":[{"sl":1100},{"sl":1101},{"sl":1102},{"sl":1103},{"sl":1105},{"sl":1106},{"sl":1107}]},"test_606":{"methods":[{"sl":709}],"name":"commentBeforeHtml","pass":true,"statements":[{"sl":710},{"sl":711},{"sl":712}]},"test_607":{"methods":[{"sl":1051}],"name":"testUsingSingleQuotesInQueries","pass":true,"statements":[{"sl":1052},{"sl":1053},{"sl":1054},{"sl":1055}]},"test_614":{"methods":[{"sl":648}],"name":"handlesUnexpectedMarkupInTables","pass":true,"statements":[{"sl":651},{"sl":652},{"sl":653}]},"test_621":{"methods":[{"sl":805}],"name":"handlesNullInComments","pass":true,"statements":[{"sl":806},{"sl":807}]},"test_626":{"methods":[{"sl":1067}],"name":"testSupportsPartiallyNonAsciiTags","pass":true,"statements":[{"sl":1068},{"sl":1069},{"sl":1070},{"sl":1071}]},"test_628":{"methods":[{"sl":233}],"name":"preservesSpaceInScript","pass":true,"statements":[{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240}]},"test_638":{"methods":[{"sl":849}],"name":"noErrorsByDefault","pass":true,"statements":[{"sl":850},{"sl":851},{"sl":852},{"sl":854},{"sl":855}]},"test_641":{"methods":[{"sl":416}],"name":"handlesInvalidStartTags","pass":true,"statements":[{"sl":417},{"sl":418},{"sl":419}]},"test_678":{"methods":[{"sl":133}],"name":"parsesUnterminatedTextarea","pass":true,"statements":[{"sl":135},{"sl":136},{"sl":137},{"sl":138}]},"test_689":{"methods":[{"sl":432}],"name":"handlesUnknownInlineTags","pass":true,"statements":[{"sl":433},{"sl":434},{"sl":435},{"sl":436}]},"test_707":{"methods":[{"sl":1165}],"name":"selfClosingVoidIsNotAnError","pass":true,"statements":[{"sl":1166},{"sl":1167},{"sl":1168},{"sl":1169},{"sl":1171},{"sl":1172},{"sl":1173}]},"test_71":{"methods":[{"sl":1110}],"name":"canPreserveAttributeCase","pass":true,"statements":[{"sl":1111},{"sl":1112},{"sl":1113},{"sl":1114},{"sl":1116},{"sl":1117},{"sl":1118}]},"test_72":{"methods":[{"sl":656}],"name":"handlesUnclosedFormattingElements","pass":true,"statements":[{"sl":658},{"sl":663},{"sl":664},{"sl":665},{"sl":675}]},"test_725":{"methods":[{"sl":599}],"name":"testSpanContents","pass":true,"statements":[{"sl":601},{"sl":602}]},"test_727":{"methods":[{"sl":1137}],"name":"caseSensitiveParseTree","pass":true,"statements":[{"sl":1138},{"sl":1139},{"sl":1140},{"sl":1141},{"sl":1142}]},"test_753":{"methods":[{"sl":405}],"name":"cdataNodesAreTextNodes","pass":true,"statements":[{"sl":406},{"sl":407},{"sl":408},{"sl":410},{"sl":411},{"sl":412},{"sl":413}]},"test_77":{"methods":[{"sl":581}],"name":"testHgroup","pass":true,"statements":[{"sl":583},{"sl":584}]},"test_787":{"methods":[{"sl":243}],"name":"doesNotCreateImplicitLists","pass":true,"statements":[{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":254},{"sl":255},{"sl":257},{"sl":258},{"sl":259},{"sl":260},{"sl":261}]},"test_788":{"methods":[{"sl":631}],"name":"handlesMisnestedTagsBP","pass":true,"statements":[{"sl":633},{"sl":634},{"sl":635}]},"test_789":{"methods":[{"sl":264}],"name":"discardsNakedTds","pass":true,"statements":[{"sl":266},{"sl":267},{"sl":268}]},"test_793":{"methods":[{"sl":91}],"name":"parsesComments","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100}]},"test_800":{"methods":[{"sl":215}],"name":"handlesTextArea","pass":true,"statements":[{"sl":216},{"sl":217},{"sl":218},{"sl":219}]},"test_801":{"methods":[{"sl":484}],"name":"handlesSolidusAtAttributeEnd","pass":true,"statements":[{"sl":486},{"sl":487},{"sl":488}]},"test_805":{"methods":[{"sl":58}],"name":"dropsDuplicateAttributes","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":63},{"sl":64},{"sl":66},{"sl":67}]},"test_814":{"methods":[{"sl":1212}],"name":"commentAtEnd","pass":true,"statements":[{"sl":1213},{"sl":1214}]},"test_82":{"methods":[{"sl":1045}],"name":"testReinsertionModeForThCelss","pass":true,"statements":[{"sl":1046},{"sl":1047},{"sl":1048}]},"test_823":{"methods":[{"sl":272}],"name":"handlesNestedImplicitTable","pass":true,"statements":[{"sl":273},{"sl":274}]},"test_829":{"methods":[{"sl":574}],"name":"findsCharsetInMalformedMeta","pass":true,"statements":[{"sl":575},{"sl":577},{"sl":578}]},"test_833":{"methods":[{"sl":823}],"name":"tracksErrorsWhenRequested","pass":true,"statements":[{"sl":824},{"sl":825},{"sl":826},{"sl":828},{"sl":829},{"sl":830},{"sl":831},{"sl":832},{"sl":833},{"sl":834}]},"test_837":{"methods":[{"sl":1152}],"name":"preservedCaseLinksCantNest","pass":true,"statements":[{"sl":1153},{"sl":1154},{"sl":1157}]},"test_839":{"methods":[{"sl":1025}],"name":"testInvalidTableContents","pass":true,"statements":[{"sl":1027},{"sl":1028},{"sl":1029},{"sl":1030},{"sl":1031},{"sl":1032},{"sl":1033},{"sl":1034},{"sl":1035}]},"test_84":{"methods":[{"sl":277}],"name":"handlesWhatWgExpensesTableExample","pass":true,"statements":[{"sl":279},{"sl":280}]},"test_857":{"methods":[{"sl":999}],"name":"handlesDeepStack","pass":true,"statements":[{"sl":1004},{"sl":1005},{"sl":1006},{"sl":1008},{"sl":1009},{"sl":1015},{"sl":1018},{"sl":1019}]},"test_859":{"methods":[{"sl":283}],"name":"handlesTbodyTable","pass":true,"statements":[{"sl":284},{"sl":285}]},"test_867":{"methods":[{"sl":1145}],"name":"caseInsensitiveParseTree","pass":true,"statements":[{"sl":1146},{"sl":1147},{"sl":1148},{"sl":1149}]},"test_875":{"methods":[{"sl":453}],"name":"handlesKnownEmptyBlocks","pass":true,"statements":[{"sl":455},{"sl":456},{"sl":457}]},"test_88":{"methods":[{"sl":180}],"name":"createsStructureFromBodySnippet","pass":true,"statements":[{"sl":183},{"sl":184},{"sl":185}]},"test_888":{"methods":[{"sl":509}],"name":"handlesBlocksInDefinitions","pass":true,"statements":[{"sl":511},{"sl":512},{"sl":513},{"sl":514},{"sl":515}]},"test_896":{"methods":[{"sl":355}],"name":"handlesCdataAcrossBuffer","pass":true,"statements":[{"sl":356},{"sl":357},{"sl":358},{"sl":360},{"sl":361},{"sl":362},{"sl":363},{"sl":365},{"sl":366}]},"test_901":{"methods":[{"sl":944}],"name":"handlesInputInTable","pass":true,"statements":[{"sl":945},{"sl":951},{"sl":952},{"sl":953}]},"test_912":{"methods":[{"sl":466}],"name":"handlesKnownEmptyStyle","pass":true,"statements":[{"sl":467},{"sl":468},{"sl":469}]},"test_917":{"methods":[{"sl":908}],"name":"handlesTagsInTextarea","pass":true,"statements":[{"sl":909},{"sl":910},{"sl":911}]},"test_928":{"methods":[{"sl":460}],"name":"handlesKnownEmptyNoFrames","pass":true,"statements":[{"sl":461},{"sl":462},{"sl":463}]},"test_939":{"methods":[{"sl":784}],"name":"noImplicitFormForTextAreas","pass":true,"statements":[{"sl":786},{"sl":787}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [162], [162], [162], [], [162], [162], [162], [162], [162], [], [], [100], [100], [100], [], [], [100], [100], [100], [], [], [805], [805], [805], [805], [], [805], [805], [], [805], [805], [], [], [184], [184], [184], [184], [184], [], [], [116], [116], [], [116], [], [], [], [], [116], [], [116], [116], [], [], [793], [793], [793], [], [793], [793], [793], [793], [793], [793], [], [], [189], [189], [189], [189], [189], [189], [189], [189], [189], [], [], [583], [], [583], [583], [583], [583], [], [583], [583], [583], [], [], [33], [], [33], [33], [33], [], [], [678], [], [678], [678], [678], [678], [], [], [325], [], [325], [325], [325], [325], [325], [], [], [454], [454], [454], [454], [454], [], [], [581], [581], [581], [], [], [448], [448], [448], [448], [448], [], [448], [448], [448], [448], [], [448], [448], [448], [448], [448], [], [], [88], [], [], [88], [88], [88], [], [], [148], [148], [148], [148], [], [148], [148], [], [], [108], [108], [108], [108], [108], [], [108], [108], [108], [108], [], [], [334], [334], [334], [334], [], [], [800], [800], [800], [800], [800], [], [], [324], [], [324], [324], [324], [324], [324], [324], [324], [], [], [628], [], [628], [628], [628], [628], [628], [628], [], [], [787], [], [787], [787], [787], [787], [787], [787], [787], [], [], [787], [787], [], [787], [787], [787], [787], [787], [], [], [789], [], [789], [789], [789], [], [], [], [823], [823], [823], [], [], [84], [], [84], [84], [], [], [859], [859], [859], [], [], [501], [501], [501], [], [], [51], [51], [51], [], [], [], [313], [313], [313], [], [], [], [171], [], [171], [171], [171], [], [171], [171], [], [171], [171], [171], [], [171], [171], [171], [], [], [127], [127], [127], [127], [127], [127], [], [], [510], [], [510], [510], [510], [510], [510], [510], [], [], [512], [512], [512], [512], [512], [512], [512], [], [512], [], [512], [512], [], [], [896], [896], [896], [896], [], [896], [896], [896], [896], [], [896], [896], [], [], [224], [224], [224], [], [224], [224], [224], [224], [224], [], [224], [224], [], [], [], [391], [], [391], [391], [391], [], [], [303], [303], [303], [303], [], [303], [303], [303], [303], [303], [], [303], [], [], [753], [753], [753], [753], [], [753], [753], [753], [753], [], [], [641], [641], [641], [641], [], [], [546], [546], [546], [546], [546], [546], [546], [546], [], [], [689], [689], [689], [689], [689], [], [], [434], [434], [434], [434], [434], [], [], [439], [], [439], [439], [439], [], [], [875], [], [875], [875], [875], [], [], [928], [928], [928], [928], [], [], [912], [912], [912], [912], [], [], [585], [585], [585], [585], [], [], [579], [579], [579], [579], [], [], [801], [], [801], [801], [801], [], [], [111], [111], [111], [111], [111], [], [], [140], [], [140], [140], [140], [140], [140], [140], [140], [], [], [888], [], [888], [888], [888], [888], [888], [], [], [405], [405], [405], [405], [], [], [], [], [304], [304], [304], [304], [], [], [], [275], [275], [275], [275], [275], [275], [275], [], [], [34], [34], [34], [34], [34], [34], [], [], [154], [154], [154], [154], [], [], [], [285], [285], [285], [], [], [484], [484], [484], [], [], [], [109], [109], [109], [], [], [], [829], [829], [], [829], [829], [], [], [77], [], [77], [77], [], [], [554], [554], [554], [], [], [393], [], [], [393], [393], [], [], [725], [], [725], [725], [], [], [309], [], [309], [309], [], [], [371], [], [371], [371], [], [], [373], [], [373], [373], [], [], [49], [], [49], [49], [49], [], [], [], [788], [], [788], [788], [788], [], [], [], [], [], [], [], [], [], [], [], [], [614], [], [], [614], [614], [614], [], [], [72], [], [72], [], [], [], [], [72], [72], [72], [], [], [], [], [], [], [], [], [], [72], [], [], [310], [310], [310], [310], [310], [], [], [180], [], [180], [180], [180], [], [], [394], [], [], [394], [394], [394], [], [], [], [], [], [], [], [], [394], [], [], [606], [606], [606], [606], [], [], [580], [580], [580], [580], [], [], [475], [], [475], [475], [475], [475], [475], [], [], [470], [], [470], [470], [470], [470], [], [], [315], [315], [315], [315], [315], [315], [315], [315], [], [], [16], [16], [16], [16], [], [16], [16], [16], [], [], [294], [294], [294], [294], [294], [294], [294], [294], [294], [294], [294], [294], [294], [294], [], [], [209], [209], [209], [209], [209], [209], [209], [209], [], [], [939], [], [939], [939], [], [], [374], [374], [374], [], [], [179], [179], [179], [], [], [534], [534], [534], [], [], [621], [621], [621], [], [], [402], [402], [402], [], [], [418], [418], [], [], [418], [418], [], [], [833], [833], [833], [833], [], [833], [833], [833], [833], [833], [833], [833], [], [], [176], [176], [176], [176], [], [176], [176], [176], [176], [176], [], [], [638], [638], [638], [638], [], [638], [638], [], [], [262], [262], [262], [262], [], [], [270], [270], [], [], [], [], [270], [270], [], [], [], [], [], [], [28], [28], [28], [28], [28], [28], [], [], [340], [], [], [340], [340], [340], [], [], [45], [], [45], [45], [45], [45], [], [], [40], [40], [40], [40], [], [], [917], [917], [917], [917], [], [], [], [186], [186], [186], [186], [], [186], [186], [186], [186], [186], [186], [], [], [42], [], [42], [42], [42], [], [42], [42], [42], [42], [42], [42], [], [42], [], [], [901], [901], [], [], [], [], [], [901], [901], [901], [], [], [31], [], [31], [31], [31], [], [], [152], [], [152], [152], [], [], [], [152], [152], [], [], [], [152], [152], [], [], [], [], [250], [], [250], [250], [250], [], [], [], [], [], [250], [], [], [250], [], [], [], [], [857], [], [], [], [], [857], [857], [857], [], [857], [857], [], [], [], [], [], [857], [], [], [857], [857], [], [], [], [], [], [839], [], [839], [839], [839], [839], [839], [839], [839], [839], [839], [], [], [272], [272], [272], [272], [], [], [], [82], [82], [82], [82], [], [], [607], [607], [607], [607], [607], [], [], [555], [555], [555], [555], [555], [555], [555], [], [], [626], [626], [626], [626], [626], [], [], [505], [], [505], [], [], [], [], [505], [505], [], [], [], [], [], [], [283], [283], [283], [283], [], [283], [283], [283], [], [], [599], [599], [599], [599], [599], [], [599], [599], [599], [], [], [71], [71], [71], [71], [71], [], [71], [71], [71], [], [], [549], [549], [549], [549], [549], [], [549], [549], [549], [], [], [157], [157], [157], [], [], [727], [727], [727], [727], [727], [727], [], [], [867], [867], [867], [867], [867], [], [], [837], [837], [837], [], [], [837], [], [], [178], [178], [178], [], [], [707], [707], [707], [707], [707], [], [707], [707], [707], [], [], [314], [314], [314], [314], [314], [314], [], [314], [314], [314], [], [], [57], [57], [57], [57], [], [57], [57], [57], [], [], [], [515], [515], [515], [515], [], [], [515], [], [515], [515], [515], [], [], [814], [814], [814], [], [], [218], [218], [218], [218], [218], [], [], [173], [173], [173], [], [173], [], [], [173], [], [], [14], [], [], [14], [14], [], [14], [14], [], [14], [14], [], [], [25], [25], [25], [], [25], [], [25], [25], [25], [25], [], []]
