
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

//    private final static QName _AsyncAffiliationProposal_QNAME = new QName("http://ade.service.kiprev.kiman.com.br/", "asyncAffiliationProposal");
//    private final static QName _AsyncAffiliationProposalResponse_QNAME = new QName("http://ade.service.kiprev.kiman.com.br/", "asyncAffiliationProposalResponse");
    private final static QName _FaultInfo_QNAME = new QName("http://ade.service.kiprev.kiman.com.br/", "faultInfo");
    private final static QName _GetAsyncAffiliationProposalResult_QNAME = new QName("http://ade.service.kiprev.kiman.com.br/", "getAsyncAffiliationProposalResult");
    private final static QName _GetAsyncAffiliationProposalResultResponse_QNAME = new QName("http://ade.service.kiprev.kiman.com.br/", "getAsyncAffiliationProposalResultResponse");
    private final static QName _BusinesWSException_QNAME = new QName("http://kiman.com.br/kiprev/service/exception", "BusinesWSException");

    /**
     * 
     */
    public ObjectFactory() {
    }

//    /**
//     * Create an instance of {@link AsyncAffiliationProposal }
//     * 
//     */
//    public AsyncAffiliationProposal createAsyncAffiliationProposal() {
//        return new AsyncAffiliationProposal();
//    }

    /**
     * Create an instance of {@link AsyncAffiliationProposalResponse }
     * 
     */
//    public AsyncAffiliationProposalResponse createAsyncAffiliationProposalResponse() {
//        return new AsyncAffiliationProposalResponse();
//    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link GetAsyncAffiliationProposalResult }
     * 
     */
    public GetAsyncAffiliationProposalResult createGetAsyncAffiliationProposalResult() {
        return new GetAsyncAffiliationProposalResult();
    }

    /**
     * Create an instance of {@link GetAsyncAffiliationProposalResultResponse }
     * 
     */
    public GetAsyncAffiliationProposalResultResponse createGetAsyncAffiliationProposalResultResponse() {
        return new GetAsyncAffiliationProposalResultResponse();
    }

    /**
     * Create an instance of {@link Affiliation }
     * 
     */
    public Affiliation createAffiliation() {
        return new Affiliation();
    }

    /**
     * Create an instance of {@link Broker }
     * 
     */
    public Broker createBroker() {
        return new Broker();
    }

    /**
     * Create an instance of {@link BrokerCategory }
     * 
     */
    public BrokerCategory createBrokerCategory() {
        return new BrokerCategory();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PhysicalPerson }
     * 
     */
    public PhysicalPerson createPhysicalPerson() {
        return new PhysicalPerson();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Benefit }
     * 
     */
    public Benefit createBenefit() {
        return new Benefit();
    }

    /**
     * Create an instance of {@link IncomeType }
     * 
     */
    public IncomeType createIncomeType() {
        return new IncomeType();
    }

    /**
     * Create an instance of {@link Beneficiary }
     * 
     */
    public Beneficiary createBeneficiary() {
        return new Beneficiary();
    }

    /**
     * Create an instance of {@link Fund }
     * 
     */
    public Fund createFund() {
        return new Fund();
    }

    /**
     * Create an instance of {@link Reserve }
     * 
     */
    public Reserve createReserve() {
        return new Reserve();
    }

    /**
     * Create an instance of {@link Objective }
     * 
     */
    public Objective createObjective() {
        return new Objective();
    }

    /**
     * Create an instance of {@link Contribution }
     * 
     */
    public Contribution createContribution() {
        return new Contribution();
    }

    /**
     * Create an instance of {@link ParameterizedValue }
     * 
     */
    public ParameterizedValue createParameterizedValue() {
        return new ParameterizedValue();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Periodicity }
     * 
     */
    public Periodicity createPeriodicity() {
        return new Periodicity();
    }

    /**
     * Create an instance of {@link Balance }
     * 
     */
    public Balance createBalance() {
        return new Balance();
    }

    /**
     * Create an instance of {@link Statement }
     * 
     */
    public Statement createStatement() {
        return new Statement();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link SalesChannel }
     * 
     */
    public SalesChannel createSalesChannel() {
        return new SalesChannel();
    }

    /**
     * Create an instance of {@link SalesChannelAgency }
     * 
     */
    public SalesChannelAgency createSalesChannelAgency() {
        return new SalesChannelAgency();
    }

    /**
     * Create an instance of {@link InsuranceContract }
     * 
     */
    public InsuranceContract createInsuranceContract() {
        return new InsuranceContract();
    }

    /**
     * Create an instance of {@link JuridicPerson }
     * 
     */
    public JuridicPerson createJuridicPerson() {
        return new JuridicPerson();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link PoliticallyExposedData }
     * 
     */
    public PoliticallyExposedData createPoliticallyExposedData() {
        return new PoliticallyExposedData();
    }

    /**
     * Create an instance of {@link QuestionAnswer }
     * 
     */
    public QuestionAnswer createQuestionAnswer() {
        return new QuestionAnswer();
    }

    /**
     * Create an instance of {@link ConsignorUnit }
     * 
     */
    public ConsignorUnit createConsignorUnit() {
        return new ConsignorUnit();
    }

    /**
     * Create an instance of {@link ConsignorUnitBranch }
     * 
     */
    public ConsignorUnitBranch createConsignorUnitBranch() {
        return new ConsignorUnitBranch();
    }

    /**
     * Create an instance of {@link ValidationResult }
     * 
     */
    public ValidationResult createValidationResult() {
        return new ValidationResult();
    }

    /**
     * Create an instance of {@link AdditionalInfo }
     * 
     */
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }

//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncAffiliationProposal }{@code >}}
//     * 
//     */
//    @XmlElementDecl(namespace = "http://ade.service.kiprev.kiman.com.br/", name = "asyncAffiliationProposal")
//    public JAXBElement<AsyncAffiliationProposal> createAsyncAffiliationProposal(AsyncAffiliationProposal value) {
//        return new JAXBElement<AsyncAffiliationProposal>(_AsyncAffiliationProposal_QNAME, AsyncAffiliationProposal.class, null, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncAffiliationProposalResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://ade.service.kiprev.kiman.com.br/", name = "asyncAffiliationProposalResponse")
//    public JAXBElement<AsyncAffiliationProposalResponse> createAsyncAffiliationProposalResponse(AsyncAffiliationProposalResponse value) {
//        return new JAXBElement<AsyncAffiliationProposalResponse>(_AsyncAffiliationProposalResponse_QNAME, AsyncAffiliationProposalResponse.class, null, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.service.kiprev.kiman.com.br/", name = "faultInfo")
    public JAXBElement<FaultInfo> createFaultInfo(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_FaultInfo_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsyncAffiliationProposalResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.service.kiprev.kiman.com.br/", name = "getAsyncAffiliationProposalResult")
    public JAXBElement<GetAsyncAffiliationProposalResult> createGetAsyncAffiliationProposalResult(GetAsyncAffiliationProposalResult value) {
        return new JAXBElement<GetAsyncAffiliationProposalResult>(_GetAsyncAffiliationProposalResult_QNAME, GetAsyncAffiliationProposalResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsyncAffiliationProposalResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.service.kiprev.kiman.com.br/", name = "getAsyncAffiliationProposalResultResponse")
    public JAXBElement<GetAsyncAffiliationProposalResultResponse> createGetAsyncAffiliationProposalResultResponse(GetAsyncAffiliationProposalResultResponse value) {
        return new JAXBElement<GetAsyncAffiliationProposalResultResponse>(_GetAsyncAffiliationProposalResultResponse_QNAME, GetAsyncAffiliationProposalResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiman.com.br/kiprev/service/exception", name = "BusinesWSException")
    public JAXBElement<FaultInfo> createBusinesWSException(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_BusinesWSException_QNAME, FaultInfo.class, null, value);
    }

}
