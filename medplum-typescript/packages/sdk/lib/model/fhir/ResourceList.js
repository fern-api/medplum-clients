"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResourceList = void 0;
exports.ResourceList = {
    Account: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Account" })),
    ActivityDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ActivityDefinition" })),
    AdverseEvent: (value) => (Object.assign(Object.assign({}, value), { resourceType: "AdverseEvent" })),
    AllergyIntolerance: (value) => (Object.assign(Object.assign({}, value), { resourceType: "AllergyIntolerance" })),
    Appointment: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Appointment" })),
    AppointmentResponse: (value) => (Object.assign(Object.assign({}, value), { resourceType: "AppointmentResponse" })),
    AuditEvent: (value) => (Object.assign(Object.assign({}, value), { resourceType: "AuditEvent" })),
    Basic: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Basic" })),
    Binary: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Binary" })),
    BiologicallyDerivedProduct: (value) => (Object.assign(Object.assign({}, value), { resourceType: "BiologicallyDerivedProduct" })),
    BodyStructure: (value) => (Object.assign(Object.assign({}, value), { resourceType: "BodyStructure" })),
    Bundle: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Bundle" })),
    CapabilityStatement: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CapabilityStatement" })),
    CarePlan: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CarePlan" })),
    CareTeam: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CareTeam" })),
    CatalogEntry: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CatalogEntry" })),
    ChargeItem: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ChargeItem" })),
    ChargeItemDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ChargeItemDefinition" })),
    Claim: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Claim" })),
    ClaimResponse: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ClaimResponse" })),
    ClinicalImpression: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ClinicalImpression" })),
    CodeSystem: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CodeSystem" })),
    Communication: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Communication" })),
    CommunicationRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CommunicationRequest" })),
    CompartmentDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CompartmentDefinition" })),
    Composition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Composition" })),
    ConceptMap: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ConceptMap" })),
    Condition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Condition" })),
    Consent: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Consent" })),
    Contract: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Contract" })),
    Coverage: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Coverage" })),
    CoverageEligibilityRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CoverageEligibilityRequest" })),
    CoverageEligibilityResponse: (value) => (Object.assign(Object.assign({}, value), { resourceType: "CoverageEligibilityResponse" })),
    DetectedIssue: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DetectedIssue" })),
    Device: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Device" })),
    DeviceDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DeviceDefinition" })),
    DeviceMetric: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DeviceMetric" })),
    DeviceRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DeviceRequest" })),
    DeviceUseStatement: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DeviceUseStatement" })),
    DiagnosticReport: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DiagnosticReport" })),
    DocumentManifest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DocumentManifest" })),
    DocumentReference: (value) => (Object.assign(Object.assign({}, value), { resourceType: "DocumentReference" })),
    EffectEvidenceSynthesis: (value) => (Object.assign(Object.assign({}, value), { resourceType: "EffectEvidenceSynthesis" })),
    Encounter: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Encounter" })),
    Endpoint: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Endpoint" })),
    EnrollmentRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "EnrollmentRequest" })),
    EnrollmentResponse: (value) => (Object.assign(Object.assign({}, value), { resourceType: "EnrollmentResponse" })),
    EpisodeOfCare: (value) => (Object.assign(Object.assign({}, value), { resourceType: "EpisodeOfCare" })),
    EventDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "EventDefinition" })),
    Evidence: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Evidence" })),
    EvidenceVariable: (value) => (Object.assign(Object.assign({}, value), { resourceType: "EvidenceVariable" })),
    ExampleScenario: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ExampleScenario" })),
    ExplanationOfBenefit: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ExplanationOfBenefit" })),
    FamilyMemberHistory: (value) => (Object.assign(Object.assign({}, value), { resourceType: "FamilyMemberHistory" })),
    Flag: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Flag" })),
    Goal: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Goal" })),
    GraphDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "GraphDefinition" })),
    Group: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Group" })),
    GuidanceResponse: (value) => (Object.assign(Object.assign({}, value), { resourceType: "GuidanceResponse" })),
    HealthcareService: (value) => (Object.assign(Object.assign({}, value), { resourceType: "HealthcareService" })),
    ImagingStudy: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ImagingStudy" })),
    Immunization: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Immunization" })),
    ImmunizationEvaluation: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ImmunizationEvaluation" })),
    ImmunizationRecommendation: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ImmunizationRecommendation" })),
    ImplementationGuide: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ImplementationGuide" })),
    InsurancePlan: (value) => (Object.assign(Object.assign({}, value), { resourceType: "InsurancePlan" })),
    Invoice: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Invoice" })),
    Library: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Library" })),
    Linkage: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Linkage" })),
    List: (value) => (Object.assign(Object.assign({}, value), { resourceType: "List" })),
    Location: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Location" })),
    Measure: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Measure" })),
    MeasureReport: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MeasureReport" })),
    Media: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Media" })),
    Medication: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Medication" })),
    MedicationAdministration: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicationAdministration" })),
    MedicationDispense: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicationDispense" })),
    MedicationKnowledge: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicationKnowledge" })),
    MedicationRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicationRequest" })),
    MedicationStatement: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicationStatement" })),
    MedicinalProduct: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProduct" })),
    MedicinalProductAuthorization: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductAuthorization" })),
    MedicinalProductContraindication: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductContraindication" })),
    MedicinalProductIndication: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductIndication" })),
    MedicinalProductIngredient: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductIngredient" })),
    MedicinalProductInteraction: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductInteraction" })),
    MedicinalProductManufactured: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductManufactured" })),
    MedicinalProductPackaged: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductPackaged" })),
    MedicinalProductPharmaceutical: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductPharmaceutical" })),
    MedicinalProductUndesirableEffect: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MedicinalProductUndesirableEffect" })),
    MessageDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MessageDefinition" })),
    MessageHeader: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MessageHeader" })),
    MolecularSequence: (value) => (Object.assign(Object.assign({}, value), { resourceType: "MolecularSequence" })),
    NamingSystem: (value) => (Object.assign(Object.assign({}, value), { resourceType: "NamingSystem" })),
    NutritionOrder: (value) => (Object.assign(Object.assign({}, value), { resourceType: "NutritionOrder" })),
    Observation: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Observation" })),
    ObservationDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ObservationDefinition" })),
    OperationDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "OperationDefinition" })),
    OperationOutcome: (value) => (Object.assign(Object.assign({}, value), { resourceType: "OperationOutcome" })),
    Organization: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Organization" })),
    OrganizationAffiliation: (value) => (Object.assign(Object.assign({}, value), { resourceType: "OrganizationAffiliation" })),
    Parameters: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Parameters" })),
    Patient: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Patient" })),
    PaymentNotice: (value) => (Object.assign(Object.assign({}, value), { resourceType: "PaymentNotice" })),
    PaymentReconciliation: (value) => (Object.assign(Object.assign({}, value), { resourceType: "PaymentReconciliation" })),
    Person: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Person" })),
    PlanDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "PlanDefinition" })),
    Practitioner: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Practitioner" })),
    PractitionerRole: (value) => (Object.assign(Object.assign({}, value), { resourceType: "PractitionerRole" })),
    Procedure: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Procedure" })),
    Provenance: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Provenance" })),
    Questionnaire: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Questionnaire" })),
    QuestionnaireResponse: (value) => (Object.assign(Object.assign({}, value), { resourceType: "QuestionnaireResponse" })),
    RelatedPerson: (value) => (Object.assign(Object.assign({}, value), { resourceType: "RelatedPerson" })),
    RequestGroup: (value) => (Object.assign(Object.assign({}, value), { resourceType: "RequestGroup" })),
    ResearchDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ResearchDefinition" })),
    ResearchElementDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ResearchElementDefinition" })),
    ResearchStudy: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ResearchStudy" })),
    ResearchSubject: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ResearchSubject" })),
    RiskAssessment: (value) => (Object.assign(Object.assign({}, value), { resourceType: "RiskAssessment" })),
    RiskEvidenceSynthesis: (value) => (Object.assign(Object.assign({}, value), { resourceType: "RiskEvidenceSynthesis" })),
    Schedule: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Schedule" })),
    SearchParameter: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SearchParameter" })),
    ServiceRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ServiceRequest" })),
    Slot: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Slot" })),
    Specimen: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Specimen" })),
    SpecimenDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SpecimenDefinition" })),
    StructureDefinition: (value) => (Object.assign(Object.assign({}, value), { resourceType: "StructureDefinition" })),
    StructureMap: (value) => (Object.assign(Object.assign({}, value), { resourceType: "StructureMap" })),
    Subscription: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Subscription" })),
    Substance: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Substance" })),
    SubstanceNucleicAcid: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SubstanceNucleicAcid" })),
    SubstancePolymer: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SubstancePolymer" })),
    SubstanceProtein: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SubstanceProtein" })),
    SubstanceReferenceInformation: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SubstanceReferenceInformation" })),
    SubstanceSourceMaterial: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SubstanceSourceMaterial" })),
    SubstanceSpecification: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SubstanceSpecification" })),
    SupplyDelivery: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SupplyDelivery" })),
    SupplyRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "SupplyRequest" })),
    Task: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Task" })),
    TerminologyCapabilities: (value) => (Object.assign(Object.assign({}, value), { resourceType: "TerminologyCapabilities" })),
    TestReport: (value) => (Object.assign(Object.assign({}, value), { resourceType: "TestReport" })),
    TestScript: (value) => (Object.assign(Object.assign({}, value), { resourceType: "TestScript" })),
    ValueSet: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ValueSet" })),
    VerificationResult: (value) => (Object.assign(Object.assign({}, value), { resourceType: "VerificationResult" })),
    VisionPrescription: (value) => (Object.assign(Object.assign({}, value), { resourceType: "VisionPrescription" })),
    Project: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Project" })),
    ClientApplication: (value) => (Object.assign(Object.assign({}, value), { resourceType: "ClientApplication" })),
    User: (value) => (Object.assign(Object.assign({}, value), { resourceType: "User" })),
    Login: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Login" })),
    RefreshToken: (value) => ({
        RefreshToken: value,
        resourceType: "RefreshToken",
    }),
    PasswordChangeRequest: (value) => (Object.assign(Object.assign({}, value), { resourceType: "PasswordChangeRequest" })),
    JsonWebKey: (value) => (Object.assign(Object.assign({}, value), { resourceType: "JsonWebKey" })),
    Bot: (value) => (Object.assign(Object.assign({}, value), { resourceType: "Bot" })),
    AccessPolicy: (value) => (Object.assign(Object.assign({}, value), { resourceType: "AccessPolicy" })),
    UserConfiguration: (value) => (Object.assign(Object.assign({}, value), { resourceType: "UserConfiguration" })),
    _visit: (value, visitor) => {
        switch (value.resourceType) {
            case "Account":
                return visitor.Account(value);
            case "ActivityDefinition":
                return visitor.ActivityDefinition(value);
            case "AdverseEvent":
                return visitor.AdverseEvent(value);
            case "AllergyIntolerance":
                return visitor.AllergyIntolerance(value);
            case "Appointment":
                return visitor.Appointment(value);
            case "AppointmentResponse":
                return visitor.AppointmentResponse(value);
            case "AuditEvent":
                return visitor.AuditEvent(value);
            case "Basic":
                return visitor.Basic(value);
            case "Binary":
                return visitor.Binary(value);
            case "BiologicallyDerivedProduct":
                return visitor.BiologicallyDerivedProduct(value);
            case "BodyStructure":
                return visitor.BodyStructure(value);
            case "Bundle":
                return visitor.Bundle(value);
            case "CapabilityStatement":
                return visitor.CapabilityStatement(value);
            case "CarePlan":
                return visitor.CarePlan(value);
            case "CareTeam":
                return visitor.CareTeam(value);
            case "CatalogEntry":
                return visitor.CatalogEntry(value);
            case "ChargeItem":
                return visitor.ChargeItem(value);
            case "ChargeItemDefinition":
                return visitor.ChargeItemDefinition(value);
            case "Claim":
                return visitor.Claim(value);
            case "ClaimResponse":
                return visitor.ClaimResponse(value);
            case "ClinicalImpression":
                return visitor.ClinicalImpression(value);
            case "CodeSystem":
                return visitor.CodeSystem(value);
            case "Communication":
                return visitor.Communication(value);
            case "CommunicationRequest":
                return visitor.CommunicationRequest(value);
            case "CompartmentDefinition":
                return visitor.CompartmentDefinition(value);
            case "Composition":
                return visitor.Composition(value);
            case "ConceptMap":
                return visitor.ConceptMap(value);
            case "Condition":
                return visitor.Condition(value);
            case "Consent":
                return visitor.Consent(value);
            case "Contract":
                return visitor.Contract(value);
            case "Coverage":
                return visitor.Coverage(value);
            case "CoverageEligibilityRequest":
                return visitor.CoverageEligibilityRequest(value);
            case "CoverageEligibilityResponse":
                return visitor.CoverageEligibilityResponse(value);
            case "DetectedIssue":
                return visitor.DetectedIssue(value);
            case "Device":
                return visitor.Device(value);
            case "DeviceDefinition":
                return visitor.DeviceDefinition(value);
            case "DeviceMetric":
                return visitor.DeviceMetric(value);
            case "DeviceRequest":
                return visitor.DeviceRequest(value);
            case "DeviceUseStatement":
                return visitor.DeviceUseStatement(value);
            case "DiagnosticReport":
                return visitor.DiagnosticReport(value);
            case "DocumentManifest":
                return visitor.DocumentManifest(value);
            case "DocumentReference":
                return visitor.DocumentReference(value);
            case "EffectEvidenceSynthesis":
                return visitor.EffectEvidenceSynthesis(value);
            case "Encounter":
                return visitor.Encounter(value);
            case "Endpoint":
                return visitor.Endpoint(value);
            case "EnrollmentRequest":
                return visitor.EnrollmentRequest(value);
            case "EnrollmentResponse":
                return visitor.EnrollmentResponse(value);
            case "EpisodeOfCare":
                return visitor.EpisodeOfCare(value);
            case "EventDefinition":
                return visitor.EventDefinition(value);
            case "Evidence":
                return visitor.Evidence(value);
            case "EvidenceVariable":
                return visitor.EvidenceVariable(value);
            case "ExampleScenario":
                return visitor.ExampleScenario(value);
            case "ExplanationOfBenefit":
                return visitor.ExplanationOfBenefit(value);
            case "FamilyMemberHistory":
                return visitor.FamilyMemberHistory(value);
            case "Flag":
                return visitor.Flag(value);
            case "Goal":
                return visitor.Goal(value);
            case "GraphDefinition":
                return visitor.GraphDefinition(value);
            case "Group":
                return visitor.Group(value);
            case "GuidanceResponse":
                return visitor.GuidanceResponse(value);
            case "HealthcareService":
                return visitor.HealthcareService(value);
            case "ImagingStudy":
                return visitor.ImagingStudy(value);
            case "Immunization":
                return visitor.Immunization(value);
            case "ImmunizationEvaluation":
                return visitor.ImmunizationEvaluation(value);
            case "ImmunizationRecommendation":
                return visitor.ImmunizationRecommendation(value);
            case "ImplementationGuide":
                return visitor.ImplementationGuide(value);
            case "InsurancePlan":
                return visitor.InsurancePlan(value);
            case "Invoice":
                return visitor.Invoice(value);
            case "Library":
                return visitor.Library(value);
            case "Linkage":
                return visitor.Linkage(value);
            case "List":
                return visitor.List(value);
            case "Location":
                return visitor.Location(value);
            case "Measure":
                return visitor.Measure(value);
            case "MeasureReport":
                return visitor.MeasureReport(value);
            case "Media":
                return visitor.Media(value);
            case "Medication":
                return visitor.Medication(value);
            case "MedicationAdministration":
                return visitor.MedicationAdministration(value);
            case "MedicationDispense":
                return visitor.MedicationDispense(value);
            case "MedicationKnowledge":
                return visitor.MedicationKnowledge(value);
            case "MedicationRequest":
                return visitor.MedicationRequest(value);
            case "MedicationStatement":
                return visitor.MedicationStatement(value);
            case "MedicinalProduct":
                return visitor.MedicinalProduct(value);
            case "MedicinalProductAuthorization":
                return visitor.MedicinalProductAuthorization(value);
            case "MedicinalProductContraindication":
                return visitor.MedicinalProductContraindication(value);
            case "MedicinalProductIndication":
                return visitor.MedicinalProductIndication(value);
            case "MedicinalProductIngredient":
                return visitor.MedicinalProductIngredient(value);
            case "MedicinalProductInteraction":
                return visitor.MedicinalProductInteraction(value);
            case "MedicinalProductManufactured":
                return visitor.MedicinalProductManufactured(value);
            case "MedicinalProductPackaged":
                return visitor.MedicinalProductPackaged(value);
            case "MedicinalProductPharmaceutical":
                return visitor.MedicinalProductPharmaceutical(value);
            case "MedicinalProductUndesirableEffect":
                return visitor.MedicinalProductUndesirableEffect(value);
            case "MessageDefinition":
                return visitor.MessageDefinition(value);
            case "MessageHeader":
                return visitor.MessageHeader(value);
            case "MolecularSequence":
                return visitor.MolecularSequence(value);
            case "NamingSystem":
                return visitor.NamingSystem(value);
            case "NutritionOrder":
                return visitor.NutritionOrder(value);
            case "Observation":
                return visitor.Observation(value);
            case "ObservationDefinition":
                return visitor.ObservationDefinition(value);
            case "OperationDefinition":
                return visitor.OperationDefinition(value);
            case "OperationOutcome":
                return visitor.OperationOutcome(value);
            case "Organization":
                return visitor.Organization(value);
            case "OrganizationAffiliation":
                return visitor.OrganizationAffiliation(value);
            case "Parameters":
                return visitor.Parameters(value);
            case "Patient":
                return visitor.Patient(value);
            case "PaymentNotice":
                return visitor.PaymentNotice(value);
            case "PaymentReconciliation":
                return visitor.PaymentReconciliation(value);
            case "Person":
                return visitor.Person(value);
            case "PlanDefinition":
                return visitor.PlanDefinition(value);
            case "Practitioner":
                return visitor.Practitioner(value);
            case "PractitionerRole":
                return visitor.PractitionerRole(value);
            case "Procedure":
                return visitor.Procedure(value);
            case "Provenance":
                return visitor.Provenance(value);
            case "Questionnaire":
                return visitor.Questionnaire(value);
            case "QuestionnaireResponse":
                return visitor.QuestionnaireResponse(value);
            case "RelatedPerson":
                return visitor.RelatedPerson(value);
            case "RequestGroup":
                return visitor.RequestGroup(value);
            case "ResearchDefinition":
                return visitor.ResearchDefinition(value);
            case "ResearchElementDefinition":
                return visitor.ResearchElementDefinition(value);
            case "ResearchStudy":
                return visitor.ResearchStudy(value);
            case "ResearchSubject":
                return visitor.ResearchSubject(value);
            case "RiskAssessment":
                return visitor.RiskAssessment(value);
            case "RiskEvidenceSynthesis":
                return visitor.RiskEvidenceSynthesis(value);
            case "Schedule":
                return visitor.Schedule(value);
            case "SearchParameter":
                return visitor.SearchParameter(value);
            case "ServiceRequest":
                return visitor.ServiceRequest(value);
            case "Slot":
                return visitor.Slot(value);
            case "Specimen":
                return visitor.Specimen(value);
            case "SpecimenDefinition":
                return visitor.SpecimenDefinition(value);
            case "StructureDefinition":
                return visitor.StructureDefinition(value);
            case "StructureMap":
                return visitor.StructureMap(value);
            case "Subscription":
                return visitor.Subscription(value);
            case "Substance":
                return visitor.Substance(value);
            case "SubstanceNucleicAcid":
                return visitor.SubstanceNucleicAcid(value);
            case "SubstancePolymer":
                return visitor.SubstancePolymer(value);
            case "SubstanceProtein":
                return visitor.SubstanceProtein(value);
            case "SubstanceReferenceInformation":
                return visitor.SubstanceReferenceInformation(value);
            case "SubstanceSourceMaterial":
                return visitor.SubstanceSourceMaterial(value);
            case "SubstanceSpecification":
                return visitor.SubstanceSpecification(value);
            case "SupplyDelivery":
                return visitor.SupplyDelivery(value);
            case "SupplyRequest":
                return visitor.SupplyRequest(value);
            case "Task":
                return visitor.Task(value);
            case "TerminologyCapabilities":
                return visitor.TerminologyCapabilities(value);
            case "TestReport":
                return visitor.TestReport(value);
            case "TestScript":
                return visitor.TestScript(value);
            case "ValueSet":
                return visitor.ValueSet(value);
            case "VerificationResult":
                return visitor.VerificationResult(value);
            case "VisionPrescription":
                return visitor.VisionPrescription(value);
            case "Project":
                return visitor.Project(value);
            case "ClientApplication":
                return visitor.ClientApplication(value);
            case "User":
                return visitor.User(value);
            case "Login":
                return visitor.Login(value);
            case "RefreshToken":
                return visitor.RefreshToken(value.RefreshToken);
            case "PasswordChangeRequest":
                return visitor.PasswordChangeRequest(value);
            case "JsonWebKey":
                return visitor.JsonWebKey(value);
            case "Bot":
                return visitor.Bot(value);
            case "AccessPolicy":
                return visitor.AccessPolicy(value);
            case "UserConfiguration":
                return visitor.UserConfiguration(value);
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ResourceList.js.map