//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicationKnowledge}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge.builder()}.
 */
@org.immutables.value.Generated(from = "MedicationKnowledge", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge implements com.fhir.MedicationKnowledge {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> contraindication;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Cost> cost;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Regulatory> regulatory;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> administrationGuidelines;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> productType;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept doseForm;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Ingredient> ingredient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> intendedRoute;
  private final @javax.annotation.Nullable com.fhir.Reference manufacturer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> associatedMedication;
  private final @javax.annotation.Nullable com.fhir.MedicationKnowledge_Packaging packaging;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> monitoringProgram;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> medicineClassification;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> synonym;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Monograph> monograph;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Kinetics> kinetics;
  private final @javax.annotation.Nullable com.fhir.Quantity amount;
  private final @javax.annotation.Nullable com.fhir.markdown preparationInstruction;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> drugCharacteristic;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableMedicationKnowledge(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> contraindication,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Cost> cost,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Regulatory> regulatory,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> administrationGuidelines,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> productType,
      @javax.annotation.Nullable com.fhir.CodeableConcept doseForm,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Ingredient> ingredient,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> intendedRoute,
      @javax.annotation.Nullable com.fhir.Reference manufacturer,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> associatedMedication,
      @javax.annotation.Nullable com.fhir.MedicationKnowledge_Packaging packaging,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> monitoringProgram,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> medicineClassification,
      @javax.annotation.Nullable java.util.List<java.lang.String> synonym,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Monograph> monograph,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Kinetics> kinetics,
      @javax.annotation.Nullable com.fhir.Quantity amount,
      @javax.annotation.Nullable com.fhir.markdown preparationInstruction,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> drugCharacteristic,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.language = language;
    this.contraindication = contraindication;
    this.id = id;
    this.extension = extension;
    this.status = status;
    this.cost = cost;
    this.regulatory = regulatory;
    this.text = text;
    this.administrationGuidelines = administrationGuidelines;
    this.resourceType = resourceType;
    this.productType = productType;
    this.doseForm = doseForm;
    this.ingredient = ingredient;
    this.contained = contained;
    this.intendedRoute = intendedRoute;
    this.manufacturer = manufacturer;
    this.associatedMedication = associatedMedication;
    this.packaging = packaging;
    this.monitoringProgram = monitoringProgram;
    this.medicineClassification = medicineClassification;
    this.synonym = synonym;
    this.monograph = monograph;
    this.kinetics = kinetics;
    this.amount = amount;
    this.preparationInstruction = preparationInstruction;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.code = code;
    this.drugCharacteristic = drugCharacteristic;
    this.relatedMedicationKnowledge = relatedMedicationKnowledge;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code contraindication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contraindication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> contraindication() {
    return java.util.Optional.ofNullable(contraindication);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code cost} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cost")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Cost>> cost() {
    return java.util.Optional.ofNullable(cost);
  }

  /**
   * @return The value of the {@code regulatory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("regulatory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Regulatory>> regulatory() {
    return java.util.Optional.ofNullable(regulatory);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code administrationGuidelines} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("administrationGuidelines")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines() {
    return java.util.Optional.ofNullable(administrationGuidelines);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code productType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productType() {
    return java.util.Optional.ofNullable(productType);
  }

  /**
   * @return The value of the {@code doseForm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doseForm")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> doseForm() {
    return java.util.Optional.ofNullable(doseForm);
  }

  /**
   * @return The value of the {@code ingredient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Ingredient>> ingredient() {
    return java.util.Optional.ofNullable(ingredient);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code intendedRoute} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intendedRoute")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> intendedRoute() {
    return java.util.Optional.ofNullable(intendedRoute);
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @Override
  public java.util.Optional<com.fhir.Reference> manufacturer() {
    return java.util.Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code associatedMedication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("associatedMedication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> associatedMedication() {
    return java.util.Optional.ofNullable(associatedMedication);
  }

  /**
   * @return The value of the {@code packaging} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("packaging")
  @Override
  public java.util.Optional<com.fhir.MedicationKnowledge_Packaging> packaging() {
    return java.util.Optional.ofNullable(packaging);
  }

  /**
   * @return The value of the {@code monitoringProgram} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("monitoringProgram")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram>> monitoringProgram() {
    return java.util.Optional.ofNullable(monitoringProgram);
  }

  /**
   * @return The value of the {@code medicineClassification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medicineClassification")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MedicineClassification>> medicineClassification() {
    return java.util.Optional.ofNullable(medicineClassification);
  }

  /**
   * @return The value of the {@code synonym} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("synonym")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> synonym() {
    return java.util.Optional.ofNullable(synonym);
  }

  /**
   * @return The value of the {@code monograph} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("monograph")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Monograph>> monograph() {
    return java.util.Optional.ofNullable(monograph);
  }

  /**
   * @return The value of the {@code kinetics} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kinetics")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Kinetics>> kinetics() {
    return java.util.Optional.ofNullable(kinetics);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("amount")
  @Override
  public java.util.Optional<com.fhir.Quantity> amount() {
    return java.util.Optional.ofNullable(amount);
  }

  /**
   * @return The value of the {@code preparationInstruction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preparationInstruction")
  @Override
  public java.util.Optional<com.fhir.markdown> preparationInstruction() {
    return java.util.Optional.ofNullable(preparationInstruction);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code drugCharacteristic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("drugCharacteristic")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic>> drugCharacteristic() {
    return java.util.Optional.ofNullable(drugCharacteristic);
  }

  /**
   * @return The value of the {@code relatedMedicationKnowledge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedMedicationKnowledge")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge() {
    return java.util.Optional.ofNullable(relatedMedicationKnowledge);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationKnowledge(
        newValue,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationKnowledge(
        value,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#contraindication() contraindication} attribute.
   * @param value The value for contraindication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withContraindication(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "contraindication");
    if (this.contraindication == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        newValue,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#contraindication() contraindication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contraindication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withContraindication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.contraindication == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        value,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        newValue,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        value,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        newValue,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        value,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        newValue,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        value,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#cost() cost} attribute.
   * @param value The value for cost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withCost(java.util.List<com.fhir.MedicationKnowledge_Cost> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Cost> newValue = java.util.Objects.requireNonNull(value, "cost");
    if (this.cost == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        newValue,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#cost() cost} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cost
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withCost(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Cost>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Cost> value = optional.orElse(null);
    if (this.cost == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        value,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#regulatory() regulatory} attribute.
   * @param value The value for regulatory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withRegulatory(java.util.List<com.fhir.MedicationKnowledge_Regulatory> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Regulatory> newValue = java.util.Objects.requireNonNull(value, "regulatory");
    if (this.regulatory == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        newValue,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#regulatory() regulatory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for regulatory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withRegulatory(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Regulatory>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Regulatory> value = optional.orElse(null);
    if (this.regulatory == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        value,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        newValue,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        value,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} attribute.
   * @param value The value for administrationGuidelines
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withAdministrationGuidelines(java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> newValue = java.util.Objects.requireNonNull(value, "administrationGuidelines");
    if (this.administrationGuidelines == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        newValue,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for administrationGuidelines
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withAdministrationGuidelines(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> value = optional.orElse(null);
    if (this.administrationGuidelines == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        value,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationKnowledge#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationKnowledge withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        newValue,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#productType() productType} attribute.
   * @param value The value for productType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withProductType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "productType");
    if (this.productType == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        newValue,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#productType() productType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withProductType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.productType == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        value,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#doseForm() doseForm} attribute.
   * @param value The value for doseForm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withDoseForm(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "doseForm");
    if (this.doseForm == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        newValue,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#doseForm() doseForm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseForm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withDoseForm(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.doseForm == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        value,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withIngredient(java.util.List<com.fhir.MedicationKnowledge_Ingredient> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Ingredient> newValue = java.util.Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        newValue,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withIngredient(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Ingredient>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Ingredient> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        value,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        newValue,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        value,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#intendedRoute() intendedRoute} attribute.
   * @param value The value for intendedRoute
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withIntendedRoute(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "intendedRoute");
    if (this.intendedRoute == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        newValue,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#intendedRoute() intendedRoute} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intendedRoute
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withIntendedRoute(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.intendedRoute == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        value,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withManufacturer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        newValue,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withManufacturer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        value,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#associatedMedication() associatedMedication} attribute.
   * @param value The value for associatedMedication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withAssociatedMedication(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "associatedMedication");
    if (this.associatedMedication == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        newValue,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#associatedMedication() associatedMedication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for associatedMedication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withAssociatedMedication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.associatedMedication == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        value,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#packaging() packaging} attribute.
   * @param value The value for packaging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withPackaging(com.fhir.MedicationKnowledge_Packaging value) {
    @javax.annotation.Nullable com.fhir.MedicationKnowledge_Packaging newValue = java.util.Objects.requireNonNull(value, "packaging");
    if (this.packaging == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        newValue,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#packaging() packaging} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packaging
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withPackaging(java.util.Optional<? extends com.fhir.MedicationKnowledge_Packaging> optional) {
    @javax.annotation.Nullable com.fhir.MedicationKnowledge_Packaging value = optional.orElse(null);
    if (this.packaging == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        value,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#monitoringProgram() monitoringProgram} attribute.
   * @param value The value for monitoringProgram
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMonitoringProgram(java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> newValue = java.util.Objects.requireNonNull(value, "monitoringProgram");
    if (this.monitoringProgram == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        newValue,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#monitoringProgram() monitoringProgram} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for monitoringProgram
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMonitoringProgram(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> value = optional.orElse(null);
    if (this.monitoringProgram == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        value,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#medicineClassification() medicineClassification} attribute.
   * @param value The value for medicineClassification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMedicineClassification(java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> newValue = java.util.Objects.requireNonNull(value, "medicineClassification");
    if (this.medicineClassification == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        newValue,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#medicineClassification() medicineClassification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicineClassification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMedicineClassification(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_MedicineClassification>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> value = optional.orElse(null);
    if (this.medicineClassification == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        value,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#synonym() synonym} attribute.
   * @param value The value for synonym
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withSynonym(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "synonym");
    if (this.synonym == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        newValue,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#synonym() synonym} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for synonym
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withSynonym(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.synonym == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        value,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#monograph() monograph} attribute.
   * @param value The value for monograph
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMonograph(java.util.List<com.fhir.MedicationKnowledge_Monograph> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Monograph> newValue = java.util.Objects.requireNonNull(value, "monograph");
    if (this.monograph == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        newValue,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#monograph() monograph} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for monograph
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMonograph(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Monograph>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Monograph> value = optional.orElse(null);
    if (this.monograph == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        value,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#kinetics() kinetics} attribute.
   * @param value The value for kinetics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withKinetics(java.util.List<com.fhir.MedicationKnowledge_Kinetics> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Kinetics> newValue = java.util.Objects.requireNonNull(value, "kinetics");
    if (this.kinetics == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        newValue,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#kinetics() kinetics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kinetics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withKinetics(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Kinetics>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Kinetics> value = optional.orElse(null);
    if (this.kinetics == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        value,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withAmount(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        newValue,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withAmount(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        value,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#preparationInstruction() preparationInstruction} attribute.
   * @param value The value for preparationInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withPreparationInstruction(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "preparationInstruction");
    if (this.preparationInstruction == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        newValue,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#preparationInstruction() preparationInstruction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preparationInstruction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withPreparationInstruction(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.preparationInstruction == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        value,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        newValue,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        value,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        newValue,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        value,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        newValue,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        value,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} attribute.
   * @param value The value for drugCharacteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withDrugCharacteristic(java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> newValue = java.util.Objects.requireNonNull(value, "drugCharacteristic");
    if (this.drugCharacteristic == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        newValue,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for drugCharacteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withDrugCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> value = optional.orElse(null);
    if (this.drugCharacteristic == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        value,
        this.relatedMedicationKnowledge,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} attribute.
   * @param value The value for relatedMedicationKnowledge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withRelatedMedicationKnowledge(java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> newValue = java.util.Objects.requireNonNull(value, "relatedMedicationKnowledge");
    if (this.relatedMedicationKnowledge == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedMedicationKnowledge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withRelatedMedicationKnowledge(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> value = optional.orElse(null);
    if (this.relatedMedicationKnowledge == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge(
        this.language,
        this.contraindication,
        this.id,
        this.extension,
        this.status,
        this.cost,
        this.regulatory,
        this.text,
        this.administrationGuidelines,
        this.resourceType,
        this.productType,
        this.doseForm,
        this.ingredient,
        this.contained,
        this.intendedRoute,
        this.manufacturer,
        this.associatedMedication,
        this.packaging,
        this.monitoringProgram,
        this.medicineClassification,
        this.synonym,
        this.monograph,
        this.kinetics,
        this.amount,
        this.preparationInstruction,
        this.implicitRules,
        this.meta,
        this.code,
        this.drugCharacteristic,
        this.relatedMedicationKnowledge,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge
        && equalTo((ImmutableMedicationKnowledge) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contraindication, another.contraindication)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(cost, another.cost)
        && java.util.Objects.equals(regulatory, another.regulatory)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(administrationGuidelines, another.administrationGuidelines)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(productType, another.productType)
        && java.util.Objects.equals(doseForm, another.doseForm)
        && java.util.Objects.equals(ingredient, another.ingredient)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(intendedRoute, another.intendedRoute)
        && java.util.Objects.equals(manufacturer, another.manufacturer)
        && java.util.Objects.equals(associatedMedication, another.associatedMedication)
        && java.util.Objects.equals(packaging, another.packaging)
        && java.util.Objects.equals(monitoringProgram, another.monitoringProgram)
        && java.util.Objects.equals(medicineClassification, another.medicineClassification)
        && java.util.Objects.equals(synonym, another.synonym)
        && java.util.Objects.equals(monograph, another.monograph)
        && java.util.Objects.equals(kinetics, another.kinetics)
        && java.util.Objects.equals(amount, another.amount)
        && java.util.Objects.equals(preparationInstruction, another.preparationInstruction)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(drugCharacteristic, another.drugCharacteristic)
        && java.util.Objects.equals(relatedMedicationKnowledge, another.relatedMedicationKnowledge)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code contraindication}, {@code id}, {@code extension}, {@code status}, {@code cost}, {@code regulatory}, {@code text}, {@code administrationGuidelines}, {@code resourceType}, {@code productType}, {@code doseForm}, {@code ingredient}, {@code contained}, {@code intendedRoute}, {@code manufacturer}, {@code associatedMedication}, {@code packaging}, {@code monitoringProgram}, {@code medicineClassification}, {@code synonym}, {@code monograph}, {@code kinetics}, {@code amount}, {@code preparationInstruction}, {@code implicitRules}, {@code meta}, {@code code}, {@code drugCharacteristic}, {@code relatedMedicationKnowledge}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contraindication);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(cost);
    h += (h << 5) + java.util.Objects.hashCode(regulatory);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(administrationGuidelines);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(productType);
    h += (h << 5) + java.util.Objects.hashCode(doseForm);
    h += (h << 5) + java.util.Objects.hashCode(ingredient);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(intendedRoute);
    h += (h << 5) + java.util.Objects.hashCode(manufacturer);
    h += (h << 5) + java.util.Objects.hashCode(associatedMedication);
    h += (h << 5) + java.util.Objects.hashCode(packaging);
    h += (h << 5) + java.util.Objects.hashCode(monitoringProgram);
    h += (h << 5) + java.util.Objects.hashCode(medicineClassification);
    h += (h << 5) + java.util.Objects.hashCode(synonym);
    h += (h << 5) + java.util.Objects.hashCode(monograph);
    h += (h << 5) + java.util.Objects.hashCode(kinetics);
    h += (h << 5) + java.util.Objects.hashCode(amount);
    h += (h << 5) + java.util.Objects.hashCode(preparationInstruction);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(drugCharacteristic);
    h += (h << 5) + java.util.Objects.hashCode(relatedMedicationKnowledge);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicationKnowledge{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (contraindication != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contraindication=").append(contraindication);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (cost != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("cost=").append(cost);
    }
    if (regulatory != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("regulatory=").append(regulatory);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (administrationGuidelines != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("administrationGuidelines=").append(administrationGuidelines);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (productType != null) {
      builder.append(", ");
      builder.append("productType=").append(productType);
    }
    if (doseForm != null) {
      builder.append(", ");
      builder.append("doseForm=").append(doseForm);
    }
    if (ingredient != null) {
      builder.append(", ");
      builder.append("ingredient=").append(ingredient);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (intendedRoute != null) {
      builder.append(", ");
      builder.append("intendedRoute=").append(intendedRoute);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (associatedMedication != null) {
      builder.append(", ");
      builder.append("associatedMedication=").append(associatedMedication);
    }
    if (packaging != null) {
      builder.append(", ");
      builder.append("packaging=").append(packaging);
    }
    if (monitoringProgram != null) {
      builder.append(", ");
      builder.append("monitoringProgram=").append(monitoringProgram);
    }
    if (medicineClassification != null) {
      builder.append(", ");
      builder.append("medicineClassification=").append(medicineClassification);
    }
    if (synonym != null) {
      builder.append(", ");
      builder.append("synonym=").append(synonym);
    }
    if (monograph != null) {
      builder.append(", ");
      builder.append("monograph=").append(monograph);
    }
    if (kinetics != null) {
      builder.append(", ");
      builder.append("kinetics=").append(kinetics);
    }
    if (amount != null) {
      builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (preparationInstruction != null) {
      builder.append(", ");
      builder.append("preparationInstruction=").append(preparationInstruction);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (drugCharacteristic != null) {
      builder.append(", ");
      builder.append("drugCharacteristic=").append(drugCharacteristic);
    }
    if (relatedMedicationKnowledge != null) {
      builder.append(", ");
      builder.append("relatedMedicationKnowledge=").append(relatedMedicationKnowledge);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicationKnowledge", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicationKnowledge {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> contraindication = java.util.Optional.empty();
    boolean contraindicationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Cost>> cost = java.util.Optional.empty();
    boolean costIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Regulatory>> regulatory = java.util.Optional.empty();
    boolean regulatoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines = java.util.Optional.empty();
    boolean administrationGuidelinesIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productType = java.util.Optional.empty();
    boolean productTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> doseForm = java.util.Optional.empty();
    boolean doseFormIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Ingredient>> ingredient = java.util.Optional.empty();
    boolean ingredientIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> intendedRoute = java.util.Optional.empty();
    boolean intendedRouteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> manufacturer = java.util.Optional.empty();
    boolean manufacturerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> associatedMedication = java.util.Optional.empty();
    boolean associatedMedicationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicationKnowledge_Packaging> packaging = java.util.Optional.empty();
    boolean packagingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram>> monitoringProgram = java.util.Optional.empty();
    boolean monitoringProgramIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MedicineClassification>> medicineClassification = java.util.Optional.empty();
    boolean medicineClassificationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> synonym = java.util.Optional.empty();
    boolean synonymIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Monograph>> monograph = java.util.Optional.empty();
    boolean monographIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Kinetics>> kinetics = java.util.Optional.empty();
    boolean kineticsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> amount = java.util.Optional.empty();
    boolean amountIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> preparationInstruction = java.util.Optional.empty();
    boolean preparationInstructionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic>> drugCharacteristic = java.util.Optional.empty();
    boolean drugCharacteristicIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge = java.util.Optional.empty();
    boolean relatedMedicationKnowledgeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contraindication")
    public void setContraindication(java.util.Optional<java.util.List<com.fhir.Reference>> contraindication) {
      this.contraindication = contraindication;
      this.contraindicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    public void setCost(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Cost>> cost) {
      this.cost = cost;
      this.costIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("regulatory")
    public void setRegulatory(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Regulatory>> regulatory) {
      this.regulatory = regulatory;
      this.regulatoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("administrationGuidelines")
    public void setAdministrationGuidelines(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines) {
      this.administrationGuidelines = administrationGuidelines;
      this.administrationGuidelinesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productType")
    public void setProductType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productType) {
      this.productType = productType;
      this.productTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doseForm")
    public void setDoseForm(java.util.Optional<com.fhir.CodeableConcept> doseForm) {
      this.doseForm = doseForm;
      this.doseFormIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
    public void setIngredient(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Ingredient>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intendedRoute")
    public void setIntendedRoute(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> intendedRoute) {
      this.intendedRoute = intendedRoute;
      this.intendedRouteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public void setManufacturer(java.util.Optional<com.fhir.Reference> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("associatedMedication")
    public void setAssociatedMedication(java.util.Optional<java.util.List<com.fhir.Reference>> associatedMedication) {
      this.associatedMedication = associatedMedication;
      this.associatedMedicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("packaging")
    public void setPackaging(java.util.Optional<com.fhir.MedicationKnowledge_Packaging> packaging) {
      this.packaging = packaging;
      this.packagingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("monitoringProgram")
    public void setMonitoringProgram(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram>> monitoringProgram) {
      this.monitoringProgram = monitoringProgram;
      this.monitoringProgramIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medicineClassification")
    public void setMedicineClassification(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MedicineClassification>> medicineClassification) {
      this.medicineClassification = medicineClassification;
      this.medicineClassificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("synonym")
    public void setSynonym(java.util.Optional<java.util.List<java.lang.String>> synonym) {
      this.synonym = synonym;
      this.synonymIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("monograph")
    public void setMonograph(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Monograph>> monograph) {
      this.monograph = monograph;
      this.monographIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kinetics")
    public void setKinetics(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Kinetics>> kinetics) {
      this.kinetics = kinetics;
      this.kineticsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public void setAmount(java.util.Optional<com.fhir.Quantity> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preparationInstruction")
    public void setPreparationInstruction(java.util.Optional<com.fhir.markdown> preparationInstruction) {
      this.preparationInstruction = preparationInstruction;
      this.preparationInstructionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("drugCharacteristic")
    public void setDrugCharacteristic(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic>> drugCharacteristic) {
      this.drugCharacteristic = drugCharacteristic;
      this.drugCharacteristicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedMedicationKnowledge")
    public void setRelatedMedicationKnowledge(java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge) {
      this.relatedMedicationKnowledge = relatedMedicationKnowledge;
      this.relatedMedicationKnowledgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> contraindication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Cost>> cost() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Regulatory>> regulatory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> doseForm() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Ingredient>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> intendedRoute() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> associatedMedication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MedicationKnowledge_Packaging> packaging() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram>> monitoringProgram() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_MedicineClassification>> medicineClassification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> synonym() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Monograph>> monograph() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_Kinetics>> kinetics() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> amount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> preparationInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic>> drugCharacteristic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge fromJson(Json json) {
    ImmutableMedicationKnowledge.Builder builder = ((ImmutableMedicationKnowledge.Builder) ImmutableMedicationKnowledge.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.contraindicationIsSet) {
      builder.contraindication(json.contraindication);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.costIsSet) {
      builder.cost(json.cost);
    }
    if (json.regulatoryIsSet) {
      builder.regulatory(json.regulatory);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.administrationGuidelinesIsSet) {
      builder.administrationGuidelines(json.administrationGuidelines);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.productTypeIsSet) {
      builder.productType(json.productType);
    }
    if (json.doseFormIsSet) {
      builder.doseForm(json.doseForm);
    }
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.intendedRouteIsSet) {
      builder.intendedRoute(json.intendedRoute);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.associatedMedicationIsSet) {
      builder.associatedMedication(json.associatedMedication);
    }
    if (json.packagingIsSet) {
      builder.packaging(json.packaging);
    }
    if (json.monitoringProgramIsSet) {
      builder.monitoringProgram(json.monitoringProgram);
    }
    if (json.medicineClassificationIsSet) {
      builder.medicineClassification(json.medicineClassification);
    }
    if (json.synonymIsSet) {
      builder.synonym(json.synonym);
    }
    if (json.monographIsSet) {
      builder.monograph(json.monograph);
    }
    if (json.kineticsIsSet) {
      builder.kinetics(json.kinetics);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.preparationInstructionIsSet) {
      builder.preparationInstruction(json.preparationInstruction);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.drugCharacteristicIsSet) {
      builder.drugCharacteristic(json.drugCharacteristic);
    }
    if (json.relatedMedicationKnowledgeIsSet) {
      builder.relatedMedicationKnowledge(json.relatedMedicationKnowledge);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicationKnowledge) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge instance
   */
  public static MedicationKnowledge copyOf(MedicationKnowledge instance) {
    if (instance instanceof ImmutableMedicationKnowledge) {
      return (ImmutableMedicationKnowledge) instance;
    }
    return ((ImmutableMedicationKnowledge.Builder) ImmutableMedicationKnowledge.builder())
        .language(instance.language())
        .contraindication(instance.contraindication())
        .id(instance.id())
        .extension(instance.extension())
        .status(instance.status())
        .cost(instance.cost())
        .regulatory(instance.regulatory())
        .text(instance.text())
        .administrationGuidelines(instance.administrationGuidelines())
        .resourceType(instance.resourceType())
        .productType(instance.productType())
        .doseForm(instance.doseForm())
        .ingredient(instance.ingredient())
        .contained(instance.contained())
        .intendedRoute(instance.intendedRoute())
        .manufacturer(instance.manufacturer())
        .associatedMedication(instance.associatedMedication())
        .packaging(instance.packaging())
        .monitoringProgram(instance.monitoringProgram())
        .medicineClassification(instance.medicineClassification())
        .synonym(instance.synonym())
        .monograph(instance.monograph())
        .kinetics(instance.kinetics())
        .amount(instance.amount())
        .preparationInstruction(instance.preparationInstruction())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .code(instance.code())
        .drugCharacteristic(instance.drugCharacteristic())
        .relatedMedicationKnowledge(instance.relatedMedicationKnowledge())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge MedicationKnowledge}.
   * <pre>
   * ImmutableMedicationKnowledge.builder()
   *    .language(com.fhir.code) // optional {@link MedicationKnowledge#language() language}
   *    .contraindication(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationKnowledge#contraindication() contraindication}
   *    .id(com.fhir.id) // optional {@link MedicationKnowledge#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge#extension() extension}
   *    .status(com.fhir.code) // optional {@link MedicationKnowledge#status() status}
   *    .cost(List&amp;lt;com.fhir.MedicationKnowledge_Cost&amp;gt;) // optional {@link MedicationKnowledge#cost() cost}
   *    .regulatory(List&amp;lt;com.fhir.MedicationKnowledge_Regulatory&amp;gt;) // optional {@link MedicationKnowledge#regulatory() regulatory}
   *    .text(com.fhir.Narrative) // optional {@link MedicationKnowledge#text() text}
   *    .administrationGuidelines(List&amp;lt;com.fhir.MedicationKnowledge_AdministrationGuidelines&amp;gt;) // optional {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines}
   *    .resourceType(String) // required {@link MedicationKnowledge#resourceType() resourceType}
   *    .productType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationKnowledge#productType() productType}
   *    .doseForm(com.fhir.CodeableConcept) // optional {@link MedicationKnowledge#doseForm() doseForm}
   *    .ingredient(List&amp;lt;com.fhir.MedicationKnowledge_Ingredient&amp;gt;) // optional {@link MedicationKnowledge#ingredient() ingredient}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicationKnowledge#contained() contained}
   *    .intendedRoute(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationKnowledge#intendedRoute() intendedRoute}
   *    .manufacturer(com.fhir.Reference) // optional {@link MedicationKnowledge#manufacturer() manufacturer}
   *    .associatedMedication(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationKnowledge#associatedMedication() associatedMedication}
   *    .packaging(com.fhir.MedicationKnowledge_Packaging) // optional {@link MedicationKnowledge#packaging() packaging}
   *    .monitoringProgram(List&amp;lt;com.fhir.MedicationKnowledge_MonitoringProgram&amp;gt;) // optional {@link MedicationKnowledge#monitoringProgram() monitoringProgram}
   *    .medicineClassification(List&amp;lt;com.fhir.MedicationKnowledge_MedicineClassification&amp;gt;) // optional {@link MedicationKnowledge#medicineClassification() medicineClassification}
   *    .synonym(List&amp;lt;String&amp;gt;) // optional {@link MedicationKnowledge#synonym() synonym}
   *    .monograph(List&amp;lt;com.fhir.MedicationKnowledge_Monograph&amp;gt;) // optional {@link MedicationKnowledge#monograph() monograph}
   *    .kinetics(List&amp;lt;com.fhir.MedicationKnowledge_Kinetics&amp;gt;) // optional {@link MedicationKnowledge#kinetics() kinetics}
   *    .amount(com.fhir.Quantity) // optional {@link MedicationKnowledge#amount() amount}
   *    .preparationInstruction(com.fhir.markdown) // optional {@link MedicationKnowledge#preparationInstruction() preparationInstruction}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicationKnowledge#implicitRules() implicitRules}
   *    .meta(com.fhir.Meta) // optional {@link MedicationKnowledge#meta() meta}
   *    .code(com.fhir.CodeableConcept) // optional {@link MedicationKnowledge#code() code}
   *    .drugCharacteristic(List&amp;lt;com.fhir.MedicationKnowledge_DrugCharacteristic&amp;gt;) // optional {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic}
   *    .relatedMedicationKnowledge(List&amp;lt;com.fhir.MedicationKnowledge_RelatedMedicationKnowledge&amp;gt;) // optional {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicationKnowledge.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge MedicationKnowledge}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicationKnowledge", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_CONTRAINDICATION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_COST = 0x20L;
    private static final long OPT_BIT_REGULATORY = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_ADMINISTRATION_GUIDELINES = 0x100L;
    private static final long OPT_BIT_PRODUCT_TYPE = 0x200L;
    private static final long OPT_BIT_DOSE_FORM = 0x400L;
    private static final long OPT_BIT_INGREDIENT = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_INTENDED_ROUTE = 0x2000L;
    private static final long OPT_BIT_MANUFACTURER = 0x4000L;
    private static final long OPT_BIT_ASSOCIATED_MEDICATION = 0x8000L;
    private static final long OPT_BIT_PACKAGING = 0x10000L;
    private static final long OPT_BIT_MONITORING_PROGRAM = 0x20000L;
    private static final long OPT_BIT_MEDICINE_CLASSIFICATION = 0x40000L;
    private static final long OPT_BIT_SYNONYM = 0x80000L;
    private static final long OPT_BIT_MONOGRAPH = 0x100000L;
    private static final long OPT_BIT_KINETICS = 0x200000L;
    private static final long OPT_BIT_AMOUNT = 0x400000L;
    private static final long OPT_BIT_PREPARATION_INSTRUCTION = 0x800000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000000L;
    private static final long OPT_BIT_META = 0x2000000L;
    private static final long OPT_BIT_CODE = 0x4000000L;
    private static final long OPT_BIT_DRUG_CHARACTERISTIC = 0x8000000L;
    private static final long OPT_BIT_RELATED_MEDICATION_KNOWLEDGE = 0x10000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> contraindication;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Cost> cost;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Regulatory> regulatory;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> administrationGuidelines;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> productType;
    private @javax.annotation.Nullable com.fhir.CodeableConcept doseForm;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Ingredient> ingredient;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> intendedRoute;
    private @javax.annotation.Nullable com.fhir.Reference manufacturer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> associatedMedication;
    private @javax.annotation.Nullable com.fhir.MedicationKnowledge_Packaging packaging;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> monitoringProgram;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> medicineClassification;
    private @javax.annotation.Nullable java.util.List<java.lang.String> synonym;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Monograph> monograph;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_Kinetics> kinetics;
    private @javax.annotation.Nullable com.fhir.Quantity amount;
    private @javax.annotation.Nullable com.fhir.markdown preparationInstruction;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> drugCharacteristic;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for chained invocation
     */
    public final Builder contraindication(java.util.List<com.fhir.Reference> contraindication) {
      checkNotIsSet(contraindicationIsSet(), "contraindication");
      this.contraindication = java.util.Objects.requireNonNull(contraindication, "contraindication");
      optBits |= OPT_BIT_CONTRAINDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contraindication")
    public final Builder contraindication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contraindication) {
      checkNotIsSet(contraindicationIsSet(), "contraindication");
      this.contraindication = contraindication.orElse(null);
      optBits |= OPT_BIT_CONTRAINDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    public final Builder cost(java.util.List<com.fhir.MedicationKnowledge_Cost> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = java.util.Objects.requireNonNull(cost, "cost");
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    public final Builder cost(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Cost>> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = cost.orElse(null);
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for chained invocation
     */
    public final Builder regulatory(java.util.List<com.fhir.MedicationKnowledge_Regulatory> regulatory) {
      checkNotIsSet(regulatoryIsSet(), "regulatory");
      this.regulatory = java.util.Objects.requireNonNull(regulatory, "regulatory");
      optBits |= OPT_BIT_REGULATORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regulatory")
    public final Builder regulatory(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Regulatory>> regulatory) {
      checkNotIsSet(regulatoryIsSet(), "regulatory");
      this.regulatory = regulatory.orElse(null);
      optBits |= OPT_BIT_REGULATORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for chained invocation
     */
    public final Builder administrationGuidelines(java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> administrationGuidelines) {
      checkNotIsSet(administrationGuidelinesIsSet(), "administrationGuidelines");
      this.administrationGuidelines = java.util.Objects.requireNonNull(administrationGuidelines, "administrationGuidelines");
      optBits |= OPT_BIT_ADMINISTRATION_GUIDELINES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("administrationGuidelines")
    public final Builder administrationGuidelines(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines) {
      checkNotIsSet(administrationGuidelinesIsSet(), "administrationGuidelines");
      this.administrationGuidelines = administrationGuidelines.orElse(null);
      optBits |= OPT_BIT_ADMINISTRATION_GUIDELINES;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicationKnowledge#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for chained invocation
     */
    public final Builder productType(java.util.List<com.fhir.CodeableConcept> productType) {
      checkNotIsSet(productTypeIsSet(), "productType");
      this.productType = java.util.Objects.requireNonNull(productType, "productType");
      optBits |= OPT_BIT_PRODUCT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productType")
    public final Builder productType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> productType) {
      checkNotIsSet(productTypeIsSet(), "productType");
      this.productType = productType.orElse(null);
      optBits |= OPT_BIT_PRODUCT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseForm(com.fhir.CodeableConcept doseForm) {
      checkNotIsSet(doseFormIsSet(), "doseForm");
      this.doseForm = java.util.Objects.requireNonNull(doseForm, "doseForm");
      optBits |= OPT_BIT_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doseForm")
    public final Builder doseForm(java.util.Optional<? extends com.fhir.CodeableConcept> doseForm) {
      checkNotIsSet(doseFormIsSet(), "doseForm");
      this.doseForm = doseForm.orElse(null);
      optBits |= OPT_BIT_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    public final Builder ingredient(java.util.List<com.fhir.MedicationKnowledge_Ingredient> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = java.util.Objects.requireNonNull(ingredient, "ingredient");
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
    public final Builder ingredient(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Ingredient>> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = ingredient.orElse(null);
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for chained invocation
     */
    public final Builder intendedRoute(java.util.List<com.fhir.CodeableConcept> intendedRoute) {
      checkNotIsSet(intendedRouteIsSet(), "intendedRoute");
      this.intendedRoute = java.util.Objects.requireNonNull(intendedRoute, "intendedRoute");
      optBits |= OPT_BIT_INTENDED_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intendedRoute")
    public final Builder intendedRoute(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> intendedRoute) {
      checkNotIsSet(intendedRouteIsSet(), "intendedRoute");
      this.intendedRoute = intendedRoute.orElse(null);
      optBits |= OPT_BIT_INTENDED_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(com.fhir.Reference manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = java.util.Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public final Builder manufacturer(java.util.Optional<? extends com.fhir.Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for chained invocation
     */
    public final Builder associatedMedication(java.util.List<com.fhir.Reference> associatedMedication) {
      checkNotIsSet(associatedMedicationIsSet(), "associatedMedication");
      this.associatedMedication = java.util.Objects.requireNonNull(associatedMedication, "associatedMedication");
      optBits |= OPT_BIT_ASSOCIATED_MEDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedMedication")
    public final Builder associatedMedication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> associatedMedication) {
      checkNotIsSet(associatedMedicationIsSet(), "associatedMedication");
      this.associatedMedication = associatedMedication.orElse(null);
      optBits |= OPT_BIT_ASSOCIATED_MEDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for chained invocation
     */
    public final Builder packaging(com.fhir.MedicationKnowledge_Packaging packaging) {
      checkNotIsSet(packagingIsSet(), "packaging");
      this.packaging = java.util.Objects.requireNonNull(packaging, "packaging");
      optBits |= OPT_BIT_PACKAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packaging")
    public final Builder packaging(java.util.Optional<? extends com.fhir.MedicationKnowledge_Packaging> packaging) {
      checkNotIsSet(packagingIsSet(), "packaging");
      this.packaging = packaging.orElse(null);
      optBits |= OPT_BIT_PACKAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for chained invocation
     */
    public final Builder monitoringProgram(java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> monitoringProgram) {
      checkNotIsSet(monitoringProgramIsSet(), "monitoringProgram");
      this.monitoringProgram = java.util.Objects.requireNonNull(monitoringProgram, "monitoringProgram");
      optBits |= OPT_BIT_MONITORING_PROGRAM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monitoringProgram")
    public final Builder monitoringProgram(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram>> monitoringProgram) {
      checkNotIsSet(monitoringProgramIsSet(), "monitoringProgram");
      this.monitoringProgram = monitoringProgram.orElse(null);
      optBits |= OPT_BIT_MONITORING_PROGRAM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicineClassification(java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> medicineClassification) {
      checkNotIsSet(medicineClassificationIsSet(), "medicineClassification");
      this.medicineClassification = java.util.Objects.requireNonNull(medicineClassification, "medicineClassification");
      optBits |= OPT_BIT_MEDICINE_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("medicineClassification")
    public final Builder medicineClassification(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_MedicineClassification>> medicineClassification) {
      checkNotIsSet(medicineClassificationIsSet(), "medicineClassification");
      this.medicineClassification = medicineClassification.orElse(null);
      optBits |= OPT_BIT_MEDICINE_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for chained invocation
     */
    public final Builder synonym(java.util.List<java.lang.String> synonym) {
      checkNotIsSet(synonymIsSet(), "synonym");
      this.synonym = java.util.Objects.requireNonNull(synonym, "synonym");
      optBits |= OPT_BIT_SYNONYM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("synonym")
    public final Builder synonym(java.util.Optional<? extends java.util.List<java.lang.String>> synonym) {
      checkNotIsSet(synonymIsSet(), "synonym");
      this.synonym = synonym.orElse(null);
      optBits |= OPT_BIT_SYNONYM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for chained invocation
     */
    public final Builder monograph(java.util.List<com.fhir.MedicationKnowledge_Monograph> monograph) {
      checkNotIsSet(monographIsSet(), "monograph");
      this.monograph = java.util.Objects.requireNonNull(monograph, "monograph");
      optBits |= OPT_BIT_MONOGRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monograph")
    public final Builder monograph(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Monograph>> monograph) {
      checkNotIsSet(monographIsSet(), "monograph");
      this.monograph = monograph.orElse(null);
      optBits |= OPT_BIT_MONOGRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for chained invocation
     */
    public final Builder kinetics(java.util.List<com.fhir.MedicationKnowledge_Kinetics> kinetics) {
      checkNotIsSet(kineticsIsSet(), "kinetics");
      this.kinetics = java.util.Objects.requireNonNull(kinetics, "kinetics");
      optBits |= OPT_BIT_KINETICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kinetics")
    public final Builder kinetics(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Kinetics>> kinetics) {
      checkNotIsSet(kineticsIsSet(), "kinetics");
      this.kinetics = kinetics.orElse(null);
      optBits |= OPT_BIT_KINETICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(com.fhir.Quantity amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = java.util.Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public final Builder amount(java.util.Optional<? extends com.fhir.Quantity> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder preparationInstruction(com.fhir.markdown preparationInstruction) {
      checkNotIsSet(preparationInstructionIsSet(), "preparationInstruction");
      this.preparationInstruction = java.util.Objects.requireNonNull(preparationInstruction, "preparationInstruction");
      optBits |= OPT_BIT_PREPARATION_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preparationInstruction")
    public final Builder preparationInstruction(java.util.Optional<? extends com.fhir.markdown> preparationInstruction) {
      checkNotIsSet(preparationInstructionIsSet(), "preparationInstruction");
      this.preparationInstruction = preparationInstruction.orElse(null);
      optBits |= OPT_BIT_PREPARATION_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder drugCharacteristic(java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> drugCharacteristic) {
      checkNotIsSet(drugCharacteristicIsSet(), "drugCharacteristic");
      this.drugCharacteristic = java.util.Objects.requireNonNull(drugCharacteristic, "drugCharacteristic");
      optBits |= OPT_BIT_DRUG_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drugCharacteristic")
    public final Builder drugCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic>> drugCharacteristic) {
      checkNotIsSet(drugCharacteristicIsSet(), "drugCharacteristic");
      this.drugCharacteristic = drugCharacteristic.orElse(null);
      optBits |= OPT_BIT_DRUG_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedMedicationKnowledge(java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge) {
      checkNotIsSet(relatedMedicationKnowledgeIsSet(), "relatedMedicationKnowledge");
      this.relatedMedicationKnowledge = java.util.Objects.requireNonNull(relatedMedicationKnowledge, "relatedMedicationKnowledge");
      optBits |= OPT_BIT_RELATED_MEDICATION_KNOWLEDGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedMedicationKnowledge")
    public final Builder relatedMedicationKnowledge(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge) {
      checkNotIsSet(relatedMedicationKnowledgeIsSet(), "relatedMedicationKnowledge");
      this.relatedMedicationKnowledge = relatedMedicationKnowledge.orElse(null);
      optBits |= OPT_BIT_RELATED_MEDICATION_KNOWLEDGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge MedicationKnowledge}.
     * @return An immutable instance of MedicationKnowledge
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicationKnowledge build() {
      checkRequiredAttributes();
      return new ImmutableMedicationKnowledge(
          language,
          contraindication,
          id,
          extension,
          status,
          cost,
          regulatory,
          text,
          administrationGuidelines,
          resourceType,
          productType,
          doseForm,
          ingredient,
          contained,
          intendedRoute,
          manufacturer,
          associatedMedication,
          packaging,
          monitoringProgram,
          medicineClassification,
          synonym,
          monograph,
          kinetics,
          amount,
          preparationInstruction,
          implicitRules,
          meta,
          code,
          drugCharacteristic,
          relatedMedicationKnowledge,
          modifierExtension);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean contraindicationIsSet() {
      return (optBits & OPT_BIT_CONTRAINDICATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean costIsSet() {
      return (optBits & OPT_BIT_COST) != 0;
    }

    private boolean regulatoryIsSet() {
      return (optBits & OPT_BIT_REGULATORY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean administrationGuidelinesIsSet() {
      return (optBits & OPT_BIT_ADMINISTRATION_GUIDELINES) != 0;
    }

    private boolean productTypeIsSet() {
      return (optBits & OPT_BIT_PRODUCT_TYPE) != 0;
    }

    private boolean doseFormIsSet() {
      return (optBits & OPT_BIT_DOSE_FORM) != 0;
    }

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean intendedRouteIsSet() {
      return (optBits & OPT_BIT_INTENDED_ROUTE) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean associatedMedicationIsSet() {
      return (optBits & OPT_BIT_ASSOCIATED_MEDICATION) != 0;
    }

    private boolean packagingIsSet() {
      return (optBits & OPT_BIT_PACKAGING) != 0;
    }

    private boolean monitoringProgramIsSet() {
      return (optBits & OPT_BIT_MONITORING_PROGRAM) != 0;
    }

    private boolean medicineClassificationIsSet() {
      return (optBits & OPT_BIT_MEDICINE_CLASSIFICATION) != 0;
    }

    private boolean synonymIsSet() {
      return (optBits & OPT_BIT_SYNONYM) != 0;
    }

    private boolean monographIsSet() {
      return (optBits & OPT_BIT_MONOGRAPH) != 0;
    }

    private boolean kineticsIsSet() {
      return (optBits & OPT_BIT_KINETICS) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean preparationInstructionIsSet() {
      return (optBits & OPT_BIT_PREPARATION_INSTRUCTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean drugCharacteristicIsSet() {
      return (optBits & OPT_BIT_DRUG_CHARACTERISTIC) != 0;
    }

    private boolean relatedMedicationKnowledgeIsSet() {
      return (optBits & OPT_BIT_RELATED_MEDICATION_KNOWLEDGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicationKnowledge is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicationKnowledge, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicationKnowledge", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationKnowledge#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicationKnowledge", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contraindication(java.util.List<com.fhir.Reference> contraindication);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contraindication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contraindication);

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cost(java.util.List<com.fhir.MedicationKnowledge_Cost> cost);

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cost(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Cost>> cost);

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal regulatory(java.util.List<com.fhir.MedicationKnowledge_Regulatory> regulatory);

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal regulatory(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Regulatory>> regulatory);

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for chained invocation
     */
    BuildFinal administrationGuidelines(java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines> administrationGuidelines);

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal administrationGuidelines(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines);

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productType(java.util.List<com.fhir.CodeableConcept> productType);

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> productType);

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseForm(com.fhir.CodeableConcept doseForm);

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseForm(java.util.Optional<? extends com.fhir.CodeableConcept> doseForm);

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(java.util.List<com.fhir.MedicationKnowledge_Ingredient> ingredient);

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Ingredient>> ingredient);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intendedRoute(java.util.List<com.fhir.CodeableConcept> intendedRoute);

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intendedRoute(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> intendedRoute);

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(com.fhir.Reference manufacturer);

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(java.util.Optional<? extends com.fhir.Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal associatedMedication(java.util.List<com.fhir.Reference> associatedMedication);

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal associatedMedication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> associatedMedication);

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packaging(com.fhir.MedicationKnowledge_Packaging packaging);

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packaging(java.util.Optional<? extends com.fhir.MedicationKnowledge_Packaging> packaging);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for chained invocation
     */
    BuildFinal monitoringProgram(java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram> monitoringProgram);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal monitoringProgram(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_MonitoringProgram>> monitoringProgram);

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicineClassification(java.util.List<com.fhir.MedicationKnowledge_MedicineClassification> medicineClassification);

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicineClassification(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_MedicineClassification>> medicineClassification);

    /**
     * Initializes the optional value {@link MedicationKnowledge#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for chained invocation
     */
    BuildFinal synonym(java.util.List<java.lang.String> synonym);

    /**
     * Initializes the optional value {@link MedicationKnowledge#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal synonym(java.util.Optional<? extends java.util.List<java.lang.String>> synonym);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for chained invocation
     */
    BuildFinal monograph(java.util.List<com.fhir.MedicationKnowledge_Monograph> monograph);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal monograph(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Monograph>> monograph);

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kinetics(java.util.List<com.fhir.MedicationKnowledge_Kinetics> kinetics);

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kinetics(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_Kinetics>> kinetics);

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(com.fhir.Quantity amount);

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(java.util.Optional<? extends com.fhir.Quantity> amount);

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preparationInstruction(com.fhir.markdown preparationInstruction);

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preparationInstruction(java.util.Optional<? extends com.fhir.markdown> preparationInstruction);

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal drugCharacteristic(java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic> drugCharacteristic);

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal drugCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_DrugCharacteristic>> drugCharacteristic);

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedMedicationKnowledge(java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge);

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedMedicationKnowledge(java.util.Optional<? extends java.util.List<com.fhir.MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge);

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicationKnowledge MedicationKnowledge}.
     * @return An immutable instance of MedicationKnowledge
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationKnowledge build();
  }
}
