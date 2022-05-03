import * as model from "..";

export type ResourceList =
    | ResourceList.Account
    | ResourceList.ActivityDefinition
    | ResourceList.AdverseEvent
    | ResourceList.AllergyIntolerance
    | ResourceList.Appointment
    | ResourceList.AppointmentResponse
    | ResourceList.AuditEvent
    | ResourceList.Basic
    | ResourceList.Binary
    | ResourceList.BiologicallyDerivedProduct
    | ResourceList.BodyStructure
    | ResourceList.Bundle
    | ResourceList.CapabilityStatement
    | ResourceList.CarePlan
    | ResourceList.CareTeam
    | ResourceList.CatalogEntry
    | ResourceList.ChargeItem
    | ResourceList.ChargeItemDefinition
    | ResourceList.Claim
    | ResourceList.ClaimResponse
    | ResourceList.ClinicalImpression
    | ResourceList.CodeSystem
    | ResourceList.Communication
    | ResourceList.CommunicationRequest
    | ResourceList.CompartmentDefinition
    | ResourceList.Composition
    | ResourceList.ConceptMap
    | ResourceList.Condition
    | ResourceList.Consent
    | ResourceList.Contract
    | ResourceList.Coverage
    | ResourceList.CoverageEligibilityRequest
    | ResourceList.CoverageEligibilityResponse
    | ResourceList.DetectedIssue
    | ResourceList.Device
    | ResourceList.DeviceDefinition
    | ResourceList.DeviceMetric
    | ResourceList.DeviceRequest
    | ResourceList.DeviceUseStatement
    | ResourceList.DiagnosticReport
    | ResourceList.DocumentManifest
    | ResourceList.DocumentReference
    | ResourceList.EffectEvidenceSynthesis
    | ResourceList.Encounter
    | ResourceList.Endpoint
    | ResourceList.EnrollmentRequest
    | ResourceList.EnrollmentResponse
    | ResourceList.EpisodeOfCare
    | ResourceList.EventDefinition
    | ResourceList.Evidence
    | ResourceList.EvidenceVariable
    | ResourceList.ExampleScenario
    | ResourceList.ExplanationOfBenefit
    | ResourceList.FamilyMemberHistory
    | ResourceList.Flag
    | ResourceList.Goal
    | ResourceList.GraphDefinition
    | ResourceList.Group
    | ResourceList.GuidanceResponse
    | ResourceList.HealthcareService
    | ResourceList.ImagingStudy
    | ResourceList.Immunization
    | ResourceList.ImmunizationEvaluation
    | ResourceList.ImmunizationRecommendation
    | ResourceList.ImplementationGuide
    | ResourceList.InsurancePlan
    | ResourceList.Invoice
    | ResourceList.Library
    | ResourceList.Linkage
    | ResourceList.List
    | ResourceList.Location
    | ResourceList.Measure
    | ResourceList.MeasureReport
    | ResourceList.Media
    | ResourceList.Medication
    | ResourceList.MedicationAdministration
    | ResourceList.MedicationDispense
    | ResourceList.MedicationKnowledge
    | ResourceList.MedicationRequest
    | ResourceList.MedicationStatement
    | ResourceList.MedicinalProduct
    | ResourceList.MedicinalProductAuthorization
    | ResourceList.MedicinalProductContraindication
    | ResourceList.MedicinalProductIndication
    | ResourceList.MedicinalProductIngredient
    | ResourceList.MedicinalProductInteraction
    | ResourceList.MedicinalProductManufactured
    | ResourceList.MedicinalProductPackaged
    | ResourceList.MedicinalProductPharmaceutical
    | ResourceList.MedicinalProductUndesirableEffect
    | ResourceList.MessageDefinition
    | ResourceList.MessageHeader
    | ResourceList.MolecularSequence
    | ResourceList.NamingSystem
    | ResourceList.NutritionOrder
    | ResourceList.Observation
    | ResourceList.ObservationDefinition
    | ResourceList.OperationDefinition
    | ResourceList.OperationOutcome
    | ResourceList.Organization
    | ResourceList.OrganizationAffiliation
    | ResourceList.Parameters
    | ResourceList.Patient
    | ResourceList.PaymentNotice
    | ResourceList.PaymentReconciliation
    | ResourceList.Person
    | ResourceList.PlanDefinition
    | ResourceList.Practitioner
    | ResourceList.PractitionerRole
    | ResourceList.Procedure
    | ResourceList.Provenance
    | ResourceList.Questionnaire
    | ResourceList.QuestionnaireResponse
    | ResourceList.RelatedPerson
    | ResourceList.RequestGroup
    | ResourceList.ResearchDefinition
    | ResourceList.ResearchElementDefinition
    | ResourceList.ResearchStudy
    | ResourceList.ResearchSubject
    | ResourceList.RiskAssessment
    | ResourceList.RiskEvidenceSynthesis
    | ResourceList.Schedule
    | ResourceList.SearchParameter
    | ResourceList.ServiceRequest
    | ResourceList.Slot
    | ResourceList.Specimen
    | ResourceList.SpecimenDefinition
    | ResourceList.StructureDefinition
    | ResourceList.StructureMap
    | ResourceList.Subscription
    | ResourceList.Substance
    | ResourceList.SubstanceNucleicAcid
    | ResourceList.SubstancePolymer
    | ResourceList.SubstanceProtein
    | ResourceList.SubstanceReferenceInformation
    | ResourceList.SubstanceSourceMaterial
    | ResourceList.SubstanceSpecification
    | ResourceList.SupplyDelivery
    | ResourceList.SupplyRequest
    | ResourceList.Task
    | ResourceList.TerminologyCapabilities
    | ResourceList.TestReport
    | ResourceList.TestScript
    | ResourceList.ValueSet
    | ResourceList.VerificationResult
    | ResourceList.VisionPrescription
    | ResourceList.Project
    | ResourceList.ClientApplication
    | ResourceList.User
    | ResourceList.Login
    | ResourceList.RefreshToken
    | ResourceList.PasswordChangeRequest
    | ResourceList.JsonWebKey
    | ResourceList.Bot
    | ResourceList.AccessPolicy
    | ResourceList.UserConfiguration;

export declare namespace ResourceList {
    interface Account extends model.Account {
        resourceType: "Account";
    }

    interface ActivityDefinition extends model.ActivityDefinition {
        resourceType: "ActivityDefinition";
    }

    interface AdverseEvent extends model.AdverseEvent {
        resourceType: "AdverseEvent";
    }

    interface AllergyIntolerance extends model.AllergyIntolerance {
        resourceType: "AllergyIntolerance";
    }

    interface Appointment extends model.Appointment {
        resourceType: "Appointment";
    }

    interface AppointmentResponse extends model.AppointmentResponse {
        resourceType: "AppointmentResponse";
    }

    interface AuditEvent extends model.AuditEvent {
        resourceType: "AuditEvent";
    }

    interface Basic extends model.Basic {
        resourceType: "Basic";
    }

    interface Binary extends model.Binary {
        resourceType: "Binary";
    }

    interface BiologicallyDerivedProduct
        extends model.BiologicallyDerivedProduct {
        resourceType: "BiologicallyDerivedProduct";
    }

    interface BodyStructure extends model.BodyStructure {
        resourceType: "BodyStructure";
    }

    interface Bundle extends model.Bundle {
        resourceType: "Bundle";
    }

    interface CapabilityStatement extends model.CapabilityStatement {
        resourceType: "CapabilityStatement";
    }

    interface CarePlan extends model.CarePlan {
        resourceType: "CarePlan";
    }

    interface CareTeam extends model.CareTeam {
        resourceType: "CareTeam";
    }

    interface CatalogEntry extends model.CatalogEntry {
        resourceType: "CatalogEntry";
    }

    interface ChargeItem extends model.ChargeItem {
        resourceType: "ChargeItem";
    }

    interface ChargeItemDefinition extends model.ChargeItemDefinition {
        resourceType: "ChargeItemDefinition";
    }

    interface Claim extends model.Claim {
        resourceType: "Claim";
    }

    interface ClaimResponse extends model.ClaimResponse {
        resourceType: "ClaimResponse";
    }

    interface ClinicalImpression extends model.ClinicalImpression {
        resourceType: "ClinicalImpression";
    }

    interface CodeSystem extends model.CodeSystem {
        resourceType: "CodeSystem";
    }

    interface Communication extends model.Communication {
        resourceType: "Communication";
    }

    interface CommunicationRequest extends model.CommunicationRequest {
        resourceType: "CommunicationRequest";
    }

    interface CompartmentDefinition extends model.CompartmentDefinition {
        resourceType: "CompartmentDefinition";
    }

    interface Composition extends model.Composition {
        resourceType: "Composition";
    }

    interface ConceptMap extends model.ConceptMap {
        resourceType: "ConceptMap";
    }

    interface Condition extends model.Condition {
        resourceType: "Condition";
    }

    interface Consent extends model.Consent {
        resourceType: "Consent";
    }

    interface Contract extends model.Contract {
        resourceType: "Contract";
    }

    interface Coverage extends model.Coverage {
        resourceType: "Coverage";
    }

    interface CoverageEligibilityRequest
        extends model.CoverageEligibilityRequest {
        resourceType: "CoverageEligibilityRequest";
    }

    interface CoverageEligibilityResponse
        extends model.CoverageEligibilityResponse {
        resourceType: "CoverageEligibilityResponse";
    }

    interface DetectedIssue extends model.DetectedIssue {
        resourceType: "DetectedIssue";
    }

    interface Device extends model.Device {
        resourceType: "Device";
    }

    interface DeviceDefinition extends model.DeviceDefinition {
        resourceType: "DeviceDefinition";
    }

    interface DeviceMetric extends model.DeviceMetric {
        resourceType: "DeviceMetric";
    }

    interface DeviceRequest extends model.DeviceRequest {
        resourceType: "DeviceRequest";
    }

    interface DeviceUseStatement extends model.DeviceUseStatement {
        resourceType: "DeviceUseStatement";
    }

    interface DiagnosticReport extends model.DiagnosticReport {
        resourceType: "DiagnosticReport";
    }

    interface DocumentManifest extends model.DocumentManifest {
        resourceType: "DocumentManifest";
    }

    interface DocumentReference extends model.DocumentReference {
        resourceType: "DocumentReference";
    }

    interface EffectEvidenceSynthesis extends model.EffectEvidenceSynthesis {
        resourceType: "EffectEvidenceSynthesis";
    }

    interface Encounter extends model.Encounter {
        resourceType: "Encounter";
    }

    interface Endpoint extends model.Endpoint {
        resourceType: "Endpoint";
    }

    interface EnrollmentRequest extends model.EnrollmentRequest {
        resourceType: "EnrollmentRequest";
    }

    interface EnrollmentResponse extends model.EnrollmentResponse {
        resourceType: "EnrollmentResponse";
    }

    interface EpisodeOfCare extends model.EpisodeOfCare {
        resourceType: "EpisodeOfCare";
    }

    interface EventDefinition extends model.EventDefinition {
        resourceType: "EventDefinition";
    }

    interface Evidence extends model.Evidence {
        resourceType: "Evidence";
    }

    interface EvidenceVariable extends model.EvidenceVariable {
        resourceType: "EvidenceVariable";
    }

    interface ExampleScenario extends model.ExampleScenario {
        resourceType: "ExampleScenario";
    }

    interface ExplanationOfBenefit extends model.ExplanationOfBenefit {
        resourceType: "ExplanationOfBenefit";
    }

    interface FamilyMemberHistory extends model.FamilyMemberHistory {
        resourceType: "FamilyMemberHistory";
    }

    interface Flag extends model.Flag {
        resourceType: "Flag";
    }

    interface Goal extends model.Goal {
        resourceType: "Goal";
    }

    interface GraphDefinition extends model.GraphDefinition {
        resourceType: "GraphDefinition";
    }

    interface Group extends model.Group {
        resourceType: "Group";
    }

    interface GuidanceResponse extends model.GuidanceResponse {
        resourceType: "GuidanceResponse";
    }

    interface HealthcareService extends model.HealthcareService {
        resourceType: "HealthcareService";
    }

    interface ImagingStudy extends model.ImagingStudy {
        resourceType: "ImagingStudy";
    }

    interface Immunization extends model.Immunization {
        resourceType: "Immunization";
    }

    interface ImmunizationEvaluation extends model.ImmunizationEvaluation {
        resourceType: "ImmunizationEvaluation";
    }

    interface ImmunizationRecommendation
        extends model.ImmunizationRecommendation {
        resourceType: "ImmunizationRecommendation";
    }

    interface ImplementationGuide extends model.ImplementationGuide {
        resourceType: "ImplementationGuide";
    }

    interface InsurancePlan extends model.InsurancePlan {
        resourceType: "InsurancePlan";
    }

    interface Invoice extends model.Invoice {
        resourceType: "Invoice";
    }

    interface Library extends model.Library {
        resourceType: "Library";
    }

    interface Linkage extends model.Linkage {
        resourceType: "Linkage";
    }

    interface List extends model.List {
        resourceType: "List";
    }

    interface Location extends model.Location {
        resourceType: "Location";
    }

    interface Measure extends model.Measure {
        resourceType: "Measure";
    }

    interface MeasureReport extends model.MeasureReport {
        resourceType: "MeasureReport";
    }

    interface Media extends model.Media {
        resourceType: "Media";
    }

    interface Medication extends model.Medication {
        resourceType: "Medication";
    }

    interface MedicationAdministration extends model.MedicationAdministration {
        resourceType: "MedicationAdministration";
    }

    interface MedicationDispense extends model.MedicationDispense {
        resourceType: "MedicationDispense";
    }

    interface MedicationKnowledge extends model.MedicationKnowledge {
        resourceType: "MedicationKnowledge";
    }

    interface MedicationRequest extends model.MedicationRequest {
        resourceType: "MedicationRequest";
    }

    interface MedicationStatement extends model.MedicationStatement {
        resourceType: "MedicationStatement";
    }

    interface MedicinalProduct extends model.MedicinalProduct {
        resourceType: "MedicinalProduct";
    }

    interface MedicinalProductAuthorization
        extends model.MedicinalProductAuthorization {
        resourceType: "MedicinalProductAuthorization";
    }

    interface MedicinalProductContraindication
        extends model.MedicinalProductContraindication {
        resourceType: "MedicinalProductContraindication";
    }

    interface MedicinalProductIndication
        extends model.MedicinalProductIndication {
        resourceType: "MedicinalProductIndication";
    }

    interface MedicinalProductIngredient
        extends model.MedicinalProductIngredient {
        resourceType: "MedicinalProductIngredient";
    }

    interface MedicinalProductInteraction
        extends model.MedicinalProductInteraction {
        resourceType: "MedicinalProductInteraction";
    }

    interface MedicinalProductManufactured
        extends model.MedicinalProductManufactured {
        resourceType: "MedicinalProductManufactured";
    }

    interface MedicinalProductPackaged extends model.MedicinalProductPackaged {
        resourceType: "MedicinalProductPackaged";
    }

    interface MedicinalProductPharmaceutical
        extends model.MedicinalProductPharmaceutical {
        resourceType: "MedicinalProductPharmaceutical";
    }

    interface MedicinalProductUndesirableEffect
        extends model.MedicinalProductUndesirableEffect {
        resourceType: "MedicinalProductUndesirableEffect";
    }

    interface MessageDefinition extends model.MessageDefinition {
        resourceType: "MessageDefinition";
    }

    interface MessageHeader extends model.MessageHeader {
        resourceType: "MessageHeader";
    }

    interface MolecularSequence extends model.MolecularSequence {
        resourceType: "MolecularSequence";
    }

    interface NamingSystem extends model.NamingSystem {
        resourceType: "NamingSystem";
    }

    interface NutritionOrder extends model.NutritionOrder {
        resourceType: "NutritionOrder";
    }

    interface Observation extends model.Observation {
        resourceType: "Observation";
    }

    interface ObservationDefinition extends model.ObservationDefinition {
        resourceType: "ObservationDefinition";
    }

    interface OperationDefinition extends model.OperationDefinition {
        resourceType: "OperationDefinition";
    }

    interface OperationOutcome extends model.OperationOutcome {
        resourceType: "OperationOutcome";
    }

    interface Organization extends model.Organization {
        resourceType: "Organization";
    }

    interface OrganizationAffiliation extends model.OrganizationAffiliation {
        resourceType: "OrganizationAffiliation";
    }

    interface Parameters extends model.Parameters {
        resourceType: "Parameters";
    }

    interface Patient extends model.Patient {
        resourceType: "Patient";
    }

    interface PaymentNotice extends model.PaymentNotice {
        resourceType: "PaymentNotice";
    }

    interface PaymentReconciliation extends model.PaymentReconciliation {
        resourceType: "PaymentReconciliation";
    }

    interface Person extends model.Person {
        resourceType: "Person";
    }

    interface PlanDefinition extends model.PlanDefinition {
        resourceType: "PlanDefinition";
    }

    interface Practitioner extends model.Practitioner {
        resourceType: "Practitioner";
    }

    interface PractitionerRole extends model.PractitionerRole {
        resourceType: "PractitionerRole";
    }

    interface Procedure extends model.Procedure {
        resourceType: "Procedure";
    }

    interface Provenance extends model.Provenance {
        resourceType: "Provenance";
    }

    interface Questionnaire extends model.Questionnaire {
        resourceType: "Questionnaire";
    }

    interface QuestionnaireResponse extends model.QuestionnaireResponse {
        resourceType: "QuestionnaireResponse";
    }

    interface RelatedPerson extends model.RelatedPerson {
        resourceType: "RelatedPerson";
    }

    interface RequestGroup extends model.RequestGroup {
        resourceType: "RequestGroup";
    }

    interface ResearchDefinition extends model.ResearchDefinition {
        resourceType: "ResearchDefinition";
    }

    interface ResearchElementDefinition
        extends model.ResearchElementDefinition {
        resourceType: "ResearchElementDefinition";
    }

    interface ResearchStudy extends model.ResearchStudy {
        resourceType: "ResearchStudy";
    }

    interface ResearchSubject extends model.ResearchSubject {
        resourceType: "ResearchSubject";
    }

    interface RiskAssessment extends model.RiskAssessment {
        resourceType: "RiskAssessment";
    }

    interface RiskEvidenceSynthesis extends model.RiskEvidenceSynthesis {
        resourceType: "RiskEvidenceSynthesis";
    }

    interface Schedule extends model.Schedule {
        resourceType: "Schedule";
    }

    interface SearchParameter extends model.SearchParameter {
        resourceType: "SearchParameter";
    }

    interface ServiceRequest extends model.ServiceRequest {
        resourceType: "ServiceRequest";
    }

    interface Slot extends model.Slot {
        resourceType: "Slot";
    }

    interface Specimen extends model.Specimen {
        resourceType: "Specimen";
    }

    interface SpecimenDefinition extends model.SpecimenDefinition {
        resourceType: "SpecimenDefinition";
    }

    interface StructureDefinition extends model.StructureDefinition {
        resourceType: "StructureDefinition";
    }

    interface StructureMap extends model.StructureMap {
        resourceType: "StructureMap";
    }

    interface Subscription extends model.Subscription {
        resourceType: "Subscription";
    }

    interface Substance extends model.Substance {
        resourceType: "Substance";
    }

    interface SubstanceNucleicAcid extends model.SubstanceNucleicAcid {
        resourceType: "SubstanceNucleicAcid";
    }

    interface SubstancePolymer extends model.SubstancePolymer {
        resourceType: "SubstancePolymer";
    }

    interface SubstanceProtein extends model.SubstanceProtein {
        resourceType: "SubstanceProtein";
    }

    interface SubstanceReferenceInformation
        extends model.SubstanceReferenceInformation {
        resourceType: "SubstanceReferenceInformation";
    }

    interface SubstanceSourceMaterial extends model.SubstanceSourceMaterial {
        resourceType: "SubstanceSourceMaterial";
    }

    interface SubstanceSpecification extends model.SubstanceSpecification {
        resourceType: "SubstanceSpecification";
    }

    interface SupplyDelivery extends model.SupplyDelivery {
        resourceType: "SupplyDelivery";
    }

    interface SupplyRequest extends model.SupplyRequest {
        resourceType: "SupplyRequest";
    }

    interface Task extends model.Task {
        resourceType: "Task";
    }

    interface TerminologyCapabilities extends model.TerminologyCapabilities {
        resourceType: "TerminologyCapabilities";
    }

    interface TestReport extends model.TestReport {
        resourceType: "TestReport";
    }

    interface TestScript extends model.TestScript {
        resourceType: "TestScript";
    }

    interface ValueSet extends model.ValueSet {
        resourceType: "ValueSet";
    }

    interface VerificationResult extends model.VerificationResult {
        resourceType: "VerificationResult";
    }

    interface VisionPrescription extends model.VisionPrescription {
        resourceType: "VisionPrescription";
    }

    interface Project extends model.Project {
        resourceType: "Project";
    }

    interface ClientApplication extends model.ClientApplication {
        resourceType: "ClientApplication";
    }

    interface User extends model.User {
        resourceType: "User";
    }

    interface Login extends model.Login {
        resourceType: "Login";
    }

    interface RefreshToken {
        resourceType: "RefreshToken";
        RefreshToken: model.RefreshToken;
    }

    interface PasswordChangeRequest extends model.PasswordChangeRequest {
        resourceType: "PasswordChangeRequest";
    }

    interface JsonWebKey extends model.JsonWebKey {
        resourceType: "JsonWebKey";
    }

    interface Bot extends model.Bot {
        resourceType: "Bot";
    }

    interface AccessPolicy extends model.AccessPolicy {
        resourceType: "AccessPolicy";
    }

    interface UserConfiguration extends model.UserConfiguration {
        resourceType: "UserConfiguration";
    }

    export interface _Visitor<Result> {
        Account: (value: model.Account) => Result;
        ActivityDefinition: (value: model.ActivityDefinition) => Result;
        AdverseEvent: (value: model.AdverseEvent) => Result;
        AllergyIntolerance: (value: model.AllergyIntolerance) => Result;
        Appointment: (value: model.Appointment) => Result;
        AppointmentResponse: (value: model.AppointmentResponse) => Result;
        AuditEvent: (value: model.AuditEvent) => Result;
        Basic: (value: model.Basic) => Result;
        Binary: (value: model.Binary) => Result;
        BiologicallyDerivedProduct: (
            value: model.BiologicallyDerivedProduct
        ) => Result;
        BodyStructure: (value: model.BodyStructure) => Result;
        Bundle: (value: model.Bundle) => Result;
        CapabilityStatement: (value: model.CapabilityStatement) => Result;
        CarePlan: (value: model.CarePlan) => Result;
        CareTeam: (value: model.CareTeam) => Result;
        CatalogEntry: (value: model.CatalogEntry) => Result;
        ChargeItem: (value: model.ChargeItem) => Result;
        ChargeItemDefinition: (value: model.ChargeItemDefinition) => Result;
        Claim: (value: model.Claim) => Result;
        ClaimResponse: (value: model.ClaimResponse) => Result;
        ClinicalImpression: (value: model.ClinicalImpression) => Result;
        CodeSystem: (value: model.CodeSystem) => Result;
        Communication: (value: model.Communication) => Result;
        CommunicationRequest: (value: model.CommunicationRequest) => Result;
        CompartmentDefinition: (value: model.CompartmentDefinition) => Result;
        Composition: (value: model.Composition) => Result;
        ConceptMap: (value: model.ConceptMap) => Result;
        Condition: (value: model.Condition) => Result;
        Consent: (value: model.Consent) => Result;
        Contract: (value: model.Contract) => Result;
        Coverage: (value: model.Coverage) => Result;
        CoverageEligibilityRequest: (
            value: model.CoverageEligibilityRequest
        ) => Result;
        CoverageEligibilityResponse: (
            value: model.CoverageEligibilityResponse
        ) => Result;
        DetectedIssue: (value: model.DetectedIssue) => Result;
        Device: (value: model.Device) => Result;
        DeviceDefinition: (value: model.DeviceDefinition) => Result;
        DeviceMetric: (value: model.DeviceMetric) => Result;
        DeviceRequest: (value: model.DeviceRequest) => Result;
        DeviceUseStatement: (value: model.DeviceUseStatement) => Result;
        DiagnosticReport: (value: model.DiagnosticReport) => Result;
        DocumentManifest: (value: model.DocumentManifest) => Result;
        DocumentReference: (value: model.DocumentReference) => Result;
        EffectEvidenceSynthesis: (
            value: model.EffectEvidenceSynthesis
        ) => Result;
        Encounter: (value: model.Encounter) => Result;
        Endpoint: (value: model.Endpoint) => Result;
        EnrollmentRequest: (value: model.EnrollmentRequest) => Result;
        EnrollmentResponse: (value: model.EnrollmentResponse) => Result;
        EpisodeOfCare: (value: model.EpisodeOfCare) => Result;
        EventDefinition: (value: model.EventDefinition) => Result;
        Evidence: (value: model.Evidence) => Result;
        EvidenceVariable: (value: model.EvidenceVariable) => Result;
        ExampleScenario: (value: model.ExampleScenario) => Result;
        ExplanationOfBenefit: (value: model.ExplanationOfBenefit) => Result;
        FamilyMemberHistory: (value: model.FamilyMemberHistory) => Result;
        Flag: (value: model.Flag) => Result;
        Goal: (value: model.Goal) => Result;
        GraphDefinition: (value: model.GraphDefinition) => Result;
        Group: (value: model.Group) => Result;
        GuidanceResponse: (value: model.GuidanceResponse) => Result;
        HealthcareService: (value: model.HealthcareService) => Result;
        ImagingStudy: (value: model.ImagingStudy) => Result;
        Immunization: (value: model.Immunization) => Result;
        ImmunizationEvaluation: (value: model.ImmunizationEvaluation) => Result;
        ImmunizationRecommendation: (
            value: model.ImmunizationRecommendation
        ) => Result;
        ImplementationGuide: (value: model.ImplementationGuide) => Result;
        InsurancePlan: (value: model.InsurancePlan) => Result;
        Invoice: (value: model.Invoice) => Result;
        Library: (value: model.Library) => Result;
        Linkage: (value: model.Linkage) => Result;
        List: (value: model.List) => Result;
        Location: (value: model.Location) => Result;
        Measure: (value: model.Measure) => Result;
        MeasureReport: (value: model.MeasureReport) => Result;
        Media: (value: model.Media) => Result;
        Medication: (value: model.Medication) => Result;
        MedicationAdministration: (
            value: model.MedicationAdministration
        ) => Result;
        MedicationDispense: (value: model.MedicationDispense) => Result;
        MedicationKnowledge: (value: model.MedicationKnowledge) => Result;
        MedicationRequest: (value: model.MedicationRequest) => Result;
        MedicationStatement: (value: model.MedicationStatement) => Result;
        MedicinalProduct: (value: model.MedicinalProduct) => Result;
        MedicinalProductAuthorization: (
            value: model.MedicinalProductAuthorization
        ) => Result;
        MedicinalProductContraindication: (
            value: model.MedicinalProductContraindication
        ) => Result;
        MedicinalProductIndication: (
            value: model.MedicinalProductIndication
        ) => Result;
        MedicinalProductIngredient: (
            value: model.MedicinalProductIngredient
        ) => Result;
        MedicinalProductInteraction: (
            value: model.MedicinalProductInteraction
        ) => Result;
        MedicinalProductManufactured: (
            value: model.MedicinalProductManufactured
        ) => Result;
        MedicinalProductPackaged: (
            value: model.MedicinalProductPackaged
        ) => Result;
        MedicinalProductPharmaceutical: (
            value: model.MedicinalProductPharmaceutical
        ) => Result;
        MedicinalProductUndesirableEffect: (
            value: model.MedicinalProductUndesirableEffect
        ) => Result;
        MessageDefinition: (value: model.MessageDefinition) => Result;
        MessageHeader: (value: model.MessageHeader) => Result;
        MolecularSequence: (value: model.MolecularSequence) => Result;
        NamingSystem: (value: model.NamingSystem) => Result;
        NutritionOrder: (value: model.NutritionOrder) => Result;
        Observation: (value: model.Observation) => Result;
        ObservationDefinition: (value: model.ObservationDefinition) => Result;
        OperationDefinition: (value: model.OperationDefinition) => Result;
        OperationOutcome: (value: model.OperationOutcome) => Result;
        Organization: (value: model.Organization) => Result;
        OrganizationAffiliation: (
            value: model.OrganizationAffiliation
        ) => Result;
        Parameters: (value: model.Parameters) => Result;
        Patient: (value: model.Patient) => Result;
        PaymentNotice: (value: model.PaymentNotice) => Result;
        PaymentReconciliation: (value: model.PaymentReconciliation) => Result;
        Person: (value: model.Person) => Result;
        PlanDefinition: (value: model.PlanDefinition) => Result;
        Practitioner: (value: model.Practitioner) => Result;
        PractitionerRole: (value: model.PractitionerRole) => Result;
        Procedure: (value: model.Procedure) => Result;
        Provenance: (value: model.Provenance) => Result;
        Questionnaire: (value: model.Questionnaire) => Result;
        QuestionnaireResponse: (value: model.QuestionnaireResponse) => Result;
        RelatedPerson: (value: model.RelatedPerson) => Result;
        RequestGroup: (value: model.RequestGroup) => Result;
        ResearchDefinition: (value: model.ResearchDefinition) => Result;
        ResearchElementDefinition: (
            value: model.ResearchElementDefinition
        ) => Result;
        ResearchStudy: (value: model.ResearchStudy) => Result;
        ResearchSubject: (value: model.ResearchSubject) => Result;
        RiskAssessment: (value: model.RiskAssessment) => Result;
        RiskEvidenceSynthesis: (value: model.RiskEvidenceSynthesis) => Result;
        Schedule: (value: model.Schedule) => Result;
        SearchParameter: (value: model.SearchParameter) => Result;
        ServiceRequest: (value: model.ServiceRequest) => Result;
        Slot: (value: model.Slot) => Result;
        Specimen: (value: model.Specimen) => Result;
        SpecimenDefinition: (value: model.SpecimenDefinition) => Result;
        StructureDefinition: (value: model.StructureDefinition) => Result;
        StructureMap: (value: model.StructureMap) => Result;
        Subscription: (value: model.Subscription) => Result;
        Substance: (value: model.Substance) => Result;
        SubstanceNucleicAcid: (value: model.SubstanceNucleicAcid) => Result;
        SubstancePolymer: (value: model.SubstancePolymer) => Result;
        SubstanceProtein: (value: model.SubstanceProtein) => Result;
        SubstanceReferenceInformation: (
            value: model.SubstanceReferenceInformation
        ) => Result;
        SubstanceSourceMaterial: (
            value: model.SubstanceSourceMaterial
        ) => Result;
        SubstanceSpecification: (value: model.SubstanceSpecification) => Result;
        SupplyDelivery: (value: model.SupplyDelivery) => Result;
        SupplyRequest: (value: model.SupplyRequest) => Result;
        Task: (value: model.Task) => Result;
        TerminologyCapabilities: (
            value: model.TerminologyCapabilities
        ) => Result;
        TestReport: (value: model.TestReport) => Result;
        TestScript: (value: model.TestScript) => Result;
        ValueSet: (value: model.ValueSet) => Result;
        VerificationResult: (value: model.VerificationResult) => Result;
        VisionPrescription: (value: model.VisionPrescription) => Result;
        Project: (value: model.Project) => Result;
        ClientApplication: (value: model.ClientApplication) => Result;
        User: (value: model.User) => Result;
        Login: (value: model.Login) => Result;
        RefreshToken: (value: model.RefreshToken) => Result;
        PasswordChangeRequest: (value: model.PasswordChangeRequest) => Result;
        JsonWebKey: (value: model.JsonWebKey) => Result;
        Bot: (value: model.Bot) => Result;
        AccessPolicy: (value: model.AccessPolicy) => Result;
        UserConfiguration: (value: model.UserConfiguration) => Result;
        _unknown: () => Result;
    }
}

export const ResourceList = {
    Account: (value: model.Account): ResourceList.Account => ({
        ...value,
        resourceType: "Account",
    }),

    ActivityDefinition: (
        value: model.ActivityDefinition
    ): ResourceList.ActivityDefinition => ({
        ...value,
        resourceType: "ActivityDefinition",
    }),

    AdverseEvent: (value: model.AdverseEvent): ResourceList.AdverseEvent => ({
        ...value,
        resourceType: "AdverseEvent",
    }),

    AllergyIntolerance: (
        value: model.AllergyIntolerance
    ): ResourceList.AllergyIntolerance => ({
        ...value,
        resourceType: "AllergyIntolerance",
    }),

    Appointment: (value: model.Appointment): ResourceList.Appointment => ({
        ...value,
        resourceType: "Appointment",
    }),

    AppointmentResponse: (
        value: model.AppointmentResponse
    ): ResourceList.AppointmentResponse => ({
        ...value,
        resourceType: "AppointmentResponse",
    }),

    AuditEvent: (value: model.AuditEvent): ResourceList.AuditEvent => ({
        ...value,
        resourceType: "AuditEvent",
    }),

    Basic: (value: model.Basic): ResourceList.Basic => ({
        ...value,
        resourceType: "Basic",
    }),

    Binary: (value: model.Binary): ResourceList.Binary => ({
        ...value,
        resourceType: "Binary",
    }),

    BiologicallyDerivedProduct: (
        value: model.BiologicallyDerivedProduct
    ): ResourceList.BiologicallyDerivedProduct => ({
        ...value,
        resourceType: "BiologicallyDerivedProduct",
    }),

    BodyStructure: (
        value: model.BodyStructure
    ): ResourceList.BodyStructure => ({
        ...value,
        resourceType: "BodyStructure",
    }),

    Bundle: (value: model.Bundle): ResourceList.Bundle => ({
        ...value,
        resourceType: "Bundle",
    }),

    CapabilityStatement: (
        value: model.CapabilityStatement
    ): ResourceList.CapabilityStatement => ({
        ...value,
        resourceType: "CapabilityStatement",
    }),

    CarePlan: (value: model.CarePlan): ResourceList.CarePlan => ({
        ...value,
        resourceType: "CarePlan",
    }),

    CareTeam: (value: model.CareTeam): ResourceList.CareTeam => ({
        ...value,
        resourceType: "CareTeam",
    }),

    CatalogEntry: (value: model.CatalogEntry): ResourceList.CatalogEntry => ({
        ...value,
        resourceType: "CatalogEntry",
    }),

    ChargeItem: (value: model.ChargeItem): ResourceList.ChargeItem => ({
        ...value,
        resourceType: "ChargeItem",
    }),

    ChargeItemDefinition: (
        value: model.ChargeItemDefinition
    ): ResourceList.ChargeItemDefinition => ({
        ...value,
        resourceType: "ChargeItemDefinition",
    }),

    Claim: (value: model.Claim): ResourceList.Claim => ({
        ...value,
        resourceType: "Claim",
    }),

    ClaimResponse: (
        value: model.ClaimResponse
    ): ResourceList.ClaimResponse => ({
        ...value,
        resourceType: "ClaimResponse",
    }),

    ClinicalImpression: (
        value: model.ClinicalImpression
    ): ResourceList.ClinicalImpression => ({
        ...value,
        resourceType: "ClinicalImpression",
    }),

    CodeSystem: (value: model.CodeSystem): ResourceList.CodeSystem => ({
        ...value,
        resourceType: "CodeSystem",
    }),

    Communication: (
        value: model.Communication
    ): ResourceList.Communication => ({
        ...value,
        resourceType: "Communication",
    }),

    CommunicationRequest: (
        value: model.CommunicationRequest
    ): ResourceList.CommunicationRequest => ({
        ...value,
        resourceType: "CommunicationRequest",
    }),

    CompartmentDefinition: (
        value: model.CompartmentDefinition
    ): ResourceList.CompartmentDefinition => ({
        ...value,
        resourceType: "CompartmentDefinition",
    }),

    Composition: (value: model.Composition): ResourceList.Composition => ({
        ...value,
        resourceType: "Composition",
    }),

    ConceptMap: (value: model.ConceptMap): ResourceList.ConceptMap => ({
        ...value,
        resourceType: "ConceptMap",
    }),

    Condition: (value: model.Condition): ResourceList.Condition => ({
        ...value,
        resourceType: "Condition",
    }),

    Consent: (value: model.Consent): ResourceList.Consent => ({
        ...value,
        resourceType: "Consent",
    }),

    Contract: (value: model.Contract): ResourceList.Contract => ({
        ...value,
        resourceType: "Contract",
    }),

    Coverage: (value: model.Coverage): ResourceList.Coverage => ({
        ...value,
        resourceType: "Coverage",
    }),

    CoverageEligibilityRequest: (
        value: model.CoverageEligibilityRequest
    ): ResourceList.CoverageEligibilityRequest => ({
        ...value,
        resourceType: "CoverageEligibilityRequest",
    }),

    CoverageEligibilityResponse: (
        value: model.CoverageEligibilityResponse
    ): ResourceList.CoverageEligibilityResponse => ({
        ...value,
        resourceType: "CoverageEligibilityResponse",
    }),

    DetectedIssue: (
        value: model.DetectedIssue
    ): ResourceList.DetectedIssue => ({
        ...value,
        resourceType: "DetectedIssue",
    }),

    Device: (value: model.Device): ResourceList.Device => ({
        ...value,
        resourceType: "Device",
    }),

    DeviceDefinition: (
        value: model.DeviceDefinition
    ): ResourceList.DeviceDefinition => ({
        ...value,
        resourceType: "DeviceDefinition",
    }),

    DeviceMetric: (value: model.DeviceMetric): ResourceList.DeviceMetric => ({
        ...value,
        resourceType: "DeviceMetric",
    }),

    DeviceRequest: (
        value: model.DeviceRequest
    ): ResourceList.DeviceRequest => ({
        ...value,
        resourceType: "DeviceRequest",
    }),

    DeviceUseStatement: (
        value: model.DeviceUseStatement
    ): ResourceList.DeviceUseStatement => ({
        ...value,
        resourceType: "DeviceUseStatement",
    }),

    DiagnosticReport: (
        value: model.DiagnosticReport
    ): ResourceList.DiagnosticReport => ({
        ...value,
        resourceType: "DiagnosticReport",
    }),

    DocumentManifest: (
        value: model.DocumentManifest
    ): ResourceList.DocumentManifest => ({
        ...value,
        resourceType: "DocumentManifest",
    }),

    DocumentReference: (
        value: model.DocumentReference
    ): ResourceList.DocumentReference => ({
        ...value,
        resourceType: "DocumentReference",
    }),

    EffectEvidenceSynthesis: (
        value: model.EffectEvidenceSynthesis
    ): ResourceList.EffectEvidenceSynthesis => ({
        ...value,
        resourceType: "EffectEvidenceSynthesis",
    }),

    Encounter: (value: model.Encounter): ResourceList.Encounter => ({
        ...value,
        resourceType: "Encounter",
    }),

    Endpoint: (value: model.Endpoint): ResourceList.Endpoint => ({
        ...value,
        resourceType: "Endpoint",
    }),

    EnrollmentRequest: (
        value: model.EnrollmentRequest
    ): ResourceList.EnrollmentRequest => ({
        ...value,
        resourceType: "EnrollmentRequest",
    }),

    EnrollmentResponse: (
        value: model.EnrollmentResponse
    ): ResourceList.EnrollmentResponse => ({
        ...value,
        resourceType: "EnrollmentResponse",
    }),

    EpisodeOfCare: (
        value: model.EpisodeOfCare
    ): ResourceList.EpisodeOfCare => ({
        ...value,
        resourceType: "EpisodeOfCare",
    }),

    EventDefinition: (
        value: model.EventDefinition
    ): ResourceList.EventDefinition => ({
        ...value,
        resourceType: "EventDefinition",
    }),

    Evidence: (value: model.Evidence): ResourceList.Evidence => ({
        ...value,
        resourceType: "Evidence",
    }),

    EvidenceVariable: (
        value: model.EvidenceVariable
    ): ResourceList.EvidenceVariable => ({
        ...value,
        resourceType: "EvidenceVariable",
    }),

    ExampleScenario: (
        value: model.ExampleScenario
    ): ResourceList.ExampleScenario => ({
        ...value,
        resourceType: "ExampleScenario",
    }),

    ExplanationOfBenefit: (
        value: model.ExplanationOfBenefit
    ): ResourceList.ExplanationOfBenefit => ({
        ...value,
        resourceType: "ExplanationOfBenefit",
    }),

    FamilyMemberHistory: (
        value: model.FamilyMemberHistory
    ): ResourceList.FamilyMemberHistory => ({
        ...value,
        resourceType: "FamilyMemberHistory",
    }),

    Flag: (value: model.Flag): ResourceList.Flag => ({
        ...value,
        resourceType: "Flag",
    }),

    Goal: (value: model.Goal): ResourceList.Goal => ({
        ...value,
        resourceType: "Goal",
    }),

    GraphDefinition: (
        value: model.GraphDefinition
    ): ResourceList.GraphDefinition => ({
        ...value,
        resourceType: "GraphDefinition",
    }),

    Group: (value: model.Group): ResourceList.Group => ({
        ...value,
        resourceType: "Group",
    }),

    GuidanceResponse: (
        value: model.GuidanceResponse
    ): ResourceList.GuidanceResponse => ({
        ...value,
        resourceType: "GuidanceResponse",
    }),

    HealthcareService: (
        value: model.HealthcareService
    ): ResourceList.HealthcareService => ({
        ...value,
        resourceType: "HealthcareService",
    }),

    ImagingStudy: (value: model.ImagingStudy): ResourceList.ImagingStudy => ({
        ...value,
        resourceType: "ImagingStudy",
    }),

    Immunization: (value: model.Immunization): ResourceList.Immunization => ({
        ...value,
        resourceType: "Immunization",
    }),

    ImmunizationEvaluation: (
        value: model.ImmunizationEvaluation
    ): ResourceList.ImmunizationEvaluation => ({
        ...value,
        resourceType: "ImmunizationEvaluation",
    }),

    ImmunizationRecommendation: (
        value: model.ImmunizationRecommendation
    ): ResourceList.ImmunizationRecommendation => ({
        ...value,
        resourceType: "ImmunizationRecommendation",
    }),

    ImplementationGuide: (
        value: model.ImplementationGuide
    ): ResourceList.ImplementationGuide => ({
        ...value,
        resourceType: "ImplementationGuide",
    }),

    InsurancePlan: (
        value: model.InsurancePlan
    ): ResourceList.InsurancePlan => ({
        ...value,
        resourceType: "InsurancePlan",
    }),

    Invoice: (value: model.Invoice): ResourceList.Invoice => ({
        ...value,
        resourceType: "Invoice",
    }),

    Library: (value: model.Library): ResourceList.Library => ({
        ...value,
        resourceType: "Library",
    }),

    Linkage: (value: model.Linkage): ResourceList.Linkage => ({
        ...value,
        resourceType: "Linkage",
    }),

    List: (value: model.List): ResourceList.List => ({
        ...value,
        resourceType: "List",
    }),

    Location: (value: model.Location): ResourceList.Location => ({
        ...value,
        resourceType: "Location",
    }),

    Measure: (value: model.Measure): ResourceList.Measure => ({
        ...value,
        resourceType: "Measure",
    }),

    MeasureReport: (
        value: model.MeasureReport
    ): ResourceList.MeasureReport => ({
        ...value,
        resourceType: "MeasureReport",
    }),

    Media: (value: model.Media): ResourceList.Media => ({
        ...value,
        resourceType: "Media",
    }),

    Medication: (value: model.Medication): ResourceList.Medication => ({
        ...value,
        resourceType: "Medication",
    }),

    MedicationAdministration: (
        value: model.MedicationAdministration
    ): ResourceList.MedicationAdministration => ({
        ...value,
        resourceType: "MedicationAdministration",
    }),

    MedicationDispense: (
        value: model.MedicationDispense
    ): ResourceList.MedicationDispense => ({
        ...value,
        resourceType: "MedicationDispense",
    }),

    MedicationKnowledge: (
        value: model.MedicationKnowledge
    ): ResourceList.MedicationKnowledge => ({
        ...value,
        resourceType: "MedicationKnowledge",
    }),

    MedicationRequest: (
        value: model.MedicationRequest
    ): ResourceList.MedicationRequest => ({
        ...value,
        resourceType: "MedicationRequest",
    }),

    MedicationStatement: (
        value: model.MedicationStatement
    ): ResourceList.MedicationStatement => ({
        ...value,
        resourceType: "MedicationStatement",
    }),

    MedicinalProduct: (
        value: model.MedicinalProduct
    ): ResourceList.MedicinalProduct => ({
        ...value,
        resourceType: "MedicinalProduct",
    }),

    MedicinalProductAuthorization: (
        value: model.MedicinalProductAuthorization
    ): ResourceList.MedicinalProductAuthorization => ({
        ...value,
        resourceType: "MedicinalProductAuthorization",
    }),

    MedicinalProductContraindication: (
        value: model.MedicinalProductContraindication
    ): ResourceList.MedicinalProductContraindication => ({
        ...value,
        resourceType: "MedicinalProductContraindication",
    }),

    MedicinalProductIndication: (
        value: model.MedicinalProductIndication
    ): ResourceList.MedicinalProductIndication => ({
        ...value,
        resourceType: "MedicinalProductIndication",
    }),

    MedicinalProductIngredient: (
        value: model.MedicinalProductIngredient
    ): ResourceList.MedicinalProductIngredient => ({
        ...value,
        resourceType: "MedicinalProductIngredient",
    }),

    MedicinalProductInteraction: (
        value: model.MedicinalProductInteraction
    ): ResourceList.MedicinalProductInteraction => ({
        ...value,
        resourceType: "MedicinalProductInteraction",
    }),

    MedicinalProductManufactured: (
        value: model.MedicinalProductManufactured
    ): ResourceList.MedicinalProductManufactured => ({
        ...value,
        resourceType: "MedicinalProductManufactured",
    }),

    MedicinalProductPackaged: (
        value: model.MedicinalProductPackaged
    ): ResourceList.MedicinalProductPackaged => ({
        ...value,
        resourceType: "MedicinalProductPackaged",
    }),

    MedicinalProductPharmaceutical: (
        value: model.MedicinalProductPharmaceutical
    ): ResourceList.MedicinalProductPharmaceutical => ({
        ...value,
        resourceType: "MedicinalProductPharmaceutical",
    }),

    MedicinalProductUndesirableEffect: (
        value: model.MedicinalProductUndesirableEffect
    ): ResourceList.MedicinalProductUndesirableEffect => ({
        ...value,
        resourceType: "MedicinalProductUndesirableEffect",
    }),

    MessageDefinition: (
        value: model.MessageDefinition
    ): ResourceList.MessageDefinition => ({
        ...value,
        resourceType: "MessageDefinition",
    }),

    MessageHeader: (
        value: model.MessageHeader
    ): ResourceList.MessageHeader => ({
        ...value,
        resourceType: "MessageHeader",
    }),

    MolecularSequence: (
        value: model.MolecularSequence
    ): ResourceList.MolecularSequence => ({
        ...value,
        resourceType: "MolecularSequence",
    }),

    NamingSystem: (value: model.NamingSystem): ResourceList.NamingSystem => ({
        ...value,
        resourceType: "NamingSystem",
    }),

    NutritionOrder: (
        value: model.NutritionOrder
    ): ResourceList.NutritionOrder => ({
        ...value,
        resourceType: "NutritionOrder",
    }),

    Observation: (value: model.Observation): ResourceList.Observation => ({
        ...value,
        resourceType: "Observation",
    }),

    ObservationDefinition: (
        value: model.ObservationDefinition
    ): ResourceList.ObservationDefinition => ({
        ...value,
        resourceType: "ObservationDefinition",
    }),

    OperationDefinition: (
        value: model.OperationDefinition
    ): ResourceList.OperationDefinition => ({
        ...value,
        resourceType: "OperationDefinition",
    }),

    OperationOutcome: (
        value: model.OperationOutcome
    ): ResourceList.OperationOutcome => ({
        ...value,
        resourceType: "OperationOutcome",
    }),

    Organization: (value: model.Organization): ResourceList.Organization => ({
        ...value,
        resourceType: "Organization",
    }),

    OrganizationAffiliation: (
        value: model.OrganizationAffiliation
    ): ResourceList.OrganizationAffiliation => ({
        ...value,
        resourceType: "OrganizationAffiliation",
    }),

    Parameters: (value: model.Parameters): ResourceList.Parameters => ({
        ...value,
        resourceType: "Parameters",
    }),

    Patient: (value: model.Patient): ResourceList.Patient => ({
        ...value,
        resourceType: "Patient",
    }),

    PaymentNotice: (
        value: model.PaymentNotice
    ): ResourceList.PaymentNotice => ({
        ...value,
        resourceType: "PaymentNotice",
    }),

    PaymentReconciliation: (
        value: model.PaymentReconciliation
    ): ResourceList.PaymentReconciliation => ({
        ...value,
        resourceType: "PaymentReconciliation",
    }),

    Person: (value: model.Person): ResourceList.Person => ({
        ...value,
        resourceType: "Person",
    }),

    PlanDefinition: (
        value: model.PlanDefinition
    ): ResourceList.PlanDefinition => ({
        ...value,
        resourceType: "PlanDefinition",
    }),

    Practitioner: (value: model.Practitioner): ResourceList.Practitioner => ({
        ...value,
        resourceType: "Practitioner",
    }),

    PractitionerRole: (
        value: model.PractitionerRole
    ): ResourceList.PractitionerRole => ({
        ...value,
        resourceType: "PractitionerRole",
    }),

    Procedure: (value: model.Procedure): ResourceList.Procedure => ({
        ...value,
        resourceType: "Procedure",
    }),

    Provenance: (value: model.Provenance): ResourceList.Provenance => ({
        ...value,
        resourceType: "Provenance",
    }),

    Questionnaire: (
        value: model.Questionnaire
    ): ResourceList.Questionnaire => ({
        ...value,
        resourceType: "Questionnaire",
    }),

    QuestionnaireResponse: (
        value: model.QuestionnaireResponse
    ): ResourceList.QuestionnaireResponse => ({
        ...value,
        resourceType: "QuestionnaireResponse",
    }),

    RelatedPerson: (
        value: model.RelatedPerson
    ): ResourceList.RelatedPerson => ({
        ...value,
        resourceType: "RelatedPerson",
    }),

    RequestGroup: (value: model.RequestGroup): ResourceList.RequestGroup => ({
        ...value,
        resourceType: "RequestGroup",
    }),

    ResearchDefinition: (
        value: model.ResearchDefinition
    ): ResourceList.ResearchDefinition => ({
        ...value,
        resourceType: "ResearchDefinition",
    }),

    ResearchElementDefinition: (
        value: model.ResearchElementDefinition
    ): ResourceList.ResearchElementDefinition => ({
        ...value,
        resourceType: "ResearchElementDefinition",
    }),

    ResearchStudy: (
        value: model.ResearchStudy
    ): ResourceList.ResearchStudy => ({
        ...value,
        resourceType: "ResearchStudy",
    }),

    ResearchSubject: (
        value: model.ResearchSubject
    ): ResourceList.ResearchSubject => ({
        ...value,
        resourceType: "ResearchSubject",
    }),

    RiskAssessment: (
        value: model.RiskAssessment
    ): ResourceList.RiskAssessment => ({
        ...value,
        resourceType: "RiskAssessment",
    }),

    RiskEvidenceSynthesis: (
        value: model.RiskEvidenceSynthesis
    ): ResourceList.RiskEvidenceSynthesis => ({
        ...value,
        resourceType: "RiskEvidenceSynthesis",
    }),

    Schedule: (value: model.Schedule): ResourceList.Schedule => ({
        ...value,
        resourceType: "Schedule",
    }),

    SearchParameter: (
        value: model.SearchParameter
    ): ResourceList.SearchParameter => ({
        ...value,
        resourceType: "SearchParameter",
    }),

    ServiceRequest: (
        value: model.ServiceRequest
    ): ResourceList.ServiceRequest => ({
        ...value,
        resourceType: "ServiceRequest",
    }),

    Slot: (value: model.Slot): ResourceList.Slot => ({
        ...value,
        resourceType: "Slot",
    }),

    Specimen: (value: model.Specimen): ResourceList.Specimen => ({
        ...value,
        resourceType: "Specimen",
    }),

    SpecimenDefinition: (
        value: model.SpecimenDefinition
    ): ResourceList.SpecimenDefinition => ({
        ...value,
        resourceType: "SpecimenDefinition",
    }),

    StructureDefinition: (
        value: model.StructureDefinition
    ): ResourceList.StructureDefinition => ({
        ...value,
        resourceType: "StructureDefinition",
    }),

    StructureMap: (value: model.StructureMap): ResourceList.StructureMap => ({
        ...value,
        resourceType: "StructureMap",
    }),

    Subscription: (value: model.Subscription): ResourceList.Subscription => ({
        ...value,
        resourceType: "Subscription",
    }),

    Substance: (value: model.Substance): ResourceList.Substance => ({
        ...value,
        resourceType: "Substance",
    }),

    SubstanceNucleicAcid: (
        value: model.SubstanceNucleicAcid
    ): ResourceList.SubstanceNucleicAcid => ({
        ...value,
        resourceType: "SubstanceNucleicAcid",
    }),

    SubstancePolymer: (
        value: model.SubstancePolymer
    ): ResourceList.SubstancePolymer => ({
        ...value,
        resourceType: "SubstancePolymer",
    }),

    SubstanceProtein: (
        value: model.SubstanceProtein
    ): ResourceList.SubstanceProtein => ({
        ...value,
        resourceType: "SubstanceProtein",
    }),

    SubstanceReferenceInformation: (
        value: model.SubstanceReferenceInformation
    ): ResourceList.SubstanceReferenceInformation => ({
        ...value,
        resourceType: "SubstanceReferenceInformation",
    }),

    SubstanceSourceMaterial: (
        value: model.SubstanceSourceMaterial
    ): ResourceList.SubstanceSourceMaterial => ({
        ...value,
        resourceType: "SubstanceSourceMaterial",
    }),

    SubstanceSpecification: (
        value: model.SubstanceSpecification
    ): ResourceList.SubstanceSpecification => ({
        ...value,
        resourceType: "SubstanceSpecification",
    }),

    SupplyDelivery: (
        value: model.SupplyDelivery
    ): ResourceList.SupplyDelivery => ({
        ...value,
        resourceType: "SupplyDelivery",
    }),

    SupplyRequest: (
        value: model.SupplyRequest
    ): ResourceList.SupplyRequest => ({
        ...value,
        resourceType: "SupplyRequest",
    }),

    Task: (value: model.Task): ResourceList.Task => ({
        ...value,
        resourceType: "Task",
    }),

    TerminologyCapabilities: (
        value: model.TerminologyCapabilities
    ): ResourceList.TerminologyCapabilities => ({
        ...value,
        resourceType: "TerminologyCapabilities",
    }),

    TestReport: (value: model.TestReport): ResourceList.TestReport => ({
        ...value,
        resourceType: "TestReport",
    }),

    TestScript: (value: model.TestScript): ResourceList.TestScript => ({
        ...value,
        resourceType: "TestScript",
    }),

    ValueSet: (value: model.ValueSet): ResourceList.ValueSet => ({
        ...value,
        resourceType: "ValueSet",
    }),

    VerificationResult: (
        value: model.VerificationResult
    ): ResourceList.VerificationResult => ({
        ...value,
        resourceType: "VerificationResult",
    }),

    VisionPrescription: (
        value: model.VisionPrescription
    ): ResourceList.VisionPrescription => ({
        ...value,
        resourceType: "VisionPrescription",
    }),

    Project: (value: model.Project): ResourceList.Project => ({
        ...value,
        resourceType: "Project",
    }),

    ClientApplication: (
        value: model.ClientApplication
    ): ResourceList.ClientApplication => ({
        ...value,
        resourceType: "ClientApplication",
    }),

    User: (value: model.User): ResourceList.User => ({
        ...value,
        resourceType: "User",
    }),

    Login: (value: model.Login): ResourceList.Login => ({
        ...value,
        resourceType: "Login",
    }),

    RefreshToken: (value: model.RefreshToken): ResourceList.RefreshToken => ({
        RefreshToken: value,
        resourceType: "RefreshToken",
    }),

    PasswordChangeRequest: (
        value: model.PasswordChangeRequest
    ): ResourceList.PasswordChangeRequest => ({
        ...value,
        resourceType: "PasswordChangeRequest",
    }),

    JsonWebKey: (value: model.JsonWebKey): ResourceList.JsonWebKey => ({
        ...value,
        resourceType: "JsonWebKey",
    }),

    Bot: (value: model.Bot): ResourceList.Bot => ({
        ...value,
        resourceType: "Bot",
    }),

    AccessPolicy: (value: model.AccessPolicy): ResourceList.AccessPolicy => ({
        ...value,
        resourceType: "AccessPolicy",
    }),

    UserConfiguration: (
        value: model.UserConfiguration
    ): ResourceList.UserConfiguration => ({
        ...value,
        resourceType: "UserConfiguration",
    }),

    _visit: <Result>(
        value: ResourceList,
        visitor: ResourceList._Visitor<Result>
    ): Result => {
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
