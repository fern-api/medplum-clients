package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MedicationKnowledge}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge.builder()}.
 */
@Generated(from = "MedicationKnowledge", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge implements MedicationKnowledge {
  private final String resourceType;
  private final @Nullable List<MedicationKnowledge_Kinetics> kinetics;
  private final @Nullable Markdown preparationInstruction;
  private final @Nullable List<MedicationKnowledge_AdministrationGuidelines> administrationGuidelines;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<MedicationKnowledge_Ingredient> ingredient;
  private final @Nullable List<MedicationKnowledge_Regulatory> regulatory;
  private final @Nullable Meta meta;
  private final @Nullable List<MedicationKnowledge_MedicineClassification> medicineClassification;
  private final @Nullable List<String> synonym;
  private final @Nullable List<MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge;
  private final @Nullable List<CodeableConcept> intendedRoute;
  private final @Nullable List<MedicationKnowledge_Cost> cost;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Reference> associatedMedication;
  private final @Nullable List<MedicationKnowledge_DrugCharacteristic> drugCharacteristic;
  private final @Nullable List<MedicationKnowledge_Monograph> monograph;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Narrative text;
  private final @Nullable Reference manufacturer;
  private final @Nullable CodeableConcept doseForm;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable MedicationKnowledge_Packaging packaging;
  private final @Nullable Quantity amount;
  private final @Nullable List<MedicationKnowledge_MonitoringProgram> monitoringProgram;
  private final @Nullable Code status;
  private final @Nullable List<CodeableConcept> productType;
  private final @Nullable List<Reference> contraindication;

  private ImmutableMedicationKnowledge(
      String resourceType,
      @Nullable List<MedicationKnowledge_Kinetics> kinetics,
      @Nullable Markdown preparationInstruction,
      @Nullable List<MedicationKnowledge_AdministrationGuidelines> administrationGuidelines,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept code,
      @Nullable List<MedicationKnowledge_Ingredient> ingredient,
      @Nullable List<MedicationKnowledge_Regulatory> regulatory,
      @Nullable Meta meta,
      @Nullable List<MedicationKnowledge_MedicineClassification> medicineClassification,
      @Nullable List<String> synonym,
      @Nullable List<MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge,
      @Nullable List<CodeableConcept> intendedRoute,
      @Nullable List<MedicationKnowledge_Cost> cost,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable List<Reference> associatedMedication,
      @Nullable List<MedicationKnowledge_DrugCharacteristic> drugCharacteristic,
      @Nullable List<MedicationKnowledge_Monograph> monograph,
      @Nullable List<Extension> modifierExtension,
      @Nullable Narrative text,
      @Nullable Reference manufacturer,
      @Nullable CodeableConcept doseForm,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable MedicationKnowledge_Packaging packaging,
      @Nullable Quantity amount,
      @Nullable List<MedicationKnowledge_MonitoringProgram> monitoringProgram,
      @Nullable Code status,
      @Nullable List<CodeableConcept> productType,
      @Nullable List<Reference> contraindication) {
    this.resourceType = resourceType;
    this.kinetics = kinetics;
    this.preparationInstruction = preparationInstruction;
    this.administrationGuidelines = administrationGuidelines;
    this.extension = extension;
    this.code = code;
    this.ingredient = ingredient;
    this.regulatory = regulatory;
    this.meta = meta;
    this.medicineClassification = medicineClassification;
    this.synonym = synonym;
    this.relatedMedicationKnowledge = relatedMedicationKnowledge;
    this.intendedRoute = intendedRoute;
    this.cost = cost;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.associatedMedication = associatedMedication;
    this.drugCharacteristic = drugCharacteristic;
    this.monograph = monograph;
    this.modifierExtension = modifierExtension;
    this.text = text;
    this.manufacturer = manufacturer;
    this.doseForm = doseForm;
    this.id = id;
    this.language = language;
    this.packaging = packaging;
    this.amount = amount;
    this.monitoringProgram = monitoringProgram;
    this.status = status;
    this.productType = productType;
    this.contraindication = contraindication;
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code kinetics} attribute
   */
  @JsonProperty("kinetics")
  @Override
  public Optional<List<MedicationKnowledge_Kinetics>> kinetics() {
    return Optional.ofNullable(kinetics);
  }

  /**
   * @return The value of the {@code preparationInstruction} attribute
   */
  @JsonProperty("preparationInstruction")
  @Override
  public Optional<Markdown> preparationInstruction() {
    return Optional.ofNullable(preparationInstruction);
  }

  /**
   * @return The value of the {@code administrationGuidelines} attribute
   */
  @JsonProperty("administrationGuidelines")
  @Override
  public Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines() {
    return Optional.ofNullable(administrationGuidelines);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code ingredient} attribute
   */
  @JsonProperty("ingredient")
  @Override
  public Optional<List<MedicationKnowledge_Ingredient>> ingredient() {
    return Optional.ofNullable(ingredient);
  }

  /**
   * @return The value of the {@code regulatory} attribute
   */
  @JsonProperty("regulatory")
  @Override
  public Optional<List<MedicationKnowledge_Regulatory>> regulatory() {
    return Optional.ofNullable(regulatory);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code medicineClassification} attribute
   */
  @JsonProperty("medicineClassification")
  @Override
  public Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification() {
    return Optional.ofNullable(medicineClassification);
  }

  /**
   * @return The value of the {@code synonym} attribute
   */
  @JsonProperty("synonym")
  @Override
  public Optional<List<String>> synonym() {
    return Optional.ofNullable(synonym);
  }

  /**
   * @return The value of the {@code relatedMedicationKnowledge} attribute
   */
  @JsonProperty("relatedMedicationKnowledge")
  @Override
  public Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge() {
    return Optional.ofNullable(relatedMedicationKnowledge);
  }

  /**
   * @return The value of the {@code intendedRoute} attribute
   */
  @JsonProperty("intendedRoute")
  @Override
  public Optional<List<CodeableConcept>> intendedRoute() {
    return Optional.ofNullable(intendedRoute);
  }

  /**
   * @return The value of the {@code cost} attribute
   */
  @JsonProperty("cost")
  @Override
  public Optional<List<MedicationKnowledge_Cost>> cost() {
    return Optional.ofNullable(cost);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code associatedMedication} attribute
   */
  @JsonProperty("associatedMedication")
  @Override
  public Optional<List<Reference>> associatedMedication() {
    return Optional.ofNullable(associatedMedication);
  }

  /**
   * @return The value of the {@code drugCharacteristic} attribute
   */
  @JsonProperty("drugCharacteristic")
  @Override
  public Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic() {
    return Optional.ofNullable(drugCharacteristic);
  }

  /**
   * @return The value of the {@code monograph} attribute
   */
  @JsonProperty("monograph")
  @Override
  public Optional<List<MedicationKnowledge_Monograph>> monograph() {
    return Optional.ofNullable(monograph);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<Reference> manufacturer() {
    return Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code doseForm} attribute
   */
  @JsonProperty("doseForm")
  @Override
  public Optional<CodeableConcept> doseForm() {
    return Optional.ofNullable(doseForm);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code packaging} attribute
   */
  @JsonProperty("packaging")
  @Override
  public Optional<MedicationKnowledge_Packaging> packaging() {
    return Optional.ofNullable(packaging);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<Quantity> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * @return The value of the {@code monitoringProgram} attribute
   */
  @JsonProperty("monitoringProgram")
  @Override
  public Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram() {
    return Optional.ofNullable(monitoringProgram);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code productType} attribute
   */
  @JsonProperty("productType")
  @Override
  public Optional<List<CodeableConcept>> productType() {
    return Optional.ofNullable(productType);
  }

  /**
   * @return The value of the {@code contraindication} attribute
   */
  @JsonProperty("contraindication")
  @Override
  public Optional<List<Reference>> contraindication() {
    return Optional.ofNullable(contraindication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationKnowledge#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationKnowledge withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationKnowledge(
        newValue,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#kinetics() kinetics} attribute.
   * @param value The value for kinetics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withKinetics(List<MedicationKnowledge_Kinetics> value) {
    @Nullable List<MedicationKnowledge_Kinetics> newValue = Objects.requireNonNull(value, "kinetics");
    if (this.kinetics == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        newValue,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#kinetics() kinetics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kinetics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withKinetics(Optional<? extends List<MedicationKnowledge_Kinetics>> optional) {
    @Nullable List<MedicationKnowledge_Kinetics> value = optional.orElse(null);
    if (this.kinetics == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        value,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#preparationInstruction() preparationInstruction} attribute.
   * @param value The value for preparationInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withPreparationInstruction(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "preparationInstruction");
    if (this.preparationInstruction == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        newValue,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#preparationInstruction() preparationInstruction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preparationInstruction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withPreparationInstruction(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.preparationInstruction == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        value,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} attribute.
   * @param value The value for administrationGuidelines
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withAdministrationGuidelines(List<MedicationKnowledge_AdministrationGuidelines> value) {
    @Nullable List<MedicationKnowledge_AdministrationGuidelines> newValue = Objects.requireNonNull(value, "administrationGuidelines");
    if (this.administrationGuidelines == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        newValue,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for administrationGuidelines
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withAdministrationGuidelines(Optional<? extends List<MedicationKnowledge_AdministrationGuidelines>> optional) {
    @Nullable List<MedicationKnowledge_AdministrationGuidelines> value = optional.orElse(null);
    if (this.administrationGuidelines == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        value,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        newValue,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        value,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        newValue,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        value,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withIngredient(List<MedicationKnowledge_Ingredient> value) {
    @Nullable List<MedicationKnowledge_Ingredient> newValue = Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        newValue,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withIngredient(Optional<? extends List<MedicationKnowledge_Ingredient>> optional) {
    @Nullable List<MedicationKnowledge_Ingredient> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        value,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#regulatory() regulatory} attribute.
   * @param value The value for regulatory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withRegulatory(List<MedicationKnowledge_Regulatory> value) {
    @Nullable List<MedicationKnowledge_Regulatory> newValue = Objects.requireNonNull(value, "regulatory");
    if (this.regulatory == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        newValue,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#regulatory() regulatory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for regulatory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withRegulatory(Optional<? extends List<MedicationKnowledge_Regulatory>> optional) {
    @Nullable List<MedicationKnowledge_Regulatory> value = optional.orElse(null);
    if (this.regulatory == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        value,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        newValue,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        value,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#medicineClassification() medicineClassification} attribute.
   * @param value The value for medicineClassification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMedicineClassification(List<MedicationKnowledge_MedicineClassification> value) {
    @Nullable List<MedicationKnowledge_MedicineClassification> newValue = Objects.requireNonNull(value, "medicineClassification");
    if (this.medicineClassification == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        newValue,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#medicineClassification() medicineClassification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicineClassification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMedicineClassification(Optional<? extends List<MedicationKnowledge_MedicineClassification>> optional) {
    @Nullable List<MedicationKnowledge_MedicineClassification> value = optional.orElse(null);
    if (this.medicineClassification == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        value,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#synonym() synonym} attribute.
   * @param value The value for synonym
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withSynonym(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "synonym");
    if (this.synonym == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        newValue,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#synonym() synonym} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for synonym
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withSynonym(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.synonym == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        value,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} attribute.
   * @param value The value for relatedMedicationKnowledge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withRelatedMedicationKnowledge(List<MedicationKnowledge_RelatedMedicationKnowledge> value) {
    @Nullable List<MedicationKnowledge_RelatedMedicationKnowledge> newValue = Objects.requireNonNull(value, "relatedMedicationKnowledge");
    if (this.relatedMedicationKnowledge == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        newValue,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedMedicationKnowledge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withRelatedMedicationKnowledge(Optional<? extends List<MedicationKnowledge_RelatedMedicationKnowledge>> optional) {
    @Nullable List<MedicationKnowledge_RelatedMedicationKnowledge> value = optional.orElse(null);
    if (this.relatedMedicationKnowledge == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        value,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#intendedRoute() intendedRoute} attribute.
   * @param value The value for intendedRoute
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withIntendedRoute(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "intendedRoute");
    if (this.intendedRoute == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        newValue,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#intendedRoute() intendedRoute} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intendedRoute
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withIntendedRoute(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.intendedRoute == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        value,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#cost() cost} attribute.
   * @param value The value for cost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withCost(List<MedicationKnowledge_Cost> value) {
    @Nullable List<MedicationKnowledge_Cost> newValue = Objects.requireNonNull(value, "cost");
    if (this.cost == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        newValue,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#cost() cost} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cost
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withCost(Optional<? extends List<MedicationKnowledge_Cost>> optional) {
    @Nullable List<MedicationKnowledge_Cost> value = optional.orElse(null);
    if (this.cost == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        value,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        newValue,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        value,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        newValue,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        value,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#associatedMedication() associatedMedication} attribute.
   * @param value The value for associatedMedication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withAssociatedMedication(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "associatedMedication");
    if (this.associatedMedication == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        newValue,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#associatedMedication() associatedMedication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for associatedMedication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withAssociatedMedication(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.associatedMedication == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        value,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} attribute.
   * @param value The value for drugCharacteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withDrugCharacteristic(List<MedicationKnowledge_DrugCharacteristic> value) {
    @Nullable List<MedicationKnowledge_DrugCharacteristic> newValue = Objects.requireNonNull(value, "drugCharacteristic");
    if (this.drugCharacteristic == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        newValue,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for drugCharacteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withDrugCharacteristic(Optional<? extends List<MedicationKnowledge_DrugCharacteristic>> optional) {
    @Nullable List<MedicationKnowledge_DrugCharacteristic> value = optional.orElse(null);
    if (this.drugCharacteristic == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        value,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#monograph() monograph} attribute.
   * @param value The value for monograph
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMonograph(List<MedicationKnowledge_Monograph> value) {
    @Nullable List<MedicationKnowledge_Monograph> newValue = Objects.requireNonNull(value, "monograph");
    if (this.monograph == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        newValue,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#monograph() monograph} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for monograph
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMonograph(Optional<? extends List<MedicationKnowledge_Monograph>> optional) {
    @Nullable List<MedicationKnowledge_Monograph> value = optional.orElse(null);
    if (this.monograph == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        value,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        newValue,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        value,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        newValue,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        value,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withManufacturer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        newValue,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withManufacturer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        value,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#doseForm() doseForm} attribute.
   * @param value The value for doseForm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withDoseForm(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "doseForm");
    if (this.doseForm == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        newValue,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#doseForm() doseForm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseForm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withDoseForm(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.doseForm == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        value,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        newValue,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        value,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        newValue,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        value,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#packaging() packaging} attribute.
   * @param value The value for packaging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withPackaging(MedicationKnowledge_Packaging value) {
    @Nullable MedicationKnowledge_Packaging newValue = Objects.requireNonNull(value, "packaging");
    if (this.packaging == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        newValue,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#packaging() packaging} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packaging
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withPackaging(Optional<? extends MedicationKnowledge_Packaging> optional) {
    @Nullable MedicationKnowledge_Packaging value = optional.orElse(null);
    if (this.packaging == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        value,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withAmount(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        newValue,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withAmount(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        value,
        this.monitoringProgram,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#monitoringProgram() monitoringProgram} attribute.
   * @param value The value for monitoringProgram
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withMonitoringProgram(List<MedicationKnowledge_MonitoringProgram> value) {
    @Nullable List<MedicationKnowledge_MonitoringProgram> newValue = Objects.requireNonNull(value, "monitoringProgram");
    if (this.monitoringProgram == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        newValue,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#monitoringProgram() monitoringProgram} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for monitoringProgram
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withMonitoringProgram(Optional<? extends List<MedicationKnowledge_MonitoringProgram>> optional) {
    @Nullable List<MedicationKnowledge_MonitoringProgram> value = optional.orElse(null);
    if (this.monitoringProgram == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        value,
        this.status,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        newValue,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        value,
        this.productType,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#productType() productType} attribute.
   * @param value The value for productType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withProductType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "productType");
    if (this.productType == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        newValue,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#productType() productType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withProductType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.productType == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        value,
        this.contraindication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge#contraindication() contraindication} attribute.
   * @param value The value for contraindication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge withContraindication(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "contraindication");
    if (this.contraindication == newValue) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge#contraindication() contraindication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contraindication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge withContraindication(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.contraindication == value) return this;
    return new ImmutableMedicationKnowledge(
        this.resourceType,
        this.kinetics,
        this.preparationInstruction,
        this.administrationGuidelines,
        this.extension,
        this.code,
        this.ingredient,
        this.regulatory,
        this.meta,
        this.medicineClassification,
        this.synonym,
        this.relatedMedicationKnowledge,
        this.intendedRoute,
        this.cost,
        this.implicitRules,
        this.contained,
        this.associatedMedication,
        this.drugCharacteristic,
        this.monograph,
        this.modifierExtension,
        this.text,
        this.manufacturer,
        this.doseForm,
        this.id,
        this.language,
        this.packaging,
        this.amount,
        this.monitoringProgram,
        this.status,
        this.productType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge
        && equalTo((ImmutableMedicationKnowledge) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge another) {
    return resourceType.equals(another.resourceType)
        && Objects.equals(kinetics, another.kinetics)
        && Objects.equals(preparationInstruction, another.preparationInstruction)
        && Objects.equals(administrationGuidelines, another.administrationGuidelines)
        && Objects.equals(extension, another.extension)
        && Objects.equals(code, another.code)
        && Objects.equals(ingredient, another.ingredient)
        && Objects.equals(regulatory, another.regulatory)
        && Objects.equals(meta, another.meta)
        && Objects.equals(medicineClassification, another.medicineClassification)
        && Objects.equals(synonym, another.synonym)
        && Objects.equals(relatedMedicationKnowledge, another.relatedMedicationKnowledge)
        && Objects.equals(intendedRoute, another.intendedRoute)
        && Objects.equals(cost, another.cost)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(associatedMedication, another.associatedMedication)
        && Objects.equals(drugCharacteristic, another.drugCharacteristic)
        && Objects.equals(monograph, another.monograph)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(text, another.text)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(doseForm, another.doseForm)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(packaging, another.packaging)
        && Objects.equals(amount, another.amount)
        && Objects.equals(monitoringProgram, another.monitoringProgram)
        && Objects.equals(status, another.status)
        && Objects.equals(productType, another.productType)
        && Objects.equals(contraindication, another.contraindication);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code kinetics}, {@code preparationInstruction}, {@code administrationGuidelines}, {@code extension}, {@code code}, {@code ingredient}, {@code regulatory}, {@code meta}, {@code medicineClassification}, {@code synonym}, {@code relatedMedicationKnowledge}, {@code intendedRoute}, {@code cost}, {@code implicitRules}, {@code contained}, {@code associatedMedication}, {@code drugCharacteristic}, {@code monograph}, {@code modifierExtension}, {@code text}, {@code manufacturer}, {@code doseForm}, {@code id}, {@code language}, {@code packaging}, {@code amount}, {@code monitoringProgram}, {@code status}, {@code productType}, {@code contraindication}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(kinetics);
    h += (h << 5) + Objects.hashCode(preparationInstruction);
    h += (h << 5) + Objects.hashCode(administrationGuidelines);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(ingredient);
    h += (h << 5) + Objects.hashCode(regulatory);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(medicineClassification);
    h += (h << 5) + Objects.hashCode(synonym);
    h += (h << 5) + Objects.hashCode(relatedMedicationKnowledge);
    h += (h << 5) + Objects.hashCode(intendedRoute);
    h += (h << 5) + Objects.hashCode(cost);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(associatedMedication);
    h += (h << 5) + Objects.hashCode(drugCharacteristic);
    h += (h << 5) + Objects.hashCode(monograph);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(doseForm);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(packaging);
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(monitoringProgram);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(productType);
    h += (h << 5) + Objects.hashCode(contraindication);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge{");
    builder.append("resourceType=").append(resourceType);
    if (kinetics != null) {
      builder.append(", ");
      builder.append("kinetics=").append(kinetics);
    }
    if (preparationInstruction != null) {
      builder.append(", ");
      builder.append("preparationInstruction=").append(preparationInstruction);
    }
    if (administrationGuidelines != null) {
      builder.append(", ");
      builder.append("administrationGuidelines=").append(administrationGuidelines);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (ingredient != null) {
      builder.append(", ");
      builder.append("ingredient=").append(ingredient);
    }
    if (regulatory != null) {
      builder.append(", ");
      builder.append("regulatory=").append(regulatory);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (medicineClassification != null) {
      builder.append(", ");
      builder.append("medicineClassification=").append(medicineClassification);
    }
    if (synonym != null) {
      builder.append(", ");
      builder.append("synonym=").append(synonym);
    }
    if (relatedMedicationKnowledge != null) {
      builder.append(", ");
      builder.append("relatedMedicationKnowledge=").append(relatedMedicationKnowledge);
    }
    if (intendedRoute != null) {
      builder.append(", ");
      builder.append("intendedRoute=").append(intendedRoute);
    }
    if (cost != null) {
      builder.append(", ");
      builder.append("cost=").append(cost);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (associatedMedication != null) {
      builder.append(", ");
      builder.append("associatedMedication=").append(associatedMedication);
    }
    if (drugCharacteristic != null) {
      builder.append(", ");
      builder.append("drugCharacteristic=").append(drugCharacteristic);
    }
    if (monograph != null) {
      builder.append(", ");
      builder.append("monograph=").append(monograph);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (doseForm != null) {
      builder.append(", ");
      builder.append("doseForm=").append(doseForm);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (packaging != null) {
      builder.append(", ");
      builder.append("packaging=").append(packaging);
    }
    if (amount != null) {
      builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (monitoringProgram != null) {
      builder.append(", ");
      builder.append("monitoringProgram=").append(monitoringProgram);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (productType != null) {
      builder.append(", ");
      builder.append("productType=").append(productType);
    }
    if (contraindication != null) {
      builder.append(", ");
      builder.append("contraindication=").append(contraindication);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge {
    @Nullable String resourceType;
    @Nullable Optional<List<MedicationKnowledge_Kinetics>> kinetics = Optional.empty();
    boolean kineticsIsSet;
    @Nullable Optional<Markdown> preparationInstruction = Optional.empty();
    boolean preparationInstructionIsSet;
    @Nullable Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines = Optional.empty();
    boolean administrationGuidelinesIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<MedicationKnowledge_Ingredient>> ingredient = Optional.empty();
    boolean ingredientIsSet;
    @Nullable Optional<List<MedicationKnowledge_Regulatory>> regulatory = Optional.empty();
    boolean regulatoryIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification = Optional.empty();
    boolean medicineClassificationIsSet;
    @Nullable Optional<List<String>> synonym = Optional.empty();
    boolean synonymIsSet;
    @Nullable Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge = Optional.empty();
    boolean relatedMedicationKnowledgeIsSet;
    @Nullable Optional<List<CodeableConcept>> intendedRoute = Optional.empty();
    boolean intendedRouteIsSet;
    @Nullable Optional<List<MedicationKnowledge_Cost>> cost = Optional.empty();
    boolean costIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Reference>> associatedMedication = Optional.empty();
    boolean associatedMedicationIsSet;
    @Nullable Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic = Optional.empty();
    boolean drugCharacteristicIsSet;
    @Nullable Optional<List<MedicationKnowledge_Monograph>> monograph = Optional.empty();
    boolean monographIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<CodeableConcept> doseForm = Optional.empty();
    boolean doseFormIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<MedicationKnowledge_Packaging> packaging = Optional.empty();
    boolean packagingIsSet;
    @Nullable Optional<Quantity> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram = Optional.empty();
    boolean monitoringProgramIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<CodeableConcept>> productType = Optional.empty();
    boolean productTypeIsSet;
    @Nullable Optional<List<Reference>> contraindication = Optional.empty();
    boolean contraindicationIsSet;
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("kinetics")
    public void setKinetics(Optional<List<MedicationKnowledge_Kinetics>> kinetics) {
      this.kinetics = kinetics;
      this.kineticsIsSet = true;
    }
    @JsonProperty("preparationInstruction")
    public void setPreparationInstruction(Optional<Markdown> preparationInstruction) {
      this.preparationInstruction = preparationInstruction;
      this.preparationInstructionIsSet = true;
    }
    @JsonProperty("administrationGuidelines")
    public void setAdministrationGuidelines(Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines) {
      this.administrationGuidelines = administrationGuidelines;
      this.administrationGuidelinesIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("ingredient")
    public void setIngredient(Optional<List<MedicationKnowledge_Ingredient>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
    }
    @JsonProperty("regulatory")
    public void setRegulatory(Optional<List<MedicationKnowledge_Regulatory>> regulatory) {
      this.regulatory = regulatory;
      this.regulatoryIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("medicineClassification")
    public void setMedicineClassification(Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification) {
      this.medicineClassification = medicineClassification;
      this.medicineClassificationIsSet = true;
    }
    @JsonProperty("synonym")
    public void setSynonym(Optional<List<String>> synonym) {
      this.synonym = synonym;
      this.synonymIsSet = true;
    }
    @JsonProperty("relatedMedicationKnowledge")
    public void setRelatedMedicationKnowledge(Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge) {
      this.relatedMedicationKnowledge = relatedMedicationKnowledge;
      this.relatedMedicationKnowledgeIsSet = true;
    }
    @JsonProperty("intendedRoute")
    public void setIntendedRoute(Optional<List<CodeableConcept>> intendedRoute) {
      this.intendedRoute = intendedRoute;
      this.intendedRouteIsSet = true;
    }
    @JsonProperty("cost")
    public void setCost(Optional<List<MedicationKnowledge_Cost>> cost) {
      this.cost = cost;
      this.costIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("associatedMedication")
    public void setAssociatedMedication(Optional<List<Reference>> associatedMedication) {
      this.associatedMedication = associatedMedication;
      this.associatedMedicationIsSet = true;
    }
    @JsonProperty("drugCharacteristic")
    public void setDrugCharacteristic(Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic) {
      this.drugCharacteristic = drugCharacteristic;
      this.drugCharacteristicIsSet = true;
    }
    @JsonProperty("monograph")
    public void setMonograph(Optional<List<MedicationKnowledge_Monograph>> monograph) {
      this.monograph = monograph;
      this.monographIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<Reference> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("doseForm")
    public void setDoseForm(Optional<CodeableConcept> doseForm) {
      this.doseForm = doseForm;
      this.doseFormIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("packaging")
    public void setPackaging(Optional<MedicationKnowledge_Packaging> packaging) {
      this.packaging = packaging;
      this.packagingIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Optional<Quantity> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @JsonProperty("monitoringProgram")
    public void setMonitoringProgram(Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram) {
      this.monitoringProgram = monitoringProgram;
      this.monitoringProgramIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("productType")
    public void setProductType(Optional<List<CodeableConcept>> productType) {
      this.productType = productType;
      this.productTypeIsSet = true;
    }
    @JsonProperty("contraindication")
    public void setContraindication(Optional<List<Reference>> contraindication) {
      this.contraindication = contraindication;
      this.contraindicationIsSet = true;
    }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Kinetics>> kinetics() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> preparationInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Ingredient>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Regulatory>> regulatory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> synonym() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> intendedRoute() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Cost>> cost() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> associatedMedication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Monograph>> monograph() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> doseForm() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicationKnowledge_Packaging> packaging() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> productType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> contraindication() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge fromJson(Json json) {
    ImmutableMedicationKnowledge.Builder builder = ((ImmutableMedicationKnowledge.Builder) ImmutableMedicationKnowledge.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.kineticsIsSet) {
      builder.kinetics(json.kinetics);
    }
    if (json.preparationInstructionIsSet) {
      builder.preparationInstruction(json.preparationInstruction);
    }
    if (json.administrationGuidelinesIsSet) {
      builder.administrationGuidelines(json.administrationGuidelines);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.regulatoryIsSet) {
      builder.regulatory(json.regulatory);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.medicineClassificationIsSet) {
      builder.medicineClassification(json.medicineClassification);
    }
    if (json.synonymIsSet) {
      builder.synonym(json.synonym);
    }
    if (json.relatedMedicationKnowledgeIsSet) {
      builder.relatedMedicationKnowledge(json.relatedMedicationKnowledge);
    }
    if (json.intendedRouteIsSet) {
      builder.intendedRoute(json.intendedRoute);
    }
    if (json.costIsSet) {
      builder.cost(json.cost);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.associatedMedicationIsSet) {
      builder.associatedMedication(json.associatedMedication);
    }
    if (json.drugCharacteristicIsSet) {
      builder.drugCharacteristic(json.drugCharacteristic);
    }
    if (json.monographIsSet) {
      builder.monograph(json.monograph);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.doseFormIsSet) {
      builder.doseForm(json.doseForm);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.packagingIsSet) {
      builder.packaging(json.packaging);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.monitoringProgramIsSet) {
      builder.monitoringProgram(json.monitoringProgram);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.productTypeIsSet) {
      builder.productType(json.productType);
    }
    if (json.contraindicationIsSet) {
      builder.contraindication(json.contraindication);
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
        .resourceType(instance.resourceType())
        .kinetics(instance.kinetics())
        .preparationInstruction(instance.preparationInstruction())
        .administrationGuidelines(instance.administrationGuidelines())
        .extension(instance.extension())
        .code(instance.code())
        .ingredient(instance.ingredient())
        .regulatory(instance.regulatory())
        .meta(instance.meta())
        .medicineClassification(instance.medicineClassification())
        .synonym(instance.synonym())
        .relatedMedicationKnowledge(instance.relatedMedicationKnowledge())
        .intendedRoute(instance.intendedRoute())
        .cost(instance.cost())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .associatedMedication(instance.associatedMedication())
        .drugCharacteristic(instance.drugCharacteristic())
        .monograph(instance.monograph())
        .modifierExtension(instance.modifierExtension())
        .text(instance.text())
        .manufacturer(instance.manufacturer())
        .doseForm(instance.doseForm())
        .id(instance.id())
        .language(instance.language())
        .packaging(instance.packaging())
        .amount(instance.amount())
        .monitoringProgram(instance.monitoringProgram())
        .status(instance.status())
        .productType(instance.productType())
        .contraindication(instance.contraindication())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge MedicationKnowledge}.
   * <pre>
   * ImmutableMedicationKnowledge.builder()
   *    .resourceType(String) // required {@link MedicationKnowledge#resourceType() resourceType}
   *    .kinetics(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_Kinetics&amp;gt;) // optional {@link MedicationKnowledge#kinetics() kinetics}
   *    .preparationInstruction(com.medplum.types.fhir.Markdown) // optional {@link MedicationKnowledge#preparationInstruction() preparationInstruction}
   *    .administrationGuidelines(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_AdministrationGuidelines&amp;gt;) // optional {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge#extension() extension}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge#code() code}
   *    .ingredient(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_Ingredient&amp;gt;) // optional {@link MedicationKnowledge#ingredient() ingredient}
   *    .regulatory(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_Regulatory&amp;gt;) // optional {@link MedicationKnowledge#regulatory() regulatory}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicationKnowledge#meta() meta}
   *    .medicineClassification(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_MedicineClassification&amp;gt;) // optional {@link MedicationKnowledge#medicineClassification() medicineClassification}
   *    .synonym(List&amp;lt;String&amp;gt;) // optional {@link MedicationKnowledge#synonym() synonym}
   *    .relatedMedicationKnowledge(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_RelatedMedicationKnowledge&amp;gt;) // optional {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge}
   *    .intendedRoute(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationKnowledge#intendedRoute() intendedRoute}
   *    .cost(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_Cost&amp;gt;) // optional {@link MedicationKnowledge#cost() cost}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicationKnowledge#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicationKnowledge#contained() contained}
   *    .associatedMedication(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationKnowledge#associatedMedication() associatedMedication}
   *    .drugCharacteristic(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_DrugCharacteristic&amp;gt;) // optional {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic}
   *    .monograph(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_Monograph&amp;gt;) // optional {@link MedicationKnowledge#monograph() monograph}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge#modifierExtension() modifierExtension}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicationKnowledge#text() text}
   *    .manufacturer(com.medplum.types.fhir.Reference) // optional {@link MedicationKnowledge#manufacturer() manufacturer}
   *    .doseForm(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge#doseForm() doseForm}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicationKnowledge#id() id}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicationKnowledge#language() language}
   *    .packaging(com.medplum.types.fhir.MedicationKnowledge_Packaging) // optional {@link MedicationKnowledge#packaging() packaging}
   *    .amount(com.medplum.types.fhir.Quantity) // optional {@link MedicationKnowledge#amount() amount}
   *    .monitoringProgram(List&amp;lt;com.medplum.types.fhir.MedicationKnowledge_MonitoringProgram&amp;gt;) // optional {@link MedicationKnowledge#monitoringProgram() monitoringProgram}
   *    .status(com.medplum.types.fhir.Code) // optional {@link MedicationKnowledge#status() status}
   *    .productType(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationKnowledge#productType() productType}
   *    .contraindication(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationKnowledge#contraindication() contraindication}
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
  @Generated(from = "MedicationKnowledge", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_KINETICS = 0x1L;
    private static final long OPT_BIT_PREPARATION_INSTRUCTION = 0x2L;
    private static final long OPT_BIT_ADMINISTRATION_GUIDELINES = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_INGREDIENT = 0x20L;
    private static final long OPT_BIT_REGULATORY = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_MEDICINE_CLASSIFICATION = 0x100L;
    private static final long OPT_BIT_SYNONYM = 0x200L;
    private static final long OPT_BIT_RELATED_MEDICATION_KNOWLEDGE = 0x400L;
    private static final long OPT_BIT_INTENDED_ROUTE = 0x800L;
    private static final long OPT_BIT_COST = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_CONTAINED = 0x4000L;
    private static final long OPT_BIT_ASSOCIATED_MEDICATION = 0x8000L;
    private static final long OPT_BIT_DRUG_CHARACTERISTIC = 0x10000L;
    private static final long OPT_BIT_MONOGRAPH = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private static final long OPT_BIT_TEXT = 0x80000L;
    private static final long OPT_BIT_MANUFACTURER = 0x100000L;
    private static final long OPT_BIT_DOSE_FORM = 0x200000L;
    private static final long OPT_BIT_ID = 0x400000L;
    private static final long OPT_BIT_LANGUAGE = 0x800000L;
    private static final long OPT_BIT_PACKAGING = 0x1000000L;
    private static final long OPT_BIT_AMOUNT = 0x2000000L;
    private static final long OPT_BIT_MONITORING_PROGRAM = 0x4000000L;
    private static final long OPT_BIT_STATUS = 0x8000000L;
    private static final long OPT_BIT_PRODUCT_TYPE = 0x10000000L;
    private static final long OPT_BIT_CONTRAINDICATION = 0x20000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String resourceType;
    private @Nullable List<MedicationKnowledge_Kinetics> kinetics;
    private @Nullable Markdown preparationInstruction;
    private @Nullable List<MedicationKnowledge_AdministrationGuidelines> administrationGuidelines;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept code;
    private @Nullable List<MedicationKnowledge_Ingredient> ingredient;
    private @Nullable List<MedicationKnowledge_Regulatory> regulatory;
    private @Nullable Meta meta;
    private @Nullable List<MedicationKnowledge_MedicineClassification> medicineClassification;
    private @Nullable List<String> synonym;
    private @Nullable List<MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge;
    private @Nullable List<CodeableConcept> intendedRoute;
    private @Nullable List<MedicationKnowledge_Cost> cost;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Reference> associatedMedication;
    private @Nullable List<MedicationKnowledge_DrugCharacteristic> drugCharacteristic;
    private @Nullable List<MedicationKnowledge_Monograph> monograph;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Narrative text;
    private @Nullable Reference manufacturer;
    private @Nullable CodeableConcept doseForm;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable MedicationKnowledge_Packaging packaging;
    private @Nullable Quantity amount;
    private @Nullable List<MedicationKnowledge_MonitoringProgram> monitoringProgram;
    private @Nullable Code status;
    private @Nullable List<CodeableConcept> productType;
    private @Nullable List<Reference> contraindication;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link MedicationKnowledge#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for chained invocation
     */
    public final Builder kinetics(List<MedicationKnowledge_Kinetics> kinetics) {
      checkNotIsSet(kineticsIsSet(), "kinetics");
      this.kinetics = Objects.requireNonNull(kinetics, "kinetics");
      optBits |= OPT_BIT_KINETICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kinetics")
    public final Builder kinetics(Optional<? extends List<MedicationKnowledge_Kinetics>> kinetics) {
      checkNotIsSet(kineticsIsSet(), "kinetics");
      this.kinetics = kinetics.orElse(null);
      optBits |= OPT_BIT_KINETICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder preparationInstruction(Markdown preparationInstruction) {
      checkNotIsSet(preparationInstructionIsSet(), "preparationInstruction");
      this.preparationInstruction = Objects.requireNonNull(preparationInstruction, "preparationInstruction");
      optBits |= OPT_BIT_PREPARATION_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preparationInstruction")
    public final Builder preparationInstruction(Optional<? extends Markdown> preparationInstruction) {
      checkNotIsSet(preparationInstructionIsSet(), "preparationInstruction");
      this.preparationInstruction = preparationInstruction.orElse(null);
      optBits |= OPT_BIT_PREPARATION_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for chained invocation
     */
    public final Builder administrationGuidelines(List<MedicationKnowledge_AdministrationGuidelines> administrationGuidelines) {
      checkNotIsSet(administrationGuidelinesIsSet(), "administrationGuidelines");
      this.administrationGuidelines = Objects.requireNonNull(administrationGuidelines, "administrationGuidelines");
      optBits |= OPT_BIT_ADMINISTRATION_GUIDELINES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("administrationGuidelines")
    public final Builder administrationGuidelines(Optional<? extends List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines) {
      checkNotIsSet(administrationGuidelinesIsSet(), "administrationGuidelines");
      this.administrationGuidelines = administrationGuidelines.orElse(null);
      optBits |= OPT_BIT_ADMINISTRATION_GUIDELINES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    public final Builder ingredient(List<MedicationKnowledge_Ingredient> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = Objects.requireNonNull(ingredient, "ingredient");
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ingredient")
    public final Builder ingredient(Optional<? extends List<MedicationKnowledge_Ingredient>> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = ingredient.orElse(null);
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for chained invocation
     */
    public final Builder regulatory(List<MedicationKnowledge_Regulatory> regulatory) {
      checkNotIsSet(regulatoryIsSet(), "regulatory");
      this.regulatory = Objects.requireNonNull(regulatory, "regulatory");
      optBits |= OPT_BIT_REGULATORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("regulatory")
    public final Builder regulatory(Optional<? extends List<MedicationKnowledge_Regulatory>> regulatory) {
      checkNotIsSet(regulatoryIsSet(), "regulatory");
      this.regulatory = regulatory.orElse(null);
      optBits |= OPT_BIT_REGULATORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicineClassification(List<MedicationKnowledge_MedicineClassification> medicineClassification) {
      checkNotIsSet(medicineClassificationIsSet(), "medicineClassification");
      this.medicineClassification = Objects.requireNonNull(medicineClassification, "medicineClassification");
      optBits |= OPT_BIT_MEDICINE_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medicineClassification")
    public final Builder medicineClassification(Optional<? extends List<MedicationKnowledge_MedicineClassification>> medicineClassification) {
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
    public final Builder synonym(List<String> synonym) {
      checkNotIsSet(synonymIsSet(), "synonym");
      this.synonym = Objects.requireNonNull(synonym, "synonym");
      optBits |= OPT_BIT_SYNONYM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("synonym")
    public final Builder synonym(Optional<? extends List<String>> synonym) {
      checkNotIsSet(synonymIsSet(), "synonym");
      this.synonym = synonym.orElse(null);
      optBits |= OPT_BIT_SYNONYM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedMedicationKnowledge(List<MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge) {
      checkNotIsSet(relatedMedicationKnowledgeIsSet(), "relatedMedicationKnowledge");
      this.relatedMedicationKnowledge = Objects.requireNonNull(relatedMedicationKnowledge, "relatedMedicationKnowledge");
      optBits |= OPT_BIT_RELATED_MEDICATION_KNOWLEDGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatedMedicationKnowledge")
    public final Builder relatedMedicationKnowledge(Optional<? extends List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge) {
      checkNotIsSet(relatedMedicationKnowledgeIsSet(), "relatedMedicationKnowledge");
      this.relatedMedicationKnowledge = relatedMedicationKnowledge.orElse(null);
      optBits |= OPT_BIT_RELATED_MEDICATION_KNOWLEDGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for chained invocation
     */
    public final Builder intendedRoute(List<CodeableConcept> intendedRoute) {
      checkNotIsSet(intendedRouteIsSet(), "intendedRoute");
      this.intendedRoute = Objects.requireNonNull(intendedRoute, "intendedRoute");
      optBits |= OPT_BIT_INTENDED_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intendedRoute")
    public final Builder intendedRoute(Optional<? extends List<CodeableConcept>> intendedRoute) {
      checkNotIsSet(intendedRouteIsSet(), "intendedRoute");
      this.intendedRoute = intendedRoute.orElse(null);
      optBits |= OPT_BIT_INTENDED_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    public final Builder cost(List<MedicationKnowledge_Cost> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = Objects.requireNonNull(cost, "cost");
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cost")
    public final Builder cost(Optional<? extends List<MedicationKnowledge_Cost>> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = cost.orElse(null);
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for chained invocation
     */
    public final Builder associatedMedication(List<Reference> associatedMedication) {
      checkNotIsSet(associatedMedicationIsSet(), "associatedMedication");
      this.associatedMedication = Objects.requireNonNull(associatedMedication, "associatedMedication");
      optBits |= OPT_BIT_ASSOCIATED_MEDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("associatedMedication")
    public final Builder associatedMedication(Optional<? extends List<Reference>> associatedMedication) {
      checkNotIsSet(associatedMedicationIsSet(), "associatedMedication");
      this.associatedMedication = associatedMedication.orElse(null);
      optBits |= OPT_BIT_ASSOCIATED_MEDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder drugCharacteristic(List<MedicationKnowledge_DrugCharacteristic> drugCharacteristic) {
      checkNotIsSet(drugCharacteristicIsSet(), "drugCharacteristic");
      this.drugCharacteristic = Objects.requireNonNull(drugCharacteristic, "drugCharacteristic");
      optBits |= OPT_BIT_DRUG_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("drugCharacteristic")
    public final Builder drugCharacteristic(Optional<? extends List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic) {
      checkNotIsSet(drugCharacteristicIsSet(), "drugCharacteristic");
      this.drugCharacteristic = drugCharacteristic.orElse(null);
      optBits |= OPT_BIT_DRUG_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for chained invocation
     */
    public final Builder monograph(List<MedicationKnowledge_Monograph> monograph) {
      checkNotIsSet(monographIsSet(), "monograph");
      this.monograph = Objects.requireNonNull(monograph, "monograph");
      optBits |= OPT_BIT_MONOGRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("monograph")
    public final Builder monograph(Optional<? extends List<MedicationKnowledge_Monograph>> monograph) {
      checkNotIsSet(monographIsSet(), "monograph");
      this.monograph = monograph.orElse(null);
      optBits |= OPT_BIT_MONOGRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(Reference manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturer")
    public final Builder manufacturer(Optional<? extends Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseForm(CodeableConcept doseForm) {
      checkNotIsSet(doseFormIsSet(), "doseForm");
      this.doseForm = Objects.requireNonNull(doseForm, "doseForm");
      optBits |= OPT_BIT_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseForm")
    public final Builder doseForm(Optional<? extends CodeableConcept> doseForm) {
      checkNotIsSet(doseFormIsSet(), "doseForm");
      this.doseForm = doseForm.orElse(null);
      optBits |= OPT_BIT_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for chained invocation
     */
    public final Builder packaging(MedicationKnowledge_Packaging packaging) {
      checkNotIsSet(packagingIsSet(), "packaging");
      this.packaging = Objects.requireNonNull(packaging, "packaging");
      optBits |= OPT_BIT_PACKAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("packaging")
    public final Builder packaging(Optional<? extends MedicationKnowledge_Packaging> packaging) {
      checkNotIsSet(packagingIsSet(), "packaging");
      this.packaging = packaging.orElse(null);
      optBits |= OPT_BIT_PACKAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(Quantity amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends Quantity> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for chained invocation
     */
    public final Builder monitoringProgram(List<MedicationKnowledge_MonitoringProgram> monitoringProgram) {
      checkNotIsSet(monitoringProgramIsSet(), "monitoringProgram");
      this.monitoringProgram = Objects.requireNonNull(monitoringProgram, "monitoringProgram");
      optBits |= OPT_BIT_MONITORING_PROGRAM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("monitoringProgram")
    public final Builder monitoringProgram(Optional<? extends List<MedicationKnowledge_MonitoringProgram>> monitoringProgram) {
      checkNotIsSet(monitoringProgramIsSet(), "monitoringProgram");
      this.monitoringProgram = monitoringProgram.orElse(null);
      optBits |= OPT_BIT_MONITORING_PROGRAM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for chained invocation
     */
    public final Builder productType(List<CodeableConcept> productType) {
      checkNotIsSet(productTypeIsSet(), "productType");
      this.productType = Objects.requireNonNull(productType, "productType");
      optBits |= OPT_BIT_PRODUCT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productType")
    public final Builder productType(Optional<? extends List<CodeableConcept>> productType) {
      checkNotIsSet(productTypeIsSet(), "productType");
      this.productType = productType.orElse(null);
      optBits |= OPT_BIT_PRODUCT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for chained invocation
     */
    public final Builder contraindication(List<Reference> contraindication) {
      checkNotIsSet(contraindicationIsSet(), "contraindication");
      this.contraindication = Objects.requireNonNull(contraindication, "contraindication");
      optBits |= OPT_BIT_CONTRAINDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contraindication")
    public final Builder contraindication(Optional<? extends List<Reference>> contraindication) {
      checkNotIsSet(contraindicationIsSet(), "contraindication");
      this.contraindication = contraindication.orElse(null);
      optBits |= OPT_BIT_CONTRAINDICATION;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge MedicationKnowledge}.
     * @return An immutable instance of MedicationKnowledge
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge build() {
      checkRequiredAttributes();
      return new ImmutableMedicationKnowledge(
          resourceType,
          kinetics,
          preparationInstruction,
          administrationGuidelines,
          extension,
          code,
          ingredient,
          regulatory,
          meta,
          medicineClassification,
          synonym,
          relatedMedicationKnowledge,
          intendedRoute,
          cost,
          implicitRules,
          contained,
          associatedMedication,
          drugCharacteristic,
          monograph,
          modifierExtension,
          text,
          manufacturer,
          doseForm,
          id,
          language,
          packaging,
          amount,
          monitoringProgram,
          status,
          productType,
          contraindication);
    }

    private boolean kineticsIsSet() {
      return (optBits & OPT_BIT_KINETICS) != 0;
    }

    private boolean preparationInstructionIsSet() {
      return (optBits & OPT_BIT_PREPARATION_INSTRUCTION) != 0;
    }

    private boolean administrationGuidelinesIsSet() {
      return (optBits & OPT_BIT_ADMINISTRATION_GUIDELINES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
    }

    private boolean regulatoryIsSet() {
      return (optBits & OPT_BIT_REGULATORY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean medicineClassificationIsSet() {
      return (optBits & OPT_BIT_MEDICINE_CLASSIFICATION) != 0;
    }

    private boolean synonymIsSet() {
      return (optBits & OPT_BIT_SYNONYM) != 0;
    }

    private boolean relatedMedicationKnowledgeIsSet() {
      return (optBits & OPT_BIT_RELATED_MEDICATION_KNOWLEDGE) != 0;
    }

    private boolean intendedRouteIsSet() {
      return (optBits & OPT_BIT_INTENDED_ROUTE) != 0;
    }

    private boolean costIsSet() {
      return (optBits & OPT_BIT_COST) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean associatedMedicationIsSet() {
      return (optBits & OPT_BIT_ASSOCIATED_MEDICATION) != 0;
    }

    private boolean drugCharacteristicIsSet() {
      return (optBits & OPT_BIT_DRUG_CHARACTERISTIC) != 0;
    }

    private boolean monographIsSet() {
      return (optBits & OPT_BIT_MONOGRAPH) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean doseFormIsSet() {
      return (optBits & OPT_BIT_DOSE_FORM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean packagingIsSet() {
      return (optBits & OPT_BIT_PACKAGING) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean monitoringProgramIsSet() {
      return (optBits & OPT_BIT_MONITORING_PROGRAM) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean productTypeIsSet() {
      return (optBits & OPT_BIT_PRODUCT_TYPE) != 0;
    }

    private boolean contraindicationIsSet() {
      return (optBits & OPT_BIT_CONTRAINDICATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicationKnowledge, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationKnowledge", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationKnowledge#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicationKnowledge", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kinetics(List<MedicationKnowledge_Kinetics> kinetics);

    /**
     * Initializes the optional value {@link MedicationKnowledge#kinetics() kinetics} to kinetics.
     * @param kinetics The value for kinetics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kinetics(Optional<? extends List<MedicationKnowledge_Kinetics>> kinetics);

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preparationInstruction(Markdown preparationInstruction);

    /**
     * Initializes the optional value {@link MedicationKnowledge#preparationInstruction() preparationInstruction} to preparationInstruction.
     * @param preparationInstruction The value for preparationInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preparationInstruction(Optional<? extends Markdown> preparationInstruction);

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for chained invocation
     */
    BuildFinal administrationGuidelines(List<MedicationKnowledge_AdministrationGuidelines> administrationGuidelines);

    /**
     * Initializes the optional value {@link MedicationKnowledge#administrationGuidelines() administrationGuidelines} to administrationGuidelines.
     * @param administrationGuidelines The value for administrationGuidelines
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal administrationGuidelines(Optional<? extends List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines);

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link MedicationKnowledge#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(List<MedicationKnowledge_Ingredient> ingredient);

    /**
     * Initializes the optional value {@link MedicationKnowledge#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(Optional<? extends List<MedicationKnowledge_Ingredient>> ingredient);

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal regulatory(List<MedicationKnowledge_Regulatory> regulatory);

    /**
     * Initializes the optional value {@link MedicationKnowledge#regulatory() regulatory} to regulatory.
     * @param regulatory The value for regulatory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal regulatory(Optional<? extends List<MedicationKnowledge_Regulatory>> regulatory);

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicationKnowledge#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicineClassification(List<MedicationKnowledge_MedicineClassification> medicineClassification);

    /**
     * Initializes the optional value {@link MedicationKnowledge#medicineClassification() medicineClassification} to medicineClassification.
     * @param medicineClassification The value for medicineClassification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicineClassification(Optional<? extends List<MedicationKnowledge_MedicineClassification>> medicineClassification);

    /**
     * Initializes the optional value {@link MedicationKnowledge#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for chained invocation
     */
    BuildFinal synonym(List<String> synonym);

    /**
     * Initializes the optional value {@link MedicationKnowledge#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal synonym(Optional<? extends List<String>> synonym);

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedMedicationKnowledge(List<MedicationKnowledge_RelatedMedicationKnowledge> relatedMedicationKnowledge);

    /**
     * Initializes the optional value {@link MedicationKnowledge#relatedMedicationKnowledge() relatedMedicationKnowledge} to relatedMedicationKnowledge.
     * @param relatedMedicationKnowledge The value for relatedMedicationKnowledge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedMedicationKnowledge(Optional<? extends List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge);

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intendedRoute(List<CodeableConcept> intendedRoute);

    /**
     * Initializes the optional value {@link MedicationKnowledge#intendedRoute() intendedRoute} to intendedRoute.
     * @param intendedRoute The value for intendedRoute
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intendedRoute(Optional<? extends List<CodeableConcept>> intendedRoute);

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cost(List<MedicationKnowledge_Cost> cost);

    /**
     * Initializes the optional value {@link MedicationKnowledge#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cost(Optional<? extends List<MedicationKnowledge_Cost>> cost);

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationKnowledge#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal associatedMedication(List<Reference> associatedMedication);

    /**
     * Initializes the optional value {@link MedicationKnowledge#associatedMedication() associatedMedication} to associatedMedication.
     * @param associatedMedication The value for associatedMedication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal associatedMedication(Optional<? extends List<Reference>> associatedMedication);

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal drugCharacteristic(List<MedicationKnowledge_DrugCharacteristic> drugCharacteristic);

    /**
     * Initializes the optional value {@link MedicationKnowledge#drugCharacteristic() drugCharacteristic} to drugCharacteristic.
     * @param drugCharacteristic The value for drugCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal drugCharacteristic(Optional<? extends List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for chained invocation
     */
    BuildFinal monograph(List<MedicationKnowledge_Monograph> monograph);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monograph() monograph} to monograph.
     * @param monograph The value for monograph
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal monograph(Optional<? extends List<MedicationKnowledge_Monograph>> monograph);

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicationKnowledge#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(Reference manufacturer);

    /**
     * Initializes the optional value {@link MedicationKnowledge#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<? extends Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseForm(CodeableConcept doseForm);

    /**
     * Initializes the optional value {@link MedicationKnowledge#doseForm() doseForm} to doseForm.
     * @param doseForm The value for doseForm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseForm(Optional<? extends CodeableConcept> doseForm);

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicationKnowledge#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicationKnowledge#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packaging(MedicationKnowledge_Packaging packaging);

    /**
     * Initializes the optional value {@link MedicationKnowledge#packaging() packaging} to packaging.
     * @param packaging The value for packaging
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packaging(Optional<? extends MedicationKnowledge_Packaging> packaging);

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(Quantity amount);

    /**
     * Initializes the optional value {@link MedicationKnowledge#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(Optional<? extends Quantity> amount);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for chained invocation
     */
    BuildFinal monitoringProgram(List<MedicationKnowledge_MonitoringProgram> monitoringProgram);

    /**
     * Initializes the optional value {@link MedicationKnowledge#monitoringProgram() monitoringProgram} to monitoringProgram.
     * @param monitoringProgram The value for monitoringProgram
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal monitoringProgram(Optional<? extends List<MedicationKnowledge_MonitoringProgram>> monitoringProgram);

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link MedicationKnowledge#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productType(List<CodeableConcept> productType);

    /**
     * Initializes the optional value {@link MedicationKnowledge#productType() productType} to productType.
     * @param productType The value for productType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productType(Optional<? extends List<CodeableConcept>> productType);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contraindication(List<Reference> contraindication);

    /**
     * Initializes the optional value {@link MedicationKnowledge#contraindication() contraindication} to contraindication.
     * @param contraindication The value for contraindication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contraindication(Optional<? extends List<Reference>> contraindication);

    /**
     * Builds a new {@link MedicationKnowledge MedicationKnowledge}.
     * @return An immutable instance of MedicationKnowledge
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationKnowledge build();
  }
}
