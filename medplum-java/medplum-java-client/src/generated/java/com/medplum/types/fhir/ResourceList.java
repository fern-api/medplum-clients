package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Enclosing
public final class ResourceList {
  private final InternalValue value;

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  private ResourceList(InternalValue value) {
    this.value = value;
  }

  @JsonValue
  InternalValue getInternalValue() {
    return value;
  }

  public static ResourceList Account(Account value) {
    return new ResourceList(InternalAccountValue.of(value));
  }

  public static ResourceList ActivityDefinition(ActivityDefinition value) {
    return new ResourceList(InternalActivityDefinitionValue.of(value));
  }

  public static ResourceList AdverseEvent(AdverseEvent value) {
    return new ResourceList(InternalAdverseEventValue.of(value));
  }

  public static ResourceList AllergyIntolerance(AllergyIntolerance value) {
    return new ResourceList(InternalAllergyIntoleranceValue.of(value));
  }

  public static ResourceList Appointment(Appointment value) {
    return new ResourceList(InternalAppointmentValue.of(value));
  }

  public static ResourceList AppointmentResponse(AppointmentResponse value) {
    return new ResourceList(InternalAppointmentResponseValue.of(value));
  }

  public static ResourceList AuditEvent(AuditEvent value) {
    return new ResourceList(InternalAuditEventValue.of(value));
  }

  public static ResourceList Basic(Basic value) {
    return new ResourceList(InternalBasicValue.of(value));
  }

  public static ResourceList Binary(Binary value) {
    return new ResourceList(InternalBinaryValue.of(value));
  }

  public static ResourceList BiologicallyDerivedProduct(BiologicallyDerivedProduct value) {
    return new ResourceList(InternalBiologicallyDerivedProductValue.of(value));
  }

  public static ResourceList BodyStructure(BodyStructure value) {
    return new ResourceList(InternalBodyStructureValue.of(value));
  }

  public static ResourceList Bundle(Bundle value) {
    return new ResourceList(InternalBundleValue.of(value));
  }

  public static ResourceList CapabilityStatement(CapabilityStatement value) {
    return new ResourceList(InternalCapabilityStatementValue.of(value));
  }

  public static ResourceList CarePlan(CarePlan value) {
    return new ResourceList(InternalCarePlanValue.of(value));
  }

  public static ResourceList CareTeam(CareTeam value) {
    return new ResourceList(InternalCareTeamValue.of(value));
  }

  public static ResourceList CatalogEntry(CatalogEntry value) {
    return new ResourceList(InternalCatalogEntryValue.of(value));
  }

  public static ResourceList ChargeItem(ChargeItem value) {
    return new ResourceList(InternalChargeItemValue.of(value));
  }

  public static ResourceList ChargeItemDefinition(ChargeItemDefinition value) {
    return new ResourceList(InternalChargeItemDefinitionValue.of(value));
  }

  public static ResourceList Claim(Claim value) {
    return new ResourceList(InternalClaimValue.of(value));
  }

  public static ResourceList ClaimResponse(ClaimResponse value) {
    return new ResourceList(InternalClaimResponseValue.of(value));
  }

  public static ResourceList ClinicalImpression(ClinicalImpression value) {
    return new ResourceList(InternalClinicalImpressionValue.of(value));
  }

  public static ResourceList CodeSystem(CodeSystem value) {
    return new ResourceList(InternalCodeSystemValue.of(value));
  }

  public static ResourceList Communication(Communication value) {
    return new ResourceList(InternalCommunicationValue.of(value));
  }

  public static ResourceList CommunicationRequest(CommunicationRequest value) {
    return new ResourceList(InternalCommunicationRequestValue.of(value));
  }

  public static ResourceList CompartmentDefinition(CompartmentDefinition value) {
    return new ResourceList(InternalCompartmentDefinitionValue.of(value));
  }

  public static ResourceList Composition(Composition value) {
    return new ResourceList(InternalCompositionValue.of(value));
  }

  public static ResourceList ConceptMap(ConceptMap value) {
    return new ResourceList(InternalConceptMapValue.of(value));
  }

  public static ResourceList Condition(Condition value) {
    return new ResourceList(InternalConditionValue.of(value));
  }

  public static ResourceList Consent(Consent value) {
    return new ResourceList(InternalConsentValue.of(value));
  }

  public static ResourceList Contract(Contract value) {
    return new ResourceList(InternalContractValue.of(value));
  }

  public static ResourceList Coverage(Coverage value) {
    return new ResourceList(InternalCoverageValue.of(value));
  }

  public static ResourceList CoverageEligibilityRequest(CoverageEligibilityRequest value) {
    return new ResourceList(InternalCoverageEligibilityRequestValue.of(value));
  }

  public static ResourceList CoverageEligibilityResponse(CoverageEligibilityResponse value) {
    return new ResourceList(InternalCoverageEligibilityResponseValue.of(value));
  }

  public static ResourceList DetectedIssue(DetectedIssue value) {
    return new ResourceList(InternalDetectedIssueValue.of(value));
  }

  public static ResourceList Device(Device value) {
    return new ResourceList(InternalDeviceValue.of(value));
  }

  public static ResourceList DeviceDefinition(DeviceDefinition value) {
    return new ResourceList(InternalDeviceDefinitionValue.of(value));
  }

  public static ResourceList DeviceMetric(DeviceMetric value) {
    return new ResourceList(InternalDeviceMetricValue.of(value));
  }

  public static ResourceList DeviceRequest(DeviceRequest value) {
    return new ResourceList(InternalDeviceRequestValue.of(value));
  }

  public static ResourceList DeviceUseStatement(DeviceUseStatement value) {
    return new ResourceList(InternalDeviceUseStatementValue.of(value));
  }

  public static ResourceList DiagnosticReport(DiagnosticReport value) {
    return new ResourceList(InternalDiagnosticReportValue.of(value));
  }

  public static ResourceList DocumentManifest(DocumentManifest value) {
    return new ResourceList(InternalDocumentManifestValue.of(value));
  }

  public static ResourceList DocumentReference(DocumentReference value) {
    return new ResourceList(InternalDocumentReferenceValue.of(value));
  }

  public static ResourceList EffectEvidenceSynthesis(EffectEvidenceSynthesis value) {
    return new ResourceList(InternalEffectEvidenceSynthesisValue.of(value));
  }

  public static ResourceList Encounter(Encounter value) {
    return new ResourceList(InternalEncounterValue.of(value));
  }

  public static ResourceList Endpoint(Endpoint value) {
    return new ResourceList(InternalEndpointValue.of(value));
  }

  public static ResourceList EnrollmentRequest(EnrollmentRequest value) {
    return new ResourceList(InternalEnrollmentRequestValue.of(value));
  }

  public static ResourceList EnrollmentResponse(EnrollmentResponse value) {
    return new ResourceList(InternalEnrollmentResponseValue.of(value));
  }

  public static ResourceList EpisodeOfCare(EpisodeOfCare value) {
    return new ResourceList(InternalEpisodeOfCareValue.of(value));
  }

  public static ResourceList EventDefinition(EventDefinition value) {
    return new ResourceList(InternalEventDefinitionValue.of(value));
  }

  public static ResourceList Evidence(Evidence value) {
    return new ResourceList(InternalEvidenceValue.of(value));
  }

  public static ResourceList EvidenceVariable(EvidenceVariable value) {
    return new ResourceList(InternalEvidenceVariableValue.of(value));
  }

  public static ResourceList ExampleScenario(ExampleScenario value) {
    return new ResourceList(InternalExampleScenarioValue.of(value));
  }

  public static ResourceList ExplanationOfBenefit(ExplanationOfBenefit value) {
    return new ResourceList(InternalExplanationOfBenefitValue.of(value));
  }

  public static ResourceList FamilyMemberHistory(FamilyMemberHistory value) {
    return new ResourceList(InternalFamilyMemberHistoryValue.of(value));
  }

  public static ResourceList Flag(Flag value) {
    return new ResourceList(InternalFlagValue.of(value));
  }

  public static ResourceList Goal(Goal value) {
    return new ResourceList(InternalGoalValue.of(value));
  }

  public static ResourceList GraphDefinition(GraphDefinition value) {
    return new ResourceList(InternalGraphDefinitionValue.of(value));
  }

  public static ResourceList Group(Group value) {
    return new ResourceList(InternalGroupValue.of(value));
  }

  public static ResourceList GuidanceResponse(GuidanceResponse value) {
    return new ResourceList(InternalGuidanceResponseValue.of(value));
  }

  public static ResourceList HealthcareService(HealthcareService value) {
    return new ResourceList(InternalHealthcareServiceValue.of(value));
  }

  public static ResourceList ImagingStudy(ImagingStudy value) {
    return new ResourceList(InternalImagingStudyValue.of(value));
  }

  public static ResourceList Immunization(Immunization value) {
    return new ResourceList(InternalImmunizationValue.of(value));
  }

  public static ResourceList ImmunizationEvaluation(ImmunizationEvaluation value) {
    return new ResourceList(InternalImmunizationEvaluationValue.of(value));
  }

  public static ResourceList ImmunizationRecommendation(ImmunizationRecommendation value) {
    return new ResourceList(InternalImmunizationRecommendationValue.of(value));
  }

  public static ResourceList ImplementationGuide(ImplementationGuide value) {
    return new ResourceList(InternalImplementationGuideValue.of(value));
  }

  public static ResourceList InsurancePlan(InsurancePlan value) {
    return new ResourceList(InternalInsurancePlanValue.of(value));
  }

  public static ResourceList Invoice(Invoice value) {
    return new ResourceList(InternalInvoiceValue.of(value));
  }

  public static ResourceList Library(Library value) {
    return new ResourceList(InternalLibraryValue.of(value));
  }

  public static ResourceList Linkage(Linkage value) {
    return new ResourceList(InternalLinkageValue.of(value));
  }

  public static ResourceList List(List value) {
    return new ResourceList(InternalListValue.of(value));
  }

  public static ResourceList Location(Location value) {
    return new ResourceList(InternalLocationValue.of(value));
  }

  public static ResourceList Measure(Measure value) {
    return new ResourceList(InternalMeasureValue.of(value));
  }

  public static ResourceList MeasureReport(MeasureReport value) {
    return new ResourceList(InternalMeasureReportValue.of(value));
  }

  public static ResourceList Media(Media value) {
    return new ResourceList(InternalMediaValue.of(value));
  }

  public static ResourceList Medication(Medication value) {
    return new ResourceList(InternalMedicationValue.of(value));
  }

  public static ResourceList MedicationAdministration(MedicationAdministration value) {
    return new ResourceList(InternalMedicationAdministrationValue.of(value));
  }

  public static ResourceList MedicationDispense(MedicationDispense value) {
    return new ResourceList(InternalMedicationDispenseValue.of(value));
  }

  public static ResourceList MedicationKnowledge(MedicationKnowledge value) {
    return new ResourceList(InternalMedicationKnowledgeValue.of(value));
  }

  public static ResourceList MedicationRequest(MedicationRequest value) {
    return new ResourceList(InternalMedicationRequestValue.of(value));
  }

  public static ResourceList MedicationStatement(MedicationStatement value) {
    return new ResourceList(InternalMedicationStatementValue.of(value));
  }

  public static ResourceList MedicinalProduct(MedicinalProduct value) {
    return new ResourceList(InternalMedicinalProductValue.of(value));
  }

  public static ResourceList MedicinalProductAuthorization(MedicinalProductAuthorization value) {
    return new ResourceList(InternalMedicinalProductAuthorizationValue.of(value));
  }

  public static ResourceList MedicinalProductContraindication(
      MedicinalProductContraindication value) {
    return new ResourceList(InternalMedicinalProductContraindicationValue.of(value));
  }

  public static ResourceList MedicinalProductIndication(MedicinalProductIndication value) {
    return new ResourceList(InternalMedicinalProductIndicationValue.of(value));
  }

  public static ResourceList MedicinalProductIngredient(MedicinalProductIngredient value) {
    return new ResourceList(InternalMedicinalProductIngredientValue.of(value));
  }

  public static ResourceList MedicinalProductInteraction(MedicinalProductInteraction value) {
    return new ResourceList(InternalMedicinalProductInteractionValue.of(value));
  }

  public static ResourceList MedicinalProductManufactured(MedicinalProductManufactured value) {
    return new ResourceList(InternalMedicinalProductManufacturedValue.of(value));
  }

  public static ResourceList MedicinalProductPackaged(MedicinalProductPackaged value) {
    return new ResourceList(InternalMedicinalProductPackagedValue.of(value));
  }

  public static ResourceList MedicinalProductPharmaceutical(MedicinalProductPharmaceutical value) {
    return new ResourceList(InternalMedicinalProductPharmaceuticalValue.of(value));
  }

  public static ResourceList MedicinalProductUndesirableEffect(
      MedicinalProductUndesirableEffect value) {
    return new ResourceList(InternalMedicinalProductUndesirableEffectValue.of(value));
  }

  public static ResourceList MessageDefinition(MessageDefinition value) {
    return new ResourceList(InternalMessageDefinitionValue.of(value));
  }

  public static ResourceList MessageHeader(MessageHeader value) {
    return new ResourceList(InternalMessageHeaderValue.of(value));
  }

  public static ResourceList MolecularSequence(MolecularSequence value) {
    return new ResourceList(InternalMolecularSequenceValue.of(value));
  }

  public static ResourceList NamingSystem(NamingSystem value) {
    return new ResourceList(InternalNamingSystemValue.of(value));
  }

  public static ResourceList NutritionOrder(NutritionOrder value) {
    return new ResourceList(InternalNutritionOrderValue.of(value));
  }

  public static ResourceList Observation(Observation value) {
    return new ResourceList(InternalObservationValue.of(value));
  }

  public static ResourceList ObservationDefinition(ObservationDefinition value) {
    return new ResourceList(InternalObservationDefinitionValue.of(value));
  }

  public static ResourceList OperationDefinition(OperationDefinition value) {
    return new ResourceList(InternalOperationDefinitionValue.of(value));
  }

  public static ResourceList OperationOutcome(OperationOutcome value) {
    return new ResourceList(InternalOperationOutcomeValue.of(value));
  }

  public static ResourceList Organization(Organization value) {
    return new ResourceList(InternalOrganizationValue.of(value));
  }

  public static ResourceList OrganizationAffiliation(OrganizationAffiliation value) {
    return new ResourceList(InternalOrganizationAffiliationValue.of(value));
  }

  public static ResourceList Parameters(Parameters value) {
    return new ResourceList(InternalParametersValue.of(value));
  }

  public static ResourceList Patient(Patient value) {
    return new ResourceList(InternalPatientValue.of(value));
  }

  public static ResourceList PaymentNotice(PaymentNotice value) {
    return new ResourceList(InternalPaymentNoticeValue.of(value));
  }

  public static ResourceList PaymentReconciliation(PaymentReconciliation value) {
    return new ResourceList(InternalPaymentReconciliationValue.of(value));
  }

  public static ResourceList Person(Person value) {
    return new ResourceList(InternalPersonValue.of(value));
  }

  public static ResourceList PlanDefinition(PlanDefinition value) {
    return new ResourceList(InternalPlanDefinitionValue.of(value));
  }

  public static ResourceList Practitioner(Practitioner value) {
    return new ResourceList(InternalPractitionerValue.of(value));
  }

  public static ResourceList PractitionerRole(PractitionerRole value) {
    return new ResourceList(InternalPractitionerRoleValue.of(value));
  }

  public static ResourceList Procedure(Procedure value) {
    return new ResourceList(InternalProcedureValue.of(value));
  }

  public static ResourceList Provenance(Provenance value) {
    return new ResourceList(InternalProvenanceValue.of(value));
  }

  public static ResourceList Questionnaire(Questionnaire value) {
    return new ResourceList(InternalQuestionnaireValue.of(value));
  }

  public static ResourceList QuestionnaireResponse(QuestionnaireResponse value) {
    return new ResourceList(InternalQuestionnaireResponseValue.of(value));
  }

  public static ResourceList RelatedPerson(RelatedPerson value) {
    return new ResourceList(InternalRelatedPersonValue.of(value));
  }

  public static ResourceList RequestGroup(RequestGroup value) {
    return new ResourceList(InternalRequestGroupValue.of(value));
  }

  public static ResourceList ResearchDefinition(ResearchDefinition value) {
    return new ResourceList(InternalResearchDefinitionValue.of(value));
  }

  public static ResourceList ResearchElementDefinition(ResearchElementDefinition value) {
    return new ResourceList(InternalResearchElementDefinitionValue.of(value));
  }

  public static ResourceList ResearchStudy(ResearchStudy value) {
    return new ResourceList(InternalResearchStudyValue.of(value));
  }

  public static ResourceList ResearchSubject(ResearchSubject value) {
    return new ResourceList(InternalResearchSubjectValue.of(value));
  }

  public static ResourceList RiskAssessment(RiskAssessment value) {
    return new ResourceList(InternalRiskAssessmentValue.of(value));
  }

  public static ResourceList RiskEvidenceSynthesis(RiskEvidenceSynthesis value) {
    return new ResourceList(InternalRiskEvidenceSynthesisValue.of(value));
  }

  public static ResourceList Schedule(Schedule value) {
    return new ResourceList(InternalScheduleValue.of(value));
  }

  public static ResourceList SearchParameter(SearchParameter value) {
    return new ResourceList(InternalSearchParameterValue.of(value));
  }

  public static ResourceList ServiceRequest(ServiceRequest value) {
    return new ResourceList(InternalServiceRequestValue.of(value));
  }

  public static ResourceList Slot(Slot value) {
    return new ResourceList(InternalSlotValue.of(value));
  }

  public static ResourceList Specimen(Specimen value) {
    return new ResourceList(InternalSpecimenValue.of(value));
  }

  public static ResourceList SpecimenDefinition(SpecimenDefinition value) {
    return new ResourceList(InternalSpecimenDefinitionValue.of(value));
  }

  public static ResourceList StructureDefinition(StructureDefinition value) {
    return new ResourceList(InternalStructureDefinitionValue.of(value));
  }

  public static ResourceList StructureMap(StructureMap value) {
    return new ResourceList(InternalStructureMapValue.of(value));
  }

  public static ResourceList Subscription(Subscription value) {
    return new ResourceList(InternalSubscriptionValue.of(value));
  }

  public static ResourceList Substance(Substance value) {
    return new ResourceList(InternalSubstanceValue.of(value));
  }

  public static ResourceList SubstanceNucleicAcid(SubstanceNucleicAcid value) {
    return new ResourceList(InternalSubstanceNucleicAcidValue.of(value));
  }

  public static ResourceList SubstancePolymer(SubstancePolymer value) {
    return new ResourceList(InternalSubstancePolymerValue.of(value));
  }

  public static ResourceList SubstanceProtein(SubstanceProtein value) {
    return new ResourceList(InternalSubstanceProteinValue.of(value));
  }

  public static ResourceList SubstanceReferenceInformation(SubstanceReferenceInformation value) {
    return new ResourceList(InternalSubstanceReferenceInformationValue.of(value));
  }

  public static ResourceList SubstanceSourceMaterial(SubstanceSourceMaterial value) {
    return new ResourceList(InternalSubstanceSourceMaterialValue.of(value));
  }

  public static ResourceList SubstanceSpecification(SubstanceSpecification value) {
    return new ResourceList(InternalSubstanceSpecificationValue.of(value));
  }

  public static ResourceList SupplyDelivery(SupplyDelivery value) {
    return new ResourceList(InternalSupplyDeliveryValue.of(value));
  }

  public static ResourceList SupplyRequest(SupplyRequest value) {
    return new ResourceList(InternalSupplyRequestValue.of(value));
  }

  public static ResourceList Task(Task value) {
    return new ResourceList(InternalTaskValue.of(value));
  }

  public static ResourceList TerminologyCapabilities(TerminologyCapabilities value) {
    return new ResourceList(InternalTerminologyCapabilitiesValue.of(value));
  }

  public static ResourceList TestReport(TestReport value) {
    return new ResourceList(InternalTestReportValue.of(value));
  }

  public static ResourceList TestScript(TestScript value) {
    return new ResourceList(InternalTestScriptValue.of(value));
  }

  public static ResourceList ValueSet(ValueSet value) {
    return new ResourceList(InternalValueSetValue.of(value));
  }

  public static ResourceList VerificationResult(VerificationResult value) {
    return new ResourceList(InternalVerificationResultValue.of(value));
  }

  public static ResourceList VisionPrescription(VisionPrescription value) {
    return new ResourceList(InternalVisionPrescriptionValue.of(value));
  }

  public static ResourceList Project(Project value) {
    return new ResourceList(InternalProjectValue.of(value));
  }

  public static ResourceList ClientApplication(ClientApplication value) {
    return new ResourceList(InternalClientApplicationValue.of(value));
  }

  public static ResourceList User(User value) {
    return new ResourceList(InternalUserValue.of(value));
  }

  public static ResourceList Login(Login value) {
    return new ResourceList(InternalLoginValue.of(value));
  }

  public static ResourceList RefreshToken(RefreshToken value) {
    return new ResourceList(InternalRefreshTokenValue.of(value));
  }

  public static ResourceList PasswordChangeRequest(PasswordChangeRequest value) {
    return new ResourceList(InternalPasswordChangeRequestValue.of(value));
  }

  public static ResourceList JsonWebKey(JsonWebKey value) {
    return new ResourceList(InternalJsonWebKeyValue.of(value));
  }

  public static ResourceList Bot(Bot value) {
    return new ResourceList(InternalBotValue.of(value));
  }

  public static ResourceList AccessPolicy(AccessPolicy value) {
    return new ResourceList(InternalAccessPolicyValue.of(value));
  }

  public static ResourceList UserConfiguration(UserConfiguration value) {
    return new ResourceList(InternalUserConfigurationValue.of(value));
  }

  public boolean isImmunizationRecommendation() {
    return value instanceof InternalImmunizationRecommendationValue;
  }

  public boolean isChargeItemDefinition() {
    return value instanceof InternalChargeItemDefinitionValue;
  }

  public boolean isPerson() {
    return value instanceof InternalPersonValue;
  }

  public boolean isCapabilityStatement() {
    return value instanceof InternalCapabilityStatementValue;
  }

  public boolean isMessageHeader() {
    return value instanceof InternalMessageHeaderValue;
  }

  public boolean isClaimResponse() {
    return value instanceof InternalClaimResponseValue;
  }

  public boolean isTerminologyCapabilities() {
    return value instanceof InternalTerminologyCapabilitiesValue;
  }

  public boolean isMedication() {
    return value instanceof InternalMedicationValue;
  }

  public boolean isVisionPrescription() {
    return value instanceof InternalVisionPrescriptionValue;
  }

  public boolean isQuestionnaireResponse() {
    return value instanceof InternalQuestionnaireResponseValue;
  }

  public boolean isConceptMap() {
    return value instanceof InternalConceptMapValue;
  }

  public boolean isCoverageEligibilityRequest() {
    return value instanceof InternalCoverageEligibilityRequestValue;
  }

  public boolean isFlag() {
    return value instanceof InternalFlagValue;
  }

  public boolean isSearchParameter() {
    return value instanceof InternalSearchParameterValue;
  }

  public boolean isSubstanceSpecification() {
    return value instanceof InternalSubstanceSpecificationValue;
  }

  public boolean isRelatedPerson() {
    return value instanceof InternalRelatedPersonValue;
  }

  public boolean isMeasureReport() {
    return value instanceof InternalMeasureReportValue;
  }

  public boolean isResearchElementDefinition() {
    return value instanceof InternalResearchElementDefinitionValue;
  }

  public boolean isPaymentReconciliation() {
    return value instanceof InternalPaymentReconciliationValue;
  }

  public boolean isCompartmentDefinition() {
    return value instanceof InternalCompartmentDefinitionValue;
  }

  public boolean isResearchStudy() {
    return value instanceof InternalResearchStudyValue;
  }

  public boolean isCareTeam() {
    return value instanceof InternalCareTeamValue;
  }

  public boolean isNamingSystem() {
    return value instanceof InternalNamingSystemValue;
  }

  public boolean isDocumentManifest() {
    return value instanceof InternalDocumentManifestValue;
  }

  public boolean isFamilyMemberHistory() {
    return value instanceof InternalFamilyMemberHistoryValue;
  }

  public boolean isSpecimen() {
    return value instanceof InternalSpecimenValue;
  }

  public boolean isSupplyDelivery() {
    return value instanceof InternalSupplyDeliveryValue;
  }

  public boolean isAppointment() {
    return value instanceof InternalAppointmentValue;
  }

  public boolean isJsonWebKey() {
    return value instanceof InternalJsonWebKeyValue;
  }

  public boolean isObservation() {
    return value instanceof InternalObservationValue;
  }

  public boolean isClinicalImpression() {
    return value instanceof InternalClinicalImpressionValue;
  }

  public boolean isComposition() {
    return value instanceof InternalCompositionValue;
  }

  public boolean isCarePlan() {
    return value instanceof InternalCarePlanValue;
  }

  public boolean isBasic() {
    return value instanceof InternalBasicValue;
  }

  public boolean isEvidenceVariable() {
    return value instanceof InternalEvidenceVariableValue;
  }

  public boolean isSchedule() {
    return value instanceof InternalScheduleValue;
  }

  public boolean isClaim() {
    return value instanceof InternalClaimValue;
  }

  public boolean isObservationDefinition() {
    return value instanceof InternalObservationDefinitionValue;
  }

  public boolean isSubstanceNucleicAcid() {
    return value instanceof InternalSubstanceNucleicAcidValue;
  }

  public boolean isDocumentReference() {
    return value instanceof InternalDocumentReferenceValue;
  }

  public boolean isTestScript() {
    return value instanceof InternalTestScriptValue;
  }

  public boolean isRefreshToken() {
    return value instanceof InternalRefreshTokenValue;
  }

  public boolean isAuditEvent() {
    return value instanceof InternalAuditEventValue;
  }

  public boolean isPaymentNotice() {
    return value instanceof InternalPaymentNoticeValue;
  }

  public boolean isAppointmentResponse() {
    return value instanceof InternalAppointmentResponseValue;
  }

  public boolean isResearchDefinition() {
    return value instanceof InternalResearchDefinitionValue;
  }

  public boolean isPasswordChangeRequest() {
    return value instanceof InternalPasswordChangeRequestValue;
  }

  public boolean isMedicinalProductContraindication() {
    return value instanceof InternalMedicinalProductContraindicationValue;
  }

  public boolean isMeasure() {
    return value instanceof InternalMeasureValue;
  }

  public boolean isPatient() {
    return value instanceof InternalPatientValue;
  }

  public boolean isPlanDefinition() {
    return value instanceof InternalPlanDefinitionValue;
  }

  public boolean isHealthcareService() {
    return value instanceof InternalHealthcareServiceValue;
  }

  public boolean isSubstanceReferenceInformation() {
    return value instanceof InternalSubstanceReferenceInformationValue;
  }

  public boolean isMedicationRequest() {
    return value instanceof InternalMedicationRequestValue;
  }

  public boolean isDiagnosticReport() {
    return value instanceof InternalDiagnosticReportValue;
  }

  public boolean isMessageDefinition() {
    return value instanceof InternalMessageDefinitionValue;
  }

  public boolean isDevice() {
    return value instanceof InternalDeviceValue;
  }

  public boolean isEpisodeOfCare() {
    return value instanceof InternalEpisodeOfCareValue;
  }

  public boolean isImmunization() {
    return value instanceof InternalImmunizationValue;
  }

  public boolean isEnrollmentRequest() {
    return value instanceof InternalEnrollmentRequestValue;
  }

  public boolean isDeviceDefinition() {
    return value instanceof InternalDeviceDefinitionValue;
  }

  public boolean isMedicinalProduct() {
    return value instanceof InternalMedicinalProductValue;
  }

  public boolean isMedicationKnowledge() {
    return value instanceof InternalMedicationKnowledgeValue;
  }

  public boolean isEndpoint() {
    return value instanceof InternalEndpointValue;
  }

  public boolean isEncounter() {
    return value instanceof InternalEncounterValue;
  }

  public boolean isMedicinalProductPackaged() {
    return value instanceof InternalMedicinalProductPackagedValue;
  }

  public boolean isProcedure() {
    return value instanceof InternalProcedureValue;
  }

  public boolean isEventDefinition() {
    return value instanceof InternalEventDefinitionValue;
  }

  public boolean isMedia() {
    return value instanceof InternalMediaValue;
  }

  public boolean isInvoice() {
    return value instanceof InternalInvoiceValue;
  }

  public boolean isMedicinalProductInteraction() {
    return value instanceof InternalMedicinalProductInteractionValue;
  }

  public boolean isMedicinalProductPharmaceutical() {
    return value instanceof InternalMedicinalProductPharmaceuticalValue;
  }

  public boolean isContract() {
    return value instanceof InternalContractValue;
  }

  public boolean isAccount() {
    return value instanceof InternalAccountValue;
  }

  public boolean isGroup() {
    return value instanceof InternalGroupValue;
  }

  public boolean isPractitionerRole() {
    return value instanceof InternalPractitionerRoleValue;
  }

  public boolean isDeviceUseStatement() {
    return value instanceof InternalDeviceUseStatementValue;
  }

  public boolean isSlot() {
    return value instanceof InternalSlotValue;
  }

  public boolean isDeviceRequest() {
    return value instanceof InternalDeviceRequestValue;
  }

  public boolean isBodyStructure() {
    return value instanceof InternalBodyStructureValue;
  }

  public boolean isGoal() {
    return value instanceof InternalGoalValue;
  }

  public boolean isCommunicationRequest() {
    return value instanceof InternalCommunicationRequestValue;
  }

  public boolean isStructureMap() {
    return value instanceof InternalStructureMapValue;
  }

  public boolean isImagingStudy() {
    return value instanceof InternalImagingStudyValue;
  }

  public boolean isAdverseEvent() {
    return value instanceof InternalAdverseEventValue;
  }

  public boolean isSubstance() {
    return value instanceof InternalSubstanceValue;
  }

  public boolean isSubscription() {
    return value instanceof InternalSubscriptionValue;
  }

  public boolean isTask() {
    return value instanceof InternalTaskValue;
  }

  public boolean isMedicinalProductIndication() {
    return value instanceof InternalMedicinalProductIndicationValue;
  }

  public boolean isMedicinalProductManufactured() {
    return value instanceof InternalMedicinalProductManufacturedValue;
  }

  public boolean isEvidence() {
    return value instanceof InternalEvidenceValue;
  }

  public boolean isCodeSystem() {
    return value instanceof InternalCodeSystemValue;
  }

  public boolean isMedicationDispense() {
    return value instanceof InternalMedicationDispenseValue;
  }

  public boolean isSubstancePolymer() {
    return value instanceof InternalSubstancePolymerValue;
  }

  public boolean isDetectedIssue() {
    return value instanceof InternalDetectedIssueValue;
  }

  public boolean isInsurancePlan() {
    return value instanceof InternalInsurancePlanValue;
  }

  public boolean isImmunizationEvaluation() {
    return value instanceof InternalImmunizationEvaluationValue;
  }

  public boolean isMedicinalProductIngredient() {
    return value instanceof InternalMedicinalProductIngredientValue;
  }

  public boolean isCommunication() {
    return value instanceof InternalCommunicationValue;
  }

  public boolean isGuidanceResponse() {
    return value instanceof InternalGuidanceResponseValue;
  }

  public boolean isBundle() {
    return value instanceof InternalBundleValue;
  }

  public boolean isAccessPolicy() {
    return value instanceof InternalAccessPolicyValue;
  }

  public boolean isEffectEvidenceSynthesis() {
    return value instanceof InternalEffectEvidenceSynthesisValue;
  }

  public boolean isMolecularSequence() {
    return value instanceof InternalMolecularSequenceValue;
  }

  public boolean isRequestGroup() {
    return value instanceof InternalRequestGroupValue;
  }

  public boolean isCondition() {
    return value instanceof InternalConditionValue;
  }

  public boolean isMedicationStatement() {
    return value instanceof InternalMedicationStatementValue;
  }

  public boolean isOperationDefinition() {
    return value instanceof InternalOperationDefinitionValue;
  }

  public boolean isOrganization() {
    return value instanceof InternalOrganizationValue;
  }

  public boolean isOrganizationAffiliation() {
    return value instanceof InternalOrganizationAffiliationValue;
  }

  public boolean isResearchSubject() {
    return value instanceof InternalResearchSubjectValue;
  }

  public boolean isExampleScenario() {
    return value instanceof InternalExampleScenarioValue;
  }

  public boolean isLinkage() {
    return value instanceof InternalLinkageValue;
  }

  public boolean isRiskEvidenceSynthesis() {
    return value instanceof InternalRiskEvidenceSynthesisValue;
  }

  public boolean isMedicationAdministration() {
    return value instanceof InternalMedicationAdministrationValue;
  }

  public boolean isProject() {
    return value instanceof InternalProjectValue;
  }

  public boolean isSupplyRequest() {
    return value instanceof InternalSupplyRequestValue;
  }

  public boolean isCatalogEntry() {
    return value instanceof InternalCatalogEntryValue;
  }

  public boolean isSubstanceSourceMaterial() {
    return value instanceof InternalSubstanceSourceMaterialValue;
  }

  public boolean isOperationOutcome() {
    return value instanceof InternalOperationOutcomeValue;
  }

  public boolean isPractitioner() {
    return value instanceof InternalPractitionerValue;
  }

  public boolean isBiologicallyDerivedProduct() {
    return value instanceof InternalBiologicallyDerivedProductValue;
  }

  public boolean isImplementationGuide() {
    return value instanceof InternalImplementationGuideValue;
  }

  public boolean isTestReport() {
    return value instanceof InternalTestReportValue;
  }

  public boolean isQuestionnaire() {
    return value instanceof InternalQuestionnaireValue;
  }

  public boolean isBot() {
    return value instanceof InternalBotValue;
  }

  public boolean isMedicinalProductUndesirableEffect() {
    return value instanceof InternalMedicinalProductUndesirableEffectValue;
  }

  public boolean isVerificationResult() {
    return value instanceof InternalVerificationResultValue;
  }

  public boolean isUser() {
    return value instanceof InternalUserValue;
  }

  public boolean isConsent() {
    return value instanceof InternalConsentValue;
  }

  public boolean isChargeItem() {
    return value instanceof InternalChargeItemValue;
  }

  public boolean isList() {
    return value instanceof InternalListValue;
  }

  public boolean isClientApplication() {
    return value instanceof InternalClientApplicationValue;
  }

  public boolean isLocation() {
    return value instanceof InternalLocationValue;
  }

  public boolean isEnrollmentResponse() {
    return value instanceof InternalEnrollmentResponseValue;
  }

  public boolean isRiskAssessment() {
    return value instanceof InternalRiskAssessmentValue;
  }

  public boolean isGraphDefinition() {
    return value instanceof InternalGraphDefinitionValue;
  }

  public boolean isProvenance() {
    return value instanceof InternalProvenanceValue;
  }

  public boolean isSubstanceProtein() {
    return value instanceof InternalSubstanceProteinValue;
  }

  public boolean isSpecimenDefinition() {
    return value instanceof InternalSpecimenDefinitionValue;
  }

  public boolean isCoverage() {
    return value instanceof InternalCoverageValue;
  }

  public boolean isValueSet() {
    return value instanceof InternalValueSetValue;
  }

  public boolean isAllergyIntolerance() {
    return value instanceof InternalAllergyIntoleranceValue;
  }

  public boolean isBinary() {
    return value instanceof InternalBinaryValue;
  }

  public boolean isParameters() {
    return value instanceof InternalParametersValue;
  }

  public boolean isActivityDefinition() {
    return value instanceof InternalActivityDefinitionValue;
  }

  public boolean isMedicinalProductAuthorization() {
    return value instanceof InternalMedicinalProductAuthorizationValue;
  }

  public boolean isLibrary() {
    return value instanceof InternalLibraryValue;
  }

  public boolean isNutritionOrder() {
    return value instanceof InternalNutritionOrderValue;
  }

  public boolean isCoverageEligibilityResponse() {
    return value instanceof InternalCoverageEligibilityResponseValue;
  }

  public boolean isExplanationOfBenefit() {
    return value instanceof InternalExplanationOfBenefitValue;
  }

  public boolean isLogin() {
    return value instanceof InternalLoginValue;
  }

  public boolean isUserConfiguration() {
    return value instanceof InternalUserConfigurationValue;
  }

  public boolean isServiceRequest() {
    return value instanceof InternalServiceRequestValue;
  }

  public boolean isDeviceMetric() {
    return value instanceof InternalDeviceMetricValue;
  }

  public boolean isStructureDefinition() {
    return value instanceof InternalStructureDefinitionValue;
  }

  public Optional<Account> getAccount() {
    if (isAccount()) {
      return Optional.of(((InternalAccountValue) value).Account());
    }
    return Optional.empty();
  }

  public Optional<ActivityDefinition> getActivityDefinition() {
    if (isActivityDefinition()) {
      return Optional.of(((InternalActivityDefinitionValue) value).ActivityDefinition());
    }
    return Optional.empty();
  }

  public Optional<AdverseEvent> getAdverseEvent() {
    if (isAdverseEvent()) {
      return Optional.of(((InternalAdverseEventValue) value).AdverseEvent());
    }
    return Optional.empty();
  }

  public Optional<AllergyIntolerance> getAllergyIntolerance() {
    if (isAllergyIntolerance()) {
      return Optional.of(((InternalAllergyIntoleranceValue) value).AllergyIntolerance());
    }
    return Optional.empty();
  }

  public Optional<Appointment> getAppointment() {
    if (isAppointment()) {
      return Optional.of(((InternalAppointmentValue) value).Appointment());
    }
    return Optional.empty();
  }

  public Optional<AppointmentResponse> getAppointmentResponse() {
    if (isAppointmentResponse()) {
      return Optional.of(((InternalAppointmentResponseValue) value).AppointmentResponse());
    }
    return Optional.empty();
  }

  public Optional<AuditEvent> getAuditEvent() {
    if (isAuditEvent()) {
      return Optional.of(((InternalAuditEventValue) value).AuditEvent());
    }
    return Optional.empty();
  }

  public Optional<Basic> getBasic() {
    if (isBasic()) {
      return Optional.of(((InternalBasicValue) value).Basic());
    }
    return Optional.empty();
  }

  public Optional<Binary> getBinary() {
    if (isBinary()) {
      return Optional.of(((InternalBinaryValue) value).Binary());
    }
    return Optional.empty();
  }

  public Optional<BiologicallyDerivedProduct> getBiologicallyDerivedProduct() {
    if (isBiologicallyDerivedProduct()) {
      return Optional.of(((InternalBiologicallyDerivedProductValue) value).BiologicallyDerivedProduct());
    }
    return Optional.empty();
  }

  public Optional<BodyStructure> getBodyStructure() {
    if (isBodyStructure()) {
      return Optional.of(((InternalBodyStructureValue) value).BodyStructure());
    }
    return Optional.empty();
  }

  public Optional<Bundle> getBundle() {
    if (isBundle()) {
      return Optional.of(((InternalBundleValue) value).Bundle());
    }
    return Optional.empty();
  }

  public Optional<CapabilityStatement> getCapabilityStatement() {
    if (isCapabilityStatement()) {
      return Optional.of(((InternalCapabilityStatementValue) value).CapabilityStatement());
    }
    return Optional.empty();
  }

  public Optional<CarePlan> getCarePlan() {
    if (isCarePlan()) {
      return Optional.of(((InternalCarePlanValue) value).CarePlan());
    }
    return Optional.empty();
  }

  public Optional<CareTeam> getCareTeam() {
    if (isCareTeam()) {
      return Optional.of(((InternalCareTeamValue) value).CareTeam());
    }
    return Optional.empty();
  }

  public Optional<CatalogEntry> getCatalogEntry() {
    if (isCatalogEntry()) {
      return Optional.of(((InternalCatalogEntryValue) value).CatalogEntry());
    }
    return Optional.empty();
  }

  public Optional<ChargeItem> getChargeItem() {
    if (isChargeItem()) {
      return Optional.of(((InternalChargeItemValue) value).ChargeItem());
    }
    return Optional.empty();
  }

  public Optional<ChargeItemDefinition> getChargeItemDefinition() {
    if (isChargeItemDefinition()) {
      return Optional.of(((InternalChargeItemDefinitionValue) value).ChargeItemDefinition());
    }
    return Optional.empty();
  }

  public Optional<Claim> getClaim() {
    if (isClaim()) {
      return Optional.of(((InternalClaimValue) value).Claim());
    }
    return Optional.empty();
  }

  public Optional<ClaimResponse> getClaimResponse() {
    if (isClaimResponse()) {
      return Optional.of(((InternalClaimResponseValue) value).ClaimResponse());
    }
    return Optional.empty();
  }

  public Optional<ClinicalImpression> getClinicalImpression() {
    if (isClinicalImpression()) {
      return Optional.of(((InternalClinicalImpressionValue) value).ClinicalImpression());
    }
    return Optional.empty();
  }

  public Optional<CodeSystem> getCodeSystem() {
    if (isCodeSystem()) {
      return Optional.of(((InternalCodeSystemValue) value).CodeSystem());
    }
    return Optional.empty();
  }

  public Optional<Communication> getCommunication() {
    if (isCommunication()) {
      return Optional.of(((InternalCommunicationValue) value).Communication());
    }
    return Optional.empty();
  }

  public Optional<CommunicationRequest> getCommunicationRequest() {
    if (isCommunicationRequest()) {
      return Optional.of(((InternalCommunicationRequestValue) value).CommunicationRequest());
    }
    return Optional.empty();
  }

  public Optional<CompartmentDefinition> getCompartmentDefinition() {
    if (isCompartmentDefinition()) {
      return Optional.of(((InternalCompartmentDefinitionValue) value).CompartmentDefinition());
    }
    return Optional.empty();
  }

  public Optional<Composition> getComposition() {
    if (isComposition()) {
      return Optional.of(((InternalCompositionValue) value).Composition());
    }
    return Optional.empty();
  }

  public Optional<ConceptMap> getConceptMap() {
    if (isConceptMap()) {
      return Optional.of(((InternalConceptMapValue) value).ConceptMap());
    }
    return Optional.empty();
  }

  public Optional<Condition> getCondition() {
    if (isCondition()) {
      return Optional.of(((InternalConditionValue) value).Condition());
    }
    return Optional.empty();
  }

  public Optional<Consent> getConsent() {
    if (isConsent()) {
      return Optional.of(((InternalConsentValue) value).Consent());
    }
    return Optional.empty();
  }

  public Optional<Contract> getContract() {
    if (isContract()) {
      return Optional.of(((InternalContractValue) value).Contract());
    }
    return Optional.empty();
  }

  public Optional<Coverage> getCoverage() {
    if (isCoverage()) {
      return Optional.of(((InternalCoverageValue) value).Coverage());
    }
    return Optional.empty();
  }

  public Optional<CoverageEligibilityRequest> getCoverageEligibilityRequest() {
    if (isCoverageEligibilityRequest()) {
      return Optional.of(((InternalCoverageEligibilityRequestValue) value).CoverageEligibilityRequest());
    }
    return Optional.empty();
  }

  public Optional<CoverageEligibilityResponse> getCoverageEligibilityResponse() {
    if (isCoverageEligibilityResponse()) {
      return Optional.of(((InternalCoverageEligibilityResponseValue) value).CoverageEligibilityResponse());
    }
    return Optional.empty();
  }

  public Optional<DetectedIssue> getDetectedIssue() {
    if (isDetectedIssue()) {
      return Optional.of(((InternalDetectedIssueValue) value).DetectedIssue());
    }
    return Optional.empty();
  }

  public Optional<Device> getDevice() {
    if (isDevice()) {
      return Optional.of(((InternalDeviceValue) value).Device());
    }
    return Optional.empty();
  }

  public Optional<DeviceDefinition> getDeviceDefinition() {
    if (isDeviceDefinition()) {
      return Optional.of(((InternalDeviceDefinitionValue) value).DeviceDefinition());
    }
    return Optional.empty();
  }

  public Optional<DeviceMetric> getDeviceMetric() {
    if (isDeviceMetric()) {
      return Optional.of(((InternalDeviceMetricValue) value).DeviceMetric());
    }
    return Optional.empty();
  }

  public Optional<DeviceRequest> getDeviceRequest() {
    if (isDeviceRequest()) {
      return Optional.of(((InternalDeviceRequestValue) value).DeviceRequest());
    }
    return Optional.empty();
  }

  public Optional<DeviceUseStatement> getDeviceUseStatement() {
    if (isDeviceUseStatement()) {
      return Optional.of(((InternalDeviceUseStatementValue) value).DeviceUseStatement());
    }
    return Optional.empty();
  }

  public Optional<DiagnosticReport> getDiagnosticReport() {
    if (isDiagnosticReport()) {
      return Optional.of(((InternalDiagnosticReportValue) value).DiagnosticReport());
    }
    return Optional.empty();
  }

  public Optional<DocumentManifest> getDocumentManifest() {
    if (isDocumentManifest()) {
      return Optional.of(((InternalDocumentManifestValue) value).DocumentManifest());
    }
    return Optional.empty();
  }

  public Optional<DocumentReference> getDocumentReference() {
    if (isDocumentReference()) {
      return Optional.of(((InternalDocumentReferenceValue) value).DocumentReference());
    }
    return Optional.empty();
  }

  public Optional<EffectEvidenceSynthesis> getEffectEvidenceSynthesis() {
    if (isEffectEvidenceSynthesis()) {
      return Optional.of(((InternalEffectEvidenceSynthesisValue) value).EffectEvidenceSynthesis());
    }
    return Optional.empty();
  }

  public Optional<Encounter> getEncounter() {
    if (isEncounter()) {
      return Optional.of(((InternalEncounterValue) value).Encounter());
    }
    return Optional.empty();
  }

  public Optional<Endpoint> getEndpoint() {
    if (isEndpoint()) {
      return Optional.of(((InternalEndpointValue) value).Endpoint());
    }
    return Optional.empty();
  }

  public Optional<EnrollmentRequest> getEnrollmentRequest() {
    if (isEnrollmentRequest()) {
      return Optional.of(((InternalEnrollmentRequestValue) value).EnrollmentRequest());
    }
    return Optional.empty();
  }

  public Optional<EnrollmentResponse> getEnrollmentResponse() {
    if (isEnrollmentResponse()) {
      return Optional.of(((InternalEnrollmentResponseValue) value).EnrollmentResponse());
    }
    return Optional.empty();
  }

  public Optional<EpisodeOfCare> getEpisodeOfCare() {
    if (isEpisodeOfCare()) {
      return Optional.of(((InternalEpisodeOfCareValue) value).EpisodeOfCare());
    }
    return Optional.empty();
  }

  public Optional<EventDefinition> getEventDefinition() {
    if (isEventDefinition()) {
      return Optional.of(((InternalEventDefinitionValue) value).EventDefinition());
    }
    return Optional.empty();
  }

  public Optional<Evidence> getEvidence() {
    if (isEvidence()) {
      return Optional.of(((InternalEvidenceValue) value).Evidence());
    }
    return Optional.empty();
  }

  public Optional<EvidenceVariable> getEvidenceVariable() {
    if (isEvidenceVariable()) {
      return Optional.of(((InternalEvidenceVariableValue) value).EvidenceVariable());
    }
    return Optional.empty();
  }

  public Optional<ExampleScenario> getExampleScenario() {
    if (isExampleScenario()) {
      return Optional.of(((InternalExampleScenarioValue) value).ExampleScenario());
    }
    return Optional.empty();
  }

  public Optional<ExplanationOfBenefit> getExplanationOfBenefit() {
    if (isExplanationOfBenefit()) {
      return Optional.of(((InternalExplanationOfBenefitValue) value).ExplanationOfBenefit());
    }
    return Optional.empty();
  }

  public Optional<FamilyMemberHistory> getFamilyMemberHistory() {
    if (isFamilyMemberHistory()) {
      return Optional.of(((InternalFamilyMemberHistoryValue) value).FamilyMemberHistory());
    }
    return Optional.empty();
  }

  public Optional<Flag> getFlag() {
    if (isFlag()) {
      return Optional.of(((InternalFlagValue) value).Flag());
    }
    return Optional.empty();
  }

  public Optional<Goal> getGoal() {
    if (isGoal()) {
      return Optional.of(((InternalGoalValue) value).Goal());
    }
    return Optional.empty();
  }

  public Optional<GraphDefinition> getGraphDefinition() {
    if (isGraphDefinition()) {
      return Optional.of(((InternalGraphDefinitionValue) value).GraphDefinition());
    }
    return Optional.empty();
  }

  public Optional<Group> getGroup() {
    if (isGroup()) {
      return Optional.of(((InternalGroupValue) value).Group());
    }
    return Optional.empty();
  }

  public Optional<GuidanceResponse> getGuidanceResponse() {
    if (isGuidanceResponse()) {
      return Optional.of(((InternalGuidanceResponseValue) value).GuidanceResponse());
    }
    return Optional.empty();
  }

  public Optional<HealthcareService> getHealthcareService() {
    if (isHealthcareService()) {
      return Optional.of(((InternalHealthcareServiceValue) value).HealthcareService());
    }
    return Optional.empty();
  }

  public Optional<ImagingStudy> getImagingStudy() {
    if (isImagingStudy()) {
      return Optional.of(((InternalImagingStudyValue) value).ImagingStudy());
    }
    return Optional.empty();
  }

  public Optional<Immunization> getImmunization() {
    if (isImmunization()) {
      return Optional.of(((InternalImmunizationValue) value).Immunization());
    }
    return Optional.empty();
  }

  public Optional<ImmunizationEvaluation> getImmunizationEvaluation() {
    if (isImmunizationEvaluation()) {
      return Optional.of(((InternalImmunizationEvaluationValue) value).ImmunizationEvaluation());
    }
    return Optional.empty();
  }

  public Optional<ImmunizationRecommendation> getImmunizationRecommendation() {
    if (isImmunizationRecommendation()) {
      return Optional.of(((InternalImmunizationRecommendationValue) value).ImmunizationRecommendation());
    }
    return Optional.empty();
  }

  public Optional<ImplementationGuide> getImplementationGuide() {
    if (isImplementationGuide()) {
      return Optional.of(((InternalImplementationGuideValue) value).ImplementationGuide());
    }
    return Optional.empty();
  }

  public Optional<InsurancePlan> getInsurancePlan() {
    if (isInsurancePlan()) {
      return Optional.of(((InternalInsurancePlanValue) value).InsurancePlan());
    }
    return Optional.empty();
  }

  public Optional<Invoice> getInvoice() {
    if (isInvoice()) {
      return Optional.of(((InternalInvoiceValue) value).Invoice());
    }
    return Optional.empty();
  }

  public Optional<Library> getLibrary() {
    if (isLibrary()) {
      return Optional.of(((InternalLibraryValue) value).Library());
    }
    return Optional.empty();
  }

  public Optional<Linkage> getLinkage() {
    if (isLinkage()) {
      return Optional.of(((InternalLinkageValue) value).Linkage());
    }
    return Optional.empty();
  }

  public Optional<List> getList() {
    if (isList()) {
      return Optional.of(((InternalListValue) value).List());
    }
    return Optional.empty();
  }

  public Optional<Location> getLocation() {
    if (isLocation()) {
      return Optional.of(((InternalLocationValue) value).Location());
    }
    return Optional.empty();
  }

  public Optional<Measure> getMeasure() {
    if (isMeasure()) {
      return Optional.of(((InternalMeasureValue) value).Measure());
    }
    return Optional.empty();
  }

  public Optional<MeasureReport> getMeasureReport() {
    if (isMeasureReport()) {
      return Optional.of(((InternalMeasureReportValue) value).MeasureReport());
    }
    return Optional.empty();
  }

  public Optional<Media> getMedia() {
    if (isMedia()) {
      return Optional.of(((InternalMediaValue) value).Media());
    }
    return Optional.empty();
  }

  public Optional<Medication> getMedication() {
    if (isMedication()) {
      return Optional.of(((InternalMedicationValue) value).Medication());
    }
    return Optional.empty();
  }

  public Optional<MedicationAdministration> getMedicationAdministration() {
    if (isMedicationAdministration()) {
      return Optional.of(((InternalMedicationAdministrationValue) value).MedicationAdministration());
    }
    return Optional.empty();
  }

  public Optional<MedicationDispense> getMedicationDispense() {
    if (isMedicationDispense()) {
      return Optional.of(((InternalMedicationDispenseValue) value).MedicationDispense());
    }
    return Optional.empty();
  }

  public Optional<MedicationKnowledge> getMedicationKnowledge() {
    if (isMedicationKnowledge()) {
      return Optional.of(((InternalMedicationKnowledgeValue) value).MedicationKnowledge());
    }
    return Optional.empty();
  }

  public Optional<MedicationRequest> getMedicationRequest() {
    if (isMedicationRequest()) {
      return Optional.of(((InternalMedicationRequestValue) value).MedicationRequest());
    }
    return Optional.empty();
  }

  public Optional<MedicationStatement> getMedicationStatement() {
    if (isMedicationStatement()) {
      return Optional.of(((InternalMedicationStatementValue) value).MedicationStatement());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProduct> getMedicinalProduct() {
    if (isMedicinalProduct()) {
      return Optional.of(((InternalMedicinalProductValue) value).MedicinalProduct());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductAuthorization> getMedicinalProductAuthorization() {
    if (isMedicinalProductAuthorization()) {
      return Optional.of(((InternalMedicinalProductAuthorizationValue) value).MedicinalProductAuthorization());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductContraindication> getMedicinalProductContraindication() {
    if (isMedicinalProductContraindication()) {
      return Optional.of(((InternalMedicinalProductContraindicationValue) value).MedicinalProductContraindication());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductIndication> getMedicinalProductIndication() {
    if (isMedicinalProductIndication()) {
      return Optional.of(((InternalMedicinalProductIndicationValue) value).MedicinalProductIndication());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductIngredient> getMedicinalProductIngredient() {
    if (isMedicinalProductIngredient()) {
      return Optional.of(((InternalMedicinalProductIngredientValue) value).MedicinalProductIngredient());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductInteraction> getMedicinalProductInteraction() {
    if (isMedicinalProductInteraction()) {
      return Optional.of(((InternalMedicinalProductInteractionValue) value).MedicinalProductInteraction());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductManufactured> getMedicinalProductManufactured() {
    if (isMedicinalProductManufactured()) {
      return Optional.of(((InternalMedicinalProductManufacturedValue) value).MedicinalProductManufactured());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductPackaged> getMedicinalProductPackaged() {
    if (isMedicinalProductPackaged()) {
      return Optional.of(((InternalMedicinalProductPackagedValue) value).MedicinalProductPackaged());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductPharmaceutical> getMedicinalProductPharmaceutical() {
    if (isMedicinalProductPharmaceutical()) {
      return Optional.of(((InternalMedicinalProductPharmaceuticalValue) value).MedicinalProductPharmaceutical());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductUndesirableEffect> getMedicinalProductUndesirableEffect() {
    if (isMedicinalProductUndesirableEffect()) {
      return Optional.of(((InternalMedicinalProductUndesirableEffectValue) value).MedicinalProductUndesirableEffect());
    }
    return Optional.empty();
  }

  public Optional<MessageDefinition> getMessageDefinition() {
    if (isMessageDefinition()) {
      return Optional.of(((InternalMessageDefinitionValue) value).MessageDefinition());
    }
    return Optional.empty();
  }

  public Optional<MessageHeader> getMessageHeader() {
    if (isMessageHeader()) {
      return Optional.of(((InternalMessageHeaderValue) value).MessageHeader());
    }
    return Optional.empty();
  }

  public Optional<MolecularSequence> getMolecularSequence() {
    if (isMolecularSequence()) {
      return Optional.of(((InternalMolecularSequenceValue) value).MolecularSequence());
    }
    return Optional.empty();
  }

  public Optional<NamingSystem> getNamingSystem() {
    if (isNamingSystem()) {
      return Optional.of(((InternalNamingSystemValue) value).NamingSystem());
    }
    return Optional.empty();
  }

  public Optional<NutritionOrder> getNutritionOrder() {
    if (isNutritionOrder()) {
      return Optional.of(((InternalNutritionOrderValue) value).NutritionOrder());
    }
    return Optional.empty();
  }

  public Optional<Observation> getObservation() {
    if (isObservation()) {
      return Optional.of(((InternalObservationValue) value).Observation());
    }
    return Optional.empty();
  }

  public Optional<ObservationDefinition> getObservationDefinition() {
    if (isObservationDefinition()) {
      return Optional.of(((InternalObservationDefinitionValue) value).ObservationDefinition());
    }
    return Optional.empty();
  }

  public Optional<OperationDefinition> getOperationDefinition() {
    if (isOperationDefinition()) {
      return Optional.of(((InternalOperationDefinitionValue) value).OperationDefinition());
    }
    return Optional.empty();
  }

  public Optional<OperationOutcome> getOperationOutcome() {
    if (isOperationOutcome()) {
      return Optional.of(((InternalOperationOutcomeValue) value).OperationOutcome());
    }
    return Optional.empty();
  }

  public Optional<Organization> getOrganization() {
    if (isOrganization()) {
      return Optional.of(((InternalOrganizationValue) value).Organization());
    }
    return Optional.empty();
  }

  public Optional<OrganizationAffiliation> getOrganizationAffiliation() {
    if (isOrganizationAffiliation()) {
      return Optional.of(((InternalOrganizationAffiliationValue) value).OrganizationAffiliation());
    }
    return Optional.empty();
  }

  public Optional<Parameters> getParameters() {
    if (isParameters()) {
      return Optional.of(((InternalParametersValue) value).Parameters());
    }
    return Optional.empty();
  }

  public Optional<Patient> getPatient() {
    if (isPatient()) {
      return Optional.of(((InternalPatientValue) value).Patient());
    }
    return Optional.empty();
  }

  public Optional<PaymentNotice> getPaymentNotice() {
    if (isPaymentNotice()) {
      return Optional.of(((InternalPaymentNoticeValue) value).PaymentNotice());
    }
    return Optional.empty();
  }

  public Optional<PaymentReconciliation> getPaymentReconciliation() {
    if (isPaymentReconciliation()) {
      return Optional.of(((InternalPaymentReconciliationValue) value).PaymentReconciliation());
    }
    return Optional.empty();
  }

  public Optional<Person> getPerson() {
    if (isPerson()) {
      return Optional.of(((InternalPersonValue) value).Person());
    }
    return Optional.empty();
  }

  public Optional<PlanDefinition> getPlanDefinition() {
    if (isPlanDefinition()) {
      return Optional.of(((InternalPlanDefinitionValue) value).PlanDefinition());
    }
    return Optional.empty();
  }

  public Optional<Practitioner> getPractitioner() {
    if (isPractitioner()) {
      return Optional.of(((InternalPractitionerValue) value).Practitioner());
    }
    return Optional.empty();
  }

  public Optional<PractitionerRole> getPractitionerRole() {
    if (isPractitionerRole()) {
      return Optional.of(((InternalPractitionerRoleValue) value).PractitionerRole());
    }
    return Optional.empty();
  }

  public Optional<Procedure> getProcedure() {
    if (isProcedure()) {
      return Optional.of(((InternalProcedureValue) value).Procedure());
    }
    return Optional.empty();
  }

  public Optional<Provenance> getProvenance() {
    if (isProvenance()) {
      return Optional.of(((InternalProvenanceValue) value).Provenance());
    }
    return Optional.empty();
  }

  public Optional<Questionnaire> getQuestionnaire() {
    if (isQuestionnaire()) {
      return Optional.of(((InternalQuestionnaireValue) value).Questionnaire());
    }
    return Optional.empty();
  }

  public Optional<QuestionnaireResponse> getQuestionnaireResponse() {
    if (isQuestionnaireResponse()) {
      return Optional.of(((InternalQuestionnaireResponseValue) value).QuestionnaireResponse());
    }
    return Optional.empty();
  }

  public Optional<RelatedPerson> getRelatedPerson() {
    if (isRelatedPerson()) {
      return Optional.of(((InternalRelatedPersonValue) value).RelatedPerson());
    }
    return Optional.empty();
  }

  public Optional<RequestGroup> getRequestGroup() {
    if (isRequestGroup()) {
      return Optional.of(((InternalRequestGroupValue) value).RequestGroup());
    }
    return Optional.empty();
  }

  public Optional<ResearchDefinition> getResearchDefinition() {
    if (isResearchDefinition()) {
      return Optional.of(((InternalResearchDefinitionValue) value).ResearchDefinition());
    }
    return Optional.empty();
  }

  public Optional<ResearchElementDefinition> getResearchElementDefinition() {
    if (isResearchElementDefinition()) {
      return Optional.of(((InternalResearchElementDefinitionValue) value).ResearchElementDefinition());
    }
    return Optional.empty();
  }

  public Optional<ResearchStudy> getResearchStudy() {
    if (isResearchStudy()) {
      return Optional.of(((InternalResearchStudyValue) value).ResearchStudy());
    }
    return Optional.empty();
  }

  public Optional<ResearchSubject> getResearchSubject() {
    if (isResearchSubject()) {
      return Optional.of(((InternalResearchSubjectValue) value).ResearchSubject());
    }
    return Optional.empty();
  }

  public Optional<RiskAssessment> getRiskAssessment() {
    if (isRiskAssessment()) {
      return Optional.of(((InternalRiskAssessmentValue) value).RiskAssessment());
    }
    return Optional.empty();
  }

  public Optional<RiskEvidenceSynthesis> getRiskEvidenceSynthesis() {
    if (isRiskEvidenceSynthesis()) {
      return Optional.of(((InternalRiskEvidenceSynthesisValue) value).RiskEvidenceSynthesis());
    }
    return Optional.empty();
  }

  public Optional<Schedule> getSchedule() {
    if (isSchedule()) {
      return Optional.of(((InternalScheduleValue) value).Schedule());
    }
    return Optional.empty();
  }

  public Optional<SearchParameter> getSearchParameter() {
    if (isSearchParameter()) {
      return Optional.of(((InternalSearchParameterValue) value).SearchParameter());
    }
    return Optional.empty();
  }

  public Optional<ServiceRequest> getServiceRequest() {
    if (isServiceRequest()) {
      return Optional.of(((InternalServiceRequestValue) value).ServiceRequest());
    }
    return Optional.empty();
  }

  public Optional<Slot> getSlot() {
    if (isSlot()) {
      return Optional.of(((InternalSlotValue) value).Slot());
    }
    return Optional.empty();
  }

  public Optional<Specimen> getSpecimen() {
    if (isSpecimen()) {
      return Optional.of(((InternalSpecimenValue) value).Specimen());
    }
    return Optional.empty();
  }

  public Optional<SpecimenDefinition> getSpecimenDefinition() {
    if (isSpecimenDefinition()) {
      return Optional.of(((InternalSpecimenDefinitionValue) value).SpecimenDefinition());
    }
    return Optional.empty();
  }

  public Optional<StructureDefinition> getStructureDefinition() {
    if (isStructureDefinition()) {
      return Optional.of(((InternalStructureDefinitionValue) value).StructureDefinition());
    }
    return Optional.empty();
  }

  public Optional<StructureMap> getStructureMap() {
    if (isStructureMap()) {
      return Optional.of(((InternalStructureMapValue) value).StructureMap());
    }
    return Optional.empty();
  }

  public Optional<Subscription> getSubscription() {
    if (isSubscription()) {
      return Optional.of(((InternalSubscriptionValue) value).Subscription());
    }
    return Optional.empty();
  }

  public Optional<Substance> getSubstance() {
    if (isSubstance()) {
      return Optional.of(((InternalSubstanceValue) value).Substance());
    }
    return Optional.empty();
  }

  public Optional<SubstanceNucleicAcid> getSubstanceNucleicAcid() {
    if (isSubstanceNucleicAcid()) {
      return Optional.of(((InternalSubstanceNucleicAcidValue) value).SubstanceNucleicAcid());
    }
    return Optional.empty();
  }

  public Optional<SubstancePolymer> getSubstancePolymer() {
    if (isSubstancePolymer()) {
      return Optional.of(((InternalSubstancePolymerValue) value).SubstancePolymer());
    }
    return Optional.empty();
  }

  public Optional<SubstanceProtein> getSubstanceProtein() {
    if (isSubstanceProtein()) {
      return Optional.of(((InternalSubstanceProteinValue) value).SubstanceProtein());
    }
    return Optional.empty();
  }

  public Optional<SubstanceReferenceInformation> getSubstanceReferenceInformation() {
    if (isSubstanceReferenceInformation()) {
      return Optional.of(((InternalSubstanceReferenceInformationValue) value).SubstanceReferenceInformation());
    }
    return Optional.empty();
  }

  public Optional<SubstanceSourceMaterial> getSubstanceSourceMaterial() {
    if (isSubstanceSourceMaterial()) {
      return Optional.of(((InternalSubstanceSourceMaterialValue) value).SubstanceSourceMaterial());
    }
    return Optional.empty();
  }

  public Optional<SubstanceSpecification> getSubstanceSpecification() {
    if (isSubstanceSpecification()) {
      return Optional.of(((InternalSubstanceSpecificationValue) value).SubstanceSpecification());
    }
    return Optional.empty();
  }

  public Optional<SupplyDelivery> getSupplyDelivery() {
    if (isSupplyDelivery()) {
      return Optional.of(((InternalSupplyDeliveryValue) value).SupplyDelivery());
    }
    return Optional.empty();
  }

  public Optional<SupplyRequest> getSupplyRequest() {
    if (isSupplyRequest()) {
      return Optional.of(((InternalSupplyRequestValue) value).SupplyRequest());
    }
    return Optional.empty();
  }

  public Optional<Task> getTask() {
    if (isTask()) {
      return Optional.of(((InternalTaskValue) value).Task());
    }
    return Optional.empty();
  }

  public Optional<TerminologyCapabilities> getTerminologyCapabilities() {
    if (isTerminologyCapabilities()) {
      return Optional.of(((InternalTerminologyCapabilitiesValue) value).TerminologyCapabilities());
    }
    return Optional.empty();
  }

  public Optional<TestReport> getTestReport() {
    if (isTestReport()) {
      return Optional.of(((InternalTestReportValue) value).TestReport());
    }
    return Optional.empty();
  }

  public Optional<TestScript> getTestScript() {
    if (isTestScript()) {
      return Optional.of(((InternalTestScriptValue) value).TestScript());
    }
    return Optional.empty();
  }

  public Optional<ValueSet> getValueSet() {
    if (isValueSet()) {
      return Optional.of(((InternalValueSetValue) value).ValueSet());
    }
    return Optional.empty();
  }

  public Optional<VerificationResult> getVerificationResult() {
    if (isVerificationResult()) {
      return Optional.of(((InternalVerificationResultValue) value).VerificationResult());
    }
    return Optional.empty();
  }

  public Optional<VisionPrescription> getVisionPrescription() {
    if (isVisionPrescription()) {
      return Optional.of(((InternalVisionPrescriptionValue) value).VisionPrescription());
    }
    return Optional.empty();
  }

  public Optional<Project> getProject() {
    if (isProject()) {
      return Optional.of(((InternalProjectValue) value).Project());
    }
    return Optional.empty();
  }

  public Optional<ClientApplication> getClientApplication() {
    if (isClientApplication()) {
      return Optional.of(((InternalClientApplicationValue) value).ClientApplication());
    }
    return Optional.empty();
  }

  public Optional<User> getUser() {
    if (isUser()) {
      return Optional.of(((InternalUserValue) value).User());
    }
    return Optional.empty();
  }

  public Optional<Login> getLogin() {
    if (isLogin()) {
      return Optional.of(((InternalLoginValue) value).Login());
    }
    return Optional.empty();
  }

  public Optional<RefreshToken> getRefreshToken() {
    if (isRefreshToken()) {
      return Optional.of(((InternalRefreshTokenValue) value).RefreshToken());
    }
    return Optional.empty();
  }

  public Optional<PasswordChangeRequest> getPasswordChangeRequest() {
    if (isPasswordChangeRequest()) {
      return Optional.of(((InternalPasswordChangeRequestValue) value).PasswordChangeRequest());
    }
    return Optional.empty();
  }

  public Optional<JsonWebKey> getJsonWebKey() {
    if (isJsonWebKey()) {
      return Optional.of(((InternalJsonWebKeyValue) value).JsonWebKey());
    }
    return Optional.empty();
  }

  public Optional<Bot> getBot() {
    if (isBot()) {
      return Optional.of(((InternalBotValue) value).Bot());
    }
    return Optional.empty();
  }

  public Optional<AccessPolicy> getAccessPolicy() {
    if (isAccessPolicy()) {
      return Optional.of(((InternalAccessPolicyValue) value).AccessPolicy());
    }
    return Optional.empty();
  }

  public Optional<UserConfiguration> getUserConfiguration() {
    if (isUserConfiguration()) {
      return Optional.of(((InternalUserConfigurationValue) value).UserConfiguration());
    }
    return Optional.empty();
  }

  public <T> T accept(Visitor<T> visitor) {
    return value.accept(visitor);
  }

  public interface Visitor<T> {
    T visitAccount(Account value);

    T visitActivityDefinition(ActivityDefinition value);

    T visitAdverseEvent(AdverseEvent value);

    T visitAllergyIntolerance(AllergyIntolerance value);

    T visitAppointment(Appointment value);

    T visitAppointmentResponse(AppointmentResponse value);

    T visitAuditEvent(AuditEvent value);

    T visitBasic(Basic value);

    T visitBinary(Binary value);

    T visitBiologicallyDerivedProduct(BiologicallyDerivedProduct value);

    T visitBodyStructure(BodyStructure value);

    T visitBundle(Bundle value);

    T visitCapabilityStatement(CapabilityStatement value);

    T visitCarePlan(CarePlan value);

    T visitCareTeam(CareTeam value);

    T visitCatalogEntry(CatalogEntry value);

    T visitChargeItem(ChargeItem value);

    T visitChargeItemDefinition(ChargeItemDefinition value);

    T visitClaim(Claim value);

    T visitClaimResponse(ClaimResponse value);

    T visitClinicalImpression(ClinicalImpression value);

    T visitCodeSystem(CodeSystem value);

    T visitCommunication(Communication value);

    T visitCommunicationRequest(CommunicationRequest value);

    T visitCompartmentDefinition(CompartmentDefinition value);

    T visitComposition(Composition value);

    T visitConceptMap(ConceptMap value);

    T visitCondition(Condition value);

    T visitConsent(Consent value);

    T visitContract(Contract value);

    T visitCoverage(Coverage value);

    T visitCoverageEligibilityRequest(CoverageEligibilityRequest value);

    T visitCoverageEligibilityResponse(CoverageEligibilityResponse value);

    T visitDetectedIssue(DetectedIssue value);

    T visitDevice(Device value);

    T visitDeviceDefinition(DeviceDefinition value);

    T visitDeviceMetric(DeviceMetric value);

    T visitDeviceRequest(DeviceRequest value);

    T visitDeviceUseStatement(DeviceUseStatement value);

    T visitDiagnosticReport(DiagnosticReport value);

    T visitDocumentManifest(DocumentManifest value);

    T visitDocumentReference(DocumentReference value);

    T visitEffectEvidenceSynthesis(EffectEvidenceSynthesis value);

    T visitEncounter(Encounter value);

    T visitEndpoint(Endpoint value);

    T visitEnrollmentRequest(EnrollmentRequest value);

    T visitEnrollmentResponse(EnrollmentResponse value);

    T visitEpisodeOfCare(EpisodeOfCare value);

    T visitEventDefinition(EventDefinition value);

    T visitEvidence(Evidence value);

    T visitEvidenceVariable(EvidenceVariable value);

    T visitExampleScenario(ExampleScenario value);

    T visitExplanationOfBenefit(ExplanationOfBenefit value);

    T visitFamilyMemberHistory(FamilyMemberHistory value);

    T visitFlag(Flag value);

    T visitGoal(Goal value);

    T visitGraphDefinition(GraphDefinition value);

    T visitGroup(Group value);

    T visitGuidanceResponse(GuidanceResponse value);

    T visitHealthcareService(HealthcareService value);

    T visitImagingStudy(ImagingStudy value);

    T visitImmunization(Immunization value);

    T visitImmunizationEvaluation(ImmunizationEvaluation value);

    T visitImmunizationRecommendation(ImmunizationRecommendation value);

    T visitImplementationGuide(ImplementationGuide value);

    T visitInsurancePlan(InsurancePlan value);

    T visitInvoice(Invoice value);

    T visitLibrary(Library value);

    T visitLinkage(Linkage value);

    T visitList(List value);

    T visitLocation(Location value);

    T visitMeasure(Measure value);

    T visitMeasureReport(MeasureReport value);

    T visitMedia(Media value);

    T visitMedication(Medication value);

    T visitMedicationAdministration(MedicationAdministration value);

    T visitMedicationDispense(MedicationDispense value);

    T visitMedicationKnowledge(MedicationKnowledge value);

    T visitMedicationRequest(MedicationRequest value);

    T visitMedicationStatement(MedicationStatement value);

    T visitMedicinalProduct(MedicinalProduct value);

    T visitMedicinalProductAuthorization(MedicinalProductAuthorization value);

    T visitMedicinalProductContraindication(MedicinalProductContraindication value);

    T visitMedicinalProductIndication(MedicinalProductIndication value);

    T visitMedicinalProductIngredient(MedicinalProductIngredient value);

    T visitMedicinalProductInteraction(MedicinalProductInteraction value);

    T visitMedicinalProductManufactured(MedicinalProductManufactured value);

    T visitMedicinalProductPackaged(MedicinalProductPackaged value);

    T visitMedicinalProductPharmaceutical(MedicinalProductPharmaceutical value);

    T visitMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect value);

    T visitMessageDefinition(MessageDefinition value);

    T visitMessageHeader(MessageHeader value);

    T visitMolecularSequence(MolecularSequence value);

    T visitNamingSystem(NamingSystem value);

    T visitNutritionOrder(NutritionOrder value);

    T visitObservation(Observation value);

    T visitObservationDefinition(ObservationDefinition value);

    T visitOperationDefinition(OperationDefinition value);

    T visitOperationOutcome(OperationOutcome value);

    T visitOrganization(Organization value);

    T visitOrganizationAffiliation(OrganizationAffiliation value);

    T visitParameters(Parameters value);

    T visitPatient(Patient value);

    T visitPaymentNotice(PaymentNotice value);

    T visitPaymentReconciliation(PaymentReconciliation value);

    T visitPerson(Person value);

    T visitPlanDefinition(PlanDefinition value);

    T visitPractitioner(Practitioner value);

    T visitPractitionerRole(PractitionerRole value);

    T visitProcedure(Procedure value);

    T visitProvenance(Provenance value);

    T visitQuestionnaire(Questionnaire value);

    T visitQuestionnaireResponse(QuestionnaireResponse value);

    T visitRelatedPerson(RelatedPerson value);

    T visitRequestGroup(RequestGroup value);

    T visitResearchDefinition(ResearchDefinition value);

    T visitResearchElementDefinition(ResearchElementDefinition value);

    T visitResearchStudy(ResearchStudy value);

    T visitResearchSubject(ResearchSubject value);

    T visitRiskAssessment(RiskAssessment value);

    T visitRiskEvidenceSynthesis(RiskEvidenceSynthesis value);

    T visitSchedule(Schedule value);

    T visitSearchParameter(SearchParameter value);

    T visitServiceRequest(ServiceRequest value);

    T visitSlot(Slot value);

    T visitSpecimen(Specimen value);

    T visitSpecimenDefinition(SpecimenDefinition value);

    T visitStructureDefinition(StructureDefinition value);

    T visitStructureMap(StructureMap value);

    T visitSubscription(Subscription value);

    T visitSubstance(Substance value);

    T visitSubstanceNucleicAcid(SubstanceNucleicAcid value);

    T visitSubstancePolymer(SubstancePolymer value);

    T visitSubstanceProtein(SubstanceProtein value);

    T visitSubstanceReferenceInformation(SubstanceReferenceInformation value);

    T visitSubstanceSourceMaterial(SubstanceSourceMaterial value);

    T visitSubstanceSpecification(SubstanceSpecification value);

    T visitSupplyDelivery(SupplyDelivery value);

    T visitSupplyRequest(SupplyRequest value);

    T visitTask(Task value);

    T visitTerminologyCapabilities(TerminologyCapabilities value);

    T visitTestReport(TestReport value);

    T visitTestScript(TestScript value);

    T visitValueSet(ValueSet value);

    T visitVerificationResult(VerificationResult value);

    T visitVisionPrescription(VisionPrescription value);

    T visitProject(Project value);

    T visitClientApplication(ClientApplication value);

    T visitUser(User value);

    T visitLogin(Login value);

    T visitRefreshToken(RefreshToken value);

    T visitPasswordChangeRequest(PasswordChangeRequest value);

    T visitJsonWebKey(JsonWebKey value);

    T visitBot(Bot value);

    T visitAccessPolicy(AccessPolicy value);

    T visitUserConfiguration(UserConfiguration value);

    T visitUnknown(String unknownType);
  }

  @JsonTypeInfo(
      use = JsonTypeInfo.Id.NAME,
      include = JsonTypeInfo.As.EXISTING_PROPERTY,
      property = "resourceType",
      visible = true,
      defaultImpl = Unknown.class
  )
  @JsonSubTypes({
      @JsonSubTypes.Type(value = InternalImmunizationRecommendationValue.class, name = "ImmunizationRecommendation"),
      @JsonSubTypes.Type(value = InternalChargeItemDefinitionValue.class, name = "ChargeItemDefinition"),
      @JsonSubTypes.Type(value = InternalPersonValue.class, name = "Person"),
      @JsonSubTypes.Type(value = InternalCapabilityStatementValue.class, name = "CapabilityStatement"),
      @JsonSubTypes.Type(value = InternalMessageHeaderValue.class, name = "MessageHeader"),
      @JsonSubTypes.Type(value = InternalClaimResponseValue.class, name = "ClaimResponse"),
      @JsonSubTypes.Type(value = InternalTerminologyCapabilitiesValue.class, name = "TerminologyCapabilities"),
      @JsonSubTypes.Type(value = InternalMedicationValue.class, name = "Medication"),
      @JsonSubTypes.Type(value = InternalVisionPrescriptionValue.class, name = "VisionPrescription"),
      @JsonSubTypes.Type(value = InternalQuestionnaireResponseValue.class, name = "QuestionnaireResponse"),
      @JsonSubTypes.Type(value = InternalConceptMapValue.class, name = "ConceptMap"),
      @JsonSubTypes.Type(value = InternalCoverageEligibilityRequestValue.class, name = "CoverageEligibilityRequest"),
      @JsonSubTypes.Type(value = InternalFlagValue.class, name = "Flag"),
      @JsonSubTypes.Type(value = InternalSearchParameterValue.class, name = "SearchParameter"),
      @JsonSubTypes.Type(value = InternalSubstanceSpecificationValue.class, name = "SubstanceSpecification"),
      @JsonSubTypes.Type(value = InternalRelatedPersonValue.class, name = "RelatedPerson"),
      @JsonSubTypes.Type(value = InternalMeasureReportValue.class, name = "MeasureReport"),
      @JsonSubTypes.Type(value = InternalResearchElementDefinitionValue.class, name = "ResearchElementDefinition"),
      @JsonSubTypes.Type(value = InternalPaymentReconciliationValue.class, name = "PaymentReconciliation"),
      @JsonSubTypes.Type(value = InternalCompartmentDefinitionValue.class, name = "CompartmentDefinition"),
      @JsonSubTypes.Type(value = InternalResearchStudyValue.class, name = "ResearchStudy"),
      @JsonSubTypes.Type(value = InternalCareTeamValue.class, name = "CareTeam"),
      @JsonSubTypes.Type(value = InternalNamingSystemValue.class, name = "NamingSystem"),
      @JsonSubTypes.Type(value = InternalDocumentManifestValue.class, name = "DocumentManifest"),
      @JsonSubTypes.Type(value = InternalFamilyMemberHistoryValue.class, name = "FamilyMemberHistory"),
      @JsonSubTypes.Type(value = InternalSpecimenValue.class, name = "Specimen"),
      @JsonSubTypes.Type(value = InternalSupplyDeliveryValue.class, name = "SupplyDelivery"),
      @JsonSubTypes.Type(value = InternalAppointmentValue.class, name = "Appointment"),
      @JsonSubTypes.Type(value = InternalJsonWebKeyValue.class, name = "JsonWebKey"),
      @JsonSubTypes.Type(value = InternalObservationValue.class, name = "Observation"),
      @JsonSubTypes.Type(value = InternalClinicalImpressionValue.class, name = "ClinicalImpression"),
      @JsonSubTypes.Type(value = InternalCompositionValue.class, name = "Composition"),
      @JsonSubTypes.Type(value = InternalCarePlanValue.class, name = "CarePlan"),
      @JsonSubTypes.Type(value = InternalBasicValue.class, name = "Basic"),
      @JsonSubTypes.Type(value = InternalEvidenceVariableValue.class, name = "EvidenceVariable"),
      @JsonSubTypes.Type(value = InternalScheduleValue.class, name = "Schedule"),
      @JsonSubTypes.Type(value = InternalClaimValue.class, name = "Claim"),
      @JsonSubTypes.Type(value = InternalObservationDefinitionValue.class, name = "ObservationDefinition"),
      @JsonSubTypes.Type(value = InternalSubstanceNucleicAcidValue.class, name = "SubstanceNucleicAcid"),
      @JsonSubTypes.Type(value = InternalDocumentReferenceValue.class, name = "DocumentReference"),
      @JsonSubTypes.Type(value = InternalTestScriptValue.class, name = "TestScript"),
      @JsonSubTypes.Type(value = InternalRefreshTokenValue.class, name = "RefreshToken"),
      @JsonSubTypes.Type(value = InternalAuditEventValue.class, name = "AuditEvent"),
      @JsonSubTypes.Type(value = InternalPaymentNoticeValue.class, name = "PaymentNotice"),
      @JsonSubTypes.Type(value = InternalAppointmentResponseValue.class, name = "AppointmentResponse"),
      @JsonSubTypes.Type(value = InternalResearchDefinitionValue.class, name = "ResearchDefinition"),
      @JsonSubTypes.Type(value = InternalPasswordChangeRequestValue.class, name = "PasswordChangeRequest"),
      @JsonSubTypes.Type(value = InternalMedicinalProductContraindicationValue.class, name = "MedicinalProductContraindication"),
      @JsonSubTypes.Type(value = InternalMeasureValue.class, name = "Measure"),
      @JsonSubTypes.Type(value = InternalPatientValue.class, name = "Patient"),
      @JsonSubTypes.Type(value = InternalPlanDefinitionValue.class, name = "PlanDefinition"),
      @JsonSubTypes.Type(value = InternalHealthcareServiceValue.class, name = "HealthcareService"),
      @JsonSubTypes.Type(value = InternalSubstanceReferenceInformationValue.class, name = "SubstanceReferenceInformation"),
      @JsonSubTypes.Type(value = InternalMedicationRequestValue.class, name = "MedicationRequest"),
      @JsonSubTypes.Type(value = InternalDiagnosticReportValue.class, name = "DiagnosticReport"),
      @JsonSubTypes.Type(value = InternalMessageDefinitionValue.class, name = "MessageDefinition"),
      @JsonSubTypes.Type(value = InternalDeviceValue.class, name = "Device"),
      @JsonSubTypes.Type(value = InternalEpisodeOfCareValue.class, name = "EpisodeOfCare"),
      @JsonSubTypes.Type(value = InternalImmunizationValue.class, name = "Immunization"),
      @JsonSubTypes.Type(value = InternalEnrollmentRequestValue.class, name = "EnrollmentRequest"),
      @JsonSubTypes.Type(value = InternalDeviceDefinitionValue.class, name = "DeviceDefinition"),
      @JsonSubTypes.Type(value = InternalMedicinalProductValue.class, name = "MedicinalProduct"),
      @JsonSubTypes.Type(value = InternalMedicationKnowledgeValue.class, name = "MedicationKnowledge"),
      @JsonSubTypes.Type(value = InternalEndpointValue.class, name = "Endpoint"),
      @JsonSubTypes.Type(value = InternalEncounterValue.class, name = "Encounter"),
      @JsonSubTypes.Type(value = InternalMedicinalProductPackagedValue.class, name = "MedicinalProductPackaged"),
      @JsonSubTypes.Type(value = InternalProcedureValue.class, name = "Procedure"),
      @JsonSubTypes.Type(value = InternalEventDefinitionValue.class, name = "EventDefinition"),
      @JsonSubTypes.Type(value = InternalMediaValue.class, name = "Media"),
      @JsonSubTypes.Type(value = InternalInvoiceValue.class, name = "Invoice"),
      @JsonSubTypes.Type(value = InternalMedicinalProductInteractionValue.class, name = "MedicinalProductInteraction"),
      @JsonSubTypes.Type(value = InternalMedicinalProductPharmaceuticalValue.class, name = "MedicinalProductPharmaceutical"),
      @JsonSubTypes.Type(value = InternalContractValue.class, name = "Contract"),
      @JsonSubTypes.Type(value = InternalAccountValue.class, name = "Account"),
      @JsonSubTypes.Type(value = InternalGroupValue.class, name = "Group"),
      @JsonSubTypes.Type(value = InternalPractitionerRoleValue.class, name = "PractitionerRole"),
      @JsonSubTypes.Type(value = InternalDeviceUseStatementValue.class, name = "DeviceUseStatement"),
      @JsonSubTypes.Type(value = InternalSlotValue.class, name = "Slot"),
      @JsonSubTypes.Type(value = InternalDeviceRequestValue.class, name = "DeviceRequest"),
      @JsonSubTypes.Type(value = InternalBodyStructureValue.class, name = "BodyStructure"),
      @JsonSubTypes.Type(value = InternalGoalValue.class, name = "Goal"),
      @JsonSubTypes.Type(value = InternalCommunicationRequestValue.class, name = "CommunicationRequest"),
      @JsonSubTypes.Type(value = InternalStructureMapValue.class, name = "StructureMap"),
      @JsonSubTypes.Type(value = InternalImagingStudyValue.class, name = "ImagingStudy"),
      @JsonSubTypes.Type(value = InternalAdverseEventValue.class, name = "AdverseEvent"),
      @JsonSubTypes.Type(value = InternalSubstanceValue.class, name = "Substance"),
      @JsonSubTypes.Type(value = InternalSubscriptionValue.class, name = "Subscription"),
      @JsonSubTypes.Type(value = InternalTaskValue.class, name = "Task"),
      @JsonSubTypes.Type(value = InternalMedicinalProductIndicationValue.class, name = "MedicinalProductIndication"),
      @JsonSubTypes.Type(value = InternalMedicinalProductManufacturedValue.class, name = "MedicinalProductManufactured"),
      @JsonSubTypes.Type(value = InternalEvidenceValue.class, name = "Evidence"),
      @JsonSubTypes.Type(value = InternalCodeSystemValue.class, name = "CodeSystem"),
      @JsonSubTypes.Type(value = InternalMedicationDispenseValue.class, name = "MedicationDispense"),
      @JsonSubTypes.Type(value = InternalSubstancePolymerValue.class, name = "SubstancePolymer"),
      @JsonSubTypes.Type(value = InternalDetectedIssueValue.class, name = "DetectedIssue"),
      @JsonSubTypes.Type(value = InternalInsurancePlanValue.class, name = "InsurancePlan"),
      @JsonSubTypes.Type(value = InternalImmunizationEvaluationValue.class, name = "ImmunizationEvaluation"),
      @JsonSubTypes.Type(value = InternalMedicinalProductIngredientValue.class, name = "MedicinalProductIngredient"),
      @JsonSubTypes.Type(value = InternalCommunicationValue.class, name = "Communication"),
      @JsonSubTypes.Type(value = InternalGuidanceResponseValue.class, name = "GuidanceResponse"),
      @JsonSubTypes.Type(value = InternalBundleValue.class, name = "Bundle"),
      @JsonSubTypes.Type(value = InternalAccessPolicyValue.class, name = "AccessPolicy"),
      @JsonSubTypes.Type(value = InternalEffectEvidenceSynthesisValue.class, name = "EffectEvidenceSynthesis"),
      @JsonSubTypes.Type(value = InternalMolecularSequenceValue.class, name = "MolecularSequence"),
      @JsonSubTypes.Type(value = InternalRequestGroupValue.class, name = "RequestGroup"),
      @JsonSubTypes.Type(value = InternalConditionValue.class, name = "Condition"),
      @JsonSubTypes.Type(value = InternalMedicationStatementValue.class, name = "MedicationStatement"),
      @JsonSubTypes.Type(value = InternalOperationDefinitionValue.class, name = "OperationDefinition"),
      @JsonSubTypes.Type(value = InternalOrganizationValue.class, name = "Organization"),
      @JsonSubTypes.Type(value = InternalOrganizationAffiliationValue.class, name = "OrganizationAffiliation"),
      @JsonSubTypes.Type(value = InternalResearchSubjectValue.class, name = "ResearchSubject"),
      @JsonSubTypes.Type(value = InternalExampleScenarioValue.class, name = "ExampleScenario"),
      @JsonSubTypes.Type(value = InternalLinkageValue.class, name = "Linkage"),
      @JsonSubTypes.Type(value = InternalRiskEvidenceSynthesisValue.class, name = "RiskEvidenceSynthesis"),
      @JsonSubTypes.Type(value = InternalMedicationAdministrationValue.class, name = "MedicationAdministration"),
      @JsonSubTypes.Type(value = InternalProjectValue.class, name = "Project"),
      @JsonSubTypes.Type(value = InternalSupplyRequestValue.class, name = "SupplyRequest"),
      @JsonSubTypes.Type(value = InternalCatalogEntryValue.class, name = "CatalogEntry"),
      @JsonSubTypes.Type(value = InternalSubstanceSourceMaterialValue.class, name = "SubstanceSourceMaterial"),
      @JsonSubTypes.Type(value = InternalOperationOutcomeValue.class, name = "OperationOutcome"),
      @JsonSubTypes.Type(value = InternalPractitionerValue.class, name = "Practitioner"),
      @JsonSubTypes.Type(value = InternalBiologicallyDerivedProductValue.class, name = "BiologicallyDerivedProduct"),
      @JsonSubTypes.Type(value = InternalImplementationGuideValue.class, name = "ImplementationGuide"),
      @JsonSubTypes.Type(value = InternalTestReportValue.class, name = "TestReport"),
      @JsonSubTypes.Type(value = InternalQuestionnaireValue.class, name = "Questionnaire"),
      @JsonSubTypes.Type(value = InternalBotValue.class, name = "Bot"),
      @JsonSubTypes.Type(value = InternalMedicinalProductUndesirableEffectValue.class, name = "MedicinalProductUndesirableEffect"),
      @JsonSubTypes.Type(value = InternalVerificationResultValue.class, name = "VerificationResult"),
      @JsonSubTypes.Type(value = InternalUserValue.class, name = "User"),
      @JsonSubTypes.Type(value = InternalConsentValue.class, name = "Consent"),
      @JsonSubTypes.Type(value = InternalChargeItemValue.class, name = "ChargeItem"),
      @JsonSubTypes.Type(value = InternalListValue.class, name = "List"),
      @JsonSubTypes.Type(value = InternalClientApplicationValue.class, name = "ClientApplication"),
      @JsonSubTypes.Type(value = InternalLocationValue.class, name = "Location"),
      @JsonSubTypes.Type(value = InternalEnrollmentResponseValue.class, name = "EnrollmentResponse"),
      @JsonSubTypes.Type(value = InternalRiskAssessmentValue.class, name = "RiskAssessment"),
      @JsonSubTypes.Type(value = InternalGraphDefinitionValue.class, name = "GraphDefinition"),
      @JsonSubTypes.Type(value = InternalProvenanceValue.class, name = "Provenance"),
      @JsonSubTypes.Type(value = InternalSubstanceProteinValue.class, name = "SubstanceProtein"),
      @JsonSubTypes.Type(value = InternalSpecimenDefinitionValue.class, name = "SpecimenDefinition"),
      @JsonSubTypes.Type(value = InternalCoverageValue.class, name = "Coverage"),
      @JsonSubTypes.Type(value = InternalValueSetValue.class, name = "ValueSet"),
      @JsonSubTypes.Type(value = InternalAllergyIntoleranceValue.class, name = "AllergyIntolerance"),
      @JsonSubTypes.Type(value = InternalBinaryValue.class, name = "Binary"),
      @JsonSubTypes.Type(value = InternalParametersValue.class, name = "Parameters"),
      @JsonSubTypes.Type(value = InternalActivityDefinitionValue.class, name = "ActivityDefinition"),
      @JsonSubTypes.Type(value = InternalMedicinalProductAuthorizationValue.class, name = "MedicinalProductAuthorization"),
      @JsonSubTypes.Type(value = InternalLibraryValue.class, name = "Library"),
      @JsonSubTypes.Type(value = InternalNutritionOrderValue.class, name = "NutritionOrder"),
      @JsonSubTypes.Type(value = InternalCoverageEligibilityResponseValue.class, name = "CoverageEligibilityResponse"),
      @JsonSubTypes.Type(value = InternalExplanationOfBenefitValue.class, name = "ExplanationOfBenefit"),
      @JsonSubTypes.Type(value = InternalLoginValue.class, name = "Login"),
      @JsonSubTypes.Type(value = InternalUserConfigurationValue.class, name = "UserConfiguration"),
      @JsonSubTypes.Type(value = InternalServiceRequestValue.class, name = "ServiceRequest"),
      @JsonSubTypes.Type(value = InternalDeviceMetricValue.class, name = "DeviceMetric"),
      @JsonSubTypes.Type(value = InternalStructureDefinitionValue.class, name = "StructureDefinition")
  })
  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  private interface InternalValue {
    <T> T accept(Visitor<T> visitor);
  }

  @Value.Immutable
  @JsonTypeName("ImmunizationRecommendation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImmunizationRecommendationValue.class
  )
  interface InternalImmunizationRecommendationValue extends InternalValue {
    @JsonValue
    ImmunizationRecommendation ImmunizationRecommendation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImmunizationRecommendation(ImmunizationRecommendation());
    }

    static InternalImmunizationRecommendationValue of(ImmunizationRecommendation value) {
      return ImmutableResourceList.InternalImmunizationRecommendationValue.builder().ImmunizationRecommendation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ChargeItemDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalChargeItemDefinitionValue.class
  )
  interface InternalChargeItemDefinitionValue extends InternalValue {
    @JsonValue
    ChargeItemDefinition ChargeItemDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitChargeItemDefinition(ChargeItemDefinition());
    }

    static InternalChargeItemDefinitionValue of(ChargeItemDefinition value) {
      return ImmutableResourceList.InternalChargeItemDefinitionValue.builder().ChargeItemDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Person")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPersonValue.class
  )
  interface InternalPersonValue extends InternalValue {
    @JsonValue
    Person Person();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPerson(Person());
    }

    static InternalPersonValue of(Person value) {
      return ImmutableResourceList.InternalPersonValue.builder().Person(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CapabilityStatement")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCapabilityStatementValue.class
  )
  interface InternalCapabilityStatementValue extends InternalValue {
    @JsonValue
    CapabilityStatement CapabilityStatement();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCapabilityStatement(CapabilityStatement());
    }

    static InternalCapabilityStatementValue of(CapabilityStatement value) {
      return ImmutableResourceList.InternalCapabilityStatementValue.builder().CapabilityStatement(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MessageHeader")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMessageHeaderValue.class
  )
  interface InternalMessageHeaderValue extends InternalValue {
    @JsonValue
    MessageHeader MessageHeader();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMessageHeader(MessageHeader());
    }

    static InternalMessageHeaderValue of(MessageHeader value) {
      return ImmutableResourceList.InternalMessageHeaderValue.builder().MessageHeader(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ClaimResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClaimResponseValue.class
  )
  interface InternalClaimResponseValue extends InternalValue {
    @JsonValue
    ClaimResponse ClaimResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClaimResponse(ClaimResponse());
    }

    static InternalClaimResponseValue of(ClaimResponse value) {
      return ImmutableResourceList.InternalClaimResponseValue.builder().ClaimResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("TerminologyCapabilities")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTerminologyCapabilitiesValue.class
  )
  interface InternalTerminologyCapabilitiesValue extends InternalValue {
    @JsonValue
    TerminologyCapabilities TerminologyCapabilities();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTerminologyCapabilities(TerminologyCapabilities());
    }

    static InternalTerminologyCapabilitiesValue of(TerminologyCapabilities value) {
      return ImmutableResourceList.InternalTerminologyCapabilitiesValue.builder().TerminologyCapabilities(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Medication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationValue.class
  )
  interface InternalMedicationValue extends InternalValue {
    @JsonValue
    Medication Medication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedication(Medication());
    }

    static InternalMedicationValue of(Medication value) {
      return ImmutableResourceList.InternalMedicationValue.builder().Medication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("VisionPrescription")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalVisionPrescriptionValue.class
  )
  interface InternalVisionPrescriptionValue extends InternalValue {
    @JsonValue
    VisionPrescription VisionPrescription();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitVisionPrescription(VisionPrescription());
    }

    static InternalVisionPrescriptionValue of(VisionPrescription value) {
      return ImmutableResourceList.InternalVisionPrescriptionValue.builder().VisionPrescription(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("QuestionnaireResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalQuestionnaireResponseValue.class
  )
  interface InternalQuestionnaireResponseValue extends InternalValue {
    @JsonValue
    QuestionnaireResponse QuestionnaireResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitQuestionnaireResponse(QuestionnaireResponse());
    }

    static InternalQuestionnaireResponseValue of(QuestionnaireResponse value) {
      return ImmutableResourceList.InternalQuestionnaireResponseValue.builder().QuestionnaireResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ConceptMap")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalConceptMapValue.class
  )
  interface InternalConceptMapValue extends InternalValue {
    @JsonValue
    ConceptMap ConceptMap();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitConceptMap(ConceptMap());
    }

    static InternalConceptMapValue of(ConceptMap value) {
      return ImmutableResourceList.InternalConceptMapValue.builder().ConceptMap(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CoverageEligibilityRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCoverageEligibilityRequestValue.class
  )
  interface InternalCoverageEligibilityRequestValue extends InternalValue {
    @JsonValue
    CoverageEligibilityRequest CoverageEligibilityRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCoverageEligibilityRequest(CoverageEligibilityRequest());
    }

    static InternalCoverageEligibilityRequestValue of(CoverageEligibilityRequest value) {
      return ImmutableResourceList.InternalCoverageEligibilityRequestValue.builder().CoverageEligibilityRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Flag")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalFlagValue.class
  )
  interface InternalFlagValue extends InternalValue {
    @JsonValue
    Flag Flag();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitFlag(Flag());
    }

    static InternalFlagValue of(Flag value) {
      return ImmutableResourceList.InternalFlagValue.builder().Flag(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SearchParameter")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSearchParameterValue.class
  )
  interface InternalSearchParameterValue extends InternalValue {
    @JsonValue
    SearchParameter SearchParameter();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSearchParameter(SearchParameter());
    }

    static InternalSearchParameterValue of(SearchParameter value) {
      return ImmutableResourceList.InternalSearchParameterValue.builder().SearchParameter(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SubstanceSpecification")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceSpecificationValue.class
  )
  interface InternalSubstanceSpecificationValue extends InternalValue {
    @JsonValue
    SubstanceSpecification SubstanceSpecification();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceSpecification(SubstanceSpecification());
    }

    static InternalSubstanceSpecificationValue of(SubstanceSpecification value) {
      return ImmutableResourceList.InternalSubstanceSpecificationValue.builder().SubstanceSpecification(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("RelatedPerson")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRelatedPersonValue.class
  )
  interface InternalRelatedPersonValue extends InternalValue {
    @JsonValue
    RelatedPerson RelatedPerson();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRelatedPerson(RelatedPerson());
    }

    static InternalRelatedPersonValue of(RelatedPerson value) {
      return ImmutableResourceList.InternalRelatedPersonValue.builder().RelatedPerson(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MeasureReport")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMeasureReportValue.class
  )
  interface InternalMeasureReportValue extends InternalValue {
    @JsonValue
    MeasureReport MeasureReport();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMeasureReport(MeasureReport());
    }

    static InternalMeasureReportValue of(MeasureReport value) {
      return ImmutableResourceList.InternalMeasureReportValue.builder().MeasureReport(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ResearchElementDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchElementDefinitionValue.class
  )
  interface InternalResearchElementDefinitionValue extends InternalValue {
    @JsonValue
    ResearchElementDefinition ResearchElementDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchElementDefinition(ResearchElementDefinition());
    }

    static InternalResearchElementDefinitionValue of(ResearchElementDefinition value) {
      return ImmutableResourceList.InternalResearchElementDefinitionValue.builder().ResearchElementDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("PaymentReconciliation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPaymentReconciliationValue.class
  )
  interface InternalPaymentReconciliationValue extends InternalValue {
    @JsonValue
    PaymentReconciliation PaymentReconciliation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPaymentReconciliation(PaymentReconciliation());
    }

    static InternalPaymentReconciliationValue of(PaymentReconciliation value) {
      return ImmutableResourceList.InternalPaymentReconciliationValue.builder().PaymentReconciliation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CompartmentDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCompartmentDefinitionValue.class
  )
  interface InternalCompartmentDefinitionValue extends InternalValue {
    @JsonValue
    CompartmentDefinition CompartmentDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCompartmentDefinition(CompartmentDefinition());
    }

    static InternalCompartmentDefinitionValue of(CompartmentDefinition value) {
      return ImmutableResourceList.InternalCompartmentDefinitionValue.builder().CompartmentDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ResearchStudy")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchStudyValue.class
  )
  interface InternalResearchStudyValue extends InternalValue {
    @JsonValue
    ResearchStudy ResearchStudy();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchStudy(ResearchStudy());
    }

    static InternalResearchStudyValue of(ResearchStudy value) {
      return ImmutableResourceList.InternalResearchStudyValue.builder().ResearchStudy(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CareTeam")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCareTeamValue.class
  )
  interface InternalCareTeamValue extends InternalValue {
    @JsonValue
    CareTeam CareTeam();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCareTeam(CareTeam());
    }

    static InternalCareTeamValue of(CareTeam value) {
      return ImmutableResourceList.InternalCareTeamValue.builder().CareTeam(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("NamingSystem")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalNamingSystemValue.class
  )
  interface InternalNamingSystemValue extends InternalValue {
    @JsonValue
    NamingSystem NamingSystem();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitNamingSystem(NamingSystem());
    }

    static InternalNamingSystemValue of(NamingSystem value) {
      return ImmutableResourceList.InternalNamingSystemValue.builder().NamingSystem(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DocumentManifest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDocumentManifestValue.class
  )
  interface InternalDocumentManifestValue extends InternalValue {
    @JsonValue
    DocumentManifest DocumentManifest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDocumentManifest(DocumentManifest());
    }

    static InternalDocumentManifestValue of(DocumentManifest value) {
      return ImmutableResourceList.InternalDocumentManifestValue.builder().DocumentManifest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("FamilyMemberHistory")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalFamilyMemberHistoryValue.class
  )
  interface InternalFamilyMemberHistoryValue extends InternalValue {
    @JsonValue
    FamilyMemberHistory FamilyMemberHistory();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitFamilyMemberHistory(FamilyMemberHistory());
    }

    static InternalFamilyMemberHistoryValue of(FamilyMemberHistory value) {
      return ImmutableResourceList.InternalFamilyMemberHistoryValue.builder().FamilyMemberHistory(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Specimen")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSpecimenValue.class
  )
  interface InternalSpecimenValue extends InternalValue {
    @JsonValue
    Specimen Specimen();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSpecimen(Specimen());
    }

    static InternalSpecimenValue of(Specimen value) {
      return ImmutableResourceList.InternalSpecimenValue.builder().Specimen(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SupplyDelivery")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSupplyDeliveryValue.class
  )
  interface InternalSupplyDeliveryValue extends InternalValue {
    @JsonValue
    SupplyDelivery SupplyDelivery();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSupplyDelivery(SupplyDelivery());
    }

    static InternalSupplyDeliveryValue of(SupplyDelivery value) {
      return ImmutableResourceList.InternalSupplyDeliveryValue.builder().SupplyDelivery(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Appointment")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAppointmentValue.class
  )
  interface InternalAppointmentValue extends InternalValue {
    @JsonValue
    Appointment Appointment();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAppointment(Appointment());
    }

    static InternalAppointmentValue of(Appointment value) {
      return ImmutableResourceList.InternalAppointmentValue.builder().Appointment(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("JsonWebKey")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalJsonWebKeyValue.class
  )
  interface InternalJsonWebKeyValue extends InternalValue {
    @JsonValue
    JsonWebKey JsonWebKey();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitJsonWebKey(JsonWebKey());
    }

    static InternalJsonWebKeyValue of(JsonWebKey value) {
      return ImmutableResourceList.InternalJsonWebKeyValue.builder().JsonWebKey(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Observation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalObservationValue.class
  )
  interface InternalObservationValue extends InternalValue {
    @JsonValue
    Observation Observation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitObservation(Observation());
    }

    static InternalObservationValue of(Observation value) {
      return ImmutableResourceList.InternalObservationValue.builder().Observation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ClinicalImpression")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClinicalImpressionValue.class
  )
  interface InternalClinicalImpressionValue extends InternalValue {
    @JsonValue
    ClinicalImpression ClinicalImpression();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClinicalImpression(ClinicalImpression());
    }

    static InternalClinicalImpressionValue of(ClinicalImpression value) {
      return ImmutableResourceList.InternalClinicalImpressionValue.builder().ClinicalImpression(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Composition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCompositionValue.class
  )
  interface InternalCompositionValue extends InternalValue {
    @JsonValue
    Composition Composition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitComposition(Composition());
    }

    static InternalCompositionValue of(Composition value) {
      return ImmutableResourceList.InternalCompositionValue.builder().Composition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CarePlan")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCarePlanValue.class
  )
  interface InternalCarePlanValue extends InternalValue {
    @JsonValue
    CarePlan CarePlan();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCarePlan(CarePlan());
    }

    static InternalCarePlanValue of(CarePlan value) {
      return ImmutableResourceList.InternalCarePlanValue.builder().CarePlan(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Basic")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBasicValue.class
  )
  interface InternalBasicValue extends InternalValue {
    @JsonValue
    Basic Basic();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBasic(Basic());
    }

    static InternalBasicValue of(Basic value) {
      return ImmutableResourceList.InternalBasicValue.builder().Basic(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("EvidenceVariable")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEvidenceVariableValue.class
  )
  interface InternalEvidenceVariableValue extends InternalValue {
    @JsonValue
    EvidenceVariable EvidenceVariable();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEvidenceVariable(EvidenceVariable());
    }

    static InternalEvidenceVariableValue of(EvidenceVariable value) {
      return ImmutableResourceList.InternalEvidenceVariableValue.builder().EvidenceVariable(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Schedule")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalScheduleValue.class
  )
  interface InternalScheduleValue extends InternalValue {
    @JsonValue
    Schedule Schedule();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSchedule(Schedule());
    }

    static InternalScheduleValue of(Schedule value) {
      return ImmutableResourceList.InternalScheduleValue.builder().Schedule(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Claim")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClaimValue.class
  )
  interface InternalClaimValue extends InternalValue {
    @JsonValue
    Claim Claim();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClaim(Claim());
    }

    static InternalClaimValue of(Claim value) {
      return ImmutableResourceList.InternalClaimValue.builder().Claim(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ObservationDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalObservationDefinitionValue.class
  )
  interface InternalObservationDefinitionValue extends InternalValue {
    @JsonValue
    ObservationDefinition ObservationDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitObservationDefinition(ObservationDefinition());
    }

    static InternalObservationDefinitionValue of(ObservationDefinition value) {
      return ImmutableResourceList.InternalObservationDefinitionValue.builder().ObservationDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SubstanceNucleicAcid")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceNucleicAcidValue.class
  )
  interface InternalSubstanceNucleicAcidValue extends InternalValue {
    @JsonValue
    SubstanceNucleicAcid SubstanceNucleicAcid();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceNucleicAcid(SubstanceNucleicAcid());
    }

    static InternalSubstanceNucleicAcidValue of(SubstanceNucleicAcid value) {
      return ImmutableResourceList.InternalSubstanceNucleicAcidValue.builder().SubstanceNucleicAcid(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DocumentReference")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDocumentReferenceValue.class
  )
  interface InternalDocumentReferenceValue extends InternalValue {
    @JsonValue
    DocumentReference DocumentReference();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDocumentReference(DocumentReference());
    }

    static InternalDocumentReferenceValue of(DocumentReference value) {
      return ImmutableResourceList.InternalDocumentReferenceValue.builder().DocumentReference(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("TestScript")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTestScriptValue.class
  )
  interface InternalTestScriptValue extends InternalValue {
    @JsonValue
    TestScript TestScript();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTestScript(TestScript());
    }

    static InternalTestScriptValue of(TestScript value) {
      return ImmutableResourceList.InternalTestScriptValue.builder().TestScript(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("RefreshToken")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRefreshTokenValue.class
  )
  interface InternalRefreshTokenValue extends InternalValue {
    RefreshToken RefreshToken();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRefreshToken(RefreshToken());
    }

    static InternalRefreshTokenValue of(RefreshToken value) {
      return ImmutableResourceList.InternalRefreshTokenValue.builder().RefreshToken(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("AuditEvent")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAuditEventValue.class
  )
  interface InternalAuditEventValue extends InternalValue {
    @JsonValue
    AuditEvent AuditEvent();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAuditEvent(AuditEvent());
    }

    static InternalAuditEventValue of(AuditEvent value) {
      return ImmutableResourceList.InternalAuditEventValue.builder().AuditEvent(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("PaymentNotice")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPaymentNoticeValue.class
  )
  interface InternalPaymentNoticeValue extends InternalValue {
    @JsonValue
    PaymentNotice PaymentNotice();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPaymentNotice(PaymentNotice());
    }

    static InternalPaymentNoticeValue of(PaymentNotice value) {
      return ImmutableResourceList.InternalPaymentNoticeValue.builder().PaymentNotice(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("AppointmentResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAppointmentResponseValue.class
  )
  interface InternalAppointmentResponseValue extends InternalValue {
    @JsonValue
    AppointmentResponse AppointmentResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAppointmentResponse(AppointmentResponse());
    }

    static InternalAppointmentResponseValue of(AppointmentResponse value) {
      return ImmutableResourceList.InternalAppointmentResponseValue.builder().AppointmentResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ResearchDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchDefinitionValue.class
  )
  interface InternalResearchDefinitionValue extends InternalValue {
    @JsonValue
    ResearchDefinition ResearchDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchDefinition(ResearchDefinition());
    }

    static InternalResearchDefinitionValue of(ResearchDefinition value) {
      return ImmutableResourceList.InternalResearchDefinitionValue.builder().ResearchDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("PasswordChangeRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPasswordChangeRequestValue.class
  )
  interface InternalPasswordChangeRequestValue extends InternalValue {
    @JsonValue
    PasswordChangeRequest PasswordChangeRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPasswordChangeRequest(PasswordChangeRequest());
    }

    static InternalPasswordChangeRequestValue of(PasswordChangeRequest value) {
      return ImmutableResourceList.InternalPasswordChangeRequestValue.builder().PasswordChangeRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductContraindication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductContraindicationValue.class
  )
  interface InternalMedicinalProductContraindicationValue extends InternalValue {
    @JsonValue
    MedicinalProductContraindication MedicinalProductContraindication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductContraindication(MedicinalProductContraindication());
    }

    static InternalMedicinalProductContraindicationValue of(
        MedicinalProductContraindication value) {
      return ImmutableResourceList.InternalMedicinalProductContraindicationValue.builder().MedicinalProductContraindication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Measure")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMeasureValue.class
  )
  interface InternalMeasureValue extends InternalValue {
    @JsonValue
    Measure Measure();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMeasure(Measure());
    }

    static InternalMeasureValue of(Measure value) {
      return ImmutableResourceList.InternalMeasureValue.builder().Measure(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Patient")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPatientValue.class
  )
  interface InternalPatientValue extends InternalValue {
    @JsonValue
    Patient Patient();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPatient(Patient());
    }

    static InternalPatientValue of(Patient value) {
      return ImmutableResourceList.InternalPatientValue.builder().Patient(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("PlanDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPlanDefinitionValue.class
  )
  interface InternalPlanDefinitionValue extends InternalValue {
    @JsonValue
    PlanDefinition PlanDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPlanDefinition(PlanDefinition());
    }

    static InternalPlanDefinitionValue of(PlanDefinition value) {
      return ImmutableResourceList.InternalPlanDefinitionValue.builder().PlanDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("HealthcareService")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalHealthcareServiceValue.class
  )
  interface InternalHealthcareServiceValue extends InternalValue {
    @JsonValue
    HealthcareService HealthcareService();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitHealthcareService(HealthcareService());
    }

    static InternalHealthcareServiceValue of(HealthcareService value) {
      return ImmutableResourceList.InternalHealthcareServiceValue.builder().HealthcareService(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SubstanceReferenceInformation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceReferenceInformationValue.class
  )
  interface InternalSubstanceReferenceInformationValue extends InternalValue {
    @JsonValue
    SubstanceReferenceInformation SubstanceReferenceInformation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceReferenceInformation(SubstanceReferenceInformation());
    }

    static InternalSubstanceReferenceInformationValue of(SubstanceReferenceInformation value) {
      return ImmutableResourceList.InternalSubstanceReferenceInformationValue.builder().SubstanceReferenceInformation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicationRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationRequestValue.class
  )
  interface InternalMedicationRequestValue extends InternalValue {
    @JsonValue
    MedicationRequest MedicationRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationRequest(MedicationRequest());
    }

    static InternalMedicationRequestValue of(MedicationRequest value) {
      return ImmutableResourceList.InternalMedicationRequestValue.builder().MedicationRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DiagnosticReport")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDiagnosticReportValue.class
  )
  interface InternalDiagnosticReportValue extends InternalValue {
    @JsonValue
    DiagnosticReport DiagnosticReport();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDiagnosticReport(DiagnosticReport());
    }

    static InternalDiagnosticReportValue of(DiagnosticReport value) {
      return ImmutableResourceList.InternalDiagnosticReportValue.builder().DiagnosticReport(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MessageDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMessageDefinitionValue.class
  )
  interface InternalMessageDefinitionValue extends InternalValue {
    @JsonValue
    MessageDefinition MessageDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMessageDefinition(MessageDefinition());
    }

    static InternalMessageDefinitionValue of(MessageDefinition value) {
      return ImmutableResourceList.InternalMessageDefinitionValue.builder().MessageDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Device")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceValue.class
  )
  interface InternalDeviceValue extends InternalValue {
    @JsonValue
    Device Device();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDevice(Device());
    }

    static InternalDeviceValue of(Device value) {
      return ImmutableResourceList.InternalDeviceValue.builder().Device(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("EpisodeOfCare")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEpisodeOfCareValue.class
  )
  interface InternalEpisodeOfCareValue extends InternalValue {
    @JsonValue
    EpisodeOfCare EpisodeOfCare();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEpisodeOfCare(EpisodeOfCare());
    }

    static InternalEpisodeOfCareValue of(EpisodeOfCare value) {
      return ImmutableResourceList.InternalEpisodeOfCareValue.builder().EpisodeOfCare(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Immunization")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImmunizationValue.class
  )
  interface InternalImmunizationValue extends InternalValue {
    @JsonValue
    Immunization Immunization();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImmunization(Immunization());
    }

    static InternalImmunizationValue of(Immunization value) {
      return ImmutableResourceList.InternalImmunizationValue.builder().Immunization(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("EnrollmentRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEnrollmentRequestValue.class
  )
  interface InternalEnrollmentRequestValue extends InternalValue {
    @JsonValue
    EnrollmentRequest EnrollmentRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEnrollmentRequest(EnrollmentRequest());
    }

    static InternalEnrollmentRequestValue of(EnrollmentRequest value) {
      return ImmutableResourceList.InternalEnrollmentRequestValue.builder().EnrollmentRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DeviceDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceDefinitionValue.class
  )
  interface InternalDeviceDefinitionValue extends InternalValue {
    @JsonValue
    DeviceDefinition DeviceDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceDefinition(DeviceDefinition());
    }

    static InternalDeviceDefinitionValue of(DeviceDefinition value) {
      return ImmutableResourceList.InternalDeviceDefinitionValue.builder().DeviceDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProduct")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductValue.class
  )
  interface InternalMedicinalProductValue extends InternalValue {
    @JsonValue
    MedicinalProduct MedicinalProduct();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProduct(MedicinalProduct());
    }

    static InternalMedicinalProductValue of(MedicinalProduct value) {
      return ImmutableResourceList.InternalMedicinalProductValue.builder().MedicinalProduct(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicationKnowledge")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationKnowledgeValue.class
  )
  interface InternalMedicationKnowledgeValue extends InternalValue {
    @JsonValue
    MedicationKnowledge MedicationKnowledge();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationKnowledge(MedicationKnowledge());
    }

    static InternalMedicationKnowledgeValue of(MedicationKnowledge value) {
      return ImmutableResourceList.InternalMedicationKnowledgeValue.builder().MedicationKnowledge(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Endpoint")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEndpointValue.class
  )
  interface InternalEndpointValue extends InternalValue {
    @JsonValue
    Endpoint Endpoint();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEndpoint(Endpoint());
    }

    static InternalEndpointValue of(Endpoint value) {
      return ImmutableResourceList.InternalEndpointValue.builder().Endpoint(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Encounter")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEncounterValue.class
  )
  interface InternalEncounterValue extends InternalValue {
    @JsonValue
    Encounter Encounter();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEncounter(Encounter());
    }

    static InternalEncounterValue of(Encounter value) {
      return ImmutableResourceList.InternalEncounterValue.builder().Encounter(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductPackaged")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductPackagedValue.class
  )
  interface InternalMedicinalProductPackagedValue extends InternalValue {
    @JsonValue
    MedicinalProductPackaged MedicinalProductPackaged();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductPackaged(MedicinalProductPackaged());
    }

    static InternalMedicinalProductPackagedValue of(MedicinalProductPackaged value) {
      return ImmutableResourceList.InternalMedicinalProductPackagedValue.builder().MedicinalProductPackaged(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Procedure")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalProcedureValue.class
  )
  interface InternalProcedureValue extends InternalValue {
    @JsonValue
    Procedure Procedure();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitProcedure(Procedure());
    }

    static InternalProcedureValue of(Procedure value) {
      return ImmutableResourceList.InternalProcedureValue.builder().Procedure(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("EventDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEventDefinitionValue.class
  )
  interface InternalEventDefinitionValue extends InternalValue {
    @JsonValue
    EventDefinition EventDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEventDefinition(EventDefinition());
    }

    static InternalEventDefinitionValue of(EventDefinition value) {
      return ImmutableResourceList.InternalEventDefinitionValue.builder().EventDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Media")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMediaValue.class
  )
  interface InternalMediaValue extends InternalValue {
    @JsonValue
    Media Media();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedia(Media());
    }

    static InternalMediaValue of(Media value) {
      return ImmutableResourceList.InternalMediaValue.builder().Media(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Invoice")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalInvoiceValue.class
  )
  interface InternalInvoiceValue extends InternalValue {
    @JsonValue
    Invoice Invoice();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitInvoice(Invoice());
    }

    static InternalInvoiceValue of(Invoice value) {
      return ImmutableResourceList.InternalInvoiceValue.builder().Invoice(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductInteraction")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductInteractionValue.class
  )
  interface InternalMedicinalProductInteractionValue extends InternalValue {
    @JsonValue
    MedicinalProductInteraction MedicinalProductInteraction();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductInteraction(MedicinalProductInteraction());
    }

    static InternalMedicinalProductInteractionValue of(MedicinalProductInteraction value) {
      return ImmutableResourceList.InternalMedicinalProductInteractionValue.builder().MedicinalProductInteraction(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductPharmaceutical")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductPharmaceuticalValue.class
  )
  interface InternalMedicinalProductPharmaceuticalValue extends InternalValue {
    @JsonValue
    MedicinalProductPharmaceutical MedicinalProductPharmaceutical();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductPharmaceutical(MedicinalProductPharmaceutical());
    }

    static InternalMedicinalProductPharmaceuticalValue of(MedicinalProductPharmaceutical value) {
      return ImmutableResourceList.InternalMedicinalProductPharmaceuticalValue.builder().MedicinalProductPharmaceutical(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Contract")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalContractValue.class
  )
  interface InternalContractValue extends InternalValue {
    @JsonValue
    Contract Contract();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitContract(Contract());
    }

    static InternalContractValue of(Contract value) {
      return ImmutableResourceList.InternalContractValue.builder().Contract(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Account")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAccountValue.class
  )
  interface InternalAccountValue extends InternalValue {
    @JsonValue
    Account Account();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAccount(Account());
    }

    static InternalAccountValue of(Account value) {
      return ImmutableResourceList.InternalAccountValue.builder().Account(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Group")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGroupValue.class
  )
  interface InternalGroupValue extends InternalValue {
    @JsonValue
    Group Group();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGroup(Group());
    }

    static InternalGroupValue of(Group value) {
      return ImmutableResourceList.InternalGroupValue.builder().Group(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("PractitionerRole")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPractitionerRoleValue.class
  )
  interface InternalPractitionerRoleValue extends InternalValue {
    @JsonValue
    PractitionerRole PractitionerRole();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPractitionerRole(PractitionerRole());
    }

    static InternalPractitionerRoleValue of(PractitionerRole value) {
      return ImmutableResourceList.InternalPractitionerRoleValue.builder().PractitionerRole(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DeviceUseStatement")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceUseStatementValue.class
  )
  interface InternalDeviceUseStatementValue extends InternalValue {
    @JsonValue
    DeviceUseStatement DeviceUseStatement();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceUseStatement(DeviceUseStatement());
    }

    static InternalDeviceUseStatementValue of(DeviceUseStatement value) {
      return ImmutableResourceList.InternalDeviceUseStatementValue.builder().DeviceUseStatement(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Slot")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSlotValue.class
  )
  interface InternalSlotValue extends InternalValue {
    @JsonValue
    Slot Slot();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSlot(Slot());
    }

    static InternalSlotValue of(Slot value) {
      return ImmutableResourceList.InternalSlotValue.builder().Slot(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DeviceRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceRequestValue.class
  )
  interface InternalDeviceRequestValue extends InternalValue {
    @JsonValue
    DeviceRequest DeviceRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceRequest(DeviceRequest());
    }

    static InternalDeviceRequestValue of(DeviceRequest value) {
      return ImmutableResourceList.InternalDeviceRequestValue.builder().DeviceRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("BodyStructure")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBodyStructureValue.class
  )
  interface InternalBodyStructureValue extends InternalValue {
    @JsonValue
    BodyStructure BodyStructure();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBodyStructure(BodyStructure());
    }

    static InternalBodyStructureValue of(BodyStructure value) {
      return ImmutableResourceList.InternalBodyStructureValue.builder().BodyStructure(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Goal")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGoalValue.class
  )
  interface InternalGoalValue extends InternalValue {
    @JsonValue
    Goal Goal();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGoal(Goal());
    }

    static InternalGoalValue of(Goal value) {
      return ImmutableResourceList.InternalGoalValue.builder().Goal(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CommunicationRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCommunicationRequestValue.class
  )
  interface InternalCommunicationRequestValue extends InternalValue {
    @JsonValue
    CommunicationRequest CommunicationRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCommunicationRequest(CommunicationRequest());
    }

    static InternalCommunicationRequestValue of(CommunicationRequest value) {
      return ImmutableResourceList.InternalCommunicationRequestValue.builder().CommunicationRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("StructureMap")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalStructureMapValue.class
  )
  interface InternalStructureMapValue extends InternalValue {
    @JsonValue
    StructureMap StructureMap();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitStructureMap(StructureMap());
    }

    static InternalStructureMapValue of(StructureMap value) {
      return ImmutableResourceList.InternalStructureMapValue.builder().StructureMap(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ImagingStudy")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImagingStudyValue.class
  )
  interface InternalImagingStudyValue extends InternalValue {
    @JsonValue
    ImagingStudy ImagingStudy();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImagingStudy(ImagingStudy());
    }

    static InternalImagingStudyValue of(ImagingStudy value) {
      return ImmutableResourceList.InternalImagingStudyValue.builder().ImagingStudy(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("AdverseEvent")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAdverseEventValue.class
  )
  interface InternalAdverseEventValue extends InternalValue {
    @JsonValue
    AdverseEvent AdverseEvent();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAdverseEvent(AdverseEvent());
    }

    static InternalAdverseEventValue of(AdverseEvent value) {
      return ImmutableResourceList.InternalAdverseEventValue.builder().AdverseEvent(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Substance")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceValue.class
  )
  interface InternalSubstanceValue extends InternalValue {
    @JsonValue
    Substance Substance();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstance(Substance());
    }

    static InternalSubstanceValue of(Substance value) {
      return ImmutableResourceList.InternalSubstanceValue.builder().Substance(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Subscription")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubscriptionValue.class
  )
  interface InternalSubscriptionValue extends InternalValue {
    @JsonValue
    Subscription Subscription();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubscription(Subscription());
    }

    static InternalSubscriptionValue of(Subscription value) {
      return ImmutableResourceList.InternalSubscriptionValue.builder().Subscription(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Task")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTaskValue.class
  )
  interface InternalTaskValue extends InternalValue {
    @JsonValue
    Task Task();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTask(Task());
    }

    static InternalTaskValue of(Task value) {
      return ImmutableResourceList.InternalTaskValue.builder().Task(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductIndication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductIndicationValue.class
  )
  interface InternalMedicinalProductIndicationValue extends InternalValue {
    @JsonValue
    MedicinalProductIndication MedicinalProductIndication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductIndication(MedicinalProductIndication());
    }

    static InternalMedicinalProductIndicationValue of(MedicinalProductIndication value) {
      return ImmutableResourceList.InternalMedicinalProductIndicationValue.builder().MedicinalProductIndication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductManufactured")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductManufacturedValue.class
  )
  interface InternalMedicinalProductManufacturedValue extends InternalValue {
    @JsonValue
    MedicinalProductManufactured MedicinalProductManufactured();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductManufactured(MedicinalProductManufactured());
    }

    static InternalMedicinalProductManufacturedValue of(MedicinalProductManufactured value) {
      return ImmutableResourceList.InternalMedicinalProductManufacturedValue.builder().MedicinalProductManufactured(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Evidence")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEvidenceValue.class
  )
  interface InternalEvidenceValue extends InternalValue {
    @JsonValue
    Evidence Evidence();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEvidence(Evidence());
    }

    static InternalEvidenceValue of(Evidence value) {
      return ImmutableResourceList.InternalEvidenceValue.builder().Evidence(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CodeSystem")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCodeSystemValue.class
  )
  interface InternalCodeSystemValue extends InternalValue {
    @JsonValue
    CodeSystem CodeSystem();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCodeSystem(CodeSystem());
    }

    static InternalCodeSystemValue of(CodeSystem value) {
      return ImmutableResourceList.InternalCodeSystemValue.builder().CodeSystem(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicationDispense")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationDispenseValue.class
  )
  interface InternalMedicationDispenseValue extends InternalValue {
    @JsonValue
    MedicationDispense MedicationDispense();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationDispense(MedicationDispense());
    }

    static InternalMedicationDispenseValue of(MedicationDispense value) {
      return ImmutableResourceList.InternalMedicationDispenseValue.builder().MedicationDispense(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SubstancePolymer")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstancePolymerValue.class
  )
  interface InternalSubstancePolymerValue extends InternalValue {
    @JsonValue
    SubstancePolymer SubstancePolymer();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstancePolymer(SubstancePolymer());
    }

    static InternalSubstancePolymerValue of(SubstancePolymer value) {
      return ImmutableResourceList.InternalSubstancePolymerValue.builder().SubstancePolymer(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DetectedIssue")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDetectedIssueValue.class
  )
  interface InternalDetectedIssueValue extends InternalValue {
    @JsonValue
    DetectedIssue DetectedIssue();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDetectedIssue(DetectedIssue());
    }

    static InternalDetectedIssueValue of(DetectedIssue value) {
      return ImmutableResourceList.InternalDetectedIssueValue.builder().DetectedIssue(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("InsurancePlan")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalInsurancePlanValue.class
  )
  interface InternalInsurancePlanValue extends InternalValue {
    @JsonValue
    InsurancePlan InsurancePlan();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitInsurancePlan(InsurancePlan());
    }

    static InternalInsurancePlanValue of(InsurancePlan value) {
      return ImmutableResourceList.InternalInsurancePlanValue.builder().InsurancePlan(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ImmunizationEvaluation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImmunizationEvaluationValue.class
  )
  interface InternalImmunizationEvaluationValue extends InternalValue {
    @JsonValue
    ImmunizationEvaluation ImmunizationEvaluation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImmunizationEvaluation(ImmunizationEvaluation());
    }

    static InternalImmunizationEvaluationValue of(ImmunizationEvaluation value) {
      return ImmutableResourceList.InternalImmunizationEvaluationValue.builder().ImmunizationEvaluation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductIngredient")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductIngredientValue.class
  )
  interface InternalMedicinalProductIngredientValue extends InternalValue {
    @JsonValue
    MedicinalProductIngredient MedicinalProductIngredient();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductIngredient(MedicinalProductIngredient());
    }

    static InternalMedicinalProductIngredientValue of(MedicinalProductIngredient value) {
      return ImmutableResourceList.InternalMedicinalProductIngredientValue.builder().MedicinalProductIngredient(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Communication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCommunicationValue.class
  )
  interface InternalCommunicationValue extends InternalValue {
    @JsonValue
    Communication Communication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCommunication(Communication());
    }

    static InternalCommunicationValue of(Communication value) {
      return ImmutableResourceList.InternalCommunicationValue.builder().Communication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("GuidanceResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGuidanceResponseValue.class
  )
  interface InternalGuidanceResponseValue extends InternalValue {
    @JsonValue
    GuidanceResponse GuidanceResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGuidanceResponse(GuidanceResponse());
    }

    static InternalGuidanceResponseValue of(GuidanceResponse value) {
      return ImmutableResourceList.InternalGuidanceResponseValue.builder().GuidanceResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Bundle")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBundleValue.class
  )
  interface InternalBundleValue extends InternalValue {
    @JsonValue
    Bundle Bundle();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBundle(Bundle());
    }

    static InternalBundleValue of(Bundle value) {
      return ImmutableResourceList.InternalBundleValue.builder().Bundle(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("AccessPolicy")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAccessPolicyValue.class
  )
  interface InternalAccessPolicyValue extends InternalValue {
    @JsonValue
    AccessPolicy AccessPolicy();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAccessPolicy(AccessPolicy());
    }

    static InternalAccessPolicyValue of(AccessPolicy value) {
      return ImmutableResourceList.InternalAccessPolicyValue.builder().AccessPolicy(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("EffectEvidenceSynthesis")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEffectEvidenceSynthesisValue.class
  )
  interface InternalEffectEvidenceSynthesisValue extends InternalValue {
    @JsonValue
    EffectEvidenceSynthesis EffectEvidenceSynthesis();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEffectEvidenceSynthesis(EffectEvidenceSynthesis());
    }

    static InternalEffectEvidenceSynthesisValue of(EffectEvidenceSynthesis value) {
      return ImmutableResourceList.InternalEffectEvidenceSynthesisValue.builder().EffectEvidenceSynthesis(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MolecularSequence")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMolecularSequenceValue.class
  )
  interface InternalMolecularSequenceValue extends InternalValue {
    @JsonValue
    MolecularSequence MolecularSequence();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMolecularSequence(MolecularSequence());
    }

    static InternalMolecularSequenceValue of(MolecularSequence value) {
      return ImmutableResourceList.InternalMolecularSequenceValue.builder().MolecularSequence(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("RequestGroup")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRequestGroupValue.class
  )
  interface InternalRequestGroupValue extends InternalValue {
    @JsonValue
    RequestGroup RequestGroup();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRequestGroup(RequestGroup());
    }

    static InternalRequestGroupValue of(RequestGroup value) {
      return ImmutableResourceList.InternalRequestGroupValue.builder().RequestGroup(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Condition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalConditionValue.class
  )
  interface InternalConditionValue extends InternalValue {
    @JsonValue
    Condition Condition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCondition(Condition());
    }

    static InternalConditionValue of(Condition value) {
      return ImmutableResourceList.InternalConditionValue.builder().Condition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicationStatement")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationStatementValue.class
  )
  interface InternalMedicationStatementValue extends InternalValue {
    @JsonValue
    MedicationStatement MedicationStatement();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationStatement(MedicationStatement());
    }

    static InternalMedicationStatementValue of(MedicationStatement value) {
      return ImmutableResourceList.InternalMedicationStatementValue.builder().MedicationStatement(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("OperationDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOperationDefinitionValue.class
  )
  interface InternalOperationDefinitionValue extends InternalValue {
    @JsonValue
    OperationDefinition OperationDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOperationDefinition(OperationDefinition());
    }

    static InternalOperationDefinitionValue of(OperationDefinition value) {
      return ImmutableResourceList.InternalOperationDefinitionValue.builder().OperationDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Organization")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOrganizationValue.class
  )
  interface InternalOrganizationValue extends InternalValue {
    @JsonValue
    Organization Organization();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOrganization(Organization());
    }

    static InternalOrganizationValue of(Organization value) {
      return ImmutableResourceList.InternalOrganizationValue.builder().Organization(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("OrganizationAffiliation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOrganizationAffiliationValue.class
  )
  interface InternalOrganizationAffiliationValue extends InternalValue {
    @JsonValue
    OrganizationAffiliation OrganizationAffiliation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOrganizationAffiliation(OrganizationAffiliation());
    }

    static InternalOrganizationAffiliationValue of(OrganizationAffiliation value) {
      return ImmutableResourceList.InternalOrganizationAffiliationValue.builder().OrganizationAffiliation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ResearchSubject")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchSubjectValue.class
  )
  interface InternalResearchSubjectValue extends InternalValue {
    @JsonValue
    ResearchSubject ResearchSubject();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchSubject(ResearchSubject());
    }

    static InternalResearchSubjectValue of(ResearchSubject value) {
      return ImmutableResourceList.InternalResearchSubjectValue.builder().ResearchSubject(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ExampleScenario")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalExampleScenarioValue.class
  )
  interface InternalExampleScenarioValue extends InternalValue {
    @JsonValue
    ExampleScenario ExampleScenario();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitExampleScenario(ExampleScenario());
    }

    static InternalExampleScenarioValue of(ExampleScenario value) {
      return ImmutableResourceList.InternalExampleScenarioValue.builder().ExampleScenario(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Linkage")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLinkageValue.class
  )
  interface InternalLinkageValue extends InternalValue {
    @JsonValue
    Linkage Linkage();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLinkage(Linkage());
    }

    static InternalLinkageValue of(Linkage value) {
      return ImmutableResourceList.InternalLinkageValue.builder().Linkage(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("RiskEvidenceSynthesis")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRiskEvidenceSynthesisValue.class
  )
  interface InternalRiskEvidenceSynthesisValue extends InternalValue {
    @JsonValue
    RiskEvidenceSynthesis RiskEvidenceSynthesis();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRiskEvidenceSynthesis(RiskEvidenceSynthesis());
    }

    static InternalRiskEvidenceSynthesisValue of(RiskEvidenceSynthesis value) {
      return ImmutableResourceList.InternalRiskEvidenceSynthesisValue.builder().RiskEvidenceSynthesis(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicationAdministration")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationAdministrationValue.class
  )
  interface InternalMedicationAdministrationValue extends InternalValue {
    @JsonValue
    MedicationAdministration MedicationAdministration();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationAdministration(MedicationAdministration());
    }

    static InternalMedicationAdministrationValue of(MedicationAdministration value) {
      return ImmutableResourceList.InternalMedicationAdministrationValue.builder().MedicationAdministration(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Project")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalProjectValue.class
  )
  interface InternalProjectValue extends InternalValue {
    @JsonValue
    Project Project();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitProject(Project());
    }

    static InternalProjectValue of(Project value) {
      return ImmutableResourceList.InternalProjectValue.builder().Project(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SupplyRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSupplyRequestValue.class
  )
  interface InternalSupplyRequestValue extends InternalValue {
    @JsonValue
    SupplyRequest SupplyRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSupplyRequest(SupplyRequest());
    }

    static InternalSupplyRequestValue of(SupplyRequest value) {
      return ImmutableResourceList.InternalSupplyRequestValue.builder().SupplyRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CatalogEntry")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCatalogEntryValue.class
  )
  interface InternalCatalogEntryValue extends InternalValue {
    @JsonValue
    CatalogEntry CatalogEntry();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCatalogEntry(CatalogEntry());
    }

    static InternalCatalogEntryValue of(CatalogEntry value) {
      return ImmutableResourceList.InternalCatalogEntryValue.builder().CatalogEntry(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SubstanceSourceMaterial")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceSourceMaterialValue.class
  )
  interface InternalSubstanceSourceMaterialValue extends InternalValue {
    @JsonValue
    SubstanceSourceMaterial SubstanceSourceMaterial();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceSourceMaterial(SubstanceSourceMaterial());
    }

    static InternalSubstanceSourceMaterialValue of(SubstanceSourceMaterial value) {
      return ImmutableResourceList.InternalSubstanceSourceMaterialValue.builder().SubstanceSourceMaterial(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("OperationOutcome")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOperationOutcomeValue.class
  )
  interface InternalOperationOutcomeValue extends InternalValue {
    @JsonValue
    OperationOutcome OperationOutcome();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOperationOutcome(OperationOutcome());
    }

    static InternalOperationOutcomeValue of(OperationOutcome value) {
      return ImmutableResourceList.InternalOperationOutcomeValue.builder().OperationOutcome(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Practitioner")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPractitionerValue.class
  )
  interface InternalPractitionerValue extends InternalValue {
    @JsonValue
    Practitioner Practitioner();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPractitioner(Practitioner());
    }

    static InternalPractitionerValue of(Practitioner value) {
      return ImmutableResourceList.InternalPractitionerValue.builder().Practitioner(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("BiologicallyDerivedProduct")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBiologicallyDerivedProductValue.class
  )
  interface InternalBiologicallyDerivedProductValue extends InternalValue {
    @JsonValue
    BiologicallyDerivedProduct BiologicallyDerivedProduct();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBiologicallyDerivedProduct(BiologicallyDerivedProduct());
    }

    static InternalBiologicallyDerivedProductValue of(BiologicallyDerivedProduct value) {
      return ImmutableResourceList.InternalBiologicallyDerivedProductValue.builder().BiologicallyDerivedProduct(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ImplementationGuide")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImplementationGuideValue.class
  )
  interface InternalImplementationGuideValue extends InternalValue {
    @JsonValue
    ImplementationGuide ImplementationGuide();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImplementationGuide(ImplementationGuide());
    }

    static InternalImplementationGuideValue of(ImplementationGuide value) {
      return ImmutableResourceList.InternalImplementationGuideValue.builder().ImplementationGuide(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("TestReport")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTestReportValue.class
  )
  interface InternalTestReportValue extends InternalValue {
    @JsonValue
    TestReport TestReport();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTestReport(TestReport());
    }

    static InternalTestReportValue of(TestReport value) {
      return ImmutableResourceList.InternalTestReportValue.builder().TestReport(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Questionnaire")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalQuestionnaireValue.class
  )
  interface InternalQuestionnaireValue extends InternalValue {
    @JsonValue
    Questionnaire Questionnaire();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitQuestionnaire(Questionnaire());
    }

    static InternalQuestionnaireValue of(Questionnaire value) {
      return ImmutableResourceList.InternalQuestionnaireValue.builder().Questionnaire(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Bot")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBotValue.class
  )
  interface InternalBotValue extends InternalValue {
    @JsonValue
    Bot Bot();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBot(Bot());
    }

    static InternalBotValue of(Bot value) {
      return ImmutableResourceList.InternalBotValue.builder().Bot(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductUndesirableEffect")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductUndesirableEffectValue.class
  )
  interface InternalMedicinalProductUndesirableEffectValue extends InternalValue {
    @JsonValue
    MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect());
    }

    static InternalMedicinalProductUndesirableEffectValue of(
        MedicinalProductUndesirableEffect value) {
      return ImmutableResourceList.InternalMedicinalProductUndesirableEffectValue.builder().MedicinalProductUndesirableEffect(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("VerificationResult")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalVerificationResultValue.class
  )
  interface InternalVerificationResultValue extends InternalValue {
    @JsonValue
    VerificationResult VerificationResult();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitVerificationResult(VerificationResult());
    }

    static InternalVerificationResultValue of(VerificationResult value) {
      return ImmutableResourceList.InternalVerificationResultValue.builder().VerificationResult(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("User")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalUserValue.class
  )
  interface InternalUserValue extends InternalValue {
    @JsonValue
    User User();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitUser(User());
    }

    static InternalUserValue of(User value) {
      return ImmutableResourceList.InternalUserValue.builder().User(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Consent")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalConsentValue.class
  )
  interface InternalConsentValue extends InternalValue {
    @JsonValue
    Consent Consent();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitConsent(Consent());
    }

    static InternalConsentValue of(Consent value) {
      return ImmutableResourceList.InternalConsentValue.builder().Consent(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ChargeItem")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalChargeItemValue.class
  )
  interface InternalChargeItemValue extends InternalValue {
    @JsonValue
    ChargeItem ChargeItem();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitChargeItem(ChargeItem());
    }

    static InternalChargeItemValue of(ChargeItem value) {
      return ImmutableResourceList.InternalChargeItemValue.builder().ChargeItem(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("List")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalListValue.class
  )
  interface InternalListValue extends InternalValue {
    @JsonValue
    List List();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitList(List());
    }

    static InternalListValue of(List value) {
      return ImmutableResourceList.InternalListValue.builder().List(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ClientApplication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClientApplicationValue.class
  )
  interface InternalClientApplicationValue extends InternalValue {
    @JsonValue
    ClientApplication ClientApplication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClientApplication(ClientApplication());
    }

    static InternalClientApplicationValue of(ClientApplication value) {
      return ImmutableResourceList.InternalClientApplicationValue.builder().ClientApplication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Location")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLocationValue.class
  )
  interface InternalLocationValue extends InternalValue {
    @JsonValue
    Location Location();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLocation(Location());
    }

    static InternalLocationValue of(Location value) {
      return ImmutableResourceList.InternalLocationValue.builder().Location(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("EnrollmentResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEnrollmentResponseValue.class
  )
  interface InternalEnrollmentResponseValue extends InternalValue {
    @JsonValue
    EnrollmentResponse EnrollmentResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEnrollmentResponse(EnrollmentResponse());
    }

    static InternalEnrollmentResponseValue of(EnrollmentResponse value) {
      return ImmutableResourceList.InternalEnrollmentResponseValue.builder().EnrollmentResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("RiskAssessment")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRiskAssessmentValue.class
  )
  interface InternalRiskAssessmentValue extends InternalValue {
    @JsonValue
    RiskAssessment RiskAssessment();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRiskAssessment(RiskAssessment());
    }

    static InternalRiskAssessmentValue of(RiskAssessment value) {
      return ImmutableResourceList.InternalRiskAssessmentValue.builder().RiskAssessment(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("GraphDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGraphDefinitionValue.class
  )
  interface InternalGraphDefinitionValue extends InternalValue {
    @JsonValue
    GraphDefinition GraphDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGraphDefinition(GraphDefinition());
    }

    static InternalGraphDefinitionValue of(GraphDefinition value) {
      return ImmutableResourceList.InternalGraphDefinitionValue.builder().GraphDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Provenance")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalProvenanceValue.class
  )
  interface InternalProvenanceValue extends InternalValue {
    @JsonValue
    Provenance Provenance();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitProvenance(Provenance());
    }

    static InternalProvenanceValue of(Provenance value) {
      return ImmutableResourceList.InternalProvenanceValue.builder().Provenance(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SubstanceProtein")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceProteinValue.class
  )
  interface InternalSubstanceProteinValue extends InternalValue {
    @JsonValue
    SubstanceProtein SubstanceProtein();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceProtein(SubstanceProtein());
    }

    static InternalSubstanceProteinValue of(SubstanceProtein value) {
      return ImmutableResourceList.InternalSubstanceProteinValue.builder().SubstanceProtein(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("SpecimenDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSpecimenDefinitionValue.class
  )
  interface InternalSpecimenDefinitionValue extends InternalValue {
    @JsonValue
    SpecimenDefinition SpecimenDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSpecimenDefinition(SpecimenDefinition());
    }

    static InternalSpecimenDefinitionValue of(SpecimenDefinition value) {
      return ImmutableResourceList.InternalSpecimenDefinitionValue.builder().SpecimenDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Coverage")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCoverageValue.class
  )
  interface InternalCoverageValue extends InternalValue {
    @JsonValue
    Coverage Coverage();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCoverage(Coverage());
    }

    static InternalCoverageValue of(Coverage value) {
      return ImmutableResourceList.InternalCoverageValue.builder().Coverage(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ValueSet")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalValueSetValue.class
  )
  interface InternalValueSetValue extends InternalValue {
    @JsonValue
    ValueSet ValueSet();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitValueSet(ValueSet());
    }

    static InternalValueSetValue of(ValueSet value) {
      return ImmutableResourceList.InternalValueSetValue.builder().ValueSet(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("AllergyIntolerance")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAllergyIntoleranceValue.class
  )
  interface InternalAllergyIntoleranceValue extends InternalValue {
    @JsonValue
    AllergyIntolerance AllergyIntolerance();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAllergyIntolerance(AllergyIntolerance());
    }

    static InternalAllergyIntoleranceValue of(AllergyIntolerance value) {
      return ImmutableResourceList.InternalAllergyIntoleranceValue.builder().AllergyIntolerance(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Binary")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBinaryValue.class
  )
  interface InternalBinaryValue extends InternalValue {
    @JsonValue
    Binary Binary();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBinary(Binary());
    }

    static InternalBinaryValue of(Binary value) {
      return ImmutableResourceList.InternalBinaryValue.builder().Binary(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Parameters")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalParametersValue.class
  )
  interface InternalParametersValue extends InternalValue {
    @JsonValue
    Parameters Parameters();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitParameters(Parameters());
    }

    static InternalParametersValue of(Parameters value) {
      return ImmutableResourceList.InternalParametersValue.builder().Parameters(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ActivityDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalActivityDefinitionValue.class
  )
  interface InternalActivityDefinitionValue extends InternalValue {
    @JsonValue
    ActivityDefinition ActivityDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitActivityDefinition(ActivityDefinition());
    }

    static InternalActivityDefinitionValue of(ActivityDefinition value) {
      return ImmutableResourceList.InternalActivityDefinitionValue.builder().ActivityDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("MedicinalProductAuthorization")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductAuthorizationValue.class
  )
  interface InternalMedicinalProductAuthorizationValue extends InternalValue {
    @JsonValue
    MedicinalProductAuthorization MedicinalProductAuthorization();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductAuthorization(MedicinalProductAuthorization());
    }

    static InternalMedicinalProductAuthorizationValue of(MedicinalProductAuthorization value) {
      return ImmutableResourceList.InternalMedicinalProductAuthorizationValue.builder().MedicinalProductAuthorization(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Library")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLibraryValue.class
  )
  interface InternalLibraryValue extends InternalValue {
    @JsonValue
    Library Library();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLibrary(Library());
    }

    static InternalLibraryValue of(Library value) {
      return ImmutableResourceList.InternalLibraryValue.builder().Library(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("NutritionOrder")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalNutritionOrderValue.class
  )
  interface InternalNutritionOrderValue extends InternalValue {
    @JsonValue
    NutritionOrder NutritionOrder();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitNutritionOrder(NutritionOrder());
    }

    static InternalNutritionOrderValue of(NutritionOrder value) {
      return ImmutableResourceList.InternalNutritionOrderValue.builder().NutritionOrder(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("CoverageEligibilityResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCoverageEligibilityResponseValue.class
  )
  interface InternalCoverageEligibilityResponseValue extends InternalValue {
    @JsonValue
    CoverageEligibilityResponse CoverageEligibilityResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCoverageEligibilityResponse(CoverageEligibilityResponse());
    }

    static InternalCoverageEligibilityResponseValue of(CoverageEligibilityResponse value) {
      return ImmutableResourceList.InternalCoverageEligibilityResponseValue.builder().CoverageEligibilityResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ExplanationOfBenefit")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalExplanationOfBenefitValue.class
  )
  interface InternalExplanationOfBenefitValue extends InternalValue {
    @JsonValue
    ExplanationOfBenefit ExplanationOfBenefit();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitExplanationOfBenefit(ExplanationOfBenefit());
    }

    static InternalExplanationOfBenefitValue of(ExplanationOfBenefit value) {
      return ImmutableResourceList.InternalExplanationOfBenefitValue.builder().ExplanationOfBenefit(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("Login")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLoginValue.class
  )
  interface InternalLoginValue extends InternalValue {
    @JsonValue
    Login Login();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLogin(Login());
    }

    static InternalLoginValue of(Login value) {
      return ImmutableResourceList.InternalLoginValue.builder().Login(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("UserConfiguration")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalUserConfigurationValue.class
  )
  interface InternalUserConfigurationValue extends InternalValue {
    @JsonValue
    UserConfiguration UserConfiguration();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitUserConfiguration(UserConfiguration());
    }

    static InternalUserConfigurationValue of(UserConfiguration value) {
      return ImmutableResourceList.InternalUserConfigurationValue.builder().UserConfiguration(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("ServiceRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalServiceRequestValue.class
  )
  interface InternalServiceRequestValue extends InternalValue {
    @JsonValue
    ServiceRequest ServiceRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitServiceRequest(ServiceRequest());
    }

    static InternalServiceRequestValue of(ServiceRequest value) {
      return ImmutableResourceList.InternalServiceRequestValue.builder().ServiceRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("DeviceMetric")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceMetricValue.class
  )
  interface InternalDeviceMetricValue extends InternalValue {
    @JsonValue
    DeviceMetric DeviceMetric();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceMetric(DeviceMetric());
    }

    static InternalDeviceMetricValue of(DeviceMetric value) {
      return ImmutableResourceList.InternalDeviceMetricValue.builder().DeviceMetric(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("StructureDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalStructureDefinitionValue.class
  )
  interface InternalStructureDefinitionValue extends InternalValue {
    @JsonValue
    StructureDefinition StructureDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitStructureDefinition(StructureDefinition());
    }

    static InternalStructureDefinitionValue of(StructureDefinition value) {
      return ImmutableResourceList.InternalStructureDefinitionValue.builder().StructureDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonDeserialize(
      as = ImmutableResourceList.Unknown.class
  )
  interface Unknown extends InternalValue {
    @JsonValue
    Map<String, Object> value();

    default String type() {
      return value().get("type").toString();
    }

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitUnknown(type());
    }
  }
}
