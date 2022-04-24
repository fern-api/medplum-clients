package com.fhir;

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

  public static ResourceList account(Account value) {
    return new ResourceList(InternalAccountValue.of(value));
  }

  public static ResourceList activityDefinition(ActivityDefinition value) {
    return new ResourceList(InternalActivityDefinitionValue.of(value));
  }

  public static ResourceList adverseEvent(AdverseEvent value) {
    return new ResourceList(InternalAdverseEventValue.of(value));
  }

  public static ResourceList allergyIntolerance(AllergyIntolerance value) {
    return new ResourceList(InternalAllergyIntoleranceValue.of(value));
  }

  public static ResourceList appointment(Appointment value) {
    return new ResourceList(InternalAppointmentValue.of(value));
  }

  public static ResourceList appointmentResponse(AppointmentResponse value) {
    return new ResourceList(InternalAppointmentResponseValue.of(value));
  }

  public static ResourceList auditEvent(AuditEvent value) {
    return new ResourceList(InternalAuditEventValue.of(value));
  }

  public static ResourceList basic(Basic value) {
    return new ResourceList(InternalBasicValue.of(value));
  }

  public static ResourceList binary(Binary value) {
    return new ResourceList(InternalBinaryValue.of(value));
  }

  public static ResourceList biologicallyDerivedProduct(BiologicallyDerivedProduct value) {
    return new ResourceList(InternalBiologicallyDerivedProductValue.of(value));
  }

  public static ResourceList bodyStructure(BodyStructure value) {
    return new ResourceList(InternalBodyStructureValue.of(value));
  }

  public static ResourceList bundle(Bundle value) {
    return new ResourceList(InternalBundleValue.of(value));
  }

  public static ResourceList capabilityStatement(CapabilityStatement value) {
    return new ResourceList(InternalCapabilityStatementValue.of(value));
  }

  public static ResourceList carePlan(CarePlan value) {
    return new ResourceList(InternalCarePlanValue.of(value));
  }

  public static ResourceList careTeam(CareTeam value) {
    return new ResourceList(InternalCareTeamValue.of(value));
  }

  public static ResourceList catalogEntry(CatalogEntry value) {
    return new ResourceList(InternalCatalogEntryValue.of(value));
  }

  public static ResourceList chargeItem(ChargeItem value) {
    return new ResourceList(InternalChargeItemValue.of(value));
  }

  public static ResourceList chargeItemDefinition(ChargeItemDefinition value) {
    return new ResourceList(InternalChargeItemDefinitionValue.of(value));
  }

  public static ResourceList claim(Claim value) {
    return new ResourceList(InternalClaimValue.of(value));
  }

  public static ResourceList claimResponse(ClaimResponse value) {
    return new ResourceList(InternalClaimResponseValue.of(value));
  }

  public static ResourceList clinicalImpression(ClinicalImpression value) {
    return new ResourceList(InternalClinicalImpressionValue.of(value));
  }

  public static ResourceList codeSystem(CodeSystem value) {
    return new ResourceList(InternalCodeSystemValue.of(value));
  }

  public static ResourceList communication(Communication value) {
    return new ResourceList(InternalCommunicationValue.of(value));
  }

  public static ResourceList communicationRequest(CommunicationRequest value) {
    return new ResourceList(InternalCommunicationRequestValue.of(value));
  }

  public static ResourceList compartmentDefinition(CompartmentDefinition value) {
    return new ResourceList(InternalCompartmentDefinitionValue.of(value));
  }

  public static ResourceList composition(Composition value) {
    return new ResourceList(InternalCompositionValue.of(value));
  }

  public static ResourceList conceptMap(ConceptMap value) {
    return new ResourceList(InternalConceptMapValue.of(value));
  }

  public static ResourceList condition(Condition value) {
    return new ResourceList(InternalConditionValue.of(value));
  }

  public static ResourceList consent(Consent value) {
    return new ResourceList(InternalConsentValue.of(value));
  }

  public static ResourceList contract(Contract value) {
    return new ResourceList(InternalContractValue.of(value));
  }

  public static ResourceList coverage(Coverage value) {
    return new ResourceList(InternalCoverageValue.of(value));
  }

  public static ResourceList coverageEligibilityRequest(CoverageEligibilityRequest value) {
    return new ResourceList(InternalCoverageEligibilityRequestValue.of(value));
  }

  public static ResourceList coverageEligibilityResponse(CoverageEligibilityResponse value) {
    return new ResourceList(InternalCoverageEligibilityResponseValue.of(value));
  }

  public static ResourceList detectedIssue(DetectedIssue value) {
    return new ResourceList(InternalDetectedIssueValue.of(value));
  }

  public static ResourceList device(Device value) {
    return new ResourceList(InternalDeviceValue.of(value));
  }

  public static ResourceList deviceDefinition(DeviceDefinition value) {
    return new ResourceList(InternalDeviceDefinitionValue.of(value));
  }

  public static ResourceList deviceMetric(DeviceMetric value) {
    return new ResourceList(InternalDeviceMetricValue.of(value));
  }

  public static ResourceList deviceRequest(DeviceRequest value) {
    return new ResourceList(InternalDeviceRequestValue.of(value));
  }

  public static ResourceList deviceUseStatement(DeviceUseStatement value) {
    return new ResourceList(InternalDeviceUseStatementValue.of(value));
  }

  public static ResourceList diagnosticReport(DiagnosticReport value) {
    return new ResourceList(InternalDiagnosticReportValue.of(value));
  }

  public static ResourceList documentManifest(DocumentManifest value) {
    return new ResourceList(InternalDocumentManifestValue.of(value));
  }

  public static ResourceList documentReference(DocumentReference value) {
    return new ResourceList(InternalDocumentReferenceValue.of(value));
  }

  public static ResourceList effectEvidenceSynthesis(EffectEvidenceSynthesis value) {
    return new ResourceList(InternalEffectEvidenceSynthesisValue.of(value));
  }

  public static ResourceList encounter(Encounter value) {
    return new ResourceList(InternalEncounterValue.of(value));
  }

  public static ResourceList endpoint(Endpoint value) {
    return new ResourceList(InternalEndpointValue.of(value));
  }

  public static ResourceList enrollmentRequest(EnrollmentRequest value) {
    return new ResourceList(InternalEnrollmentRequestValue.of(value));
  }

  public static ResourceList enrollmentResponse(EnrollmentResponse value) {
    return new ResourceList(InternalEnrollmentResponseValue.of(value));
  }

  public static ResourceList episodeOfCare(EpisodeOfCare value) {
    return new ResourceList(InternalEpisodeOfCareValue.of(value));
  }

  public static ResourceList eventDefinition(EventDefinition value) {
    return new ResourceList(InternalEventDefinitionValue.of(value));
  }

  public static ResourceList evidence(Evidence value) {
    return new ResourceList(InternalEvidenceValue.of(value));
  }

  public static ResourceList evidenceVariable(EvidenceVariable value) {
    return new ResourceList(InternalEvidenceVariableValue.of(value));
  }

  public static ResourceList exampleScenario(ExampleScenario value) {
    return new ResourceList(InternalExampleScenarioValue.of(value));
  }

  public static ResourceList explanationOfBenefit(ExplanationOfBenefit value) {
    return new ResourceList(InternalExplanationOfBenefitValue.of(value));
  }

  public static ResourceList familyMemberHistory(FamilyMemberHistory value) {
    return new ResourceList(InternalFamilyMemberHistoryValue.of(value));
  }

  public static ResourceList flag(Flag value) {
    return new ResourceList(InternalFlagValue.of(value));
  }

  public static ResourceList goal(Goal value) {
    return new ResourceList(InternalGoalValue.of(value));
  }

  public static ResourceList graphDefinition(GraphDefinition value) {
    return new ResourceList(InternalGraphDefinitionValue.of(value));
  }

  public static ResourceList group(Group value) {
    return new ResourceList(InternalGroupValue.of(value));
  }

  public static ResourceList guidanceResponse(GuidanceResponse value) {
    return new ResourceList(InternalGuidanceResponseValue.of(value));
  }

  public static ResourceList healthcareService(HealthcareService value) {
    return new ResourceList(InternalHealthcareServiceValue.of(value));
  }

  public static ResourceList imagingStudy(ImagingStudy value) {
    return new ResourceList(InternalImagingStudyValue.of(value));
  }

  public static ResourceList immunization(Immunization value) {
    return new ResourceList(InternalImmunizationValue.of(value));
  }

  public static ResourceList immunizationEvaluation(ImmunizationEvaluation value) {
    return new ResourceList(InternalImmunizationEvaluationValue.of(value));
  }

  public static ResourceList immunizationRecommendation(ImmunizationRecommendation value) {
    return new ResourceList(InternalImmunizationRecommendationValue.of(value));
  }

  public static ResourceList implementationGuide(ImplementationGuide value) {
    return new ResourceList(InternalImplementationGuideValue.of(value));
  }

  public static ResourceList insurancePlan(InsurancePlan value) {
    return new ResourceList(InternalInsurancePlanValue.of(value));
  }

  public static ResourceList invoice(Invoice value) {
    return new ResourceList(InternalInvoiceValue.of(value));
  }

  public static ResourceList library(Library value) {
    return new ResourceList(InternalLibraryValue.of(value));
  }

  public static ResourceList linkage(Linkage value) {
    return new ResourceList(InternalLinkageValue.of(value));
  }

  public static ResourceList list(List value) {
    return new ResourceList(InternalListValue.of(value));
  }

  public static ResourceList location(Location value) {
    return new ResourceList(InternalLocationValue.of(value));
  }

  public static ResourceList measure(Measure value) {
    return new ResourceList(InternalMeasureValue.of(value));
  }

  public static ResourceList measureReport(MeasureReport value) {
    return new ResourceList(InternalMeasureReportValue.of(value));
  }

  public static ResourceList media(Media value) {
    return new ResourceList(InternalMediaValue.of(value));
  }

  public static ResourceList medication(Medication value) {
    return new ResourceList(InternalMedicationValue.of(value));
  }

  public static ResourceList medicationAdministration(MedicationAdministration value) {
    return new ResourceList(InternalMedicationAdministrationValue.of(value));
  }

  public static ResourceList medicationDispense(MedicationDispense value) {
    return new ResourceList(InternalMedicationDispenseValue.of(value));
  }

  public static ResourceList medicationKnowledge(MedicationKnowledge value) {
    return new ResourceList(InternalMedicationKnowledgeValue.of(value));
  }

  public static ResourceList medicationRequest(MedicationRequest value) {
    return new ResourceList(InternalMedicationRequestValue.of(value));
  }

  public static ResourceList medicationStatement(MedicationStatement value) {
    return new ResourceList(InternalMedicationStatementValue.of(value));
  }

  public static ResourceList medicinalProduct(MedicinalProduct value) {
    return new ResourceList(InternalMedicinalProductValue.of(value));
  }

  public static ResourceList medicinalProductAuthorization(MedicinalProductAuthorization value) {
    return new ResourceList(InternalMedicinalProductAuthorizationValue.of(value));
  }

  public static ResourceList medicinalProductContraindication(
      MedicinalProductContraindication value) {
    return new ResourceList(InternalMedicinalProductContraindicationValue.of(value));
  }

  public static ResourceList medicinalProductIndication(MedicinalProductIndication value) {
    return new ResourceList(InternalMedicinalProductIndicationValue.of(value));
  }

  public static ResourceList medicinalProductIngredient(MedicinalProductIngredient value) {
    return new ResourceList(InternalMedicinalProductIngredientValue.of(value));
  }

  public static ResourceList medicinalProductInteraction(MedicinalProductInteraction value) {
    return new ResourceList(InternalMedicinalProductInteractionValue.of(value));
  }

  public static ResourceList medicinalProductManufactured(MedicinalProductManufactured value) {
    return new ResourceList(InternalMedicinalProductManufacturedValue.of(value));
  }

  public static ResourceList medicinalProductPackaged(MedicinalProductPackaged value) {
    return new ResourceList(InternalMedicinalProductPackagedValue.of(value));
  }

  public static ResourceList medicinalProductPharmaceutical(MedicinalProductPharmaceutical value) {
    return new ResourceList(InternalMedicinalProductPharmaceuticalValue.of(value));
  }

  public static ResourceList medicinalProductUndesirableEffect(
      MedicinalProductUndesirableEffect value) {
    return new ResourceList(InternalMedicinalProductUndesirableEffectValue.of(value));
  }

  public static ResourceList messageDefinition(MessageDefinition value) {
    return new ResourceList(InternalMessageDefinitionValue.of(value));
  }

  public static ResourceList messageHeader(MessageHeader value) {
    return new ResourceList(InternalMessageHeaderValue.of(value));
  }

  public static ResourceList molecularSequence(MolecularSequence value) {
    return new ResourceList(InternalMolecularSequenceValue.of(value));
  }

  public static ResourceList namingSystem(NamingSystem value) {
    return new ResourceList(InternalNamingSystemValue.of(value));
  }

  public static ResourceList nutritionOrder(NutritionOrder value) {
    return new ResourceList(InternalNutritionOrderValue.of(value));
  }

  public static ResourceList observation(Observation value) {
    return new ResourceList(InternalObservationValue.of(value));
  }

  public static ResourceList observationDefinition(ObservationDefinition value) {
    return new ResourceList(InternalObservationDefinitionValue.of(value));
  }

  public static ResourceList operationDefinition(OperationDefinition value) {
    return new ResourceList(InternalOperationDefinitionValue.of(value));
  }

  public static ResourceList operationOutcome(OperationOutcome value) {
    return new ResourceList(InternalOperationOutcomeValue.of(value));
  }

  public static ResourceList organization(Organization value) {
    return new ResourceList(InternalOrganizationValue.of(value));
  }

  public static ResourceList organizationAffiliation(OrganizationAffiliation value) {
    return new ResourceList(InternalOrganizationAffiliationValue.of(value));
  }

  public static ResourceList parameters(Parameters value) {
    return new ResourceList(InternalParametersValue.of(value));
  }

  public static ResourceList patient(Patient value) {
    return new ResourceList(InternalPatientValue.of(value));
  }

  public static ResourceList paymentNotice(PaymentNotice value) {
    return new ResourceList(InternalPaymentNoticeValue.of(value));
  }

  public static ResourceList paymentReconciliation(PaymentReconciliation value) {
    return new ResourceList(InternalPaymentReconciliationValue.of(value));
  }

  public static ResourceList person(Person value) {
    return new ResourceList(InternalPersonValue.of(value));
  }

  public static ResourceList planDefinition(PlanDefinition value) {
    return new ResourceList(InternalPlanDefinitionValue.of(value));
  }

  public static ResourceList practitioner(Practitioner value) {
    return new ResourceList(InternalPractitionerValue.of(value));
  }

  public static ResourceList practitionerRole(PractitionerRole value) {
    return new ResourceList(InternalPractitionerRoleValue.of(value));
  }

  public static ResourceList procedure(Procedure value) {
    return new ResourceList(InternalProcedureValue.of(value));
  }

  public static ResourceList provenance(Provenance value) {
    return new ResourceList(InternalProvenanceValue.of(value));
  }

  public static ResourceList questionnaire(Questionnaire value) {
    return new ResourceList(InternalQuestionnaireValue.of(value));
  }

  public static ResourceList questionnaireResponse(QuestionnaireResponse value) {
    return new ResourceList(InternalQuestionnaireResponseValue.of(value));
  }

  public static ResourceList relatedPerson(RelatedPerson value) {
    return new ResourceList(InternalRelatedPersonValue.of(value));
  }

  public static ResourceList requestGroup(RequestGroup value) {
    return new ResourceList(InternalRequestGroupValue.of(value));
  }

  public static ResourceList researchDefinition(ResearchDefinition value) {
    return new ResourceList(InternalResearchDefinitionValue.of(value));
  }

  public static ResourceList researchElementDefinition(ResearchElementDefinition value) {
    return new ResourceList(InternalResearchElementDefinitionValue.of(value));
  }

  public static ResourceList researchStudy(ResearchStudy value) {
    return new ResourceList(InternalResearchStudyValue.of(value));
  }

  public static ResourceList researchSubject(ResearchSubject value) {
    return new ResourceList(InternalResearchSubjectValue.of(value));
  }

  public static ResourceList riskAssessment(RiskAssessment value) {
    return new ResourceList(InternalRiskAssessmentValue.of(value));
  }

  public static ResourceList riskEvidenceSynthesis(RiskEvidenceSynthesis value) {
    return new ResourceList(InternalRiskEvidenceSynthesisValue.of(value));
  }

  public static ResourceList schedule(Schedule value) {
    return new ResourceList(InternalScheduleValue.of(value));
  }

  public static ResourceList searchParameter(SearchParameter value) {
    return new ResourceList(InternalSearchParameterValue.of(value));
  }

  public static ResourceList serviceRequest(ServiceRequest value) {
    return new ResourceList(InternalServiceRequestValue.of(value));
  }

  public static ResourceList slot(Slot value) {
    return new ResourceList(InternalSlotValue.of(value));
  }

  public static ResourceList specimen(Specimen value) {
    return new ResourceList(InternalSpecimenValue.of(value));
  }

  public static ResourceList specimenDefinition(SpecimenDefinition value) {
    return new ResourceList(InternalSpecimenDefinitionValue.of(value));
  }

  public static ResourceList structureDefinition(StructureDefinition value) {
    return new ResourceList(InternalStructureDefinitionValue.of(value));
  }

  public static ResourceList structureMap(StructureMap value) {
    return new ResourceList(InternalStructureMapValue.of(value));
  }

  public static ResourceList subscription(Subscription value) {
    return new ResourceList(InternalSubscriptionValue.of(value));
  }

  public static ResourceList substance(Substance value) {
    return new ResourceList(InternalSubstanceValue.of(value));
  }

  public static ResourceList substanceNucleicAcid(SubstanceNucleicAcid value) {
    return new ResourceList(InternalSubstanceNucleicAcidValue.of(value));
  }

  public static ResourceList substancePolymer(SubstancePolymer value) {
    return new ResourceList(InternalSubstancePolymerValue.of(value));
  }

  public static ResourceList substanceProtein(SubstanceProtein value) {
    return new ResourceList(InternalSubstanceProteinValue.of(value));
  }

  public static ResourceList substanceReferenceInformation(SubstanceReferenceInformation value) {
    return new ResourceList(InternalSubstanceReferenceInformationValue.of(value));
  }

  public static ResourceList substanceSourceMaterial(SubstanceSourceMaterial value) {
    return new ResourceList(InternalSubstanceSourceMaterialValue.of(value));
  }

  public static ResourceList substanceSpecification(SubstanceSpecification value) {
    return new ResourceList(InternalSubstanceSpecificationValue.of(value));
  }

  public static ResourceList supplyDelivery(SupplyDelivery value) {
    return new ResourceList(InternalSupplyDeliveryValue.of(value));
  }

  public static ResourceList supplyRequest(SupplyRequest value) {
    return new ResourceList(InternalSupplyRequestValue.of(value));
  }

  public static ResourceList task(Task value) {
    return new ResourceList(InternalTaskValue.of(value));
  }

  public static ResourceList terminologyCapabilities(TerminologyCapabilities value) {
    return new ResourceList(InternalTerminologyCapabilitiesValue.of(value));
  }

  public static ResourceList testReport(TestReport value) {
    return new ResourceList(InternalTestReportValue.of(value));
  }

  public static ResourceList testScript(TestScript value) {
    return new ResourceList(InternalTestScriptValue.of(value));
  }

  public static ResourceList valueSet(ValueSet value) {
    return new ResourceList(InternalValueSetValue.of(value));
  }

  public static ResourceList verificationResult(VerificationResult value) {
    return new ResourceList(InternalVerificationResultValue.of(value));
  }

  public static ResourceList visionPrescription(VisionPrescription value) {
    return new ResourceList(InternalVisionPrescriptionValue.of(value));
  }

  public static ResourceList project(Project value) {
    return new ResourceList(InternalProjectValue.of(value));
  }

  public static ResourceList clientApplication(ClientApplication value) {
    return new ResourceList(InternalClientApplicationValue.of(value));
  }

  public static ResourceList user(User value) {
    return new ResourceList(InternalUserValue.of(value));
  }

  public static ResourceList login(Login value) {
    return new ResourceList(InternalLoginValue.of(value));
  }

  public static ResourceList refreshToken(RefreshToken value) {
    return new ResourceList(InternalRefreshTokenValue.of(value));
  }

  public static ResourceList passwordChangeRequest(PasswordChangeRequest value) {
    return new ResourceList(InternalPasswordChangeRequestValue.of(value));
  }

  public static ResourceList jsonWebKey(JsonWebKey value) {
    return new ResourceList(InternalJsonWebKeyValue.of(value));
  }

  public static ResourceList bot(Bot value) {
    return new ResourceList(InternalBotValue.of(value));
  }

  public static ResourceList accessPolicy(AccessPolicy value) {
    return new ResourceList(InternalAccessPolicyValue.of(value));
  }

  public static ResourceList userConfiguration(UserConfiguration value) {
    return new ResourceList(InternalUserConfigurationValue.of(value));
  }

  public boolean isPatient() {
    return value instanceof InternalPatientValue;
  }

  public boolean isLogin() {
    return value instanceof InternalLoginValue;
  }

  public boolean isList() {
    return value instanceof InternalListValue;
  }

  public boolean isActivityDefinition() {
    return value instanceof InternalActivityDefinitionValue;
  }

  public boolean isProject() {
    return value instanceof InternalProjectValue;
  }

  public boolean isQuestionnaireResponse() {
    return value instanceof InternalQuestionnaireResponseValue;
  }

  public boolean isTask() {
    return value instanceof InternalTaskValue;
  }

  public boolean isDetectedIssue() {
    return value instanceof InternalDetectedIssueValue;
  }

  public boolean isOperationOutcome() {
    return value instanceof InternalOperationOutcomeValue;
  }

  public boolean isUser() {
    return value instanceof InternalUserValue;
  }

  public boolean isChargeItemDefinition() {
    return value instanceof InternalChargeItemDefinitionValue;
  }

  public boolean isMessageHeader() {
    return value instanceof InternalMessageHeaderValue;
  }

  public boolean isSubstanceProtein() {
    return value instanceof InternalSubstanceProteinValue;
  }

  public boolean isMessageDefinition() {
    return value instanceof InternalMessageDefinitionValue;
  }

  public boolean isMeasureReport() {
    return value instanceof InternalMeasureReportValue;
  }

  public boolean isAccessPolicy() {
    return value instanceof InternalAccessPolicyValue;
  }

  public boolean isCareTeam() {
    return value instanceof InternalCareTeamValue;
  }

  public boolean isAppointment() {
    return value instanceof InternalAppointmentValue;
  }

  public boolean isParameters() {
    return value instanceof InternalParametersValue;
  }

  public boolean isChargeItem() {
    return value instanceof InternalChargeItemValue;
  }

  public boolean isObservation() {
    return value instanceof InternalObservationValue;
  }

  public boolean isSubstance() {
    return value instanceof InternalSubstanceValue;
  }

  public boolean isCoverageEligibilityResponse() {
    return value instanceof InternalCoverageEligibilityResponseValue;
  }

  public boolean isOrganizationAffiliation() {
    return value instanceof InternalOrganizationAffiliationValue;
  }

  public boolean isRiskAssessment() {
    return value instanceof InternalRiskAssessmentValue;
  }

  public boolean isObservationDefinition() {
    return value instanceof InternalObservationDefinitionValue;
  }

  public boolean isMedicationStatement() {
    return value instanceof InternalMedicationStatementValue;
  }

  public boolean isUserConfiguration() {
    return value instanceof InternalUserConfigurationValue;
  }

  public boolean isMeasure() {
    return value instanceof InternalMeasureValue;
  }

  public boolean isSupplyRequest() {
    return value instanceof InternalSupplyRequestValue;
  }

  public boolean isTerminologyCapabilities() {
    return value instanceof InternalTerminologyCapabilitiesValue;
  }

  public boolean isTestReport() {
    return value instanceof InternalTestReportValue;
  }

  public boolean isPractitioner() {
    return value instanceof InternalPractitionerValue;
  }

  public boolean isCarePlan() {
    return value instanceof InternalCarePlanValue;
  }

  public boolean isMedicinalProductPharmaceutical() {
    return value instanceof InternalMedicinalProductPharmaceuticalValue;
  }

  public boolean isLinkage() {
    return value instanceof InternalLinkageValue;
  }

  public boolean isMedicinalProduct() {
    return value instanceof InternalMedicinalProductValue;
  }

  public boolean isMedicationKnowledge() {
    return value instanceof InternalMedicationKnowledgeValue;
  }

  public boolean isProvenance() {
    return value instanceof InternalProvenanceValue;
  }

  public boolean isCoverageEligibilityRequest() {
    return value instanceof InternalCoverageEligibilityRequestValue;
  }

  public boolean isEndpoint() {
    return value instanceof InternalEndpointValue;
  }

  public boolean isConsent() {
    return value instanceof InternalConsentValue;
  }

  public boolean isEvidenceVariable() {
    return value instanceof InternalEvidenceVariableValue;
  }

  public boolean isBodyStructure() {
    return value instanceof InternalBodyStructureValue;
  }

  public boolean isCommunicationRequest() {
    return value instanceof InternalCommunicationRequestValue;
  }

  public boolean isEnrollmentRequest() {
    return value instanceof InternalEnrollmentRequestValue;
  }

  public boolean isSubstancePolymer() {
    return value instanceof InternalSubstancePolymerValue;
  }

  public boolean isClaim() {
    return value instanceof InternalClaimValue;
  }

  public boolean isSlot() {
    return value instanceof InternalSlotValue;
  }

  public boolean isCatalogEntry() {
    return value instanceof InternalCatalogEntryValue;
  }

  public boolean isValueSet() {
    return value instanceof InternalValueSetValue;
  }

  public boolean isPractitionerRole() {
    return value instanceof InternalPractitionerRoleValue;
  }

  public boolean isMolecularSequence() {
    return value instanceof InternalMolecularSequenceValue;
  }

  public boolean isCapabilityStatement() {
    return value instanceof InternalCapabilityStatementValue;
  }

  public boolean isGraphDefinition() {
    return value instanceof InternalGraphDefinitionValue;
  }

  public boolean isMedicinalProductPackaged() {
    return value instanceof InternalMedicinalProductPackagedValue;
  }

  public boolean isPaymentReconciliation() {
    return value instanceof InternalPaymentReconciliationValue;
  }

  public boolean isSchedule() {
    return value instanceof InternalScheduleValue;
  }

  public boolean isMedicinalProductManufactured() {
    return value instanceof InternalMedicinalProductManufacturedValue;
  }

  public boolean isPerson() {
    return value instanceof InternalPersonValue;
  }

  public boolean isPasswordChangeRequest() {
    return value instanceof InternalPasswordChangeRequestValue;
  }

  public boolean isMedicationRequest() {
    return value instanceof InternalMedicationRequestValue;
  }

  public boolean isImmunizationEvaluation() {
    return value instanceof InternalImmunizationEvaluationValue;
  }

  public boolean isPaymentNotice() {
    return value instanceof InternalPaymentNoticeValue;
  }

  public boolean isMedicinalProductInteraction() {
    return value instanceof InternalMedicinalProductInteractionValue;
  }

  public boolean isSubstanceReferenceInformation() {
    return value instanceof InternalSubstanceReferenceInformationValue;
  }

  public boolean isFamilyMemberHistory() {
    return value instanceof InternalFamilyMemberHistoryValue;
  }

  public boolean isAllergyIntolerance() {
    return value instanceof InternalAllergyIntoleranceValue;
  }

  public boolean isBasic() {
    return value instanceof InternalBasicValue;
  }

  public boolean isBundle() {
    return value instanceof InternalBundleValue;
  }

  public boolean isEventDefinition() {
    return value instanceof InternalEventDefinitionValue;
  }

  public boolean isEffectEvidenceSynthesis() {
    return value instanceof InternalEffectEvidenceSynthesisValue;
  }

  public boolean isRequestGroup() {
    return value instanceof InternalRequestGroupValue;
  }

  public boolean isServiceRequest() {
    return value instanceof InternalServiceRequestValue;
  }

  public boolean isImmunizationRecommendation() {
    return value instanceof InternalImmunizationRecommendationValue;
  }

  public boolean isMedicinalProductIngredient() {
    return value instanceof InternalMedicinalProductIngredientValue;
  }

  public boolean isDeviceRequest() {
    return value instanceof InternalDeviceRequestValue;
  }

  public boolean isOrganization() {
    return value instanceof InternalOrganizationValue;
  }

  public boolean isRefreshToken() {
    return value instanceof InternalRefreshTokenValue;
  }

  public boolean isCoverage() {
    return value instanceof InternalCoverageValue;
  }

  public boolean isSubstanceSpecification() {
    return value instanceof InternalSubstanceSpecificationValue;
  }

  public boolean isMedicationDispense() {
    return value instanceof InternalMedicationDispenseValue;
  }

  public boolean isInvoice() {
    return value instanceof InternalInvoiceValue;
  }

  public boolean isMedicationAdministration() {
    return value instanceof InternalMedicationAdministrationValue;
  }

  public boolean isAdverseEvent() {
    return value instanceof InternalAdverseEventValue;
  }

  public boolean isMedicinalProductUndesirableEffect() {
    return value instanceof InternalMedicinalProductUndesirableEffectValue;
  }

  public boolean isEpisodeOfCare() {
    return value instanceof InternalEpisodeOfCareValue;
  }

  public boolean isDevice() {
    return value instanceof InternalDeviceValue;
  }

  public boolean isHealthcareService() {
    return value instanceof InternalHealthcareServiceValue;
  }

  public boolean isBot() {
    return value instanceof InternalBotValue;
  }

  public boolean isSpecimenDefinition() {
    return value instanceof InternalSpecimenDefinitionValue;
  }

  public boolean isExampleScenario() {
    return value instanceof InternalExampleScenarioValue;
  }

  public boolean isSupplyDelivery() {
    return value instanceof InternalSupplyDeliveryValue;
  }

  public boolean isResearchSubject() {
    return value instanceof InternalResearchSubjectValue;
  }

  public boolean isMedicinalProductAuthorization() {
    return value instanceof InternalMedicinalProductAuthorizationValue;
  }

  public boolean isAccount() {
    return value instanceof InternalAccountValue;
  }

  public boolean isClaimResponse() {
    return value instanceof InternalClaimResponseValue;
  }

  public boolean isCondition() {
    return value instanceof InternalConditionValue;
  }

  public boolean isDeviceDefinition() {
    return value instanceof InternalDeviceDefinitionValue;
  }

  public boolean isMedication() {
    return value instanceof InternalMedicationValue;
  }

  public boolean isQuestionnaire() {
    return value instanceof InternalQuestionnaireValue;
  }

  public boolean isStructureMap() {
    return value instanceof InternalStructureMapValue;
  }

  public boolean isImmunization() {
    return value instanceof InternalImmunizationValue;
  }

  public boolean isCodeSystem() {
    return value instanceof InternalCodeSystemValue;
  }

  public boolean isClinicalImpression() {
    return value instanceof InternalClinicalImpressionValue;
  }

  public boolean isEnrollmentResponse() {
    return value instanceof InternalEnrollmentResponseValue;
  }

  public boolean isGroup() {
    return value instanceof InternalGroupValue;
  }

  public boolean isContract() {
    return value instanceof InternalContractValue;
  }

  public boolean isDeviceMetric() {
    return value instanceof InternalDeviceMetricValue;
  }

  public boolean isSearchParameter() {
    return value instanceof InternalSearchParameterValue;
  }

  public boolean isFlag() {
    return value instanceof InternalFlagValue;
  }

  public boolean isEvidence() {
    return value instanceof InternalEvidenceValue;
  }

  public boolean isLibrary() {
    return value instanceof InternalLibraryValue;
  }

  public boolean isGoal() {
    return value instanceof InternalGoalValue;
  }

  public boolean isRiskEvidenceSynthesis() {
    return value instanceof InternalRiskEvidenceSynthesisValue;
  }

  public boolean isResearchElementDefinition() {
    return value instanceof InternalResearchElementDefinitionValue;
  }

  public boolean isOperationDefinition() {
    return value instanceof InternalOperationDefinitionValue;
  }

  public boolean isExplanationOfBenefit() {
    return value instanceof InternalExplanationOfBenefitValue;
  }

  public boolean isTestScript() {
    return value instanceof InternalTestScriptValue;
  }

  public boolean isSubstanceSourceMaterial() {
    return value instanceof InternalSubstanceSourceMaterialValue;
  }

  public boolean isAppointmentResponse() {
    return value instanceof InternalAppointmentResponseValue;
  }

  public boolean isVerificationResult() {
    return value instanceof InternalVerificationResultValue;
  }

  public boolean isInsurancePlan() {
    return value instanceof InternalInsurancePlanValue;
  }

  public boolean isAuditEvent() {
    return value instanceof InternalAuditEventValue;
  }

  public boolean isCommunication() {
    return value instanceof InternalCommunicationValue;
  }

  public boolean isPlanDefinition() {
    return value instanceof InternalPlanDefinitionValue;
  }

  public boolean isConceptMap() {
    return value instanceof InternalConceptMapValue;
  }

  public boolean isEncounter() {
    return value instanceof InternalEncounterValue;
  }

  public boolean isProcedure() {
    return value instanceof InternalProcedureValue;
  }

  public boolean isGuidanceResponse() {
    return value instanceof InternalGuidanceResponseValue;
  }

  public boolean isNutritionOrder() {
    return value instanceof InternalNutritionOrderValue;
  }

  public boolean isMedia() {
    return value instanceof InternalMediaValue;
  }

  public boolean isClientApplication() {
    return value instanceof InternalClientApplicationValue;
  }

  public boolean isJsonWebKey() {
    return value instanceof InternalJsonWebKeyValue;
  }

  public boolean isVisionPrescription() {
    return value instanceof InternalVisionPrescriptionValue;
  }

  public boolean isComposition() {
    return value instanceof InternalCompositionValue;
  }

  public boolean isDocumentManifest() {
    return value instanceof InternalDocumentManifestValue;
  }

  public boolean isDocumentReference() {
    return value instanceof InternalDocumentReferenceValue;
  }

  public boolean isResearchDefinition() {
    return value instanceof InternalResearchDefinitionValue;
  }

  public boolean isDiagnosticReport() {
    return value instanceof InternalDiagnosticReportValue;
  }

  public boolean isRelatedPerson() {
    return value instanceof InternalRelatedPersonValue;
  }

  public boolean isStructureDefinition() {
    return value instanceof InternalStructureDefinitionValue;
  }

  public boolean isBiologicallyDerivedProduct() {
    return value instanceof InternalBiologicallyDerivedProductValue;
  }

  public boolean isImplementationGuide() {
    return value instanceof InternalImplementationGuideValue;
  }

  public boolean isSpecimen() {
    return value instanceof InternalSpecimenValue;
  }

  public boolean isImagingStudy() {
    return value instanceof InternalImagingStudyValue;
  }

  public boolean isMedicinalProductIndication() {
    return value instanceof InternalMedicinalProductIndicationValue;
  }

  public boolean isBinary() {
    return value instanceof InternalBinaryValue;
  }

  public boolean isSubstanceNucleicAcid() {
    return value instanceof InternalSubstanceNucleicAcidValue;
  }

  public boolean isLocation() {
    return value instanceof InternalLocationValue;
  }

  public boolean isMedicinalProductContraindication() {
    return value instanceof InternalMedicinalProductContraindicationValue;
  }

  public boolean isNamingSystem() {
    return value instanceof InternalNamingSystemValue;
  }

  public boolean isDeviceUseStatement() {
    return value instanceof InternalDeviceUseStatementValue;
  }

  public boolean isResearchStudy() {
    return value instanceof InternalResearchStudyValue;
  }

  public boolean isSubscription() {
    return value instanceof InternalSubscriptionValue;
  }

  public boolean isCompartmentDefinition() {
    return value instanceof InternalCompartmentDefinitionValue;
  }

  public Optional<Account> getAccount() {
    if (isAccount()) {
      return Optional.of(((InternalAccountValue) value).account());
    }
    return Optional.empty();
  }

  public Optional<ActivityDefinition> getActivityDefinition() {
    if (isActivityDefinition()) {
      return Optional.of(((InternalActivityDefinitionValue) value).activityDefinition());
    }
    return Optional.empty();
  }

  public Optional<AdverseEvent> getAdverseEvent() {
    if (isAdverseEvent()) {
      return Optional.of(((InternalAdverseEventValue) value).adverseEvent());
    }
    return Optional.empty();
  }

  public Optional<AllergyIntolerance> getAllergyIntolerance() {
    if (isAllergyIntolerance()) {
      return Optional.of(((InternalAllergyIntoleranceValue) value).allergyIntolerance());
    }
    return Optional.empty();
  }

  public Optional<Appointment> getAppointment() {
    if (isAppointment()) {
      return Optional.of(((InternalAppointmentValue) value).appointment());
    }
    return Optional.empty();
  }

  public Optional<AppointmentResponse> getAppointmentResponse() {
    if (isAppointmentResponse()) {
      return Optional.of(((InternalAppointmentResponseValue) value).appointmentResponse());
    }
    return Optional.empty();
  }

  public Optional<AuditEvent> getAuditEvent() {
    if (isAuditEvent()) {
      return Optional.of(((InternalAuditEventValue) value).auditEvent());
    }
    return Optional.empty();
  }

  public Optional<Basic> getBasic() {
    if (isBasic()) {
      return Optional.of(((InternalBasicValue) value).basic());
    }
    return Optional.empty();
  }

  public Optional<Binary> getBinary() {
    if (isBinary()) {
      return Optional.of(((InternalBinaryValue) value).binary());
    }
    return Optional.empty();
  }

  public Optional<BiologicallyDerivedProduct> getBiologicallyDerivedProduct() {
    if (isBiologicallyDerivedProduct()) {
      return Optional.of(((InternalBiologicallyDerivedProductValue) value).biologicallyDerivedProduct());
    }
    return Optional.empty();
  }

  public Optional<BodyStructure> getBodyStructure() {
    if (isBodyStructure()) {
      return Optional.of(((InternalBodyStructureValue) value).bodyStructure());
    }
    return Optional.empty();
  }

  public Optional<Bundle> getBundle() {
    if (isBundle()) {
      return Optional.of(((InternalBundleValue) value).bundle());
    }
    return Optional.empty();
  }

  public Optional<CapabilityStatement> getCapabilityStatement() {
    if (isCapabilityStatement()) {
      return Optional.of(((InternalCapabilityStatementValue) value).capabilityStatement());
    }
    return Optional.empty();
  }

  public Optional<CarePlan> getCarePlan() {
    if (isCarePlan()) {
      return Optional.of(((InternalCarePlanValue) value).carePlan());
    }
    return Optional.empty();
  }

  public Optional<CareTeam> getCareTeam() {
    if (isCareTeam()) {
      return Optional.of(((InternalCareTeamValue) value).careTeam());
    }
    return Optional.empty();
  }

  public Optional<CatalogEntry> getCatalogEntry() {
    if (isCatalogEntry()) {
      return Optional.of(((InternalCatalogEntryValue) value).catalogEntry());
    }
    return Optional.empty();
  }

  public Optional<ChargeItem> getChargeItem() {
    if (isChargeItem()) {
      return Optional.of(((InternalChargeItemValue) value).chargeItem());
    }
    return Optional.empty();
  }

  public Optional<ChargeItemDefinition> getChargeItemDefinition() {
    if (isChargeItemDefinition()) {
      return Optional.of(((InternalChargeItemDefinitionValue) value).chargeItemDefinition());
    }
    return Optional.empty();
  }

  public Optional<Claim> getClaim() {
    if (isClaim()) {
      return Optional.of(((InternalClaimValue) value).claim());
    }
    return Optional.empty();
  }

  public Optional<ClaimResponse> getClaimResponse() {
    if (isClaimResponse()) {
      return Optional.of(((InternalClaimResponseValue) value).claimResponse());
    }
    return Optional.empty();
  }

  public Optional<ClinicalImpression> getClinicalImpression() {
    if (isClinicalImpression()) {
      return Optional.of(((InternalClinicalImpressionValue) value).clinicalImpression());
    }
    return Optional.empty();
  }

  public Optional<CodeSystem> getCodeSystem() {
    if (isCodeSystem()) {
      return Optional.of(((InternalCodeSystemValue) value).codeSystem());
    }
    return Optional.empty();
  }

  public Optional<Communication> getCommunication() {
    if (isCommunication()) {
      return Optional.of(((InternalCommunicationValue) value).communication());
    }
    return Optional.empty();
  }

  public Optional<CommunicationRequest> getCommunicationRequest() {
    if (isCommunicationRequest()) {
      return Optional.of(((InternalCommunicationRequestValue) value).communicationRequest());
    }
    return Optional.empty();
  }

  public Optional<CompartmentDefinition> getCompartmentDefinition() {
    if (isCompartmentDefinition()) {
      return Optional.of(((InternalCompartmentDefinitionValue) value).compartmentDefinition());
    }
    return Optional.empty();
  }

  public Optional<Composition> getComposition() {
    if (isComposition()) {
      return Optional.of(((InternalCompositionValue) value).composition());
    }
    return Optional.empty();
  }

  public Optional<ConceptMap> getConceptMap() {
    if (isConceptMap()) {
      return Optional.of(((InternalConceptMapValue) value).conceptMap());
    }
    return Optional.empty();
  }

  public Optional<Condition> getCondition() {
    if (isCondition()) {
      return Optional.of(((InternalConditionValue) value).condition());
    }
    return Optional.empty();
  }

  public Optional<Consent> getConsent() {
    if (isConsent()) {
      return Optional.of(((InternalConsentValue) value).consent());
    }
    return Optional.empty();
  }

  public Optional<Contract> getContract() {
    if (isContract()) {
      return Optional.of(((InternalContractValue) value).contract());
    }
    return Optional.empty();
  }

  public Optional<Coverage> getCoverage() {
    if (isCoverage()) {
      return Optional.of(((InternalCoverageValue) value).coverage());
    }
    return Optional.empty();
  }

  public Optional<CoverageEligibilityRequest> getCoverageEligibilityRequest() {
    if (isCoverageEligibilityRequest()) {
      return Optional.of(((InternalCoverageEligibilityRequestValue) value).coverageEligibilityRequest());
    }
    return Optional.empty();
  }

  public Optional<CoverageEligibilityResponse> getCoverageEligibilityResponse() {
    if (isCoverageEligibilityResponse()) {
      return Optional.of(((InternalCoverageEligibilityResponseValue) value).coverageEligibilityResponse());
    }
    return Optional.empty();
  }

  public Optional<DetectedIssue> getDetectedIssue() {
    if (isDetectedIssue()) {
      return Optional.of(((InternalDetectedIssueValue) value).detectedIssue());
    }
    return Optional.empty();
  }

  public Optional<Device> getDevice() {
    if (isDevice()) {
      return Optional.of(((InternalDeviceValue) value).device());
    }
    return Optional.empty();
  }

  public Optional<DeviceDefinition> getDeviceDefinition() {
    if (isDeviceDefinition()) {
      return Optional.of(((InternalDeviceDefinitionValue) value).deviceDefinition());
    }
    return Optional.empty();
  }

  public Optional<DeviceMetric> getDeviceMetric() {
    if (isDeviceMetric()) {
      return Optional.of(((InternalDeviceMetricValue) value).deviceMetric());
    }
    return Optional.empty();
  }

  public Optional<DeviceRequest> getDeviceRequest() {
    if (isDeviceRequest()) {
      return Optional.of(((InternalDeviceRequestValue) value).deviceRequest());
    }
    return Optional.empty();
  }

  public Optional<DeviceUseStatement> getDeviceUseStatement() {
    if (isDeviceUseStatement()) {
      return Optional.of(((InternalDeviceUseStatementValue) value).deviceUseStatement());
    }
    return Optional.empty();
  }

  public Optional<DiagnosticReport> getDiagnosticReport() {
    if (isDiagnosticReport()) {
      return Optional.of(((InternalDiagnosticReportValue) value).diagnosticReport());
    }
    return Optional.empty();
  }

  public Optional<DocumentManifest> getDocumentManifest() {
    if (isDocumentManifest()) {
      return Optional.of(((InternalDocumentManifestValue) value).documentManifest());
    }
    return Optional.empty();
  }

  public Optional<DocumentReference> getDocumentReference() {
    if (isDocumentReference()) {
      return Optional.of(((InternalDocumentReferenceValue) value).documentReference());
    }
    return Optional.empty();
  }

  public Optional<EffectEvidenceSynthesis> getEffectEvidenceSynthesis() {
    if (isEffectEvidenceSynthesis()) {
      return Optional.of(((InternalEffectEvidenceSynthesisValue) value).effectEvidenceSynthesis());
    }
    return Optional.empty();
  }

  public Optional<Encounter> getEncounter() {
    if (isEncounter()) {
      return Optional.of(((InternalEncounterValue) value).encounter());
    }
    return Optional.empty();
  }

  public Optional<Endpoint> getEndpoint() {
    if (isEndpoint()) {
      return Optional.of(((InternalEndpointValue) value).endpoint());
    }
    return Optional.empty();
  }

  public Optional<EnrollmentRequest> getEnrollmentRequest() {
    if (isEnrollmentRequest()) {
      return Optional.of(((InternalEnrollmentRequestValue) value).enrollmentRequest());
    }
    return Optional.empty();
  }

  public Optional<EnrollmentResponse> getEnrollmentResponse() {
    if (isEnrollmentResponse()) {
      return Optional.of(((InternalEnrollmentResponseValue) value).enrollmentResponse());
    }
    return Optional.empty();
  }

  public Optional<EpisodeOfCare> getEpisodeOfCare() {
    if (isEpisodeOfCare()) {
      return Optional.of(((InternalEpisodeOfCareValue) value).episodeOfCare());
    }
    return Optional.empty();
  }

  public Optional<EventDefinition> getEventDefinition() {
    if (isEventDefinition()) {
      return Optional.of(((InternalEventDefinitionValue) value).eventDefinition());
    }
    return Optional.empty();
  }

  public Optional<Evidence> getEvidence() {
    if (isEvidence()) {
      return Optional.of(((InternalEvidenceValue) value).evidence());
    }
    return Optional.empty();
  }

  public Optional<EvidenceVariable> getEvidenceVariable() {
    if (isEvidenceVariable()) {
      return Optional.of(((InternalEvidenceVariableValue) value).evidenceVariable());
    }
    return Optional.empty();
  }

  public Optional<ExampleScenario> getExampleScenario() {
    if (isExampleScenario()) {
      return Optional.of(((InternalExampleScenarioValue) value).exampleScenario());
    }
    return Optional.empty();
  }

  public Optional<ExplanationOfBenefit> getExplanationOfBenefit() {
    if (isExplanationOfBenefit()) {
      return Optional.of(((InternalExplanationOfBenefitValue) value).explanationOfBenefit());
    }
    return Optional.empty();
  }

  public Optional<FamilyMemberHistory> getFamilyMemberHistory() {
    if (isFamilyMemberHistory()) {
      return Optional.of(((InternalFamilyMemberHistoryValue) value).familyMemberHistory());
    }
    return Optional.empty();
  }

  public Optional<Flag> getFlag() {
    if (isFlag()) {
      return Optional.of(((InternalFlagValue) value).flag());
    }
    return Optional.empty();
  }

  public Optional<Goal> getGoal() {
    if (isGoal()) {
      return Optional.of(((InternalGoalValue) value).goal());
    }
    return Optional.empty();
  }

  public Optional<GraphDefinition> getGraphDefinition() {
    if (isGraphDefinition()) {
      return Optional.of(((InternalGraphDefinitionValue) value).graphDefinition());
    }
    return Optional.empty();
  }

  public Optional<Group> getGroup() {
    if (isGroup()) {
      return Optional.of(((InternalGroupValue) value).group());
    }
    return Optional.empty();
  }

  public Optional<GuidanceResponse> getGuidanceResponse() {
    if (isGuidanceResponse()) {
      return Optional.of(((InternalGuidanceResponseValue) value).guidanceResponse());
    }
    return Optional.empty();
  }

  public Optional<HealthcareService> getHealthcareService() {
    if (isHealthcareService()) {
      return Optional.of(((InternalHealthcareServiceValue) value).healthcareService());
    }
    return Optional.empty();
  }

  public Optional<ImagingStudy> getImagingStudy() {
    if (isImagingStudy()) {
      return Optional.of(((InternalImagingStudyValue) value).imagingStudy());
    }
    return Optional.empty();
  }

  public Optional<Immunization> getImmunization() {
    if (isImmunization()) {
      return Optional.of(((InternalImmunizationValue) value).immunization());
    }
    return Optional.empty();
  }

  public Optional<ImmunizationEvaluation> getImmunizationEvaluation() {
    if (isImmunizationEvaluation()) {
      return Optional.of(((InternalImmunizationEvaluationValue) value).immunizationEvaluation());
    }
    return Optional.empty();
  }

  public Optional<ImmunizationRecommendation> getImmunizationRecommendation() {
    if (isImmunizationRecommendation()) {
      return Optional.of(((InternalImmunizationRecommendationValue) value).immunizationRecommendation());
    }
    return Optional.empty();
  }

  public Optional<ImplementationGuide> getImplementationGuide() {
    if (isImplementationGuide()) {
      return Optional.of(((InternalImplementationGuideValue) value).implementationGuide());
    }
    return Optional.empty();
  }

  public Optional<InsurancePlan> getInsurancePlan() {
    if (isInsurancePlan()) {
      return Optional.of(((InternalInsurancePlanValue) value).insurancePlan());
    }
    return Optional.empty();
  }

  public Optional<Invoice> getInvoice() {
    if (isInvoice()) {
      return Optional.of(((InternalInvoiceValue) value).invoice());
    }
    return Optional.empty();
  }

  public Optional<Library> getLibrary() {
    if (isLibrary()) {
      return Optional.of(((InternalLibraryValue) value).library());
    }
    return Optional.empty();
  }

  public Optional<Linkage> getLinkage() {
    if (isLinkage()) {
      return Optional.of(((InternalLinkageValue) value).linkage());
    }
    return Optional.empty();
  }

  public Optional<List> getList() {
    if (isList()) {
      return Optional.of(((InternalListValue) value).list());
    }
    return Optional.empty();
  }

  public Optional<Location> getLocation() {
    if (isLocation()) {
      return Optional.of(((InternalLocationValue) value).location());
    }
    return Optional.empty();
  }

  public Optional<Measure> getMeasure() {
    if (isMeasure()) {
      return Optional.of(((InternalMeasureValue) value).measure());
    }
    return Optional.empty();
  }

  public Optional<MeasureReport> getMeasureReport() {
    if (isMeasureReport()) {
      return Optional.of(((InternalMeasureReportValue) value).measureReport());
    }
    return Optional.empty();
  }

  public Optional<Media> getMedia() {
    if (isMedia()) {
      return Optional.of(((InternalMediaValue) value).media());
    }
    return Optional.empty();
  }

  public Optional<Medication> getMedication() {
    if (isMedication()) {
      return Optional.of(((InternalMedicationValue) value).medication());
    }
    return Optional.empty();
  }

  public Optional<MedicationAdministration> getMedicationAdministration() {
    if (isMedicationAdministration()) {
      return Optional.of(((InternalMedicationAdministrationValue) value).medicationAdministration());
    }
    return Optional.empty();
  }

  public Optional<MedicationDispense> getMedicationDispense() {
    if (isMedicationDispense()) {
      return Optional.of(((InternalMedicationDispenseValue) value).medicationDispense());
    }
    return Optional.empty();
  }

  public Optional<MedicationKnowledge> getMedicationKnowledge() {
    if (isMedicationKnowledge()) {
      return Optional.of(((InternalMedicationKnowledgeValue) value).medicationKnowledge());
    }
    return Optional.empty();
  }

  public Optional<MedicationRequest> getMedicationRequest() {
    if (isMedicationRequest()) {
      return Optional.of(((InternalMedicationRequestValue) value).medicationRequest());
    }
    return Optional.empty();
  }

  public Optional<MedicationStatement> getMedicationStatement() {
    if (isMedicationStatement()) {
      return Optional.of(((InternalMedicationStatementValue) value).medicationStatement());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProduct> getMedicinalProduct() {
    if (isMedicinalProduct()) {
      return Optional.of(((InternalMedicinalProductValue) value).medicinalProduct());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductAuthorization> getMedicinalProductAuthorization() {
    if (isMedicinalProductAuthorization()) {
      return Optional.of(((InternalMedicinalProductAuthorizationValue) value).medicinalProductAuthorization());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductContraindication> getMedicinalProductContraindication() {
    if (isMedicinalProductContraindication()) {
      return Optional.of(((InternalMedicinalProductContraindicationValue) value).medicinalProductContraindication());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductIndication> getMedicinalProductIndication() {
    if (isMedicinalProductIndication()) {
      return Optional.of(((InternalMedicinalProductIndicationValue) value).medicinalProductIndication());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductIngredient> getMedicinalProductIngredient() {
    if (isMedicinalProductIngredient()) {
      return Optional.of(((InternalMedicinalProductIngredientValue) value).medicinalProductIngredient());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductInteraction> getMedicinalProductInteraction() {
    if (isMedicinalProductInteraction()) {
      return Optional.of(((InternalMedicinalProductInteractionValue) value).medicinalProductInteraction());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductManufactured> getMedicinalProductManufactured() {
    if (isMedicinalProductManufactured()) {
      return Optional.of(((InternalMedicinalProductManufacturedValue) value).medicinalProductManufactured());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductPackaged> getMedicinalProductPackaged() {
    if (isMedicinalProductPackaged()) {
      return Optional.of(((InternalMedicinalProductPackagedValue) value).medicinalProductPackaged());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductPharmaceutical> getMedicinalProductPharmaceutical() {
    if (isMedicinalProductPharmaceutical()) {
      return Optional.of(((InternalMedicinalProductPharmaceuticalValue) value).medicinalProductPharmaceutical());
    }
    return Optional.empty();
  }

  public Optional<MedicinalProductUndesirableEffect> getMedicinalProductUndesirableEffect() {
    if (isMedicinalProductUndesirableEffect()) {
      return Optional.of(((InternalMedicinalProductUndesirableEffectValue) value).medicinalProductUndesirableEffect());
    }
    return Optional.empty();
  }

  public Optional<MessageDefinition> getMessageDefinition() {
    if (isMessageDefinition()) {
      return Optional.of(((InternalMessageDefinitionValue) value).messageDefinition());
    }
    return Optional.empty();
  }

  public Optional<MessageHeader> getMessageHeader() {
    if (isMessageHeader()) {
      return Optional.of(((InternalMessageHeaderValue) value).messageHeader());
    }
    return Optional.empty();
  }

  public Optional<MolecularSequence> getMolecularSequence() {
    if (isMolecularSequence()) {
      return Optional.of(((InternalMolecularSequenceValue) value).molecularSequence());
    }
    return Optional.empty();
  }

  public Optional<NamingSystem> getNamingSystem() {
    if (isNamingSystem()) {
      return Optional.of(((InternalNamingSystemValue) value).namingSystem());
    }
    return Optional.empty();
  }

  public Optional<NutritionOrder> getNutritionOrder() {
    if (isNutritionOrder()) {
      return Optional.of(((InternalNutritionOrderValue) value).nutritionOrder());
    }
    return Optional.empty();
  }

  public Optional<Observation> getObservation() {
    if (isObservation()) {
      return Optional.of(((InternalObservationValue) value).observation());
    }
    return Optional.empty();
  }

  public Optional<ObservationDefinition> getObservationDefinition() {
    if (isObservationDefinition()) {
      return Optional.of(((InternalObservationDefinitionValue) value).observationDefinition());
    }
    return Optional.empty();
  }

  public Optional<OperationDefinition> getOperationDefinition() {
    if (isOperationDefinition()) {
      return Optional.of(((InternalOperationDefinitionValue) value).operationDefinition());
    }
    return Optional.empty();
  }

  public Optional<OperationOutcome> getOperationOutcome() {
    if (isOperationOutcome()) {
      return Optional.of(((InternalOperationOutcomeValue) value).operationOutcome());
    }
    return Optional.empty();
  }

  public Optional<Organization> getOrganization() {
    if (isOrganization()) {
      return Optional.of(((InternalOrganizationValue) value).organization());
    }
    return Optional.empty();
  }

  public Optional<OrganizationAffiliation> getOrganizationAffiliation() {
    if (isOrganizationAffiliation()) {
      return Optional.of(((InternalOrganizationAffiliationValue) value).organizationAffiliation());
    }
    return Optional.empty();
  }

  public Optional<Parameters> getParameters() {
    if (isParameters()) {
      return Optional.of(((InternalParametersValue) value).parameters());
    }
    return Optional.empty();
  }

  public Optional<Patient> getPatient() {
    if (isPatient()) {
      return Optional.of(((InternalPatientValue) value).patient());
    }
    return Optional.empty();
  }

  public Optional<PaymentNotice> getPaymentNotice() {
    if (isPaymentNotice()) {
      return Optional.of(((InternalPaymentNoticeValue) value).paymentNotice());
    }
    return Optional.empty();
  }

  public Optional<PaymentReconciliation> getPaymentReconciliation() {
    if (isPaymentReconciliation()) {
      return Optional.of(((InternalPaymentReconciliationValue) value).paymentReconciliation());
    }
    return Optional.empty();
  }

  public Optional<Person> getPerson() {
    if (isPerson()) {
      return Optional.of(((InternalPersonValue) value).person());
    }
    return Optional.empty();
  }

  public Optional<PlanDefinition> getPlanDefinition() {
    if (isPlanDefinition()) {
      return Optional.of(((InternalPlanDefinitionValue) value).planDefinition());
    }
    return Optional.empty();
  }

  public Optional<Practitioner> getPractitioner() {
    if (isPractitioner()) {
      return Optional.of(((InternalPractitionerValue) value).practitioner());
    }
    return Optional.empty();
  }

  public Optional<PractitionerRole> getPractitionerRole() {
    if (isPractitionerRole()) {
      return Optional.of(((InternalPractitionerRoleValue) value).practitionerRole());
    }
    return Optional.empty();
  }

  public Optional<Procedure> getProcedure() {
    if (isProcedure()) {
      return Optional.of(((InternalProcedureValue) value).procedure());
    }
    return Optional.empty();
  }

  public Optional<Provenance> getProvenance() {
    if (isProvenance()) {
      return Optional.of(((InternalProvenanceValue) value).provenance());
    }
    return Optional.empty();
  }

  public Optional<Questionnaire> getQuestionnaire() {
    if (isQuestionnaire()) {
      return Optional.of(((InternalQuestionnaireValue) value).questionnaire());
    }
    return Optional.empty();
  }

  public Optional<QuestionnaireResponse> getQuestionnaireResponse() {
    if (isQuestionnaireResponse()) {
      return Optional.of(((InternalQuestionnaireResponseValue) value).questionnaireResponse());
    }
    return Optional.empty();
  }

  public Optional<RelatedPerson> getRelatedPerson() {
    if (isRelatedPerson()) {
      return Optional.of(((InternalRelatedPersonValue) value).relatedPerson());
    }
    return Optional.empty();
  }

  public Optional<RequestGroup> getRequestGroup() {
    if (isRequestGroup()) {
      return Optional.of(((InternalRequestGroupValue) value).requestGroup());
    }
    return Optional.empty();
  }

  public Optional<ResearchDefinition> getResearchDefinition() {
    if (isResearchDefinition()) {
      return Optional.of(((InternalResearchDefinitionValue) value).researchDefinition());
    }
    return Optional.empty();
  }

  public Optional<ResearchElementDefinition> getResearchElementDefinition() {
    if (isResearchElementDefinition()) {
      return Optional.of(((InternalResearchElementDefinitionValue) value).researchElementDefinition());
    }
    return Optional.empty();
  }

  public Optional<ResearchStudy> getResearchStudy() {
    if (isResearchStudy()) {
      return Optional.of(((InternalResearchStudyValue) value).researchStudy());
    }
    return Optional.empty();
  }

  public Optional<ResearchSubject> getResearchSubject() {
    if (isResearchSubject()) {
      return Optional.of(((InternalResearchSubjectValue) value).researchSubject());
    }
    return Optional.empty();
  }

  public Optional<RiskAssessment> getRiskAssessment() {
    if (isRiskAssessment()) {
      return Optional.of(((InternalRiskAssessmentValue) value).riskAssessment());
    }
    return Optional.empty();
  }

  public Optional<RiskEvidenceSynthesis> getRiskEvidenceSynthesis() {
    if (isRiskEvidenceSynthesis()) {
      return Optional.of(((InternalRiskEvidenceSynthesisValue) value).riskEvidenceSynthesis());
    }
    return Optional.empty();
  }

  public Optional<Schedule> getSchedule() {
    if (isSchedule()) {
      return Optional.of(((InternalScheduleValue) value).schedule());
    }
    return Optional.empty();
  }

  public Optional<SearchParameter> getSearchParameter() {
    if (isSearchParameter()) {
      return Optional.of(((InternalSearchParameterValue) value).searchParameter());
    }
    return Optional.empty();
  }

  public Optional<ServiceRequest> getServiceRequest() {
    if (isServiceRequest()) {
      return Optional.of(((InternalServiceRequestValue) value).serviceRequest());
    }
    return Optional.empty();
  }

  public Optional<Slot> getSlot() {
    if (isSlot()) {
      return Optional.of(((InternalSlotValue) value).slot());
    }
    return Optional.empty();
  }

  public Optional<Specimen> getSpecimen() {
    if (isSpecimen()) {
      return Optional.of(((InternalSpecimenValue) value).specimen());
    }
    return Optional.empty();
  }

  public Optional<SpecimenDefinition> getSpecimenDefinition() {
    if (isSpecimenDefinition()) {
      return Optional.of(((InternalSpecimenDefinitionValue) value).specimenDefinition());
    }
    return Optional.empty();
  }

  public Optional<StructureDefinition> getStructureDefinition() {
    if (isStructureDefinition()) {
      return Optional.of(((InternalStructureDefinitionValue) value).structureDefinition());
    }
    return Optional.empty();
  }

  public Optional<StructureMap> getStructureMap() {
    if (isStructureMap()) {
      return Optional.of(((InternalStructureMapValue) value).structureMap());
    }
    return Optional.empty();
  }

  public Optional<Subscription> getSubscription() {
    if (isSubscription()) {
      return Optional.of(((InternalSubscriptionValue) value).subscription());
    }
    return Optional.empty();
  }

  public Optional<Substance> getSubstance() {
    if (isSubstance()) {
      return Optional.of(((InternalSubstanceValue) value).substance());
    }
    return Optional.empty();
  }

  public Optional<SubstanceNucleicAcid> getSubstanceNucleicAcid() {
    if (isSubstanceNucleicAcid()) {
      return Optional.of(((InternalSubstanceNucleicAcidValue) value).substanceNucleicAcid());
    }
    return Optional.empty();
  }

  public Optional<SubstancePolymer> getSubstancePolymer() {
    if (isSubstancePolymer()) {
      return Optional.of(((InternalSubstancePolymerValue) value).substancePolymer());
    }
    return Optional.empty();
  }

  public Optional<SubstanceProtein> getSubstanceProtein() {
    if (isSubstanceProtein()) {
      return Optional.of(((InternalSubstanceProteinValue) value).substanceProtein());
    }
    return Optional.empty();
  }

  public Optional<SubstanceReferenceInformation> getSubstanceReferenceInformation() {
    if (isSubstanceReferenceInformation()) {
      return Optional.of(((InternalSubstanceReferenceInformationValue) value).substanceReferenceInformation());
    }
    return Optional.empty();
  }

  public Optional<SubstanceSourceMaterial> getSubstanceSourceMaterial() {
    if (isSubstanceSourceMaterial()) {
      return Optional.of(((InternalSubstanceSourceMaterialValue) value).substanceSourceMaterial());
    }
    return Optional.empty();
  }

  public Optional<SubstanceSpecification> getSubstanceSpecification() {
    if (isSubstanceSpecification()) {
      return Optional.of(((InternalSubstanceSpecificationValue) value).substanceSpecification());
    }
    return Optional.empty();
  }

  public Optional<SupplyDelivery> getSupplyDelivery() {
    if (isSupplyDelivery()) {
      return Optional.of(((InternalSupplyDeliveryValue) value).supplyDelivery());
    }
    return Optional.empty();
  }

  public Optional<SupplyRequest> getSupplyRequest() {
    if (isSupplyRequest()) {
      return Optional.of(((InternalSupplyRequestValue) value).supplyRequest());
    }
    return Optional.empty();
  }

  public Optional<Task> getTask() {
    if (isTask()) {
      return Optional.of(((InternalTaskValue) value).task());
    }
    return Optional.empty();
  }

  public Optional<TerminologyCapabilities> getTerminologyCapabilities() {
    if (isTerminologyCapabilities()) {
      return Optional.of(((InternalTerminologyCapabilitiesValue) value).terminologyCapabilities());
    }
    return Optional.empty();
  }

  public Optional<TestReport> getTestReport() {
    if (isTestReport()) {
      return Optional.of(((InternalTestReportValue) value).testReport());
    }
    return Optional.empty();
  }

  public Optional<TestScript> getTestScript() {
    if (isTestScript()) {
      return Optional.of(((InternalTestScriptValue) value).testScript());
    }
    return Optional.empty();
  }

  public Optional<ValueSet> getValueSet() {
    if (isValueSet()) {
      return Optional.of(((InternalValueSetValue) value).valueSet());
    }
    return Optional.empty();
  }

  public Optional<VerificationResult> getVerificationResult() {
    if (isVerificationResult()) {
      return Optional.of(((InternalVerificationResultValue) value).verificationResult());
    }
    return Optional.empty();
  }

  public Optional<VisionPrescription> getVisionPrescription() {
    if (isVisionPrescription()) {
      return Optional.of(((InternalVisionPrescriptionValue) value).visionPrescription());
    }
    return Optional.empty();
  }

  public Optional<Project> getProject() {
    if (isProject()) {
      return Optional.of(((InternalProjectValue) value).project());
    }
    return Optional.empty();
  }

  public Optional<ClientApplication> getClientApplication() {
    if (isClientApplication()) {
      return Optional.of(((InternalClientApplicationValue) value).clientApplication());
    }
    return Optional.empty();
  }

  public Optional<User> getUser() {
    if (isUser()) {
      return Optional.of(((InternalUserValue) value).user());
    }
    return Optional.empty();
  }

  public Optional<Login> getLogin() {
    if (isLogin()) {
      return Optional.of(((InternalLoginValue) value).login());
    }
    return Optional.empty();
  }

  public Optional<RefreshToken> getRefreshToken() {
    if (isRefreshToken()) {
      return Optional.of(((InternalRefreshTokenValue) value).refreshToken());
    }
    return Optional.empty();
  }

  public Optional<PasswordChangeRequest> getPasswordChangeRequest() {
    if (isPasswordChangeRequest()) {
      return Optional.of(((InternalPasswordChangeRequestValue) value).passwordChangeRequest());
    }
    return Optional.empty();
  }

  public Optional<JsonWebKey> getJsonWebKey() {
    if (isJsonWebKey()) {
      return Optional.of(((InternalJsonWebKeyValue) value).jsonWebKey());
    }
    return Optional.empty();
  }

  public Optional<Bot> getBot() {
    if (isBot()) {
      return Optional.of(((InternalBotValue) value).bot());
    }
    return Optional.empty();
  }

  public Optional<AccessPolicy> getAccessPolicy() {
    if (isAccessPolicy()) {
      return Optional.of(((InternalAccessPolicyValue) value).accessPolicy());
    }
    return Optional.empty();
  }

  public Optional<UserConfiguration> getUserConfiguration() {
    if (isUserConfiguration()) {
      return Optional.of(((InternalUserConfigurationValue) value).userConfiguration());
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
      @JsonSubTypes.Type(value = InternalPatientValue.class, name = "patient"),
      @JsonSubTypes.Type(value = InternalLoginValue.class, name = "login"),
      @JsonSubTypes.Type(value = InternalListValue.class, name = "list"),
      @JsonSubTypes.Type(value = InternalActivityDefinitionValue.class, name = "activityDefinition"),
      @JsonSubTypes.Type(value = InternalProjectValue.class, name = "project"),
      @JsonSubTypes.Type(value = InternalQuestionnaireResponseValue.class, name = "questionnaireResponse"),
      @JsonSubTypes.Type(value = InternalTaskValue.class, name = "task"),
      @JsonSubTypes.Type(value = InternalDetectedIssueValue.class, name = "detectedIssue"),
      @JsonSubTypes.Type(value = InternalOperationOutcomeValue.class, name = "operationOutcome"),
      @JsonSubTypes.Type(value = InternalUserValue.class, name = "user"),
      @JsonSubTypes.Type(value = InternalChargeItemDefinitionValue.class, name = "chargeItemDefinition"),
      @JsonSubTypes.Type(value = InternalMessageHeaderValue.class, name = "messageHeader"),
      @JsonSubTypes.Type(value = InternalSubstanceProteinValue.class, name = "substanceProtein"),
      @JsonSubTypes.Type(value = InternalMessageDefinitionValue.class, name = "messageDefinition"),
      @JsonSubTypes.Type(value = InternalMeasureReportValue.class, name = "measureReport"),
      @JsonSubTypes.Type(value = InternalAccessPolicyValue.class, name = "accessPolicy"),
      @JsonSubTypes.Type(value = InternalCareTeamValue.class, name = "careTeam"),
      @JsonSubTypes.Type(value = InternalAppointmentValue.class, name = "appointment"),
      @JsonSubTypes.Type(value = InternalParametersValue.class, name = "parameters"),
      @JsonSubTypes.Type(value = InternalChargeItemValue.class, name = "chargeItem"),
      @JsonSubTypes.Type(value = InternalObservationValue.class, name = "observation"),
      @JsonSubTypes.Type(value = InternalSubstanceValue.class, name = "substance"),
      @JsonSubTypes.Type(value = InternalCoverageEligibilityResponseValue.class, name = "coverageEligibilityResponse"),
      @JsonSubTypes.Type(value = InternalOrganizationAffiliationValue.class, name = "organizationAffiliation"),
      @JsonSubTypes.Type(value = InternalRiskAssessmentValue.class, name = "riskAssessment"),
      @JsonSubTypes.Type(value = InternalObservationDefinitionValue.class, name = "observationDefinition"),
      @JsonSubTypes.Type(value = InternalMedicationStatementValue.class, name = "medicationStatement"),
      @JsonSubTypes.Type(value = InternalUserConfigurationValue.class, name = "userConfiguration"),
      @JsonSubTypes.Type(value = InternalMeasureValue.class, name = "measure"),
      @JsonSubTypes.Type(value = InternalSupplyRequestValue.class, name = "supplyRequest"),
      @JsonSubTypes.Type(value = InternalTerminologyCapabilitiesValue.class, name = "terminologyCapabilities"),
      @JsonSubTypes.Type(value = InternalTestReportValue.class, name = "testReport"),
      @JsonSubTypes.Type(value = InternalPractitionerValue.class, name = "practitioner"),
      @JsonSubTypes.Type(value = InternalCarePlanValue.class, name = "carePlan"),
      @JsonSubTypes.Type(value = InternalMedicinalProductPharmaceuticalValue.class, name = "medicinalProductPharmaceutical"),
      @JsonSubTypes.Type(value = InternalLinkageValue.class, name = "linkage"),
      @JsonSubTypes.Type(value = InternalMedicinalProductValue.class, name = "medicinalProduct"),
      @JsonSubTypes.Type(value = InternalMedicationKnowledgeValue.class, name = "medicationKnowledge"),
      @JsonSubTypes.Type(value = InternalProvenanceValue.class, name = "provenance"),
      @JsonSubTypes.Type(value = InternalCoverageEligibilityRequestValue.class, name = "coverageEligibilityRequest"),
      @JsonSubTypes.Type(value = InternalEndpointValue.class, name = "endpoint"),
      @JsonSubTypes.Type(value = InternalConsentValue.class, name = "consent"),
      @JsonSubTypes.Type(value = InternalEvidenceVariableValue.class, name = "evidenceVariable"),
      @JsonSubTypes.Type(value = InternalBodyStructureValue.class, name = "bodyStructure"),
      @JsonSubTypes.Type(value = InternalCommunicationRequestValue.class, name = "communicationRequest"),
      @JsonSubTypes.Type(value = InternalEnrollmentRequestValue.class, name = "enrollmentRequest"),
      @JsonSubTypes.Type(value = InternalSubstancePolymerValue.class, name = "substancePolymer"),
      @JsonSubTypes.Type(value = InternalClaimValue.class, name = "claim"),
      @JsonSubTypes.Type(value = InternalSlotValue.class, name = "slot"),
      @JsonSubTypes.Type(value = InternalCatalogEntryValue.class, name = "catalogEntry"),
      @JsonSubTypes.Type(value = InternalValueSetValue.class, name = "valueSet"),
      @JsonSubTypes.Type(value = InternalPractitionerRoleValue.class, name = "practitionerRole"),
      @JsonSubTypes.Type(value = InternalMolecularSequenceValue.class, name = "molecularSequence"),
      @JsonSubTypes.Type(value = InternalCapabilityStatementValue.class, name = "capabilityStatement"),
      @JsonSubTypes.Type(value = InternalGraphDefinitionValue.class, name = "graphDefinition"),
      @JsonSubTypes.Type(value = InternalMedicinalProductPackagedValue.class, name = "medicinalProductPackaged"),
      @JsonSubTypes.Type(value = InternalPaymentReconciliationValue.class, name = "paymentReconciliation"),
      @JsonSubTypes.Type(value = InternalScheduleValue.class, name = "schedule"),
      @JsonSubTypes.Type(value = InternalMedicinalProductManufacturedValue.class, name = "medicinalProductManufactured"),
      @JsonSubTypes.Type(value = InternalPersonValue.class, name = "person"),
      @JsonSubTypes.Type(value = InternalPasswordChangeRequestValue.class, name = "passwordChangeRequest"),
      @JsonSubTypes.Type(value = InternalMedicationRequestValue.class, name = "medicationRequest"),
      @JsonSubTypes.Type(value = InternalImmunizationEvaluationValue.class, name = "immunizationEvaluation"),
      @JsonSubTypes.Type(value = InternalPaymentNoticeValue.class, name = "paymentNotice"),
      @JsonSubTypes.Type(value = InternalMedicinalProductInteractionValue.class, name = "medicinalProductInteraction"),
      @JsonSubTypes.Type(value = InternalSubstanceReferenceInformationValue.class, name = "substanceReferenceInformation"),
      @JsonSubTypes.Type(value = InternalFamilyMemberHistoryValue.class, name = "familyMemberHistory"),
      @JsonSubTypes.Type(value = InternalAllergyIntoleranceValue.class, name = "allergyIntolerance"),
      @JsonSubTypes.Type(value = InternalBasicValue.class, name = "basic"),
      @JsonSubTypes.Type(value = InternalBundleValue.class, name = "bundle"),
      @JsonSubTypes.Type(value = InternalEventDefinitionValue.class, name = "eventDefinition"),
      @JsonSubTypes.Type(value = InternalEffectEvidenceSynthesisValue.class, name = "effectEvidenceSynthesis"),
      @JsonSubTypes.Type(value = InternalRequestGroupValue.class, name = "requestGroup"),
      @JsonSubTypes.Type(value = InternalServiceRequestValue.class, name = "serviceRequest"),
      @JsonSubTypes.Type(value = InternalImmunizationRecommendationValue.class, name = "immunizationRecommendation"),
      @JsonSubTypes.Type(value = InternalMedicinalProductIngredientValue.class, name = "medicinalProductIngredient"),
      @JsonSubTypes.Type(value = InternalDeviceRequestValue.class, name = "deviceRequest"),
      @JsonSubTypes.Type(value = InternalOrganizationValue.class, name = "organization"),
      @JsonSubTypes.Type(value = InternalRefreshTokenValue.class, name = "refreshToken"),
      @JsonSubTypes.Type(value = InternalCoverageValue.class, name = "coverage"),
      @JsonSubTypes.Type(value = InternalSubstanceSpecificationValue.class, name = "substanceSpecification"),
      @JsonSubTypes.Type(value = InternalMedicationDispenseValue.class, name = "medicationDispense"),
      @JsonSubTypes.Type(value = InternalInvoiceValue.class, name = "invoice"),
      @JsonSubTypes.Type(value = InternalMedicationAdministrationValue.class, name = "medicationAdministration"),
      @JsonSubTypes.Type(value = InternalAdverseEventValue.class, name = "adverseEvent"),
      @JsonSubTypes.Type(value = InternalMedicinalProductUndesirableEffectValue.class, name = "medicinalProductUndesirableEffect"),
      @JsonSubTypes.Type(value = InternalEpisodeOfCareValue.class, name = "episodeOfCare"),
      @JsonSubTypes.Type(value = InternalDeviceValue.class, name = "device"),
      @JsonSubTypes.Type(value = InternalHealthcareServiceValue.class, name = "healthcareService"),
      @JsonSubTypes.Type(value = InternalBotValue.class, name = "bot"),
      @JsonSubTypes.Type(value = InternalSpecimenDefinitionValue.class, name = "specimenDefinition"),
      @JsonSubTypes.Type(value = InternalExampleScenarioValue.class, name = "exampleScenario"),
      @JsonSubTypes.Type(value = InternalSupplyDeliveryValue.class, name = "supplyDelivery"),
      @JsonSubTypes.Type(value = InternalResearchSubjectValue.class, name = "researchSubject"),
      @JsonSubTypes.Type(value = InternalMedicinalProductAuthorizationValue.class, name = "medicinalProductAuthorization"),
      @JsonSubTypes.Type(value = InternalAccountValue.class, name = "account"),
      @JsonSubTypes.Type(value = InternalClaimResponseValue.class, name = "claimResponse"),
      @JsonSubTypes.Type(value = InternalConditionValue.class, name = "condition"),
      @JsonSubTypes.Type(value = InternalDeviceDefinitionValue.class, name = "deviceDefinition"),
      @JsonSubTypes.Type(value = InternalMedicationValue.class, name = "medication"),
      @JsonSubTypes.Type(value = InternalQuestionnaireValue.class, name = "questionnaire"),
      @JsonSubTypes.Type(value = InternalStructureMapValue.class, name = "structureMap"),
      @JsonSubTypes.Type(value = InternalImmunizationValue.class, name = "immunization"),
      @JsonSubTypes.Type(value = InternalCodeSystemValue.class, name = "codeSystem"),
      @JsonSubTypes.Type(value = InternalClinicalImpressionValue.class, name = "clinicalImpression"),
      @JsonSubTypes.Type(value = InternalEnrollmentResponseValue.class, name = "enrollmentResponse"),
      @JsonSubTypes.Type(value = InternalGroupValue.class, name = "group"),
      @JsonSubTypes.Type(value = InternalContractValue.class, name = "contract"),
      @JsonSubTypes.Type(value = InternalDeviceMetricValue.class, name = "deviceMetric"),
      @JsonSubTypes.Type(value = InternalSearchParameterValue.class, name = "searchParameter"),
      @JsonSubTypes.Type(value = InternalFlagValue.class, name = "flag"),
      @JsonSubTypes.Type(value = InternalEvidenceValue.class, name = "evidence"),
      @JsonSubTypes.Type(value = InternalLibraryValue.class, name = "library"),
      @JsonSubTypes.Type(value = InternalGoalValue.class, name = "goal"),
      @JsonSubTypes.Type(value = InternalRiskEvidenceSynthesisValue.class, name = "riskEvidenceSynthesis"),
      @JsonSubTypes.Type(value = InternalResearchElementDefinitionValue.class, name = "researchElementDefinition"),
      @JsonSubTypes.Type(value = InternalOperationDefinitionValue.class, name = "operationDefinition"),
      @JsonSubTypes.Type(value = InternalExplanationOfBenefitValue.class, name = "explanationOfBenefit"),
      @JsonSubTypes.Type(value = InternalTestScriptValue.class, name = "testScript"),
      @JsonSubTypes.Type(value = InternalSubstanceSourceMaterialValue.class, name = "substanceSourceMaterial"),
      @JsonSubTypes.Type(value = InternalAppointmentResponseValue.class, name = "appointmentResponse"),
      @JsonSubTypes.Type(value = InternalVerificationResultValue.class, name = "verificationResult"),
      @JsonSubTypes.Type(value = InternalInsurancePlanValue.class, name = "insurancePlan"),
      @JsonSubTypes.Type(value = InternalAuditEventValue.class, name = "auditEvent"),
      @JsonSubTypes.Type(value = InternalCommunicationValue.class, name = "communication"),
      @JsonSubTypes.Type(value = InternalPlanDefinitionValue.class, name = "planDefinition"),
      @JsonSubTypes.Type(value = InternalConceptMapValue.class, name = "conceptMap"),
      @JsonSubTypes.Type(value = InternalEncounterValue.class, name = "encounter"),
      @JsonSubTypes.Type(value = InternalProcedureValue.class, name = "procedure"),
      @JsonSubTypes.Type(value = InternalGuidanceResponseValue.class, name = "guidanceResponse"),
      @JsonSubTypes.Type(value = InternalNutritionOrderValue.class, name = "nutritionOrder"),
      @JsonSubTypes.Type(value = InternalMediaValue.class, name = "media"),
      @JsonSubTypes.Type(value = InternalClientApplicationValue.class, name = "clientApplication"),
      @JsonSubTypes.Type(value = InternalJsonWebKeyValue.class, name = "jsonWebKey"),
      @JsonSubTypes.Type(value = InternalVisionPrescriptionValue.class, name = "visionPrescription"),
      @JsonSubTypes.Type(value = InternalCompositionValue.class, name = "composition"),
      @JsonSubTypes.Type(value = InternalDocumentManifestValue.class, name = "documentManifest"),
      @JsonSubTypes.Type(value = InternalDocumentReferenceValue.class, name = "documentReference"),
      @JsonSubTypes.Type(value = InternalResearchDefinitionValue.class, name = "researchDefinition"),
      @JsonSubTypes.Type(value = InternalDiagnosticReportValue.class, name = "diagnosticReport"),
      @JsonSubTypes.Type(value = InternalRelatedPersonValue.class, name = "relatedPerson"),
      @JsonSubTypes.Type(value = InternalStructureDefinitionValue.class, name = "structureDefinition"),
      @JsonSubTypes.Type(value = InternalBiologicallyDerivedProductValue.class, name = "biologicallyDerivedProduct"),
      @JsonSubTypes.Type(value = InternalImplementationGuideValue.class, name = "implementationGuide"),
      @JsonSubTypes.Type(value = InternalSpecimenValue.class, name = "specimen"),
      @JsonSubTypes.Type(value = InternalImagingStudyValue.class, name = "imagingStudy"),
      @JsonSubTypes.Type(value = InternalMedicinalProductIndicationValue.class, name = "medicinalProductIndication"),
      @JsonSubTypes.Type(value = InternalBinaryValue.class, name = "binary"),
      @JsonSubTypes.Type(value = InternalSubstanceNucleicAcidValue.class, name = "substanceNucleicAcid"),
      @JsonSubTypes.Type(value = InternalLocationValue.class, name = "location"),
      @JsonSubTypes.Type(value = InternalMedicinalProductContraindicationValue.class, name = "medicinalProductContraindication"),
      @JsonSubTypes.Type(value = InternalNamingSystemValue.class, name = "namingSystem"),
      @JsonSubTypes.Type(value = InternalDeviceUseStatementValue.class, name = "deviceUseStatement"),
      @JsonSubTypes.Type(value = InternalResearchStudyValue.class, name = "researchStudy"),
      @JsonSubTypes.Type(value = InternalSubscriptionValue.class, name = "subscription"),
      @JsonSubTypes.Type(value = InternalCompartmentDefinitionValue.class, name = "compartmentDefinition")
  })
  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  private interface InternalValue {
    <T> T accept(Visitor<T> visitor);
  }

  @Value.Immutable
  @JsonTypeName("patient")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPatientValue.class
  )
  interface InternalPatientValue extends InternalValue {
    @JsonValue
    Patient patient();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPatient(patient());
    }

    static InternalPatientValue of(Patient value) {
      return ImmutableResourceList.InternalPatientValue.builder().patient(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("login")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLoginValue.class
  )
  interface InternalLoginValue extends InternalValue {
    @JsonValue
    Login login();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLogin(login());
    }

    static InternalLoginValue of(Login value) {
      return ImmutableResourceList.InternalLoginValue.builder().login(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("list")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalListValue.class
  )
  interface InternalListValue extends InternalValue {
    @JsonValue
    List list();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitList(list());
    }

    static InternalListValue of(List value) {
      return ImmutableResourceList.InternalListValue.builder().list(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("activityDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalActivityDefinitionValue.class
  )
  interface InternalActivityDefinitionValue extends InternalValue {
    @JsonValue
    ActivityDefinition activityDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitActivityDefinition(activityDefinition());
    }

    static InternalActivityDefinitionValue of(ActivityDefinition value) {
      return ImmutableResourceList.InternalActivityDefinitionValue.builder().activityDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("project")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalProjectValue.class
  )
  interface InternalProjectValue extends InternalValue {
    @JsonValue
    Project project();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitProject(project());
    }

    static InternalProjectValue of(Project value) {
      return ImmutableResourceList.InternalProjectValue.builder().project(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("questionnaireResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalQuestionnaireResponseValue.class
  )
  interface InternalQuestionnaireResponseValue extends InternalValue {
    @JsonValue
    QuestionnaireResponse questionnaireResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitQuestionnaireResponse(questionnaireResponse());
    }

    static InternalQuestionnaireResponseValue of(QuestionnaireResponse value) {
      return ImmutableResourceList.InternalQuestionnaireResponseValue.builder().questionnaireResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("task")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTaskValue.class
  )
  interface InternalTaskValue extends InternalValue {
    @JsonValue
    Task task();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTask(task());
    }

    static InternalTaskValue of(Task value) {
      return ImmutableResourceList.InternalTaskValue.builder().task(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("detectedIssue")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDetectedIssueValue.class
  )
  interface InternalDetectedIssueValue extends InternalValue {
    @JsonValue
    DetectedIssue detectedIssue();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDetectedIssue(detectedIssue());
    }

    static InternalDetectedIssueValue of(DetectedIssue value) {
      return ImmutableResourceList.InternalDetectedIssueValue.builder().detectedIssue(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("operationOutcome")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOperationOutcomeValue.class
  )
  interface InternalOperationOutcomeValue extends InternalValue {
    @JsonValue
    OperationOutcome operationOutcome();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOperationOutcome(operationOutcome());
    }

    static InternalOperationOutcomeValue of(OperationOutcome value) {
      return ImmutableResourceList.InternalOperationOutcomeValue.builder().operationOutcome(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("user")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalUserValue.class
  )
  interface InternalUserValue extends InternalValue {
    @JsonValue
    User user();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitUser(user());
    }

    static InternalUserValue of(User value) {
      return ImmutableResourceList.InternalUserValue.builder().user(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("chargeItemDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalChargeItemDefinitionValue.class
  )
  interface InternalChargeItemDefinitionValue extends InternalValue {
    @JsonValue
    ChargeItemDefinition chargeItemDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitChargeItemDefinition(chargeItemDefinition());
    }

    static InternalChargeItemDefinitionValue of(ChargeItemDefinition value) {
      return ImmutableResourceList.InternalChargeItemDefinitionValue.builder().chargeItemDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("messageHeader")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMessageHeaderValue.class
  )
  interface InternalMessageHeaderValue extends InternalValue {
    @JsonValue
    MessageHeader messageHeader();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMessageHeader(messageHeader());
    }

    static InternalMessageHeaderValue of(MessageHeader value) {
      return ImmutableResourceList.InternalMessageHeaderValue.builder().messageHeader(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("substanceProtein")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceProteinValue.class
  )
  interface InternalSubstanceProteinValue extends InternalValue {
    @JsonValue
    SubstanceProtein substanceProtein();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceProtein(substanceProtein());
    }

    static InternalSubstanceProteinValue of(SubstanceProtein value) {
      return ImmutableResourceList.InternalSubstanceProteinValue.builder().substanceProtein(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("messageDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMessageDefinitionValue.class
  )
  interface InternalMessageDefinitionValue extends InternalValue {
    @JsonValue
    MessageDefinition messageDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMessageDefinition(messageDefinition());
    }

    static InternalMessageDefinitionValue of(MessageDefinition value) {
      return ImmutableResourceList.InternalMessageDefinitionValue.builder().messageDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("measureReport")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMeasureReportValue.class
  )
  interface InternalMeasureReportValue extends InternalValue {
    @JsonValue
    MeasureReport measureReport();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMeasureReport(measureReport());
    }

    static InternalMeasureReportValue of(MeasureReport value) {
      return ImmutableResourceList.InternalMeasureReportValue.builder().measureReport(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("accessPolicy")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAccessPolicyValue.class
  )
  interface InternalAccessPolicyValue extends InternalValue {
    @JsonValue
    AccessPolicy accessPolicy();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAccessPolicy(accessPolicy());
    }

    static InternalAccessPolicyValue of(AccessPolicy value) {
      return ImmutableResourceList.InternalAccessPolicyValue.builder().accessPolicy(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("careTeam")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCareTeamValue.class
  )
  interface InternalCareTeamValue extends InternalValue {
    @JsonValue
    CareTeam careTeam();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCareTeam(careTeam());
    }

    static InternalCareTeamValue of(CareTeam value) {
      return ImmutableResourceList.InternalCareTeamValue.builder().careTeam(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("appointment")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAppointmentValue.class
  )
  interface InternalAppointmentValue extends InternalValue {
    @JsonValue
    Appointment appointment();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAppointment(appointment());
    }

    static InternalAppointmentValue of(Appointment value) {
      return ImmutableResourceList.InternalAppointmentValue.builder().appointment(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("parameters")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalParametersValue.class
  )
  interface InternalParametersValue extends InternalValue {
    @JsonValue
    Parameters parameters();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitParameters(parameters());
    }

    static InternalParametersValue of(Parameters value) {
      return ImmutableResourceList.InternalParametersValue.builder().parameters(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("chargeItem")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalChargeItemValue.class
  )
  interface InternalChargeItemValue extends InternalValue {
    @JsonValue
    ChargeItem chargeItem();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitChargeItem(chargeItem());
    }

    static InternalChargeItemValue of(ChargeItem value) {
      return ImmutableResourceList.InternalChargeItemValue.builder().chargeItem(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("observation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalObservationValue.class
  )
  interface InternalObservationValue extends InternalValue {
    @JsonValue
    Observation observation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitObservation(observation());
    }

    static InternalObservationValue of(Observation value) {
      return ImmutableResourceList.InternalObservationValue.builder().observation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("substance")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceValue.class
  )
  interface InternalSubstanceValue extends InternalValue {
    @JsonValue
    Substance substance();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstance(substance());
    }

    static InternalSubstanceValue of(Substance value) {
      return ImmutableResourceList.InternalSubstanceValue.builder().substance(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("coverageEligibilityResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCoverageEligibilityResponseValue.class
  )
  interface InternalCoverageEligibilityResponseValue extends InternalValue {
    @JsonValue
    CoverageEligibilityResponse coverageEligibilityResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCoverageEligibilityResponse(coverageEligibilityResponse());
    }

    static InternalCoverageEligibilityResponseValue of(CoverageEligibilityResponse value) {
      return ImmutableResourceList.InternalCoverageEligibilityResponseValue.builder().coverageEligibilityResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("organizationAffiliation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOrganizationAffiliationValue.class
  )
  interface InternalOrganizationAffiliationValue extends InternalValue {
    @JsonValue
    OrganizationAffiliation organizationAffiliation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOrganizationAffiliation(organizationAffiliation());
    }

    static InternalOrganizationAffiliationValue of(OrganizationAffiliation value) {
      return ImmutableResourceList.InternalOrganizationAffiliationValue.builder().organizationAffiliation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("riskAssessment")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRiskAssessmentValue.class
  )
  interface InternalRiskAssessmentValue extends InternalValue {
    @JsonValue
    RiskAssessment riskAssessment();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRiskAssessment(riskAssessment());
    }

    static InternalRiskAssessmentValue of(RiskAssessment value) {
      return ImmutableResourceList.InternalRiskAssessmentValue.builder().riskAssessment(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("observationDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalObservationDefinitionValue.class
  )
  interface InternalObservationDefinitionValue extends InternalValue {
    @JsonValue
    ObservationDefinition observationDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitObservationDefinition(observationDefinition());
    }

    static InternalObservationDefinitionValue of(ObservationDefinition value) {
      return ImmutableResourceList.InternalObservationDefinitionValue.builder().observationDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicationStatement")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationStatementValue.class
  )
  interface InternalMedicationStatementValue extends InternalValue {
    @JsonValue
    MedicationStatement medicationStatement();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationStatement(medicationStatement());
    }

    static InternalMedicationStatementValue of(MedicationStatement value) {
      return ImmutableResourceList.InternalMedicationStatementValue.builder().medicationStatement(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("userConfiguration")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalUserConfigurationValue.class
  )
  interface InternalUserConfigurationValue extends InternalValue {
    @JsonValue
    UserConfiguration userConfiguration();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitUserConfiguration(userConfiguration());
    }

    static InternalUserConfigurationValue of(UserConfiguration value) {
      return ImmutableResourceList.InternalUserConfigurationValue.builder().userConfiguration(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("measure")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMeasureValue.class
  )
  interface InternalMeasureValue extends InternalValue {
    @JsonValue
    Measure measure();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMeasure(measure());
    }

    static InternalMeasureValue of(Measure value) {
      return ImmutableResourceList.InternalMeasureValue.builder().measure(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("supplyRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSupplyRequestValue.class
  )
  interface InternalSupplyRequestValue extends InternalValue {
    @JsonValue
    SupplyRequest supplyRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSupplyRequest(supplyRequest());
    }

    static InternalSupplyRequestValue of(SupplyRequest value) {
      return ImmutableResourceList.InternalSupplyRequestValue.builder().supplyRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("terminologyCapabilities")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTerminologyCapabilitiesValue.class
  )
  interface InternalTerminologyCapabilitiesValue extends InternalValue {
    @JsonValue
    TerminologyCapabilities terminologyCapabilities();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTerminologyCapabilities(terminologyCapabilities());
    }

    static InternalTerminologyCapabilitiesValue of(TerminologyCapabilities value) {
      return ImmutableResourceList.InternalTerminologyCapabilitiesValue.builder().terminologyCapabilities(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("testReport")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTestReportValue.class
  )
  interface InternalTestReportValue extends InternalValue {
    @JsonValue
    TestReport testReport();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTestReport(testReport());
    }

    static InternalTestReportValue of(TestReport value) {
      return ImmutableResourceList.InternalTestReportValue.builder().testReport(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("practitioner")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPractitionerValue.class
  )
  interface InternalPractitionerValue extends InternalValue {
    @JsonValue
    Practitioner practitioner();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPractitioner(practitioner());
    }

    static InternalPractitionerValue of(Practitioner value) {
      return ImmutableResourceList.InternalPractitionerValue.builder().practitioner(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("carePlan")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCarePlanValue.class
  )
  interface InternalCarePlanValue extends InternalValue {
    @JsonValue
    CarePlan carePlan();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCarePlan(carePlan());
    }

    static InternalCarePlanValue of(CarePlan value) {
      return ImmutableResourceList.InternalCarePlanValue.builder().carePlan(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductPharmaceutical")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductPharmaceuticalValue.class
  )
  interface InternalMedicinalProductPharmaceuticalValue extends InternalValue {
    @JsonValue
    MedicinalProductPharmaceutical medicinalProductPharmaceutical();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductPharmaceutical(medicinalProductPharmaceutical());
    }

    static InternalMedicinalProductPharmaceuticalValue of(MedicinalProductPharmaceutical value) {
      return ImmutableResourceList.InternalMedicinalProductPharmaceuticalValue.builder().medicinalProductPharmaceutical(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("linkage")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLinkageValue.class
  )
  interface InternalLinkageValue extends InternalValue {
    @JsonValue
    Linkage linkage();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLinkage(linkage());
    }

    static InternalLinkageValue of(Linkage value) {
      return ImmutableResourceList.InternalLinkageValue.builder().linkage(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProduct")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductValue.class
  )
  interface InternalMedicinalProductValue extends InternalValue {
    @JsonValue
    MedicinalProduct medicinalProduct();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProduct(medicinalProduct());
    }

    static InternalMedicinalProductValue of(MedicinalProduct value) {
      return ImmutableResourceList.InternalMedicinalProductValue.builder().medicinalProduct(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicationKnowledge")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationKnowledgeValue.class
  )
  interface InternalMedicationKnowledgeValue extends InternalValue {
    @JsonValue
    MedicationKnowledge medicationKnowledge();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationKnowledge(medicationKnowledge());
    }

    static InternalMedicationKnowledgeValue of(MedicationKnowledge value) {
      return ImmutableResourceList.InternalMedicationKnowledgeValue.builder().medicationKnowledge(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("provenance")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalProvenanceValue.class
  )
  interface InternalProvenanceValue extends InternalValue {
    @JsonValue
    Provenance provenance();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitProvenance(provenance());
    }

    static InternalProvenanceValue of(Provenance value) {
      return ImmutableResourceList.InternalProvenanceValue.builder().provenance(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("coverageEligibilityRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCoverageEligibilityRequestValue.class
  )
  interface InternalCoverageEligibilityRequestValue extends InternalValue {
    @JsonValue
    CoverageEligibilityRequest coverageEligibilityRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCoverageEligibilityRequest(coverageEligibilityRequest());
    }

    static InternalCoverageEligibilityRequestValue of(CoverageEligibilityRequest value) {
      return ImmutableResourceList.InternalCoverageEligibilityRequestValue.builder().coverageEligibilityRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("endpoint")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEndpointValue.class
  )
  interface InternalEndpointValue extends InternalValue {
    @JsonValue
    Endpoint endpoint();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEndpoint(endpoint());
    }

    static InternalEndpointValue of(Endpoint value) {
      return ImmutableResourceList.InternalEndpointValue.builder().endpoint(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("consent")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalConsentValue.class
  )
  interface InternalConsentValue extends InternalValue {
    @JsonValue
    Consent consent();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitConsent(consent());
    }

    static InternalConsentValue of(Consent value) {
      return ImmutableResourceList.InternalConsentValue.builder().consent(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("evidenceVariable")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEvidenceVariableValue.class
  )
  interface InternalEvidenceVariableValue extends InternalValue {
    @JsonValue
    EvidenceVariable evidenceVariable();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEvidenceVariable(evidenceVariable());
    }

    static InternalEvidenceVariableValue of(EvidenceVariable value) {
      return ImmutableResourceList.InternalEvidenceVariableValue.builder().evidenceVariable(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("bodyStructure")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBodyStructureValue.class
  )
  interface InternalBodyStructureValue extends InternalValue {
    @JsonValue
    BodyStructure bodyStructure();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBodyStructure(bodyStructure());
    }

    static InternalBodyStructureValue of(BodyStructure value) {
      return ImmutableResourceList.InternalBodyStructureValue.builder().bodyStructure(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("communicationRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCommunicationRequestValue.class
  )
  interface InternalCommunicationRequestValue extends InternalValue {
    @JsonValue
    CommunicationRequest communicationRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCommunicationRequest(communicationRequest());
    }

    static InternalCommunicationRequestValue of(CommunicationRequest value) {
      return ImmutableResourceList.InternalCommunicationRequestValue.builder().communicationRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("enrollmentRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEnrollmentRequestValue.class
  )
  interface InternalEnrollmentRequestValue extends InternalValue {
    @JsonValue
    EnrollmentRequest enrollmentRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEnrollmentRequest(enrollmentRequest());
    }

    static InternalEnrollmentRequestValue of(EnrollmentRequest value) {
      return ImmutableResourceList.InternalEnrollmentRequestValue.builder().enrollmentRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("substancePolymer")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstancePolymerValue.class
  )
  interface InternalSubstancePolymerValue extends InternalValue {
    @JsonValue
    SubstancePolymer substancePolymer();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstancePolymer(substancePolymer());
    }

    static InternalSubstancePolymerValue of(SubstancePolymer value) {
      return ImmutableResourceList.InternalSubstancePolymerValue.builder().substancePolymer(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("claim")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClaimValue.class
  )
  interface InternalClaimValue extends InternalValue {
    @JsonValue
    Claim claim();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClaim(claim());
    }

    static InternalClaimValue of(Claim value) {
      return ImmutableResourceList.InternalClaimValue.builder().claim(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("slot")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSlotValue.class
  )
  interface InternalSlotValue extends InternalValue {
    @JsonValue
    Slot slot();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSlot(slot());
    }

    static InternalSlotValue of(Slot value) {
      return ImmutableResourceList.InternalSlotValue.builder().slot(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("catalogEntry")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCatalogEntryValue.class
  )
  interface InternalCatalogEntryValue extends InternalValue {
    @JsonValue
    CatalogEntry catalogEntry();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCatalogEntry(catalogEntry());
    }

    static InternalCatalogEntryValue of(CatalogEntry value) {
      return ImmutableResourceList.InternalCatalogEntryValue.builder().catalogEntry(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("valueSet")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalValueSetValue.class
  )
  interface InternalValueSetValue extends InternalValue {
    @JsonValue
    ValueSet valueSet();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitValueSet(valueSet());
    }

    static InternalValueSetValue of(ValueSet value) {
      return ImmutableResourceList.InternalValueSetValue.builder().valueSet(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("practitionerRole")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPractitionerRoleValue.class
  )
  interface InternalPractitionerRoleValue extends InternalValue {
    @JsonValue
    PractitionerRole practitionerRole();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPractitionerRole(practitionerRole());
    }

    static InternalPractitionerRoleValue of(PractitionerRole value) {
      return ImmutableResourceList.InternalPractitionerRoleValue.builder().practitionerRole(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("molecularSequence")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMolecularSequenceValue.class
  )
  interface InternalMolecularSequenceValue extends InternalValue {
    @JsonValue
    MolecularSequence molecularSequence();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMolecularSequence(molecularSequence());
    }

    static InternalMolecularSequenceValue of(MolecularSequence value) {
      return ImmutableResourceList.InternalMolecularSequenceValue.builder().molecularSequence(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("capabilityStatement")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCapabilityStatementValue.class
  )
  interface InternalCapabilityStatementValue extends InternalValue {
    @JsonValue
    CapabilityStatement capabilityStatement();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCapabilityStatement(capabilityStatement());
    }

    static InternalCapabilityStatementValue of(CapabilityStatement value) {
      return ImmutableResourceList.InternalCapabilityStatementValue.builder().capabilityStatement(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("graphDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGraphDefinitionValue.class
  )
  interface InternalGraphDefinitionValue extends InternalValue {
    @JsonValue
    GraphDefinition graphDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGraphDefinition(graphDefinition());
    }

    static InternalGraphDefinitionValue of(GraphDefinition value) {
      return ImmutableResourceList.InternalGraphDefinitionValue.builder().graphDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductPackaged")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductPackagedValue.class
  )
  interface InternalMedicinalProductPackagedValue extends InternalValue {
    @JsonValue
    MedicinalProductPackaged medicinalProductPackaged();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductPackaged(medicinalProductPackaged());
    }

    static InternalMedicinalProductPackagedValue of(MedicinalProductPackaged value) {
      return ImmutableResourceList.InternalMedicinalProductPackagedValue.builder().medicinalProductPackaged(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("paymentReconciliation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPaymentReconciliationValue.class
  )
  interface InternalPaymentReconciliationValue extends InternalValue {
    @JsonValue
    PaymentReconciliation paymentReconciliation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPaymentReconciliation(paymentReconciliation());
    }

    static InternalPaymentReconciliationValue of(PaymentReconciliation value) {
      return ImmutableResourceList.InternalPaymentReconciliationValue.builder().paymentReconciliation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("schedule")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalScheduleValue.class
  )
  interface InternalScheduleValue extends InternalValue {
    @JsonValue
    Schedule schedule();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSchedule(schedule());
    }

    static InternalScheduleValue of(Schedule value) {
      return ImmutableResourceList.InternalScheduleValue.builder().schedule(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductManufactured")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductManufacturedValue.class
  )
  interface InternalMedicinalProductManufacturedValue extends InternalValue {
    @JsonValue
    MedicinalProductManufactured medicinalProductManufactured();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductManufactured(medicinalProductManufactured());
    }

    static InternalMedicinalProductManufacturedValue of(MedicinalProductManufactured value) {
      return ImmutableResourceList.InternalMedicinalProductManufacturedValue.builder().medicinalProductManufactured(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("person")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPersonValue.class
  )
  interface InternalPersonValue extends InternalValue {
    @JsonValue
    Person person();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPerson(person());
    }

    static InternalPersonValue of(Person value) {
      return ImmutableResourceList.InternalPersonValue.builder().person(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("passwordChangeRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPasswordChangeRequestValue.class
  )
  interface InternalPasswordChangeRequestValue extends InternalValue {
    @JsonValue
    PasswordChangeRequest passwordChangeRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPasswordChangeRequest(passwordChangeRequest());
    }

    static InternalPasswordChangeRequestValue of(PasswordChangeRequest value) {
      return ImmutableResourceList.InternalPasswordChangeRequestValue.builder().passwordChangeRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicationRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationRequestValue.class
  )
  interface InternalMedicationRequestValue extends InternalValue {
    @JsonValue
    MedicationRequest medicationRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationRequest(medicationRequest());
    }

    static InternalMedicationRequestValue of(MedicationRequest value) {
      return ImmutableResourceList.InternalMedicationRequestValue.builder().medicationRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("immunizationEvaluation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImmunizationEvaluationValue.class
  )
  interface InternalImmunizationEvaluationValue extends InternalValue {
    @JsonValue
    ImmunizationEvaluation immunizationEvaluation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImmunizationEvaluation(immunizationEvaluation());
    }

    static InternalImmunizationEvaluationValue of(ImmunizationEvaluation value) {
      return ImmutableResourceList.InternalImmunizationEvaluationValue.builder().immunizationEvaluation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("paymentNotice")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPaymentNoticeValue.class
  )
  interface InternalPaymentNoticeValue extends InternalValue {
    @JsonValue
    PaymentNotice paymentNotice();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPaymentNotice(paymentNotice());
    }

    static InternalPaymentNoticeValue of(PaymentNotice value) {
      return ImmutableResourceList.InternalPaymentNoticeValue.builder().paymentNotice(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductInteraction")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductInteractionValue.class
  )
  interface InternalMedicinalProductInteractionValue extends InternalValue {
    @JsonValue
    MedicinalProductInteraction medicinalProductInteraction();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductInteraction(medicinalProductInteraction());
    }

    static InternalMedicinalProductInteractionValue of(MedicinalProductInteraction value) {
      return ImmutableResourceList.InternalMedicinalProductInteractionValue.builder().medicinalProductInteraction(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("substanceReferenceInformation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceReferenceInformationValue.class
  )
  interface InternalSubstanceReferenceInformationValue extends InternalValue {
    @JsonValue
    SubstanceReferenceInformation substanceReferenceInformation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceReferenceInformation(substanceReferenceInformation());
    }

    static InternalSubstanceReferenceInformationValue of(SubstanceReferenceInformation value) {
      return ImmutableResourceList.InternalSubstanceReferenceInformationValue.builder().substanceReferenceInformation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("familyMemberHistory")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalFamilyMemberHistoryValue.class
  )
  interface InternalFamilyMemberHistoryValue extends InternalValue {
    @JsonValue
    FamilyMemberHistory familyMemberHistory();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitFamilyMemberHistory(familyMemberHistory());
    }

    static InternalFamilyMemberHistoryValue of(FamilyMemberHistory value) {
      return ImmutableResourceList.InternalFamilyMemberHistoryValue.builder().familyMemberHistory(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("allergyIntolerance")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAllergyIntoleranceValue.class
  )
  interface InternalAllergyIntoleranceValue extends InternalValue {
    @JsonValue
    AllergyIntolerance allergyIntolerance();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAllergyIntolerance(allergyIntolerance());
    }

    static InternalAllergyIntoleranceValue of(AllergyIntolerance value) {
      return ImmutableResourceList.InternalAllergyIntoleranceValue.builder().allergyIntolerance(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("basic")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBasicValue.class
  )
  interface InternalBasicValue extends InternalValue {
    @JsonValue
    Basic basic();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBasic(basic());
    }

    static InternalBasicValue of(Basic value) {
      return ImmutableResourceList.InternalBasicValue.builder().basic(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("bundle")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBundleValue.class
  )
  interface InternalBundleValue extends InternalValue {
    @JsonValue
    Bundle bundle();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBundle(bundle());
    }

    static InternalBundleValue of(Bundle value) {
      return ImmutableResourceList.InternalBundleValue.builder().bundle(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("eventDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEventDefinitionValue.class
  )
  interface InternalEventDefinitionValue extends InternalValue {
    @JsonValue
    EventDefinition eventDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEventDefinition(eventDefinition());
    }

    static InternalEventDefinitionValue of(EventDefinition value) {
      return ImmutableResourceList.InternalEventDefinitionValue.builder().eventDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("effectEvidenceSynthesis")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEffectEvidenceSynthesisValue.class
  )
  interface InternalEffectEvidenceSynthesisValue extends InternalValue {
    @JsonValue
    EffectEvidenceSynthesis effectEvidenceSynthesis();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEffectEvidenceSynthesis(effectEvidenceSynthesis());
    }

    static InternalEffectEvidenceSynthesisValue of(EffectEvidenceSynthesis value) {
      return ImmutableResourceList.InternalEffectEvidenceSynthesisValue.builder().effectEvidenceSynthesis(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("requestGroup")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRequestGroupValue.class
  )
  interface InternalRequestGroupValue extends InternalValue {
    @JsonValue
    RequestGroup requestGroup();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRequestGroup(requestGroup());
    }

    static InternalRequestGroupValue of(RequestGroup value) {
      return ImmutableResourceList.InternalRequestGroupValue.builder().requestGroup(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("serviceRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalServiceRequestValue.class
  )
  interface InternalServiceRequestValue extends InternalValue {
    @JsonValue
    ServiceRequest serviceRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitServiceRequest(serviceRequest());
    }

    static InternalServiceRequestValue of(ServiceRequest value) {
      return ImmutableResourceList.InternalServiceRequestValue.builder().serviceRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("immunizationRecommendation")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImmunizationRecommendationValue.class
  )
  interface InternalImmunizationRecommendationValue extends InternalValue {
    @JsonValue
    ImmunizationRecommendation immunizationRecommendation();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImmunizationRecommendation(immunizationRecommendation());
    }

    static InternalImmunizationRecommendationValue of(ImmunizationRecommendation value) {
      return ImmutableResourceList.InternalImmunizationRecommendationValue.builder().immunizationRecommendation(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductIngredient")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductIngredientValue.class
  )
  interface InternalMedicinalProductIngredientValue extends InternalValue {
    @JsonValue
    MedicinalProductIngredient medicinalProductIngredient();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductIngredient(medicinalProductIngredient());
    }

    static InternalMedicinalProductIngredientValue of(MedicinalProductIngredient value) {
      return ImmutableResourceList.InternalMedicinalProductIngredientValue.builder().medicinalProductIngredient(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("deviceRequest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceRequestValue.class
  )
  interface InternalDeviceRequestValue extends InternalValue {
    @JsonValue
    DeviceRequest deviceRequest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceRequest(deviceRequest());
    }

    static InternalDeviceRequestValue of(DeviceRequest value) {
      return ImmutableResourceList.InternalDeviceRequestValue.builder().deviceRequest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("organization")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOrganizationValue.class
  )
  interface InternalOrganizationValue extends InternalValue {
    @JsonValue
    Organization organization();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOrganization(organization());
    }

    static InternalOrganizationValue of(Organization value) {
      return ImmutableResourceList.InternalOrganizationValue.builder().organization(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("refreshToken")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRefreshTokenValue.class
  )
  interface InternalRefreshTokenValue extends InternalValue {
    RefreshToken refreshToken();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRefreshToken(refreshToken());
    }

    static InternalRefreshTokenValue of(RefreshToken value) {
      return ImmutableResourceList.InternalRefreshTokenValue.builder().refreshToken(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("coverage")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCoverageValue.class
  )
  interface InternalCoverageValue extends InternalValue {
    @JsonValue
    Coverage coverage();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCoverage(coverage());
    }

    static InternalCoverageValue of(Coverage value) {
      return ImmutableResourceList.InternalCoverageValue.builder().coverage(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("substanceSpecification")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceSpecificationValue.class
  )
  interface InternalSubstanceSpecificationValue extends InternalValue {
    @JsonValue
    SubstanceSpecification substanceSpecification();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceSpecification(substanceSpecification());
    }

    static InternalSubstanceSpecificationValue of(SubstanceSpecification value) {
      return ImmutableResourceList.InternalSubstanceSpecificationValue.builder().substanceSpecification(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicationDispense")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationDispenseValue.class
  )
  interface InternalMedicationDispenseValue extends InternalValue {
    @JsonValue
    MedicationDispense medicationDispense();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationDispense(medicationDispense());
    }

    static InternalMedicationDispenseValue of(MedicationDispense value) {
      return ImmutableResourceList.InternalMedicationDispenseValue.builder().medicationDispense(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("invoice")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalInvoiceValue.class
  )
  interface InternalInvoiceValue extends InternalValue {
    @JsonValue
    Invoice invoice();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitInvoice(invoice());
    }

    static InternalInvoiceValue of(Invoice value) {
      return ImmutableResourceList.InternalInvoiceValue.builder().invoice(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicationAdministration")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationAdministrationValue.class
  )
  interface InternalMedicationAdministrationValue extends InternalValue {
    @JsonValue
    MedicationAdministration medicationAdministration();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicationAdministration(medicationAdministration());
    }

    static InternalMedicationAdministrationValue of(MedicationAdministration value) {
      return ImmutableResourceList.InternalMedicationAdministrationValue.builder().medicationAdministration(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("adverseEvent")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAdverseEventValue.class
  )
  interface InternalAdverseEventValue extends InternalValue {
    @JsonValue
    AdverseEvent adverseEvent();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAdverseEvent(adverseEvent());
    }

    static InternalAdverseEventValue of(AdverseEvent value) {
      return ImmutableResourceList.InternalAdverseEventValue.builder().adverseEvent(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductUndesirableEffect")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductUndesirableEffectValue.class
  )
  interface InternalMedicinalProductUndesirableEffectValue extends InternalValue {
    @JsonValue
    MedicinalProductUndesirableEffect medicinalProductUndesirableEffect();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductUndesirableEffect(medicinalProductUndesirableEffect());
    }

    static InternalMedicinalProductUndesirableEffectValue of(
        MedicinalProductUndesirableEffect value) {
      return ImmutableResourceList.InternalMedicinalProductUndesirableEffectValue.builder().medicinalProductUndesirableEffect(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("episodeOfCare")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEpisodeOfCareValue.class
  )
  interface InternalEpisodeOfCareValue extends InternalValue {
    @JsonValue
    EpisodeOfCare episodeOfCare();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEpisodeOfCare(episodeOfCare());
    }

    static InternalEpisodeOfCareValue of(EpisodeOfCare value) {
      return ImmutableResourceList.InternalEpisodeOfCareValue.builder().episodeOfCare(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("device")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceValue.class
  )
  interface InternalDeviceValue extends InternalValue {
    @JsonValue
    Device device();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDevice(device());
    }

    static InternalDeviceValue of(Device value) {
      return ImmutableResourceList.InternalDeviceValue.builder().device(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("healthcareService")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalHealthcareServiceValue.class
  )
  interface InternalHealthcareServiceValue extends InternalValue {
    @JsonValue
    HealthcareService healthcareService();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitHealthcareService(healthcareService());
    }

    static InternalHealthcareServiceValue of(HealthcareService value) {
      return ImmutableResourceList.InternalHealthcareServiceValue.builder().healthcareService(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("bot")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBotValue.class
  )
  interface InternalBotValue extends InternalValue {
    @JsonValue
    Bot bot();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBot(bot());
    }

    static InternalBotValue of(Bot value) {
      return ImmutableResourceList.InternalBotValue.builder().bot(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("specimenDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSpecimenDefinitionValue.class
  )
  interface InternalSpecimenDefinitionValue extends InternalValue {
    @JsonValue
    SpecimenDefinition specimenDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSpecimenDefinition(specimenDefinition());
    }

    static InternalSpecimenDefinitionValue of(SpecimenDefinition value) {
      return ImmutableResourceList.InternalSpecimenDefinitionValue.builder().specimenDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("exampleScenario")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalExampleScenarioValue.class
  )
  interface InternalExampleScenarioValue extends InternalValue {
    @JsonValue
    ExampleScenario exampleScenario();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitExampleScenario(exampleScenario());
    }

    static InternalExampleScenarioValue of(ExampleScenario value) {
      return ImmutableResourceList.InternalExampleScenarioValue.builder().exampleScenario(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("supplyDelivery")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSupplyDeliveryValue.class
  )
  interface InternalSupplyDeliveryValue extends InternalValue {
    @JsonValue
    SupplyDelivery supplyDelivery();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSupplyDelivery(supplyDelivery());
    }

    static InternalSupplyDeliveryValue of(SupplyDelivery value) {
      return ImmutableResourceList.InternalSupplyDeliveryValue.builder().supplyDelivery(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("researchSubject")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchSubjectValue.class
  )
  interface InternalResearchSubjectValue extends InternalValue {
    @JsonValue
    ResearchSubject researchSubject();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchSubject(researchSubject());
    }

    static InternalResearchSubjectValue of(ResearchSubject value) {
      return ImmutableResourceList.InternalResearchSubjectValue.builder().researchSubject(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductAuthorization")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductAuthorizationValue.class
  )
  interface InternalMedicinalProductAuthorizationValue extends InternalValue {
    @JsonValue
    MedicinalProductAuthorization medicinalProductAuthorization();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductAuthorization(medicinalProductAuthorization());
    }

    static InternalMedicinalProductAuthorizationValue of(MedicinalProductAuthorization value) {
      return ImmutableResourceList.InternalMedicinalProductAuthorizationValue.builder().medicinalProductAuthorization(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("account")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAccountValue.class
  )
  interface InternalAccountValue extends InternalValue {
    @JsonValue
    Account account();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAccount(account());
    }

    static InternalAccountValue of(Account value) {
      return ImmutableResourceList.InternalAccountValue.builder().account(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("claimResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClaimResponseValue.class
  )
  interface InternalClaimResponseValue extends InternalValue {
    @JsonValue
    ClaimResponse claimResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClaimResponse(claimResponse());
    }

    static InternalClaimResponseValue of(ClaimResponse value) {
      return ImmutableResourceList.InternalClaimResponseValue.builder().claimResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("condition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalConditionValue.class
  )
  interface InternalConditionValue extends InternalValue {
    @JsonValue
    Condition condition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCondition(condition());
    }

    static InternalConditionValue of(Condition value) {
      return ImmutableResourceList.InternalConditionValue.builder().condition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("deviceDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceDefinitionValue.class
  )
  interface InternalDeviceDefinitionValue extends InternalValue {
    @JsonValue
    DeviceDefinition deviceDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceDefinition(deviceDefinition());
    }

    static InternalDeviceDefinitionValue of(DeviceDefinition value) {
      return ImmutableResourceList.InternalDeviceDefinitionValue.builder().deviceDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicationValue.class
  )
  interface InternalMedicationValue extends InternalValue {
    @JsonValue
    Medication medication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedication(medication());
    }

    static InternalMedicationValue of(Medication value) {
      return ImmutableResourceList.InternalMedicationValue.builder().medication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("questionnaire")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalQuestionnaireValue.class
  )
  interface InternalQuestionnaireValue extends InternalValue {
    @JsonValue
    Questionnaire questionnaire();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitQuestionnaire(questionnaire());
    }

    static InternalQuestionnaireValue of(Questionnaire value) {
      return ImmutableResourceList.InternalQuestionnaireValue.builder().questionnaire(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("structureMap")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalStructureMapValue.class
  )
  interface InternalStructureMapValue extends InternalValue {
    @JsonValue
    StructureMap structureMap();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitStructureMap(structureMap());
    }

    static InternalStructureMapValue of(StructureMap value) {
      return ImmutableResourceList.InternalStructureMapValue.builder().structureMap(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("immunization")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImmunizationValue.class
  )
  interface InternalImmunizationValue extends InternalValue {
    @JsonValue
    Immunization immunization();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImmunization(immunization());
    }

    static InternalImmunizationValue of(Immunization value) {
      return ImmutableResourceList.InternalImmunizationValue.builder().immunization(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("codeSystem")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCodeSystemValue.class
  )
  interface InternalCodeSystemValue extends InternalValue {
    @JsonValue
    CodeSystem codeSystem();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCodeSystem(codeSystem());
    }

    static InternalCodeSystemValue of(CodeSystem value) {
      return ImmutableResourceList.InternalCodeSystemValue.builder().codeSystem(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("clinicalImpression")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClinicalImpressionValue.class
  )
  interface InternalClinicalImpressionValue extends InternalValue {
    @JsonValue
    ClinicalImpression clinicalImpression();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClinicalImpression(clinicalImpression());
    }

    static InternalClinicalImpressionValue of(ClinicalImpression value) {
      return ImmutableResourceList.InternalClinicalImpressionValue.builder().clinicalImpression(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("enrollmentResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEnrollmentResponseValue.class
  )
  interface InternalEnrollmentResponseValue extends InternalValue {
    @JsonValue
    EnrollmentResponse enrollmentResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEnrollmentResponse(enrollmentResponse());
    }

    static InternalEnrollmentResponseValue of(EnrollmentResponse value) {
      return ImmutableResourceList.InternalEnrollmentResponseValue.builder().enrollmentResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("group")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGroupValue.class
  )
  interface InternalGroupValue extends InternalValue {
    @JsonValue
    Group group();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGroup(group());
    }

    static InternalGroupValue of(Group value) {
      return ImmutableResourceList.InternalGroupValue.builder().group(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("contract")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalContractValue.class
  )
  interface InternalContractValue extends InternalValue {
    @JsonValue
    Contract contract();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitContract(contract());
    }

    static InternalContractValue of(Contract value) {
      return ImmutableResourceList.InternalContractValue.builder().contract(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("deviceMetric")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceMetricValue.class
  )
  interface InternalDeviceMetricValue extends InternalValue {
    @JsonValue
    DeviceMetric deviceMetric();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceMetric(deviceMetric());
    }

    static InternalDeviceMetricValue of(DeviceMetric value) {
      return ImmutableResourceList.InternalDeviceMetricValue.builder().deviceMetric(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("searchParameter")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSearchParameterValue.class
  )
  interface InternalSearchParameterValue extends InternalValue {
    @JsonValue
    SearchParameter searchParameter();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSearchParameter(searchParameter());
    }

    static InternalSearchParameterValue of(SearchParameter value) {
      return ImmutableResourceList.InternalSearchParameterValue.builder().searchParameter(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("flag")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalFlagValue.class
  )
  interface InternalFlagValue extends InternalValue {
    @JsonValue
    Flag flag();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitFlag(flag());
    }

    static InternalFlagValue of(Flag value) {
      return ImmutableResourceList.InternalFlagValue.builder().flag(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("evidence")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEvidenceValue.class
  )
  interface InternalEvidenceValue extends InternalValue {
    @JsonValue
    Evidence evidence();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEvidence(evidence());
    }

    static InternalEvidenceValue of(Evidence value) {
      return ImmutableResourceList.InternalEvidenceValue.builder().evidence(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("library")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLibraryValue.class
  )
  interface InternalLibraryValue extends InternalValue {
    @JsonValue
    Library library();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLibrary(library());
    }

    static InternalLibraryValue of(Library value) {
      return ImmutableResourceList.InternalLibraryValue.builder().library(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("goal")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGoalValue.class
  )
  interface InternalGoalValue extends InternalValue {
    @JsonValue
    Goal goal();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGoal(goal());
    }

    static InternalGoalValue of(Goal value) {
      return ImmutableResourceList.InternalGoalValue.builder().goal(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("riskEvidenceSynthesis")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRiskEvidenceSynthesisValue.class
  )
  interface InternalRiskEvidenceSynthesisValue extends InternalValue {
    @JsonValue
    RiskEvidenceSynthesis riskEvidenceSynthesis();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRiskEvidenceSynthesis(riskEvidenceSynthesis());
    }

    static InternalRiskEvidenceSynthesisValue of(RiskEvidenceSynthesis value) {
      return ImmutableResourceList.InternalRiskEvidenceSynthesisValue.builder().riskEvidenceSynthesis(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("researchElementDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchElementDefinitionValue.class
  )
  interface InternalResearchElementDefinitionValue extends InternalValue {
    @JsonValue
    ResearchElementDefinition researchElementDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchElementDefinition(researchElementDefinition());
    }

    static InternalResearchElementDefinitionValue of(ResearchElementDefinition value) {
      return ImmutableResourceList.InternalResearchElementDefinitionValue.builder().researchElementDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("operationDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalOperationDefinitionValue.class
  )
  interface InternalOperationDefinitionValue extends InternalValue {
    @JsonValue
    OperationDefinition operationDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitOperationDefinition(operationDefinition());
    }

    static InternalOperationDefinitionValue of(OperationDefinition value) {
      return ImmutableResourceList.InternalOperationDefinitionValue.builder().operationDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("explanationOfBenefit")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalExplanationOfBenefitValue.class
  )
  interface InternalExplanationOfBenefitValue extends InternalValue {
    @JsonValue
    ExplanationOfBenefit explanationOfBenefit();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitExplanationOfBenefit(explanationOfBenefit());
    }

    static InternalExplanationOfBenefitValue of(ExplanationOfBenefit value) {
      return ImmutableResourceList.InternalExplanationOfBenefitValue.builder().explanationOfBenefit(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("testScript")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalTestScriptValue.class
  )
  interface InternalTestScriptValue extends InternalValue {
    @JsonValue
    TestScript testScript();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitTestScript(testScript());
    }

    static InternalTestScriptValue of(TestScript value) {
      return ImmutableResourceList.InternalTestScriptValue.builder().testScript(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("substanceSourceMaterial")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceSourceMaterialValue.class
  )
  interface InternalSubstanceSourceMaterialValue extends InternalValue {
    @JsonValue
    SubstanceSourceMaterial substanceSourceMaterial();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceSourceMaterial(substanceSourceMaterial());
    }

    static InternalSubstanceSourceMaterialValue of(SubstanceSourceMaterial value) {
      return ImmutableResourceList.InternalSubstanceSourceMaterialValue.builder().substanceSourceMaterial(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("appointmentResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAppointmentResponseValue.class
  )
  interface InternalAppointmentResponseValue extends InternalValue {
    @JsonValue
    AppointmentResponse appointmentResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAppointmentResponse(appointmentResponse());
    }

    static InternalAppointmentResponseValue of(AppointmentResponse value) {
      return ImmutableResourceList.InternalAppointmentResponseValue.builder().appointmentResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("verificationResult")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalVerificationResultValue.class
  )
  interface InternalVerificationResultValue extends InternalValue {
    @JsonValue
    VerificationResult verificationResult();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitVerificationResult(verificationResult());
    }

    static InternalVerificationResultValue of(VerificationResult value) {
      return ImmutableResourceList.InternalVerificationResultValue.builder().verificationResult(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("insurancePlan")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalInsurancePlanValue.class
  )
  interface InternalInsurancePlanValue extends InternalValue {
    @JsonValue
    InsurancePlan insurancePlan();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitInsurancePlan(insurancePlan());
    }

    static InternalInsurancePlanValue of(InsurancePlan value) {
      return ImmutableResourceList.InternalInsurancePlanValue.builder().insurancePlan(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("auditEvent")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalAuditEventValue.class
  )
  interface InternalAuditEventValue extends InternalValue {
    @JsonValue
    AuditEvent auditEvent();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitAuditEvent(auditEvent());
    }

    static InternalAuditEventValue of(AuditEvent value) {
      return ImmutableResourceList.InternalAuditEventValue.builder().auditEvent(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("communication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCommunicationValue.class
  )
  interface InternalCommunicationValue extends InternalValue {
    @JsonValue
    Communication communication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCommunication(communication());
    }

    static InternalCommunicationValue of(Communication value) {
      return ImmutableResourceList.InternalCommunicationValue.builder().communication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("planDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalPlanDefinitionValue.class
  )
  interface InternalPlanDefinitionValue extends InternalValue {
    @JsonValue
    PlanDefinition planDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitPlanDefinition(planDefinition());
    }

    static InternalPlanDefinitionValue of(PlanDefinition value) {
      return ImmutableResourceList.InternalPlanDefinitionValue.builder().planDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("conceptMap")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalConceptMapValue.class
  )
  interface InternalConceptMapValue extends InternalValue {
    @JsonValue
    ConceptMap conceptMap();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitConceptMap(conceptMap());
    }

    static InternalConceptMapValue of(ConceptMap value) {
      return ImmutableResourceList.InternalConceptMapValue.builder().conceptMap(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("encounter")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalEncounterValue.class
  )
  interface InternalEncounterValue extends InternalValue {
    @JsonValue
    Encounter encounter();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitEncounter(encounter());
    }

    static InternalEncounterValue of(Encounter value) {
      return ImmutableResourceList.InternalEncounterValue.builder().encounter(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("procedure")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalProcedureValue.class
  )
  interface InternalProcedureValue extends InternalValue {
    @JsonValue
    Procedure procedure();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitProcedure(procedure());
    }

    static InternalProcedureValue of(Procedure value) {
      return ImmutableResourceList.InternalProcedureValue.builder().procedure(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("guidanceResponse")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalGuidanceResponseValue.class
  )
  interface InternalGuidanceResponseValue extends InternalValue {
    @JsonValue
    GuidanceResponse guidanceResponse();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitGuidanceResponse(guidanceResponse());
    }

    static InternalGuidanceResponseValue of(GuidanceResponse value) {
      return ImmutableResourceList.InternalGuidanceResponseValue.builder().guidanceResponse(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("nutritionOrder")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalNutritionOrderValue.class
  )
  interface InternalNutritionOrderValue extends InternalValue {
    @JsonValue
    NutritionOrder nutritionOrder();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitNutritionOrder(nutritionOrder());
    }

    static InternalNutritionOrderValue of(NutritionOrder value) {
      return ImmutableResourceList.InternalNutritionOrderValue.builder().nutritionOrder(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("media")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMediaValue.class
  )
  interface InternalMediaValue extends InternalValue {
    @JsonValue
    Media media();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedia(media());
    }

    static InternalMediaValue of(Media value) {
      return ImmutableResourceList.InternalMediaValue.builder().media(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("clientApplication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalClientApplicationValue.class
  )
  interface InternalClientApplicationValue extends InternalValue {
    @JsonValue
    ClientApplication clientApplication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitClientApplication(clientApplication());
    }

    static InternalClientApplicationValue of(ClientApplication value) {
      return ImmutableResourceList.InternalClientApplicationValue.builder().clientApplication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("jsonWebKey")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalJsonWebKeyValue.class
  )
  interface InternalJsonWebKeyValue extends InternalValue {
    @JsonValue
    JsonWebKey jsonWebKey();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitJsonWebKey(jsonWebKey());
    }

    static InternalJsonWebKeyValue of(JsonWebKey value) {
      return ImmutableResourceList.InternalJsonWebKeyValue.builder().jsonWebKey(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("visionPrescription")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalVisionPrescriptionValue.class
  )
  interface InternalVisionPrescriptionValue extends InternalValue {
    @JsonValue
    VisionPrescription visionPrescription();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitVisionPrescription(visionPrescription());
    }

    static InternalVisionPrescriptionValue of(VisionPrescription value) {
      return ImmutableResourceList.InternalVisionPrescriptionValue.builder().visionPrescription(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("composition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCompositionValue.class
  )
  interface InternalCompositionValue extends InternalValue {
    @JsonValue
    Composition composition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitComposition(composition());
    }

    static InternalCompositionValue of(Composition value) {
      return ImmutableResourceList.InternalCompositionValue.builder().composition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("documentManifest")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDocumentManifestValue.class
  )
  interface InternalDocumentManifestValue extends InternalValue {
    @JsonValue
    DocumentManifest documentManifest();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDocumentManifest(documentManifest());
    }

    static InternalDocumentManifestValue of(DocumentManifest value) {
      return ImmutableResourceList.InternalDocumentManifestValue.builder().documentManifest(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("documentReference")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDocumentReferenceValue.class
  )
  interface InternalDocumentReferenceValue extends InternalValue {
    @JsonValue
    DocumentReference documentReference();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDocumentReference(documentReference());
    }

    static InternalDocumentReferenceValue of(DocumentReference value) {
      return ImmutableResourceList.InternalDocumentReferenceValue.builder().documentReference(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("researchDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchDefinitionValue.class
  )
  interface InternalResearchDefinitionValue extends InternalValue {
    @JsonValue
    ResearchDefinition researchDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchDefinition(researchDefinition());
    }

    static InternalResearchDefinitionValue of(ResearchDefinition value) {
      return ImmutableResourceList.InternalResearchDefinitionValue.builder().researchDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("diagnosticReport")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDiagnosticReportValue.class
  )
  interface InternalDiagnosticReportValue extends InternalValue {
    @JsonValue
    DiagnosticReport diagnosticReport();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDiagnosticReport(diagnosticReport());
    }

    static InternalDiagnosticReportValue of(DiagnosticReport value) {
      return ImmutableResourceList.InternalDiagnosticReportValue.builder().diagnosticReport(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("relatedPerson")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalRelatedPersonValue.class
  )
  interface InternalRelatedPersonValue extends InternalValue {
    @JsonValue
    RelatedPerson relatedPerson();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitRelatedPerson(relatedPerson());
    }

    static InternalRelatedPersonValue of(RelatedPerson value) {
      return ImmutableResourceList.InternalRelatedPersonValue.builder().relatedPerson(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("structureDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalStructureDefinitionValue.class
  )
  interface InternalStructureDefinitionValue extends InternalValue {
    @JsonValue
    StructureDefinition structureDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitStructureDefinition(structureDefinition());
    }

    static InternalStructureDefinitionValue of(StructureDefinition value) {
      return ImmutableResourceList.InternalStructureDefinitionValue.builder().structureDefinition(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("biologicallyDerivedProduct")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBiologicallyDerivedProductValue.class
  )
  interface InternalBiologicallyDerivedProductValue extends InternalValue {
    @JsonValue
    BiologicallyDerivedProduct biologicallyDerivedProduct();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBiologicallyDerivedProduct(biologicallyDerivedProduct());
    }

    static InternalBiologicallyDerivedProductValue of(BiologicallyDerivedProduct value) {
      return ImmutableResourceList.InternalBiologicallyDerivedProductValue.builder().biologicallyDerivedProduct(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("implementationGuide")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImplementationGuideValue.class
  )
  interface InternalImplementationGuideValue extends InternalValue {
    @JsonValue
    ImplementationGuide implementationGuide();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImplementationGuide(implementationGuide());
    }

    static InternalImplementationGuideValue of(ImplementationGuide value) {
      return ImmutableResourceList.InternalImplementationGuideValue.builder().implementationGuide(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("specimen")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSpecimenValue.class
  )
  interface InternalSpecimenValue extends InternalValue {
    @JsonValue
    Specimen specimen();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSpecimen(specimen());
    }

    static InternalSpecimenValue of(Specimen value) {
      return ImmutableResourceList.InternalSpecimenValue.builder().specimen(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("imagingStudy")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalImagingStudyValue.class
  )
  interface InternalImagingStudyValue extends InternalValue {
    @JsonValue
    ImagingStudy imagingStudy();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitImagingStudy(imagingStudy());
    }

    static InternalImagingStudyValue of(ImagingStudy value) {
      return ImmutableResourceList.InternalImagingStudyValue.builder().imagingStudy(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductIndication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductIndicationValue.class
  )
  interface InternalMedicinalProductIndicationValue extends InternalValue {
    @JsonValue
    MedicinalProductIndication medicinalProductIndication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductIndication(medicinalProductIndication());
    }

    static InternalMedicinalProductIndicationValue of(MedicinalProductIndication value) {
      return ImmutableResourceList.InternalMedicinalProductIndicationValue.builder().medicinalProductIndication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("binary")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalBinaryValue.class
  )
  interface InternalBinaryValue extends InternalValue {
    @JsonValue
    Binary binary();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitBinary(binary());
    }

    static InternalBinaryValue of(Binary value) {
      return ImmutableResourceList.InternalBinaryValue.builder().binary(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("substanceNucleicAcid")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubstanceNucleicAcidValue.class
  )
  interface InternalSubstanceNucleicAcidValue extends InternalValue {
    @JsonValue
    SubstanceNucleicAcid substanceNucleicAcid();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubstanceNucleicAcid(substanceNucleicAcid());
    }

    static InternalSubstanceNucleicAcidValue of(SubstanceNucleicAcid value) {
      return ImmutableResourceList.InternalSubstanceNucleicAcidValue.builder().substanceNucleicAcid(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("location")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalLocationValue.class
  )
  interface InternalLocationValue extends InternalValue {
    @JsonValue
    Location location();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitLocation(location());
    }

    static InternalLocationValue of(Location value) {
      return ImmutableResourceList.InternalLocationValue.builder().location(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("medicinalProductContraindication")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalMedicinalProductContraindicationValue.class
  )
  interface InternalMedicinalProductContraindicationValue extends InternalValue {
    @JsonValue
    MedicinalProductContraindication medicinalProductContraindication();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitMedicinalProductContraindication(medicinalProductContraindication());
    }

    static InternalMedicinalProductContraindicationValue of(
        MedicinalProductContraindication value) {
      return ImmutableResourceList.InternalMedicinalProductContraindicationValue.builder().medicinalProductContraindication(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("namingSystem")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalNamingSystemValue.class
  )
  interface InternalNamingSystemValue extends InternalValue {
    @JsonValue
    NamingSystem namingSystem();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitNamingSystem(namingSystem());
    }

    static InternalNamingSystemValue of(NamingSystem value) {
      return ImmutableResourceList.InternalNamingSystemValue.builder().namingSystem(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("deviceUseStatement")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalDeviceUseStatementValue.class
  )
  interface InternalDeviceUseStatementValue extends InternalValue {
    @JsonValue
    DeviceUseStatement deviceUseStatement();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitDeviceUseStatement(deviceUseStatement());
    }

    static InternalDeviceUseStatementValue of(DeviceUseStatement value) {
      return ImmutableResourceList.InternalDeviceUseStatementValue.builder().deviceUseStatement(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("researchStudy")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalResearchStudyValue.class
  )
  interface InternalResearchStudyValue extends InternalValue {
    @JsonValue
    ResearchStudy researchStudy();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitResearchStudy(researchStudy());
    }

    static InternalResearchStudyValue of(ResearchStudy value) {
      return ImmutableResourceList.InternalResearchStudyValue.builder().researchStudy(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("subscription")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalSubscriptionValue.class
  )
  interface InternalSubscriptionValue extends InternalValue {
    @JsonValue
    Subscription subscription();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitSubscription(subscription());
    }

    static InternalSubscriptionValue of(Subscription value) {
      return ImmutableResourceList.InternalSubscriptionValue.builder().subscription(value).build();
    }
  }

  @Value.Immutable
  @JsonTypeName("compartmentDefinition")
  @JsonDeserialize(
      as = ImmutableResourceList.InternalCompartmentDefinitionValue.class
  )
  interface InternalCompartmentDefinitionValue extends InternalValue {
    @JsonValue
    CompartmentDefinition compartmentDefinition();

    @Override
    default <T> T accept(Visitor<T> visitor) {
      return visitor.visitCompartmentDefinition(compartmentDefinition());
    }

    static InternalCompartmentDefinitionValue of(CompartmentDefinition value) {
      return ImmutableResourceList.InternalCompartmentDefinitionValue.builder().compartmentDefinition(value).build();
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
