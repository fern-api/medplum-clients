package com.fhir.types.fhir;

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
 * Immutable implementation of {@link NutritionOrder}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNutritionOrder.builder()}.
 */
@Generated(from = "NutritionOrder", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNutritionOrder implements NutritionOrder {
  private final @Nullable List<Identifier> identifier;
  private final @Nullable NutritionOrder_EnteralFormula enteralFormula;
  private final @Nullable Narrative text;
  private final @Nullable Reference orderer;
  private final @Nullable DateTime dateTime;
  private final @Nullable Meta meta;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable Code intent;
  private final @Nullable Code status;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<CodeableConcept> excludeFoodModifier;
  private final @Nullable NutritionOrder_OralDiet oralDiet;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference encounter;
  private final @Nullable List<Reference> allergyIntolerance;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final Reference patient;
  private final @Nullable List<Uri> instantiates;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> foodPreferenceModifier;
  private final @Nullable List<NutritionOrder_Supplement> supplement;

  private ImmutableNutritionOrder(
      @Nullable List<Identifier> identifier,
      @Nullable NutritionOrder_EnteralFormula enteralFormula,
      @Nullable Narrative text,
      @Nullable Reference orderer,
      @Nullable DateTime dateTime,
      @Nullable Meta meta,
      @Nullable List<Uri> instantiatesUri,
      @Nullable Code intent,
      @Nullable Code status,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable List<Annotation> note,
      @Nullable List<CodeableConcept> excludeFoodModifier,
      @Nullable NutritionOrder_OralDiet oralDiet,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      String resourceType,
      @Nullable List<ResourceList> contained,
      @Nullable Reference encounter,
      @Nullable List<Reference> allergyIntolerance,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      Reference patient,
      @Nullable List<Uri> instantiates,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> foodPreferenceModifier,
      @Nullable List<NutritionOrder_Supplement> supplement) {
    this.identifier = identifier;
    this.enteralFormula = enteralFormula;
    this.text = text;
    this.orderer = orderer;
    this.dateTime = dateTime;
    this.meta = meta;
    this.instantiatesUri = instantiatesUri;
    this.intent = intent;
    this.status = status;
    this.instantiatesCanonical = instantiatesCanonical;
    this.note = note;
    this.excludeFoodModifier = excludeFoodModifier;
    this.oralDiet = oralDiet;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.contained = contained;
    this.encounter = encounter;
    this.allergyIntolerance = allergyIntolerance;
    this.extension = extension;
    this.language = language;
    this.patient = patient;
    this.instantiates = instantiates;
    this.implicitRules = implicitRules;
    this.foodPreferenceModifier = foodPreferenceModifier;
    this.supplement = supplement;
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code enteralFormula} attribute
   */
  @JsonProperty("enteralFormula")
  @Override
  public Optional<NutritionOrder_EnteralFormula> enteralFormula() {
    return Optional.ofNullable(enteralFormula);
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
   * @return The value of the {@code orderer} attribute
   */
  @JsonProperty("orderer")
  @Override
  public Optional<Reference> orderer() {
    return Optional.ofNullable(orderer);
  }

  /**
   * @return The value of the {@code dateTime} attribute
   */
  @JsonProperty("dateTime")
  @Override
  public Optional<DateTime> dateTime() {
    return Optional.ofNullable(dateTime);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @JsonProperty("intent")
  @Override
  public Optional<Code> intent() {
    return Optional.ofNullable(intent);
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
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<List<Canonical>> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code excludeFoodModifier} attribute
   */
  @JsonProperty("excludeFoodModifier")
  @Override
  public Optional<List<CodeableConcept>> excludeFoodModifier() {
    return Optional.ofNullable(excludeFoodModifier);
  }

  /**
   * @return The value of the {@code oralDiet} attribute
   */
  @JsonProperty("oralDiet")
  @Override
  public Optional<NutritionOrder_OralDiet> oralDiet() {
    return Optional.ofNullable(oralDiet);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code allergyIntolerance} attribute
   */
  @JsonProperty("allergyIntolerance")
  @Override
  public Optional<List<Reference>> allergyIntolerance() {
    return Optional.ofNullable(allergyIntolerance);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code instantiates} attribute
   */
  @JsonProperty("instantiates")
  @Override
  public Optional<List<Uri>> instantiates() {
    return Optional.ofNullable(instantiates);
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
   * @return The value of the {@code foodPreferenceModifier} attribute
   */
  @JsonProperty("foodPreferenceModifier")
  @Override
  public Optional<List<CodeableConcept>> foodPreferenceModifier() {
    return Optional.ofNullable(foodPreferenceModifier);
  }

  /**
   * @return The value of the {@code supplement} attribute
   */
  @JsonProperty("supplement")
  @Override
  public Optional<List<NutritionOrder_Supplement>> supplement() {
    return Optional.ofNullable(supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableNutritionOrder(
        newValue,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableNutritionOrder(
        value,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#enteralFormula() enteralFormula} attribute.
   * @param value The value for enteralFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withEnteralFormula(NutritionOrder_EnteralFormula value) {
    @Nullable NutritionOrder_EnteralFormula newValue = Objects.requireNonNull(value, "enteralFormula");
    if (this.enteralFormula == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        newValue,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#enteralFormula() enteralFormula} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enteralFormula
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withEnteralFormula(Optional<? extends NutritionOrder_EnteralFormula> optional) {
    @Nullable NutritionOrder_EnteralFormula value = optional.orElse(null);
    if (this.enteralFormula == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        value,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        newValue,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        value,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#orderer() orderer} attribute.
   * @param value The value for orderer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withOrderer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "orderer");
    if (this.orderer == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        newValue,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#orderer() orderer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withOrderer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.orderer == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        value,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#dateTime() dateTime} attribute.
   * @param value The value for dateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withDateTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "dateTime");
    if (this.dateTime == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        newValue,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#dateTime() dateTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withDateTime(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.dateTime == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        value,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        newValue,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        value,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        newValue,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        value,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withIntent(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        newValue,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withIntent(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        value,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        newValue,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        value,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        newValue,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        value,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        newValue,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        value,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} attribute.
   * @param value The value for excludeFoodModifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withExcludeFoodModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "excludeFoodModifier");
    if (this.excludeFoodModifier == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        newValue,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for excludeFoodModifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withExcludeFoodModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.excludeFoodModifier == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        value,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#oralDiet() oralDiet} attribute.
   * @param value The value for oralDiet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withOralDiet(NutritionOrder_OralDiet value) {
    @Nullable NutritionOrder_OralDiet newValue = Objects.requireNonNull(value, "oralDiet");
    if (this.oralDiet == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        newValue,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#oralDiet() oralDiet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for oralDiet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withOralDiet(Optional<? extends NutritionOrder_OralDiet> optional) {
    @Nullable NutritionOrder_OralDiet value = optional.orElse(null);
    if (this.oralDiet == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        value,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        value,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        newValue,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        value,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NutritionOrder#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNutritionOrder withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        newValue,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        value,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        newValue,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        value,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#allergyIntolerance() allergyIntolerance} attribute.
   * @param value The value for allergyIntolerance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withAllergyIntolerance(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "allergyIntolerance");
    if (this.allergyIntolerance == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        newValue,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#allergyIntolerance() allergyIntolerance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allergyIntolerance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withAllergyIntolerance(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.allergyIntolerance == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        value,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        newValue,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        value,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        newValue,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        value,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NutritionOrder#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNutritionOrder withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        newValue,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#instantiates() instantiates} attribute.
   * @param value The value for instantiates
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withInstantiates(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiates");
    if (this.instantiates == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        newValue,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#instantiates() instantiates} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiates
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withInstantiates(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiates == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        value,
        this.implicitRules,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        newValue,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        value,
        this.foodPreferenceModifier,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} attribute.
   * @param value The value for foodPreferenceModifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withFoodPreferenceModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "foodPreferenceModifier");
    if (this.foodPreferenceModifier == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        newValue,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for foodPreferenceModifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withFoodPreferenceModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.foodPreferenceModifier == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        value,
        this.supplement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder#supplement() supplement} attribute.
   * @param value The value for supplement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder withSupplement(List<NutritionOrder_Supplement> value) {
    @Nullable List<NutritionOrder_Supplement> newValue = Objects.requireNonNull(value, "supplement");
    if (this.supplement == newValue) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder#supplement() supplement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder withSupplement(Optional<? extends List<NutritionOrder_Supplement>> optional) {
    @Nullable List<NutritionOrder_Supplement> value = optional.orElse(null);
    if (this.supplement == value) return this;
    return new ImmutableNutritionOrder(
        this.identifier,
        this.enteralFormula,
        this.text,
        this.orderer,
        this.dateTime,
        this.meta,
        this.instantiatesUri,
        this.intent,
        this.status,
        this.instantiatesCanonical,
        this.note,
        this.excludeFoodModifier,
        this.oralDiet,
        this.id,
        this.modifierExtension,
        this.resourceType,
        this.contained,
        this.encounter,
        this.allergyIntolerance,
        this.extension,
        this.language,
        this.patient,
        this.instantiates,
        this.implicitRules,
        this.foodPreferenceModifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNutritionOrder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNutritionOrder
        && equalTo((ImmutableNutritionOrder) another);
  }

  private boolean equalTo(ImmutableNutritionOrder another) {
    return Objects.equals(identifier, another.identifier)
        && Objects.equals(enteralFormula, another.enteralFormula)
        && Objects.equals(text, another.text)
        && Objects.equals(orderer, another.orderer)
        && Objects.equals(dateTime, another.dateTime)
        && Objects.equals(meta, another.meta)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(intent, another.intent)
        && Objects.equals(status, another.status)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(note, another.note)
        && Objects.equals(excludeFoodModifier, another.excludeFoodModifier)
        && Objects.equals(oralDiet, another.oralDiet)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contained, another.contained)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(allergyIntolerance, another.allergyIntolerance)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && patient.equals(another.patient)
        && Objects.equals(instantiates, another.instantiates)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(foodPreferenceModifier, another.foodPreferenceModifier)
        && Objects.equals(supplement, another.supplement);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code enteralFormula}, {@code text}, {@code orderer}, {@code dateTime}, {@code meta}, {@code instantiatesUri}, {@code intent}, {@code status}, {@code instantiatesCanonical}, {@code note}, {@code excludeFoodModifier}, {@code oralDiet}, {@code id}, {@code modifierExtension}, {@code resourceType}, {@code contained}, {@code encounter}, {@code allergyIntolerance}, {@code extension}, {@code language}, {@code patient}, {@code instantiates}, {@code implicitRules}, {@code foodPreferenceModifier}, {@code supplement}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(enteralFormula);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(orderer);
    h += (h << 5) + Objects.hashCode(dateTime);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(excludeFoodModifier);
    h += (h << 5) + Objects.hashCode(oralDiet);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(allergyIntolerance);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(instantiates);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(foodPreferenceModifier);
    h += (h << 5) + Objects.hashCode(supplement);
    return h;
  }

  /**
   * Prints the immutable value {@code NutritionOrder} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NutritionOrder{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (enteralFormula != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("enteralFormula=").append(enteralFormula);
    }
    if (text != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (orderer != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("orderer=").append(orderer);
    }
    if (dateTime != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("dateTime=").append(dateTime);
    }
    if (meta != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (intent != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (status != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (note != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (excludeFoodModifier != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("excludeFoodModifier=").append(excludeFoodModifier);
    }
    if (oralDiet != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("oralDiet=").append(oralDiet);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (allergyIntolerance != null) {
      builder.append(", ");
      builder.append("allergyIntolerance=").append(allergyIntolerance);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (instantiates != null) {
      builder.append(", ");
      builder.append("instantiates=").append(instantiates);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (foodPreferenceModifier != null) {
      builder.append(", ");
      builder.append("foodPreferenceModifier=").append(foodPreferenceModifier);
    }
    if (supplement != null) {
      builder.append(", ");
      builder.append("supplement=").append(supplement);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NutritionOrder", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NutritionOrder {
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<NutritionOrder_EnteralFormula> enteralFormula = Optional.empty();
    boolean enteralFormulaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> orderer = Optional.empty();
    boolean ordererIsSet;
    @Nullable Optional<DateTime> dateTime = Optional.empty();
    boolean dateTimeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<Code> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<CodeableConcept>> excludeFoodModifier = Optional.empty();
    boolean excludeFoodModifierIsSet;
    @Nullable Optional<NutritionOrder_OralDiet> oralDiet = Optional.empty();
    boolean oralDietIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Reference>> allergyIntolerance = Optional.empty();
    boolean allergyIntoleranceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Reference patient;
    @Nullable Optional<List<Uri>> instantiates = Optional.empty();
    boolean instantiatesIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> foodPreferenceModifier = Optional.empty();
    boolean foodPreferenceModifierIsSet;
    @Nullable Optional<List<NutritionOrder_Supplement>> supplement = Optional.empty();
    boolean supplementIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("enteralFormula")
    public void setEnteralFormula(Optional<NutritionOrder_EnteralFormula> enteralFormula) {
      this.enteralFormula = enteralFormula;
      this.enteralFormulaIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("orderer")
    public void setOrderer(Optional<Reference> orderer) {
      this.orderer = orderer;
      this.ordererIsSet = true;
    }
    @JsonProperty("dateTime")
    public void setDateTime(Optional<DateTime> dateTime) {
      this.dateTime = dateTime;
      this.dateTimeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<Code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("excludeFoodModifier")
    public void setExcludeFoodModifier(Optional<List<CodeableConcept>> excludeFoodModifier) {
      this.excludeFoodModifier = excludeFoodModifier;
      this.excludeFoodModifierIsSet = true;
    }
    @JsonProperty("oralDiet")
    public void setOralDiet(Optional<NutritionOrder_OralDiet> oralDiet) {
      this.oralDiet = oralDiet;
      this.oralDietIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("allergyIntolerance")
    public void setAllergyIntolerance(Optional<List<Reference>> allergyIntolerance) {
      this.allergyIntolerance = allergyIntolerance;
      this.allergyIntoleranceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("instantiates")
    public void setInstantiates(Optional<List<Uri>> instantiates) {
      this.instantiates = instantiates;
      this.instantiatesIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("foodPreferenceModifier")
    public void setFoodPreferenceModifier(Optional<List<CodeableConcept>> foodPreferenceModifier) {
      this.foodPreferenceModifier = foodPreferenceModifier;
      this.foodPreferenceModifierIsSet = true;
    }
    @JsonProperty("supplement")
    public void setSupplement(Optional<List<NutritionOrder_Supplement>> supplement) {
      this.supplement = supplement;
      this.supplementIsSet = true;
    }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<NutritionOrder_EnteralFormula> enteralFormula() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> orderer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> dateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> excludeFoodModifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<NutritionOrder_OralDiet> oralDiet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> allergyIntolerance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiates() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> foodPreferenceModifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<NutritionOrder_Supplement>> supplement() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNutritionOrder fromJson(Json json) {
    ImmutableNutritionOrder.Builder builder = ((ImmutableNutritionOrder.Builder) ImmutableNutritionOrder.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.enteralFormulaIsSet) {
      builder.enteralFormula(json.enteralFormula);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.ordererIsSet) {
      builder.orderer(json.orderer);
    }
    if (json.dateTimeIsSet) {
      builder.dateTime(json.dateTime);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.excludeFoodModifierIsSet) {
      builder.excludeFoodModifier(json.excludeFoodModifier);
    }
    if (json.oralDietIsSet) {
      builder.oralDiet(json.oralDiet);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.allergyIntoleranceIsSet) {
      builder.allergyIntolerance(json.allergyIntolerance);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.instantiatesIsSet) {
      builder.instantiates(json.instantiates);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.foodPreferenceModifierIsSet) {
      builder.foodPreferenceModifier(json.foodPreferenceModifier);
    }
    if (json.supplementIsSet) {
      builder.supplement(json.supplement);
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
        .identifier(instance.identifier())
        .enteralFormula(instance.enteralFormula())
        .text(instance.text())
        .orderer(instance.orderer())
        .dateTime(instance.dateTime())
        .meta(instance.meta())
        .instantiatesUri(instance.instantiatesUri())
        .intent(instance.intent())
        .status(instance.status())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .note(instance.note())
        .excludeFoodModifier(instance.excludeFoodModifier())
        .oralDiet(instance.oralDiet())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .encounter(instance.encounter())
        .allergyIntolerance(instance.allergyIntolerance())
        .extension(instance.extension())
        .language(instance.language())
        .patient(instance.patient())
        .instantiates(instance.instantiates())
        .implicitRules(instance.implicitRules())
        .foodPreferenceModifier(instance.foodPreferenceModifier())
        .supplement(instance.supplement())
        .build();
  }

  /**
   * Creates a builder for {@link NutritionOrder NutritionOrder}.
   * <pre>
   * ImmutableNutritionOrder.builder()
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link NutritionOrder#identifier() identifier}
   *    .enteralFormula(com.fhir.types.fhir.NutritionOrder_EnteralFormula) // optional {@link NutritionOrder#enteralFormula() enteralFormula}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link NutritionOrder#text() text}
   *    .orderer(com.fhir.types.fhir.Reference) // optional {@link NutritionOrder#orderer() orderer}
   *    .dateTime(com.fhir.types.fhir.DateTime) // optional {@link NutritionOrder#dateTime() dateTime}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link NutritionOrder#meta() meta}
   *    .instantiatesUri(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link NutritionOrder#instantiatesUri() instantiatesUri}
   *    .intent(com.fhir.types.fhir.Code) // optional {@link NutritionOrder#intent() intent}
   *    .status(com.fhir.types.fhir.Code) // optional {@link NutritionOrder#status() status}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link NutritionOrder#note() note}
   *    .excludeFoodModifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier}
   *    .oralDiet(com.fhir.types.fhir.NutritionOrder_OralDiet) // optional {@link NutritionOrder#oralDiet() oralDiet}
   *    .id(com.fhir.types.fhir.Id) // optional {@link NutritionOrder#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link NutritionOrder#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link NutritionOrder#contained() contained}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link NutritionOrder#encounter() encounter}
   *    .allergyIntolerance(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link NutritionOrder#allergyIntolerance() allergyIntolerance}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder#extension() extension}
   *    .language(com.fhir.types.fhir.Code) // optional {@link NutritionOrder#language() language}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link NutritionOrder#patient() patient}
   *    .instantiates(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link NutritionOrder#instantiates() instantiates}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link NutritionOrder#implicitRules() implicitRules}
   *    .foodPreferenceModifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier}
   *    .supplement(List&amp;lt;com.fhir.types.fhir.NutritionOrder_Supplement&amp;gt;) // optional {@link NutritionOrder#supplement() supplement}
   *    .build();
   * </pre>
   * @return A new NutritionOrder builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableNutritionOrder.Builder();
  }

  /**
   * Builds instances of type {@link NutritionOrder NutritionOrder}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NutritionOrder", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_ENTERAL_FORMULA = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_ORDERER = 0x8L;
    private static final long OPT_BIT_DATE_TIME = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x40L;
    private static final long OPT_BIT_INTENT = 0x80L;
    private static final long OPT_BIT_STATUS = 0x100L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x200L;
    private static final long OPT_BIT_NOTE = 0x400L;
    private static final long OPT_BIT_EXCLUDE_FOOD_MODIFIER = 0x800L;
    private static final long OPT_BIT_ORAL_DIET = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_ENCOUNTER = 0x10000L;
    private static final long OPT_BIT_ALLERGY_INTOLERANCE = 0x20000L;
    private static final long OPT_BIT_EXTENSION = 0x40000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000L;
    private static final long OPT_BIT_INSTANTIATES = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_FOOD_PREFERENCE_MODIFIER = 0x400000L;
    private static final long OPT_BIT_SUPPLEMENT = 0x800000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Identifier> identifier;
    private @Nullable NutritionOrder_EnteralFormula enteralFormula;
    private @Nullable Narrative text;
    private @Nullable Reference orderer;
    private @Nullable DateTime dateTime;
    private @Nullable Meta meta;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable Code intent;
    private @Nullable Code status;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable List<Annotation> note;
    private @Nullable List<CodeableConcept> excludeFoodModifier;
    private @Nullable NutritionOrder_OralDiet oralDiet;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference encounter;
    private @Nullable List<Reference> allergyIntolerance;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable Reference patient;
    private @Nullable List<Uri> instantiates;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> foodPreferenceModifier;
    private @Nullable List<NutritionOrder_Supplement> supplement;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for chained invocation
     */
    public final Builder enteralFormula(NutritionOrder_EnteralFormula enteralFormula) {
      checkNotIsSet(enteralFormulaIsSet(), "enteralFormula");
      this.enteralFormula = Objects.requireNonNull(enteralFormula, "enteralFormula");
      optBits |= OPT_BIT_ENTERAL_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enteralFormula")
    public final Builder enteralFormula(Optional<? extends NutritionOrder_EnteralFormula> enteralFormula) {
      checkNotIsSet(enteralFormulaIsSet(), "enteralFormula");
      this.enteralFormula = enteralFormula.orElse(null);
      optBits |= OPT_BIT_ENTERAL_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
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
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
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
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderer(Reference orderer) {
      checkNotIsSet(ordererIsSet(), "orderer");
      this.orderer = Objects.requireNonNull(orderer, "orderer");
      optBits |= OPT_BIT_ORDERER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("orderer")
    public final Builder orderer(Optional<? extends Reference> orderer) {
      checkNotIsSet(ordererIsSet(), "orderer");
      this.orderer = orderer.orElse(null);
      optBits |= OPT_BIT_ORDERER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateTime(DateTime dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = Objects.requireNonNull(dateTime, "dateTime");
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateTime")
    public final Builder dateTime(Optional<? extends DateTime> dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = dateTime.orElse(null);
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
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
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
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
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(List<Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends List<Uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(Code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intent")
    public final Builder intent(Optional<? extends Code> intent) {
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
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#status() status} to status.
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
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(List<Canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder excludeFoodModifier(List<CodeableConcept> excludeFoodModifier) {
      checkNotIsSet(excludeFoodModifierIsSet(), "excludeFoodModifier");
      this.excludeFoodModifier = Objects.requireNonNull(excludeFoodModifier, "excludeFoodModifier");
      optBits |= OPT_BIT_EXCLUDE_FOOD_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("excludeFoodModifier")
    public final Builder excludeFoodModifier(Optional<? extends List<CodeableConcept>> excludeFoodModifier) {
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
    public final Builder oralDiet(NutritionOrder_OralDiet oralDiet) {
      checkNotIsSet(oralDietIsSet(), "oralDiet");
      this.oralDiet = Objects.requireNonNull(oralDiet, "oralDiet");
      optBits |= OPT_BIT_ORAL_DIET;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#oralDiet() oralDiet} to oralDiet.
     * @param oralDiet The value for oralDiet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("oralDiet")
    public final Builder oralDiet(Optional<? extends NutritionOrder_OralDiet> oralDiet) {
      checkNotIsSet(oralDietIsSet(), "oralDiet");
      this.oralDiet = oralDiet.orElse(null);
      optBits |= OPT_BIT_ORAL_DIET;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link NutritionOrder#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
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
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
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
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for chained invocation
     */
    public final Builder allergyIntolerance(List<Reference> allergyIntolerance) {
      checkNotIsSet(allergyIntoleranceIsSet(), "allergyIntolerance");
      this.allergyIntolerance = Objects.requireNonNull(allergyIntolerance, "allergyIntolerance");
      optBits |= OPT_BIT_ALLERGY_INTOLERANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allergyIntolerance")
    public final Builder allergyIntolerance(Optional<? extends List<Reference>> allergyIntolerance) {
      checkNotIsSet(allergyIntoleranceIsSet(), "allergyIntolerance");
      this.allergyIntolerance = allergyIntolerance.orElse(null);
      optBits |= OPT_BIT_ALLERGY_INTOLERANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
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
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
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
     * Initializes the value for the {@link NutritionOrder#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiates(List<Uri> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = Objects.requireNonNull(instantiates, "instantiates");
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiates")
    public final Builder instantiates(Optional<? extends List<Uri>> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = instantiates.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder foodPreferenceModifier(List<CodeableConcept> foodPreferenceModifier) {
      checkNotIsSet(foodPreferenceModifierIsSet(), "foodPreferenceModifier");
      this.foodPreferenceModifier = Objects.requireNonNull(foodPreferenceModifier, "foodPreferenceModifier");
      optBits |= OPT_BIT_FOOD_PREFERENCE_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("foodPreferenceModifier")
    public final Builder foodPreferenceModifier(Optional<? extends List<CodeableConcept>> foodPreferenceModifier) {
      checkNotIsSet(foodPreferenceModifierIsSet(), "foodPreferenceModifier");
      this.foodPreferenceModifier = foodPreferenceModifier.orElse(null);
      optBits |= OPT_BIT_FOOD_PREFERENCE_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplement(List<NutritionOrder_Supplement> supplement) {
      checkNotIsSet(supplementIsSet(), "supplement");
      this.supplement = Objects.requireNonNull(supplement, "supplement");
      optBits |= OPT_BIT_SUPPLEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supplement")
    public final Builder supplement(Optional<? extends List<NutritionOrder_Supplement>> supplement) {
      checkNotIsSet(supplementIsSet(), "supplement");
      this.supplement = supplement.orElse(null);
      optBits |= OPT_BIT_SUPPLEMENT;
      return this;
    }

    /**
     * Builds a new {@link NutritionOrder NutritionOrder}.
     * @return An immutable instance of NutritionOrder
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NutritionOrder build() {
      checkRequiredAttributes();
      return new ImmutableNutritionOrder(
          identifier,
          enteralFormula,
          text,
          orderer,
          dateTime,
          meta,
          instantiatesUri,
          intent,
          status,
          instantiatesCanonical,
          note,
          excludeFoodModifier,
          oralDiet,
          id,
          modifierExtension,
          resourceType,
          contained,
          encounter,
          allergyIntolerance,
          extension,
          language,
          patient,
          instantiates,
          implicitRules,
          foodPreferenceModifier,
          supplement);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean enteralFormulaIsSet() {
      return (optBits & OPT_BIT_ENTERAL_FORMULA) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean ordererIsSet() {
      return (optBits & OPT_BIT_ORDERER) != 0;
    }

    private boolean dateTimeIsSet() {
      return (optBits & OPT_BIT_DATE_TIME) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean excludeFoodModifierIsSet() {
      return (optBits & OPT_BIT_EXCLUDE_FOOD_MODIFIER) != 0;
    }

    private boolean oralDietIsSet() {
      return (optBits & OPT_BIT_ORAL_DIET) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean allergyIntoleranceIsSet() {
      return (optBits & OPT_BIT_ALLERGY_INTOLERANCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean instantiatesIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean foodPreferenceModifierIsSet() {
      return (optBits & OPT_BIT_FOOD_PREFERENCE_MODIFIER) != 0;
    }

    private boolean supplementIsSet() {
      return (optBits & OPT_BIT_SUPPLEMENT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NutritionOrder is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build NutritionOrder, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "NutritionOrder", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link NutritionOrder#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "NutritionOrder", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link NutritionOrder#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "NutritionOrder", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link NutritionOrder#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enteralFormula(NutritionOrder_EnteralFormula enteralFormula);

    /**
     * Initializes the optional value {@link NutritionOrder#enteralFormula() enteralFormula} to enteralFormula.
     * @param enteralFormula The value for enteralFormula
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enteralFormula(Optional<? extends NutritionOrder_EnteralFormula> enteralFormula);

    /**
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link NutritionOrder#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal orderer(Reference orderer);

    /**
     * Initializes the optional value {@link NutritionOrder#orderer() orderer} to orderer.
     * @param orderer The value for orderer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal orderer(Optional<? extends Reference> orderer);

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateTime(DateTime dateTime);

    /**
     * Initializes the optional value {@link NutritionOrder#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateTime(Optional<? extends DateTime> dateTime);

    /**
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link NutritionOrder#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(Code intent);

    /**
     * Initializes the optional value {@link NutritionOrder#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends Code> intent);

    /**
     * Initializes the optional value {@link NutritionOrder#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link NutritionOrder#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link NutritionOrder#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal excludeFoodModifier(List<CodeableConcept> excludeFoodModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#excludeFoodModifier() excludeFoodModifier} to excludeFoodModifier.
     * @param excludeFoodModifier The value for excludeFoodModifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal excludeFoodModifier(Optional<? extends List<CodeableConcept>> excludeFoodModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#oralDiet() oralDiet} to oralDiet.
     * @param oralDiet The value for oralDiet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal oralDiet(NutritionOrder_OralDiet oralDiet);

    /**
     * Initializes the optional value {@link NutritionOrder#oralDiet() oralDiet} to oralDiet.
     * @param oralDiet The value for oralDiet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal oralDiet(Optional<? extends NutritionOrder_OralDiet> oralDiet);

    /**
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link NutritionOrder#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link NutritionOrder#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link NutritionOrder#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link NutritionOrder#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allergyIntolerance(List<Reference> allergyIntolerance);

    /**
     * Initializes the optional value {@link NutritionOrder#allergyIntolerance() allergyIntolerance} to allergyIntolerance.
     * @param allergyIntolerance The value for allergyIntolerance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allergyIntolerance(Optional<? extends List<Reference>> allergyIntolerance);

    /**
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link NutritionOrder#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link NutritionOrder#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiates(List<Uri> instantiates);

    /**
     * Initializes the optional value {@link NutritionOrder#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiates(Optional<? extends List<Uri>> instantiates);

    /**
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link NutritionOrder#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal foodPreferenceModifier(List<CodeableConcept> foodPreferenceModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#foodPreferenceModifier() foodPreferenceModifier} to foodPreferenceModifier.
     * @param foodPreferenceModifier The value for foodPreferenceModifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal foodPreferenceModifier(Optional<? extends List<CodeableConcept>> foodPreferenceModifier);

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplement(List<NutritionOrder_Supplement> supplement);

    /**
     * Initializes the optional value {@link NutritionOrder#supplement() supplement} to supplement.
     * @param supplement The value for supplement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplement(Optional<? extends List<NutritionOrder_Supplement>> supplement);

    /**
     * Builds a new {@link NutritionOrder NutritionOrder}.
     * @return An immutable instance of NutritionOrder
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    NutritionOrder build();
  }
}
