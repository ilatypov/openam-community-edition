//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.protocol.impl;

public class ResponseElementImpl
    extends com.sun.identity.liberty.ws.common.jaxb.protocol.impl.ResponseTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.protocol.ResponseElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.protocol.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.protocol.ResponseElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:1.0:protocol";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Response";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.protocol.impl.ResponseElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:1.0:protocol", "Response");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.protocol.ResponseElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.m"
+"sv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0012sr\u0000\u0011java.lang.B"
+"oolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0012ppsr\u0000 com.su"
+"n.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar"
+".UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000 com.sun.msv.g"
+"rammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq"
+"\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u00002com.sun.msv.grammar.Expression$AnyStringExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0015\u0001q\u0000~\u0000\u001fsr\u0000 com.sun.msv.grammar.Any"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000 q\u0000~\u0000%sr\u0000#com.sun.msv.grammar.SimpleNameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespace"
+"URIq\u0000~\u0000\'xq\u0000~\u0000\"t\u0000?com.sun.identity.liberty.ws.common.jaxb.xml"
+"sig.SignatureElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-el"
+"ementssq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~"
+"\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000<com.sun.identity.liberty.ws."
+"common.jaxb.xmlsig.SignatureTypeq\u0000~\u0000*sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016psr\u0000"
+"\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/"
+"datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/"
+"StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000\"com.sun.msv.datatype.xsd.QnameTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fna"
+"mespaceUriq\u0000~\u0000\'L\u0000\btypeNameq\u0000~\u0000\'L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/"
+"datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001"
+"/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpacePro"
+"cessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.White"
+"SpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressio"
+"n$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.ut"
+"il.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\'L\u0000\fnamespaceURIq\u0000~\u0000"
+"\'xpq\u0000~\u0000@q\u0000~\u0000?sq\u0000~\u0000&t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchem"
+"a-instanceq\u0000~\u0000%sq\u0000~\u0000&t\u0000\tSignaturet\u0000\"http://www.w3.org/2000/0"
+"9/xmldsig#q\u0000~\u0000%sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000"
+"~\u0000\u0016pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000>com.sun.identity.liberty.ws.comm"
+"on.jaxb.protocol.StatusElementq\u0000~\u0000*sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000;com"
+".sun.identity.liberty.ws.common.jaxb.protocol.StatusTypeq\u0000~\u0000"
+"*sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0006Statust\u0000$urn:oa"
+"sis:names:tc:SAML:1.0:protocolsq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u0012q\u0000~\u0000"
+"\u0016psq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~"
+"\u0000%sq\u0000~\u0000&t\u0000Bcom.sun.identity.liberty.ws.common.jaxb.assertion"
+".AssertionElementq\u0000~\u0000*sq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0012pp"
+"sq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000?com.sun.iden"
+"tity.liberty.ws.common.jaxb.assertion.AssertionTypeq\u0000~\u0000*sq\u0000~"
+"\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\tAssertiont\u0000%urn:oasi"
+"s:names:tc:SAML:1.0:assertionq\u0000~\u0000%sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016psq\u0000~\u00005"
+"ppsr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com."
+"sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.dat"
+"atype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000:q\u0000~\u0000?t\u0000"
+"\u0006NCNameq\u0000~\u0000C\u0000q\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u007fq\u0000~\u0000?sq\u0000~\u0000&t\u0000\fInResponseTot\u0000\u0000q\u0000"
+"~\u0000%sq\u0000~\u0000\u001cppsq\u0000~\u00005ppsr\u0000%com.sun.msv.datatype.xsd.DateTimeType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@"
+"3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000:q\u0000~\u0000?t\u0000\bdateTimeq\u0000~\u0000Cq\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u0089q\u0000~\u0000?sq\u0000~\u0000"
+"&t\u0000\fIssueInstantq\u0000~\u0000\u0083sq\u0000~\u0000\u001cppsq\u0000~\u00005ppsr\u0000$com.sun.msv.datatyp"
+"e.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.Int"
+"egerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datat"
+"ype/xsd/XSDatatypeImpl;xq\u0000~\u0000:q\u0000~\u0000?t\u0000\u0007integerq\u0000~\u0000Csr\u0000,com.sun"
+".msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;"
+"com.sun.msv.datatype.xsd.DataTypeWithLexicalConstraintFacetT"
+"\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~\u0000\u0091L"
+"\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tf"
+"acetNameq\u0000~\u0000\'xq\u0000~\u0000<ppq\u0000~\u0000C\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.Num"
+"berType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000:q\u0000~\u0000?t\u0000\u0007decimalq\u0000~\u0000Cq\u0000~\u0000\u009at\u0000\u000efraction"
+"Digits\u0000\u0000\u0000\u0000q\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u0093q\u0000~\u0000?sq\u0000~\u0000&t\u0000\fMajorVersionq\u0000~\u0000\u0083sq\u0000"
+"~\u0000\u001cppq\u0000~\u0000\u008esq\u0000~\u0000&t\u0000\fMinorVersionq\u0000~\u0000\u0083sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016psq\u0000~"
+"\u00005q\u0000~\u0000\u0016psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq"
+"\u0000~\u0000:q\u0000~\u0000?t\u0000\u0006anyURIq\u0000~\u0000Cq\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u00a8q\u0000~\u0000?sq\u0000~\u0000&t\u0000\tRecipie"
+"ntq\u0000~\u0000\u0083q\u0000~\u0000%sq\u0000~\u0000\u001cppsq\u0000~\u00005ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000{q\u0000~\u0000?t\u0000\u0002IDq\u0000~\u0000C\u0000q\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u00b0q\u0000~\u0000?sq\u0000"
+"~\u0000&t\u0000\nResponseIDq\u0000~\u0000\u0083sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~"
+"\u0000&t\u0000\bResponseq\u0000~\u0000asr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Clo"
+"sedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7"
+"j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/g"
+"rammar/ExpressionPool;xp\u0000\u0000\u0000$\u0001pq\u0000~\u0000Nq\u0000~\u0000dq\u0000~\u0000\tq\u0000~\u0000bq\u0000~\u0000cq\u0000~\u0000\u001b"
+"q\u0000~\u0000/q\u0000~\u0000Qq\u0000~\u0000Yq\u0000~\u0000gq\u0000~\u0000oq\u0000~\u0000\rq\u0000~\u0000\u0018q\u0000~\u0000.q\u0000~\u0000Pq\u0000~\u0000Xq\u0000~\u0000fq\u0000~\u0000n"
+"q\u0000~\u0000,q\u0000~\u0000Vq\u0000~\u0000lq\u0000~\u0000\u0010q\u0000~\u0000\u00a3q\u0000~\u0000\u000fq\u0000~\u0000\u0011q\u0000~\u0000xq\u0000~\u0000\fq\u0000~\u0000\u0013q\u0000~\u0000\u000bq\u0000~\u00003"
+"q\u0000~\u0000]q\u0000~\u0000sq\u0000~\u0000\u00b4q\u0000~\u0000\u000eq\u0000~\u0000\nq\u0000~\u0000\u0014x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.protocol.impl.ResponseElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("Response" == ___local)&&("urn:oasis:names:tc:SAML:1.0:protocol" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("Response" == ___local)&&("urn:oasis:names:tc:SAML:1.0:protocol" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("InResponseTo" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.ResponseTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.ResponseElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("IssueInstant" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.ResponseTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.ResponseElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "InResponseTo");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "IssueInstant");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
