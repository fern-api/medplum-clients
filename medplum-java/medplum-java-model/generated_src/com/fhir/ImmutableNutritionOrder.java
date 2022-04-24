//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link NutritionOrder}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNutritionOrder.builder()}.
 */
@org.immutables.value.Generated(from = "NutritionOrder", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNutritionOrder implements com.fhir.NutritionOrder {
  private final @javax.annotation.Nullable com.fhir.dateTime dateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> foodPreferenceModifier;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiates;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> excludeFoodModifier;
  private final @javax.annotation.Nullable com.fhir.NutritionOrder_OralDiet oralDiet;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference orderer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.NutritionOrder_Supplement> supplement;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.NutritionOrder_EnteralFormula enteralFormula;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.code intent;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> allergyIntolerance;

  private ImmutableNutritionOrder(
      @javax.annotation.Nullable com.fhir.dateTime dateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> foodPreferenceModifier,
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiates,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> excludeFoodModifier,
      @javax.annotation.Nullable com.fhir.NutritionOrder_OralDiet oralDiet,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference orderer,
      @javax.annotation.Nullable java.util.List<com.fhir.NutritionOrder_Supplement> supplement,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.NutritionOrder_EnteralFormula enteralFormula,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.code intent,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> allergyIntolerance) {
    this.dateTime = dateTime;
    this.foodPreferenceModifier = foodPreferenceModifier;
    this.patient = patient;
    this.instantiates = instantiates;
    this.instantiatesCanonical = instantiatesCanonical;
    this.excludeFoodModifier = excludeFoodModifier;
    this.oralDiet = oralDiet;
    this.extension = extension;
    this.resourceType = resourceType;
    this.id = id;
    this.orderer = orderer;
    this.supplement = supplement;
    this.contained = contained;
    this.identifier = identifier;
    this.instantiatesUri = instantiatesUri;
    this.note = note;
    this.enteralFormula = enteralFormula;
    this.encounter = encounter;
    this.language = language;
    this.intent = intent;
    this.status = status;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.allergyIntolerance = allergyIntolerance;
  }

  /**
   * @return The value of the {@code dateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dateTime")
  @Override
  public java.util.Optional<com.fhir.dateTime> dateTime() {
    return java.util.Optional.ofNullable(dateTime);
  }

  /**
   * @return The value of the {@code foodPreferenceModifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("foodPreferenceModifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> foodPreferenceModifier() {
    return java.util.Optional.ofNullable(foodPreferenceModifier);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code instantiates} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiates() {
    return java.util.Optional.ofNullable(instantiates);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code excludeFoodModifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("excludeFoodModifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> excludeFoodModifier() {
    return java.util.Optional.ofNullable(excludeFoodModifier);
  }

  /**
   * @return The value of the {@code oralDiet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("oralDiet")
  @Override
  public java.util.Optional<com.fhir.NutritionOrder_OralDiet> oralDiet() {
    return java.util.Optional.ofNullable(oralDiet);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code orderer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("orderer")
  @Override
  public java.util.Optional<com.fhir.Reference> orderer() {
    return java.util.Optional.ofNullable(orderer);
  }

  /**
   * @return The value of the {@code supplement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supplement")
  @Override
  public java.util.Optional<java.util.List<com.fhir.NutritionOrder_Supplement>> supplement() {
    return java.util.Optional.ofNullable(supplement);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code enteralFormula} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enteralFormula")
  @Override
  public java.util.Optional<com.fhir.NutritionOrder_EnteralFormula> enteralFormula() {
    return java.util.Optional.ofNullable(enteralFormula);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.code> intent() {
    return java.util.Optional.ofNullable(intent);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code allergyIntolerance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("allergyIntolerance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> allergyIntolerance() {
    return java.util.Optional.ofNullable(allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#dateTime() dateTime} attribute.
   * @param value The value for dateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withDateTime(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "dateTime");
    if (this.dateTime == newValue) return this;
    return new ImmutableNutritionOrder(
        newValue,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#dateTime() dateTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withDateTime(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.dateTime == value) return this;
    return new ImmutableNutritionOrder(
        value,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} attribute.
   * @param value The value for foodPreferenceModifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withFoodPreferenceModifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "foodPreferenceModifier");
    if (this.foodPreferenceModifier == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        newValue,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for foodPreferenceModifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withFoodPreferenceModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.foodPreferenceModifier == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        value,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NutritionOrder#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNutritionOrder withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        newValue,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#instantiates() instantiates} attribute.
   * @param value The value for instantiates
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withInstantiates(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiates");
    if (this.instantiates == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        newValue,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#instantiates() instantiates} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiates
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withInstantiates(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiates == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        value,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        newValue,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        value,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} attribute.
   * @param value The value for excludeFoodModifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withExcludeFoodModifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "excludeFoodModifier");
    if (this.excludeFoodModifier == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        newValue,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for excludeFoodModifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withExcludeFoodModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.excludeFoodModifier == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        value,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#oralDiet() oralDiet} attribute.
   * @param value The value for oralDiet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withOralDiet(com.fhir.NutritionOrder_OralDiet value) {
    @javax.annotation.Nullable com.fhir.NutritionOrder_OralDiet newValue = java.util.Objects.requireNonNull(value, "oralDiet");
    if (this.oralDiet == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        newValue,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#oralDiet() oralDiet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for oralDiet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withOralDiet(java.util.Optional<? extends com.fhir.NutritionOrder_OralDiet> optional) {
    @javax.annotation.Nullable com.fhir.NutritionOrder_OralDiet value = optional.orElse(null);
    if (this.oralDiet == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        value,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        newValue,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        value,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NutritionOrder#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNutritionOrder withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        newValue,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        newValue,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        value,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#orderer() orderer} attribute.
   * @param value The value for orderer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withOrderer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "orderer");
    if (this.orderer == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        newValue,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#orderer() orderer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withOrderer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.orderer == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        value,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#supplement() supplement} attribute.
   * @param value The value for supplement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withSupplement(java.util.List<com.fhir.NutritionOrder_Supplement> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.NutritionOrder_Supplement> newValue = java.util.Objects.requireNonNull(value, "supplement");
    if (this.supplement == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        newValue,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#supplement() supplement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withSupplement(java.util.Optional<? extends java.util.List<com.fhir.NutritionOrder_Supplement>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.NutritionOrder_Supplement> value = optional.orElse(null);
    if (this.supplement == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        value,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        newValue,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        value,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        newValue,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        value,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        newValue,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        value,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        newValue,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        value,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#enteralFormula() enteralFormula} attribute.
   * @param value The value for enteralFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withEnteralFormula(com.fhir.NutritionOrder_EnteralFormula value) {
    @javax.annotation.Nullable com.fhir.NutritionOrder_EnteralFormula newValue = java.util.Objects.requireNonNull(value, "enteralFormula");
    if (this.enteralFormula == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        newValue,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#enteralFormula() enteralFormula} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enteralFormula
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withEnteralFormula(java.util.Optional<? extends com.fhir.NutritionOrder_EnteralFormula> optional) {
    @javax.annotation.Nullable com.fhir.NutritionOrder_EnteralFormula value = optional.orElse(null);
    if (this.enteralFormula == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        value,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        newValue,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        value,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        newValue,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        value,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withIntent(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        newValue,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withIntent(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        value,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        newValue,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        value,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        newValue,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        value,
        this.meta,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        newValue,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        value,
        this.text,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        newValue,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        value,
        this.modifierExtension,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        newValue,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        value,
        this.allergyIntolerance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#allergyIntolerance() allergyIntolerance} attribute.
   * @param value The value for allergyIntolerance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withAllergyIntolerance(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "allergyIntolerance");
    if (this.allergyIntolerance == newValue) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#allergyIntolerance() allergyIntolerance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allergyIntolerance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withAllergyIntolerance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.allergyIntolerance == value) return this;
    return new ImmutableNutritionOrder(
        this.dateTime,
        this.foodPreferenceModifier,
        this.patient,
        this.instantiates,
        this.instantiatesCanonical,
        this.excludeFoodModifier,
        this.oralDiet,
        this.extension,
        this.resourceType,
        this.id,
        this.orderer,
        this.supplement,
        this.contained,
        this.identifier,
        this.instantiatesUri,
        this.note,
        this.enteralFormula,
        this.encounter,
        this.language,
        this.intent,
        this.status,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNutritionOrder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNutritionOrder
        && equalTo((ImmutableNutritionOrder) another);
  }

  private boolean equalTo(ImmutableNutritionOrder another) {
    return java.util.Objects.equals(dateTime, another.dateTime)
        && java.util.Objects.equals(foodPreferenceModifier, another.foodPreferenceModifier)
        && patient.equals(another.patient)
        && java.util.Objects.equals(instantiates, another.instantiates)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(excludeFoodModifier, another.excludeFoodModifier)
        && java.util.Objects.equals(oralDiet, another.oralDiet)
        && java.util.Objects.equals(extension, another.extension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(orderer, another.orderer)
        && java.util.Objects.equals(supplement, another.supplement)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(enteralFormula, another.enteralFormula)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(intent, another.intent)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(allergyIntolerance, another.allergyIntolerance);
  }

  /**
   * Computes a hash code from attributes: {@code dateTime}, {@code foodPreferenceModifier}, {@code patient}, {@code instantiates}, {@code instantiatesCanonical}, {@code excludeFoodModifier}, {@code oralDiet}, {@code extension}, {@code resourceType}, {@code id}, {@code orderer}, {@code supplement}, {@code contained}, {@code identifier}, {@code instantiatesUri}, {@code note}, {@code enteralFormula}, {@code encounter}, {@code language}, {@code intent}, {@code status}, {@code implicitRules}, {@code meta}, {@code text}, {@code modifierExtension}, {@code allergyIntolerance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(dateTime);
    h += (h << 5) + java.util.Objects.hashCode(foodPreferenceModifier);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(instantiates);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(excludeFoodModifier);
    h += (h << 5) + java.util.Objects.hashCode(oralDiet);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(orderer);
    h += (h << 5) + java.util.Objects.hashCode(supplement);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(enteralFormula);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(allergyIntolerance);
    return h;
  }

  /**
   * Prints the immutable value {@code NutritionOrder} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("NutritionOrder{");
    if (dateTime != null) {
      builder.append("dateTime=").append(dateTime);
    }
    if (foodPreferenceModifier != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("foodPreferenceModifier=").append(foodPreferenceModifier);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("patient=").append(patient);
    if (instantiates != null) {
      builder.append(", ");
      builder.append("instantiates=").append(instantiates);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (excludeFoodModifier != null) {
      builder.append(", ");
      builder.append("excludeFoodModifier=").append(excludeFoodModifier);
    }
    if (oralDiet != null) {
      builder.append(", ");
      builder.append("oralDiet=").append(oralDiet);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (orderer != null) {
      builder.append(", ");
      builder.append("orderer=").append(orderer);
    }
    if (supplement != null) {
      builder.append(", ");
      builder.append("supplement=").append(supplement);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (enteralFormula != null) {
      builder.append(", ");
      builder.append("enteralFormula=").append(enteralFormula);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (allergyIntolerance != null) {
      builder.append(", ");
      builder.append("allergyIntolerance=").append(allergyIntolerance);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "NutritionOrder", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.NutritionOrder {
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> dateTime = java.util.Optional.empty();
    boolean dateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> foodPreferenceModifier = java.util.Optional.empty();
    boolean foodPreferenceModifierIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiates = java.util.Optional.empty();
    boolean instantiatesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> excludeFoodModifier = java.util.Optional.empty();
    boolean excludeFoodModifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.NutritionOrder_OralDiet> oralDiet = java.util.Optional.empty();
    boolean oralDietIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> orderer = java.util.Optional.empty();
    boolean ordererIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.NutritionOrder_Supplement>> supplement = java.util.Optional.empty();
    boolean supplementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.NutritionOrder_EnteralFormula> enteralFormula = java.util.Optional.empty();
    boolean enteralFormulaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> allergyIntolerance = java.util.Optional.empty();
    boolean allergyIntoleranceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("dateTime")
    public void setDateTime(java.util.Optional<com.fhir.dateTime> dateTime) {
      this.dateTime = dateTime;
      this.dateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("foodPreferenceModifier")
    public void setFoodPreferenceModifier(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> foodPreferenceModifier) {
      this.foodPreferenceModifier = foodPreferenceModifier;
      this.foodPreferenceModifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
    public void setInstantiates(java.util.Optional<java.util.List<com.fhir.uri>> instantiates) {
      this.instantiates = instantiates;
      this.instantiatesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("excludeFoodModifier")
    public void setExcludeFoodModifier(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> excludeFoodModifier) {
      this.excludeFoodModifier = excludeFoodModifier;
      this.excludeFoodModifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("oralDiet")
    public void setOralDiet(java.util.Optional<com.fhir.NutritionOrder_OralDiet> oralDiet) {
      this.oralDiet = oralDiet;
      this.oralDietIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("orderer")
    public void setOrderer(java.util.Optional<com.fhir.Reference> orderer) {
      this.orderer = orderer;
      this.ordererIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supplement")
    public void setSupplement(java.util.Optional<java.util.List<com.fhir.NutritionOrder_Supplement>> supplement) {
      this.supplement = supplement;
      this.supplementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enteralFormula")
    public void setEnteralFormula(java.util.Optional<com.fhir.NutritionOrder_EnteralFormula> enteralFormula) {
      this.enteralFormula = enteralFormula;
      this.enteralFormulaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("allergyIntolerance")
    public void setAllergyIntolerance(java.util.Optional<java.util.List<com.fhir.Reference>> allergyIntolerance) {
      this.allergyIntolerance = allergyIntolerance;
      this.allergyIntoleranceIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.dateTime> dateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> foodPreferenceModifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiates() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> excludeFoodModifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.NutritionOrder_OralDiet> oralDiet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> orderer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.NutritionOrder_Supplement>> supplement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.NutritionOrder_EnteralFormula> enteralFormula() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> allergyIntolerance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableNutritionOrder fromJson(Json json) {
    ImmutableNutritionOrder.Builder builder = ((ImmutableNutritionOrder.Builder) ImmutableNutritionOrder.builder());
    if (json.dateTimeIsSet) {
      builder.dateTime(json.dateTime);
    }
    if (json.foodPreferenceModifierIsSet) {
      builder.foodPreferenceModifier(json.foodPreferenceModifier);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.instantiatesIsSet) {
      builder.instantiates(json.instantiates);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.excludeFoodModifierIsSet) {
      builder.excludeFoodModifier(json.excludeFoodModifier);
    }
    if (json.oralDietIsSet) {
      builder.oralDiet(json.oralDiet);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.ordererIsSet) {
      builder.orderer(json.orderer);
    }
    if (json.supplementIsSet) {
      builder.supplement(json.supplement);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.enteralFormulaIsSet) {
      builder.enteralFormula(json.enteralFormula);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.allergyIntoleranceIsSet) {
      builder.allergyIntolerance(json.allergyIntolerance);
    }
    return (ImmutableNutritionOrder) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NutritionOrder} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NutritionOrder instance
   */
  public static NutritionOrder copyOf(NutritionOrder instance) {
    if (instance instanceof ImmutableNutritionOrder) {
      return (ImmutableNutritionOrder) instance;
    }
    return ((ImmutableNutritionOrder.Builder) ImmutableNutritionOrder.builder())
        .dateTime(instance.dateTime())
        .foodPreferenceModifier(instance.foodPreferenceModifier())
        .patient(instance.patient())
        .instantiates(instance.instantiates())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .excludeFoodModifier(instance.excludeFoodModifier())
        .oralDiet(instance.oralDiet())
        .extension(instance.extension())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .orderer(instance.orderer())
        .supplement(instance.supplement())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .instantiatesUri(instance.instantiatesUri())
        .note(instance.note())
        .enteralFormula(instance.enteralFormula())
        .encounter(instance.encounter())
        .language(instance.language())
        .intent(instance.intent())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .allergyIntolerance(instance.allergyIntolerance())
        .build();
  }

  /**
   * Creates a builder for {@link NutritionOrder NutritionOrder}.
   * <pre>
   * ImmutableNutritionOrder.builder()
   *    .dateTime(com.fhir.dateTime) // optional {@link NutritionOrder#dateTime() dateTime}
   *    .foodPreferenceModifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier}
   *    .patient(com.fhir.Reference) // required {@link NutritionOrder#patient() patient}
   *    .instantiates(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link NutritionOrder#instantiates() instantiates}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical}
   *    .excludeFoodModifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier}
   *    .oralDiet(com.fhir.NutritionOrder_OralDiet) // optional {@link NutritionOrder#oralDiet() oralDiet}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link NutritionOrder#extension() extension}
   *    .resourceType(String) // required {@link NutritionOrder#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link NutritionOrder#id() id}
   *    .orderer(com.fhir.Reference) // optional {@link NutritionOrder#orderer() orderer}
   *    .supplement(List&amp;lt;com.fhir.NutritionOrder_Supplement&amp;gt;) // optional {@link NutritionOrder#supplement() supplement}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link NutritionOrder#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link NutritionOrder#identifier() identifier}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link NutritionOrder#instantiatesUri() instantiatesUri}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link NutritionOrder#note() note}
   *    .enteralFormula(com.fhir.NutritionOrder_EnteralFormula) // optional {@link NutritionOrder#enteralFormula() enteralFormula}
   *    .encounter(com.fhir.Reference) // optional {@link NutritionOrder#encounter() encounter}
   *    .language(com.fhir.code) // optional {@link NutritionOrder#language() language}
   *    .intent(com.fhir.code) // optional {@link NutritionOrder#intent() intent}
   *    .status(com.fhir.code) // optional {@link NutritionOrder#status() status}
   *    .implicitRules(com.fhir.uri) // optional {@link NutritionOrder#implicitRules() implicitRules}
   *    .meta(com.fhir.Meta) // optional {@link NutritionOrder#meta() meta}
   *    .text(com.fhir.Narrative) // optional {@link NutritionOrder#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link NutritionOrder#modifierExtension() modifierExtension}
   *    .allergyIntolerance(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link NutritionOrder#allergyIntolerance() allergyIntolerance}
   *    .build();
   * </pre>
   * @return A new NutritionOrder builder
   */
  public static PatientBuildStage builder() {
    return new ImmutableNutritionOrder.Builder();
  }

  /**
   * Builds instances of type {@link NutritionOrder NutritionOrder}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "NutritionOrder", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PatientBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PATIENT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_DATE_TIME = 0x1L;
    private static final long OPT_BIT_FOOD_PREFERENCE_MODIFIER = 0x2L;
    private static final long OPT_BIT_INSTANTIATES = 0x4L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x8L;
    private static final long OPT_BIT_EXCLUDE_FOOD_MODIFIER = 0x10L;
    private static final long OPT_BIT_ORAL_DIET = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_ORDERER = 0x100L;
    private static final long OPT_BIT_SUPPLEMENT = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x1000L;
    private static final long OPT_BIT_NOTE = 0x2000L;
    private static final long OPT_BIT_ENTERAL_FORMULA = 0x4000L;
    private static final long OPT_BIT_ENCOUNTER = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_INTENT = 0x20000L;
    private static final long OPT_BIT_STATUS = 0x40000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80000L;
    private static final long OPT_BIT_META = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400000L;
    private static final long OPT_BIT_ALLERGY_INTOLERANCE = 0x800000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.dateTime dateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> foodPreferenceModifier;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiates;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> excludeFoodModifier;
    private @javax.annotation.Nullable com.fhir.NutritionOrder_OralDiet oralDiet;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference orderer;
    private @javax.annotation.Nullable java.util.List<com.fhir.NutritionOrder_Supplement> supplement;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.NutritionOrder_EnteralFormula enteralFormula;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.code intent;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> allergyIntolerance;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateTime(com.fhir.dateTime dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = java.util.Objects.requireNonNull(dateTime, "dateTime");
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateTime")
    public final Builder dateTime(java.util.Optional<? extends com.fhir.dateTime> dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = dateTime.orElse(null);
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder foodPreferenceModifier(java.util.List<com.fhir.CodeableConcept> foodPreferenceModifier) {
      checkNotIsSet(foodPreferenceModifierIsSet(), "foodPreferenceModifier");
      this.foodPreferenceModifier = java.util.Objects.requireNonNull(foodPreferenceModifier, "foodPreferenceModifier");
      optBits |= OPT_BIT_FOOD_PREFERENCE_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("foodPreferenceModifier")
    public final Builder foodPreferenceModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> foodPreferenceModifier) {
      checkNotIsSet(foodPreferenceModifierIsSet(), "foodPreferenceModifier");
      this.foodPreferenceModifier = foodPreferenceModifier.orElse(null);
      optBits |= OPT_BIT_FOOD_PREFERENCE_MODIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link NutritionOrder#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiates(java.util.List<com.fhir.uri> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = java.util.Objects.requireNonNull(instantiates, "instantiates");
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
    public final Builder instantiates(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = instantiates.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = java.util.Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder excludeFoodModifier(java.util.List<com.fhir.CodeableConcept> excludeFoodModifier) {
      checkNotIsSet(excludeFoodModifierIsSet(), "excludeFoodModifier");
      this.excludeFoodModifier = java.util.Objects.requireNonNull(excludeFoodModifier, "excludeFoodModifier");
      optBits |= OPT_BIT_EXCLUDE_FOOD_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeFoodModifier")
    public final Builder excludeFoodModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> excludeFoodModifier) {
      checkNotIsSet(excludeFoodModifierIsSet(), "excludeFoodModifier");
      this.excludeFoodModifier = excludeFoodModifier.orElse(null);
      optBits |= OPT_BIT_EXCLUDE_FOOD_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#oralDiet() oralDiet} to oralDiet.
     * @param oralDiet The value for oralDiet
     * @return {@code this} builder for chained invocation
     */
    public final Builder oralDiet(com.fhir.NutritionOrder_OralDiet oralDiet) {
      checkNotIsSet(oralDietIsSet(), "oralDiet");
      this.oralDiet = java.util.Objects.requireNonNull(oralDiet, "oralDiet");
      optBits |= OPT_BIT_ORAL_DIET;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#oralDiet() oralDiet} to oralDiet.
     * @param oralDiet The value for oralDiet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oralDiet")
    public final Builder oralDiet(java.util.Optional<? extends com.fhir.NutritionOrder_OralDiet> oralDiet) {
      checkNotIsSet(oralDietIsSet(), "oralDiet");
      this.oralDiet = oralDiet.orElse(null);
      optBits |= OPT_BIT_ORAL_DIET;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
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
     * Initializes the value for the {@link NutritionOrder#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderer(com.fhir.Reference orderer) {
      checkNotIsSet(ordererIsSet(), "orderer");
      this.orderer = java.util.Objects.requireNonNull(orderer, "orderer");
      optBits |= OPT_BIT_ORDERER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderer")
    public final Builder orderer(java.util.Optional<? extends com.fhir.Reference> orderer) {
      checkNotIsSet(ordererIsSet(), "orderer");
      this.orderer = orderer.orElse(null);
      optBits |= OPT_BIT_ORDERER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplement(java.util.List<com.fhir.NutritionOrder_Supplement> supplement) {
      checkNotIsSet(supplementIsSet(), "supplement");
      this.supplement = java.util.Objects.requireNonNull(supplement, "supplement");
      optBits |= OPT_BIT_SUPPLEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supplement")
    public final Builder supplement(java.util.Optional<? extends java.util.List<com.fhir.NutritionOrder_Supplement>> supplement) {
      checkNotIsSet(supplementIsSet(), "supplement");
      this.supplement = supplement.orElse(null);
      optBits |= OPT_BIT_SUPPLEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
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
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
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
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = java.util.Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for chained invocation
     */
    public final Builder enteralFormula(com.fhir.NutritionOrder_EnteralFormula enteralFormula) {
      checkNotIsSet(enteralFormulaIsSet(), "enteralFormula");
      this.enteralFormula = java.util.Objects.requireNonNull(enteralFormula, "enteralFormula");
      optBits |= OPT_BIT_ENTERAL_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enteralFormula")
    public final Builder enteralFormula(java.util.Optional<? extends com.fhir.NutritionOrder_EnteralFormula> enteralFormula) {
      checkNotIsSet(enteralFormulaIsSet(), "enteralFormula");
      this.enteralFormula = enteralFormula.orElse(null);
      optBits |= OPT_BIT_ENTERAL_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
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
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
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
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(com.fhir.code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = java.util.Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public final Builder intent(java.util.Optional<? extends com.fhir.code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#status() status} to status.
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
     * Initializes the optional value {@link NutritionOrder#status() status} to status.
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
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
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
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
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
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
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
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
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
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for chained invocation
     */
    public final Builder allergyIntolerance(java.util.List<com.fhir.Reference> allergyIntolerance) {
      checkNotIsSet(allergyIntoleranceIsSet(), "allergyIntolerance");
      this.allergyIntolerance = java.util.Objects.requireNonNull(allergyIntolerance, "allergyIntolerance");
      optBits |= OPT_BIT_ALLERGY_INTOLERANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allergyIntolerance")
    public final Builder allergyIntolerance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> allergyIntolerance) {
      checkNotIsSet(allergyIntoleranceIsSet(), "allergyIntolerance");
      this.allergyIntolerance = allergyIntolerance.orElse(null);
      optBits |= OPT_BIT_ALLERGY_INTOLERANCE;
      return this;
    }

    /**
     * Builds a new {@link NutritionOrder NutritionOrder}.
     * @return An immutable instance of NutritionOrder
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.NutritionOrder build() {
      checkRequiredAttributes();
      return new ImmutableNutritionOrder(
          dateTime,
          foodPreferenceModifier,
          patient,
          instantiates,
          instantiatesCanonical,
          excludeFoodModifier,
          oralDiet,
          extension,
          resourceType,
          id,
          orderer,
          supplement,
          contained,
          identifier,
          instantiatesUri,
          note,
          enteralFormula,
          encounter,
          language,
          intent,
          status,
          implicitRules,
          meta,
          text,
          modifierExtension,
          allergyIntolerance);
    }

    private boolean dateTimeIsSet() {
      return (optBits & OPT_BIT_DATE_TIME) != 0;
    }

    private boolean foodPreferenceModifierIsSet() {
      return (optBits & OPT_BIT_FOOD_PREFERENCE_MODIFIER) != 0;
    }

    private boolean instantiatesIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean excludeFoodModifierIsSet() {
      return (optBits & OPT_BIT_EXCLUDE_FOOD_MODIFIER) != 0;
    }

    private boolean oralDietIsSet() {
      return (optBits & OPT_BIT_ORAL_DIET) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean ordererIsSet() {
      return (optBits & OPT_BIT_ORDERER) != 0;
    }

    private boolean supplementIsSet() {
      return (optBits & OPT_BIT_SUPPLEMENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean enteralFormulaIsSet() {
      return (optBits & OPT_BIT_ENTERAL_FORMULA) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean allergyIntoleranceIsSet() {
      return (optBits & OPT_BIT_ALLERGY_INTOLERANCE) != 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of NutritionOrder is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!patientIsSet()) attributes.add("patient");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build NutritionOrder, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "NutritionOrder", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link NutritionOrder#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "NutritionOrder", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link NutritionOrder#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "NutritionOrder", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateTime(com.fhir.dateTime dateTime);

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateTime(java.util.Optional<? extends com.fhir.dateTime> dateTime);

    /**
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal foodPreferenceModifier(java.util.List<com.fhir.CodeableConcept> foodPreferenceModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal foodPreferenceModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> foodPreferenceModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiates(java.util.List<com.fhir.uri> instantiates);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiates(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiates);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal excludeFoodModifier(java.util.List<com.fhir.CodeableConcept> excludeFoodModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal excludeFoodModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> excludeFoodModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#oralDiet() oralDiet} to oralDiet.
     * @param oralDiet The value for oralDiet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal oralDiet(com.fhir.NutritionOrder_OralDiet oralDiet);

    /**
     * Initializes the optional value {@link NutritionOrder#oralDiet() oralDiet} to oralDiet.
     * @param oralDiet The value for oralDiet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal oralDiet(java.util.Optional<? extends com.fhir.NutritionOrder_OralDiet> oralDiet);

    /**
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal orderer(com.fhir.Reference orderer);

    /**
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal orderer(java.util.Optional<? extends com.fhir.Reference> orderer);

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplement(java.util.List<com.fhir.NutritionOrder_Supplement> supplement);

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplement(java.util.Optional<? extends java.util.List<com.fhir.NutritionOrder_Supplement>> supplement);

    /**
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enteralFormula(com.fhir.NutritionOrder_EnteralFormula enteralFormula);

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enteralFormula(java.util.Optional<? extends com.fhir.NutritionOrder_EnteralFormula> enteralFormula);

    /**
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.code intent);

    /**
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.code> intent);

    /**
     * Initializes the optional value {@link NutritionOrder#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link NutritionOrder#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allergyIntolerance(java.util.List<com.fhir.Reference> allergyIntolerance);

    /**
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allergyIntolerance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> allergyIntolerance);

    /**
     * Builds a new {@link NutritionOrder NutritionOrder}.
     * @return An immutable instance of NutritionOrder
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    NutritionOrder build();
  }
}
