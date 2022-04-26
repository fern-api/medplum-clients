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
 * Immutable implementation of {@link RiskAssessment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskAssessment.builder()}.
 */
@Generated(from = "RiskAssessment", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskAssessment implements RiskAssessment {
  private final @Nullable Narrative text;
  private final @Nullable CodeableConcept method;
  private final @Nullable Reference condition;
  private final @Nullable List<Annotation> note;
  private final @Nullable Code status;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable Reference parent;
  private final Reference subject;
  private final @Nullable Reference encounter;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String mitigation;
  private final @Nullable List<Reference> basis;
  private final @Nullable Id id;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable List<Extension> extension;
  private final @Nullable Meta meta;
  private final String resourceType;
  private final @Nullable Reference basedOn;
  private final @Nullable List<RiskAssessment_Prediction> prediction;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Reference performer;

  private ImmutableRiskAssessment(
      @Nullable Narrative text,
      @Nullable CodeableConcept method,
      @Nullable Reference condition,
      @Nullable List<Annotation> note,
      @Nullable Code status,
      @Nullable Period occurrencePeriod,
      @Nullable Reference parent,
      Reference subject,
      @Nullable Reference encounter,
      @Nullable CodeableConcept code,
      @Nullable List<ResourceList> contained,
      @Nullable String mitigation,
      @Nullable List<Reference> basis,
      @Nullable Id id,
      @Nullable String occurrenceDateTime,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> reasonReference,
      @Nullable List<Extension> extension,
      @Nullable Meta meta,
      String resourceType,
      @Nullable Reference basedOn,
      @Nullable List<RiskAssessment_Prediction> prediction,
      @Nullable List<Identifier> identifier,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Reference performer) {
    this.text = text;
    this.method = method;
    this.condition = condition;
    this.note = note;
    this.status = status;
    this.occurrencePeriod = occurrencePeriod;
    this.parent = parent;
    this.subject = subject;
    this.encounter = encounter;
    this.code = code;
    this.contained = contained;
    this.mitigation = mitigation;
    this.basis = basis;
    this.id = id;
    this.occurrenceDateTime = occurrenceDateTime;
    this.implicitRules = implicitRules;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.reasonReference = reasonReference;
    this.extension = extension;
    this.meta = meta;
    this.resourceType = resourceType;
    this.basedOn = basedOn;
    this.prediction = prediction;
    this.identifier = identifier;
    this.reasonCode = reasonCode;
    this.performer = performer;
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
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<Reference> condition() {
    return Optional.ofNullable(condition);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @JsonProperty("occurrencePeriod")
  @Override
  public Optional<Period> occurrencePeriod() {
    return Optional.ofNullable(occurrencePeriod);
  }

  /**
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<Reference> parent() {
    return Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code mitigation} attribute
   */
  @JsonProperty("mitigation")
  @Override
  public Optional<String> mitigation() {
    return Optional.ofNullable(mitigation);
  }

  /**
   * @return The value of the {@code basis} attribute
   */
  @JsonProperty("basis")
  @Override
  public Optional<List<Reference>> basis() {
    return Optional.ofNullable(basis);
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
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @JsonProperty("occurrenceDateTime")
  @Override
  public Optional<String> occurrenceDateTime() {
    return Optional.ofNullable(occurrenceDateTime);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<Reference> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code prediction} attribute
   */
  @JsonProperty("prediction")
  @Override
  public Optional<List<RiskAssessment_Prediction>> prediction() {
    return Optional.ofNullable(prediction);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<Reference> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableRiskAssessment(
        newValue,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableRiskAssessment(
        value,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        newValue,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        value,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withCondition(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        newValue,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withCondition(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        value,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        newValue,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        value,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        newValue,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        value,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        newValue,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        value,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withParent(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        newValue,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withParent(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        value,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskAssessment#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskAssessment withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        newValue,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        newValue,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        value,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        newValue,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        value,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        newValue,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        value,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#mitigation() mitigation} attribute.
   * @param value The value for mitigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMitigation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "mitigation");
    if (Objects.equals(this.mitigation, newValue)) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        newValue,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#mitigation() mitigation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mitigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMitigation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.mitigation, value)) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        value,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#basis() basis} attribute.
   * @param value The value for basis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withBasis(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basis");
    if (this.basis == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        newValue,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#basis() basis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withBasis(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basis == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        value,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        newValue,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        value,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        newValue,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        value,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        newValue,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        value,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        newValue,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        value,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        newValue,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        value,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        newValue,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        value,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        newValue,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        value,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskAssessment#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskAssessment withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        newValue,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withBasedOn(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        newValue,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withBasedOn(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        value,
        this.prediction,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#prediction() prediction} attribute.
   * @param value The value for prediction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withPrediction(List<RiskAssessment_Prediction> value) {
    @Nullable List<RiskAssessment_Prediction> newValue = Objects.requireNonNull(value, "prediction");
    if (this.prediction == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        newValue,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#prediction() prediction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prediction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withPrediction(Optional<? extends List<RiskAssessment_Prediction>> optional) {
    @Nullable List<RiskAssessment_Prediction> value = optional.orElse(null);
    if (this.prediction == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        value,
        this.identifier,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        newValue,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        value,
        this.reasonCode,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        newValue,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        value,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withPerformer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withPerformer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableRiskAssessment(
        this.text,
        this.method,
        this.condition,
        this.note,
        this.status,
        this.occurrencePeriod,
        this.parent,
        this.subject,
        this.encounter,
        this.code,
        this.contained,
        this.mitigation,
        this.basis,
        this.id,
        this.occurrenceDateTime,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.reasonReference,
        this.extension,
        this.meta,
        this.resourceType,
        this.basedOn,
        this.prediction,
        this.identifier,
        this.reasonCode,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskAssessment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskAssessment
        && equalTo((ImmutableRiskAssessment) another);
  }

  private boolean equalTo(ImmutableRiskAssessment another) {
    return Objects.equals(text, another.text)
        && Objects.equals(method, another.method)
        && Objects.equals(condition, another.condition)
        && Objects.equals(note, another.note)
        && Objects.equals(status, another.status)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(parent, another.parent)
        && subject.equals(another.subject)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(code, another.code)
        && Objects.equals(contained, another.contained)
        && Objects.equals(mitigation, another.mitigation)
        && Objects.equals(basis, another.basis)
        && Objects.equals(id, another.id)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(extension, another.extension)
        && Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(prediction, another.prediction)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(performer, another.performer);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code method}, {@code condition}, {@code note}, {@code status}, {@code occurrencePeriod}, {@code parent}, {@code subject}, {@code encounter}, {@code code}, {@code contained}, {@code mitigation}, {@code basis}, {@code id}, {@code occurrenceDateTime}, {@code implicitRules}, {@code language}, {@code modifierExtension}, {@code reasonReference}, {@code extension}, {@code meta}, {@code resourceType}, {@code basedOn}, {@code prediction}, {@code identifier}, {@code reasonCode}, {@code performer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(mitigation);
    h += (h << 5) + Objects.hashCode(basis);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(prediction);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(performer);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskAssessment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RiskAssessment{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (method != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (condition != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (note != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (status != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (occurrencePeriod != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (parent != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("subject=").append(subject);
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (mitigation != null) {
      builder.append(", ");
      builder.append("mitigation=").append(mitigation);
    }
    if (basis != null) {
      builder.append(", ");
      builder.append("basis=").append(basis);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (prediction != null) {
      builder.append(", ");
      builder.append("prediction=").append(prediction);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RiskAssessment", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RiskAssessment {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<Reference> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<Reference> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> mitigation = Optional.empty();
    boolean mitigationIsSet;
    @Nullable Optional<List<Reference>> basis = Optional.empty();
    boolean basisIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<List<RiskAssessment_Prediction>> prediction = Optional.empty();
    boolean predictionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Reference> performer = Optional.empty();
    boolean performerIsSet;
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<Reference> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("parent")
    public void setParent(Optional<Reference> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("mitigation")
    public void setMitigation(Optional<String> mitigation) {
      this.mitigation = mitigation;
      this.mitigationIsSet = true;
    }
    @JsonProperty("basis")
    public void setBasis(Optional<List<Reference>> basis) {
      this.basis = basis;
      this.basisIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<Reference> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("prediction")
    public void setPrediction(Optional<List<RiskAssessment_Prediction>> prediction) {
      this.prediction = prediction;
      this.predictionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> mitigation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RiskAssessment_Prediction>> prediction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performer() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRiskAssessment fromJson(Json json) {
    ImmutableRiskAssessment.Builder builder = ((ImmutableRiskAssessment.Builder) ImmutableRiskAssessment.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.mitigationIsSet) {
      builder.mitigation(json.mitigation);
    }
    if (json.basisIsSet) {
      builder.basis(json.basis);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.predictionIsSet) {
      builder.prediction(json.prediction);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    return (ImmutableRiskAssessment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskAssessment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskAssessment instance
   */
  public static RiskAssessment copyOf(RiskAssessment instance) {
    if (instance instanceof ImmutableRiskAssessment) {
      return (ImmutableRiskAssessment) instance;
    }
    return ((ImmutableRiskAssessment.Builder) ImmutableRiskAssessment.builder())
        .text(instance.text())
        .method(instance.method())
        .condition(instance.condition())
        .note(instance.note())
        .status(instance.status())
        .occurrencePeriod(instance.occurrencePeriod())
        .parent(instance.parent())
        .subject(instance.subject())
        .encounter(instance.encounter())
        .code(instance.code())
        .contained(instance.contained())
        .mitigation(instance.mitigation())
        .basis(instance.basis())
        .id(instance.id())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .reasonReference(instance.reasonReference())
        .extension(instance.extension())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .basedOn(instance.basedOn())
        .prediction(instance.prediction())
        .identifier(instance.identifier())
        .reasonCode(instance.reasonCode())
        .performer(instance.performer())
        .build();
  }

  /**
   * Creates a builder for {@link RiskAssessment RiskAssessment}.
   * <pre>
   * ImmutableRiskAssessment.builder()
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link RiskAssessment#text() text}
   *    .method(com.medplum.types.fhir.CodeableConcept) // optional {@link RiskAssessment#method() method}
   *    .condition(com.medplum.types.fhir.Reference) // optional {@link RiskAssessment#condition() condition}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link RiskAssessment#note() note}
   *    .status(com.medplum.types.fhir.Code) // optional {@link RiskAssessment#status() status}
   *    .occurrencePeriod(com.medplum.types.fhir.Period) // optional {@link RiskAssessment#occurrencePeriod() occurrencePeriod}
   *    .parent(com.medplum.types.fhir.Reference) // optional {@link RiskAssessment#parent() parent}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link RiskAssessment#subject() subject}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link RiskAssessment#encounter() encounter}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link RiskAssessment#code() code}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link RiskAssessment#contained() contained}
   *    .mitigation(String) // optional {@link RiskAssessment#mitigation() mitigation}
   *    .basis(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link RiskAssessment#basis() basis}
   *    .id(com.medplum.types.fhir.Id) // optional {@link RiskAssessment#id() id}
   *    .occurrenceDateTime(String) // optional {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link RiskAssessment#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link RiskAssessment#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskAssessment#modifierExtension() modifierExtension}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link RiskAssessment#reasonReference() reasonReference}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskAssessment#extension() extension}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link RiskAssessment#meta() meta}
   *    .resourceType(String) // required {@link RiskAssessment#resourceType() resourceType}
   *    .basedOn(com.medplum.types.fhir.Reference) // optional {@link RiskAssessment#basedOn() basedOn}
   *    .prediction(List&amp;lt;com.medplum.types.fhir.RiskAssessment_Prediction&amp;gt;) // optional {@link RiskAssessment#prediction() prediction}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link RiskAssessment#identifier() identifier}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link RiskAssessment#reasonCode() reasonCode}
   *    .performer(com.medplum.types.fhir.Reference) // optional {@link RiskAssessment#performer() performer}
   *    .build();
   * </pre>
   * @return A new RiskAssessment builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableRiskAssessment.Builder();
  }

  /**
   * Builds instances of type {@link RiskAssessment RiskAssessment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RiskAssessment", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_METHOD = 0x2L;
    private static final long OPT_BIT_CONDITION = 0x4L;
    private static final long OPT_BIT_NOTE = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x20L;
    private static final long OPT_BIT_PARENT = 0x40L;
    private static final long OPT_BIT_ENCOUNTER = 0x80L;
    private static final long OPT_BIT_CODE = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_MITIGATION = 0x400L;
    private static final long OPT_BIT_BASIS = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x20000L;
    private static final long OPT_BIT_EXTENSION = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_BASED_ON = 0x100000L;
    private static final long OPT_BIT_PREDICTION = 0x200000L;
    private static final long OPT_BIT_IDENTIFIER = 0x400000L;
    private static final long OPT_BIT_REASON_CODE = 0x800000L;
    private static final long OPT_BIT_PERFORMER = 0x1000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable CodeableConcept method;
    private @Nullable Reference condition;
    private @Nullable List<Annotation> note;
    private @Nullable Code status;
    private @Nullable Period occurrencePeriod;
    private @Nullable Reference parent;
    private @Nullable Reference subject;
    private @Nullable Reference encounter;
    private @Nullable CodeableConcept code;
    private @Nullable List<ResourceList> contained;
    private @Nullable String mitigation;
    private @Nullable List<Reference> basis;
    private @Nullable Id id;
    private @Nullable String occurrenceDateTime;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> reasonReference;
    private @Nullable List<Extension> extension;
    private @Nullable Meta meta;
    private @Nullable String resourceType;
    private @Nullable Reference basedOn;
    private @Nullable List<RiskAssessment_Prediction> prediction;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Reference performer;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
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
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
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
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(Reference condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<? extends Reference> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
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
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
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
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
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
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
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
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrencePeriod(Period occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = Objects.requireNonNull(occurrencePeriod, "occurrencePeriod");
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrencePeriod")
    public final Builder occurrencePeriod(Optional<? extends Period> occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = occurrencePeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(Reference parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder parent(Optional<? extends Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the value for the {@link RiskAssessment#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
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
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
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
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    public final Builder mitigation(String mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = Objects.requireNonNull(mitigation, "mitigation");
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mitigation")
    public final Builder mitigation(Optional<String> mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = mitigation.orElse(null);
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for chained invocation
     */
    public final Builder basis(List<Reference> basis) {
      checkNotIsSet(basisIsSet(), "basis");
      this.basis = Objects.requireNonNull(basis, "basis");
      optBits |= OPT_BIT_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basis")
    public final Builder basis(Optional<? extends List<Reference>> basis) {
      checkNotIsSet(basisIsSet(), "basis");
      this.basis = basis.orElse(null);
      optBits |= OPT_BIT_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
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
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
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
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(Optional<String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
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
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
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
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
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
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
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
     * Initializes the value for the {@link RiskAssessment#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(Reference basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for chained invocation
     */
    public final Builder prediction(List<RiskAssessment_Prediction> prediction) {
      checkNotIsSet(predictionIsSet(), "prediction");
      this.prediction = Objects.requireNonNull(prediction, "prediction");
      optBits |= OPT_BIT_PREDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prediction")
    public final Builder prediction(Optional<? extends List<RiskAssessment_Prediction>> prediction) {
      checkNotIsSet(predictionIsSet(), "prediction");
      this.prediction = prediction.orElse(null);
      optBits |= OPT_BIT_PREDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Builds a new {@link RiskAssessment RiskAssessment}.
     * @return An immutable instance of RiskAssessment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RiskAssessment build() {
      checkRequiredAttributes();
      return new ImmutableRiskAssessment(
          text,
          method,
          condition,
          note,
          status,
          occurrencePeriod,
          parent,
          subject,
          encounter,
          code,
          contained,
          mitigation,
          basis,
          id,
          occurrenceDateTime,
          implicitRules,
          language,
          modifierExtension,
          reasonReference,
          extension,
          meta,
          resourceType,
          basedOn,
          prediction,
          identifier,
          reasonCode,
          performer);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean mitigationIsSet() {
      return (optBits & OPT_BIT_MITIGATION) != 0;
    }

    private boolean basisIsSet() {
      return (optBits & OPT_BIT_BASIS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean predictionIsSet() {
      return (optBits & OPT_BIT_PREDICTION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RiskAssessment is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build RiskAssessment, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "RiskAssessment", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link RiskAssessment#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "RiskAssessment", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link RiskAssessment#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "RiskAssessment", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    BuildFinal method(CodeableConcept method);

    /**
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal method(Optional<? extends CodeableConcept> method);

    /**
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(Reference condition);

    /**
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(Optional<? extends Reference> condition);

    /**
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(Reference parent);

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(Optional<? extends Reference> parent);

    /**
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mitigation(String mitigation);

    /**
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mitigation(Optional<String> mitigation);

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basis(List<Reference> basis);

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basis(Optional<? extends List<Reference>> basis);

    /**
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(Reference basedOn);

    /**
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends Reference> basedOn);

    /**
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prediction(List<RiskAssessment_Prediction> prediction);

    /**
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prediction(Optional<? extends List<RiskAssessment_Prediction>> prediction);

    /**
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(Reference performer);

    /**
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends Reference> performer);

    /**
     * Builds a new {@link RiskAssessment RiskAssessment}.
     * @return An immutable instance of RiskAssessment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RiskAssessment build();
  }
}
