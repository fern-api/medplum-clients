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
 * Immutable implementation of {@link MedicationStatement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationStatement.builder()}.
 */
@Generated(from = "MedicationStatement", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationStatement implements MedicationStatement {
  private final @Nullable CodeableConcept category;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Reference medicationReference;
  private final @Nullable String effectiveDateTime;
  private final @Nullable Uri implicitRules;
  private final Reference subject;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<CodeableConcept> statusReason;
  private final @Nullable Code language;
  private final @Nullable Id id;
  private final @Nullable CodeableConcept medicationCodeableConcept;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> derivedFrom;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable DateTime dateAsserted;
  private final @Nullable Reference context;
  private final @Nullable List<ResourceList> contained;
  private final String resourceType;
  private final @Nullable List<Annotation> note;
  private final @Nullable Period effectivePeriod;
  private final @Nullable Code status;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Reference informationSource;
  private final @Nullable Meta meta;
  private final @Nullable List<Dosage> dosage;

  private ImmutableMedicationStatement(
      @Nullable CodeableConcept category,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Identifier> identifier,
      @Nullable Reference medicationReference,
      @Nullable String effectiveDateTime,
      @Nullable Uri implicitRules,
      Reference subject,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<CodeableConcept> statusReason,
      @Nullable Code language,
      @Nullable Id id,
      @Nullable CodeableConcept medicationCodeableConcept,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> derivedFrom,
      @Nullable List<Reference> partOf,
      @Nullable List<Reference> reasonReference,
      @Nullable DateTime dateAsserted,
      @Nullable Reference context,
      @Nullable List<ResourceList> contained,
      String resourceType,
      @Nullable List<Annotation> note,
      @Nullable Period effectivePeriod,
      @Nullable Code status,
      @Nullable List<Reference> basedOn,
      @Nullable Reference informationSource,
      @Nullable Meta meta,
      @Nullable List<Dosage> dosage) {
    this.category = category;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.medicationReference = medicationReference;
    this.effectiveDateTime = effectiveDateTime;
    this.implicitRules = implicitRules;
    this.subject = subject;
    this.reasonCode = reasonCode;
    this.statusReason = statusReason;
    this.language = language;
    this.id = id;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.extension = extension;
    this.derivedFrom = derivedFrom;
    this.partOf = partOf;
    this.reasonReference = reasonReference;
    this.dateAsserted = dateAsserted;
    this.context = context;
    this.contained = contained;
    this.resourceType = resourceType;
    this.note = note;
    this.effectivePeriod = effectivePeriod;
    this.status = status;
    this.basedOn = basedOn;
    this.informationSource = informationSource;
    this.meta = meta;
    this.dosage = dosage;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code medicationReference} attribute
   */
  @JsonProperty("medicationReference")
  @Override
  public Optional<Reference> medicationReference() {
    return Optional.ofNullable(medicationReference);
  }

  /**
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @JsonProperty("effectiveDateTime")
  @Override
  public Optional<String> effectiveDateTime() {
    return Optional.ofNullable(effectiveDateTime);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<List<CodeableConcept>> statusReason() {
    return Optional.ofNullable(statusReason);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @JsonProperty("medicationCodeableConcept")
  @Override
  public Optional<CodeableConcept> medicationCodeableConcept() {
    return Optional.ofNullable(medicationCodeableConcept);
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
   * @return The value of the {@code derivedFrom} attribute
   */
  @JsonProperty("derivedFrom")
  @Override
  public Optional<List<Reference>> derivedFrom() {
    return Optional.ofNullable(derivedFrom);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
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
   * @return The value of the {@code dateAsserted} attribute
   */
  @JsonProperty("dateAsserted")
  @Override
  public Optional<DateTime> dateAsserted() {
    return Optional.ofNullable(dateAsserted);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<Reference> context() {
    return Optional.ofNullable(context);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @JsonProperty("effectivePeriod")
  @Override
  public Optional<Period> effectivePeriod() {
    return Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code informationSource} attribute
   */
  @JsonProperty("informationSource")
  @Override
  public Optional<Reference> informationSource() {
    return Optional.ofNullable(informationSource);
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
   * @return The value of the {@code dosage} attribute
   */
  @JsonProperty("dosage")
  @Override
  public Optional<List<Dosage>> dosage() {
    return Optional.ofNullable(dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationStatement(
        newValue,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationStatement(
        value,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        value,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        newValue,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        value,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        newValue,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        value,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withMedicationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withMedicationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        value,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "effectiveDateTime");
    if (Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        newValue,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        value,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        newValue,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        value,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationStatement#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationStatement withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        newValue,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        newValue,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        value,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withStatusReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        newValue,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withStatusReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        value,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        newValue,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        value,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        newValue,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        value,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withMedicationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        newValue,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withMedicationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        value,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        newValue,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        value,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withDerivedFrom(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        newValue,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withDerivedFrom(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        value,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        newValue,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        value,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        newValue,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        value,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#dateAsserted() dateAsserted} attribute.
   * @param value The value for dateAsserted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withDateAsserted(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "dateAsserted");
    if (this.dateAsserted == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        newValue,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#dateAsserted() dateAsserted} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateAsserted
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withDateAsserted(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.dateAsserted == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        value,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withContext(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        newValue,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withContext(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        value,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        newValue,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        value,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationStatement#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationStatement withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        newValue,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        newValue,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        value,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        newValue,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        value,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        newValue,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        value,
        this.basedOn,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        newValue,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        value,
        this.informationSource,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#informationSource() informationSource} attribute.
   * @param value The value for informationSource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withInformationSource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "informationSource");
    if (this.informationSource == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        newValue,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#informationSource() informationSource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for informationSource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withInformationSource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.informationSource == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        value,
        this.meta,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        newValue,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        value,
        this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#dosage() dosage} attribute.
   * @param value The value for dosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withDosage(List<Dosage> value) {
    @Nullable List<Dosage> newValue = Objects.requireNonNull(value, "dosage");
    if (this.dosage == newValue) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#dosage() dosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withDosage(Optional<? extends List<Dosage>> optional) {
    @Nullable List<Dosage> value = optional.orElse(null);
    if (this.dosage == value) return this;
    return new ImmutableMedicationStatement(
        this.category,
        this.text,
        this.modifierExtension,
        this.identifier,
        this.medicationReference,
        this.effectiveDateTime,
        this.implicitRules,
        this.subject,
        this.reasonCode,
        this.statusReason,
        this.language,
        this.id,
        this.medicationCodeableConcept,
        this.extension,
        this.derivedFrom,
        this.partOf,
        this.reasonReference,
        this.dateAsserted,
        this.context,
        this.contained,
        this.resourceType,
        this.note,
        this.effectivePeriod,
        this.status,
        this.basedOn,
        this.informationSource,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationStatement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationStatement
        && equalTo((ImmutableMedicationStatement) another);
  }

  private boolean equalTo(ImmutableMedicationStatement another) {
    return Objects.equals(category, another.category)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(medicationReference, another.medicationReference)
        && Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && Objects.equals(implicitRules, another.implicitRules)
        && subject.equals(another.subject)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(language, another.language)
        && Objects.equals(id, another.id)
        && Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && Objects.equals(extension, another.extension)
        && Objects.equals(derivedFrom, another.derivedFrom)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(dateAsserted, another.dateAsserted)
        && Objects.equals(context, another.context)
        && Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType)
        && Objects.equals(note, another.note)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(status, another.status)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(informationSource, another.informationSource)
        && Objects.equals(meta, another.meta)
        && Objects.equals(dosage, another.dosage);
  }

  /**
   * Computes a hash code from attributes: {@code category}, {@code text}, {@code modifierExtension}, {@code identifier}, {@code medicationReference}, {@code effectiveDateTime}, {@code implicitRules}, {@code subject}, {@code reasonCode}, {@code statusReason}, {@code language}, {@code id}, {@code medicationCodeableConcept}, {@code extension}, {@code derivedFrom}, {@code partOf}, {@code reasonReference}, {@code dateAsserted}, {@code context}, {@code contained}, {@code resourceType}, {@code note}, {@code effectivePeriod}, {@code status}, {@code basedOn}, {@code informationSource}, {@code meta}, {@code dosage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(medicationReference);
    h += (h << 5) + Objects.hashCode(effectiveDateTime);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(derivedFrom);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(dateAsserted);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(informationSource);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(dosage);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationStatement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationStatement{");
    if (category != null) {
      builder.append("category=").append(category);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (medicationReference != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (effectiveDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (implicitRules != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("subject=").append(subject);
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (medicationCodeableConcept != null) {
      builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (dateAsserted != null) {
      builder.append(", ");
      builder.append("dateAsserted=").append(dateAsserted);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (informationSource != null) {
      builder.append(", ");
      builder.append("informationSource=").append(informationSource);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (dosage != null) {
      builder.append(", ");
      builder.append("dosage=").append(dosage);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationStatement", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationStatement {
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> medicationReference = Optional.empty();
    boolean medicationReferenceIsSet;
    @Nullable Optional<String> effectiveDateTime = Optional.empty();
    boolean effectiveDateTimeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Reference subject;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<CodeableConcept>> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> medicationCodeableConcept = Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> derivedFrom = Optional.empty();
    boolean derivedFromIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<DateTime> dateAsserted = Optional.empty();
    boolean dateAssertedIsSet;
    @Nullable Optional<Reference> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Reference> informationSource = Optional.empty();
    boolean informationSourceIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Dosage>> dosage = Optional.empty();
    boolean dosageIsSet;
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("medicationReference")
    public void setMedicationReference(Optional<Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(Optional<String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<List<CodeableConcept>> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(Optional<CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(Optional<List<Reference>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("dateAsserted")
    public void setDateAsserted(Optional<DateTime> dateAsserted) {
      this.dateAsserted = dateAsserted;
      this.dateAssertedIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<Reference> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("informationSource")
    public void setInformationSource(Optional<Reference> informationSource) {
      this.informationSource = informationSource;
      this.informationSourceIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("dosage")
    public void setDosage(Optional<List<Dosage>> dosage) {
      this.dosage = dosage;
      this.dosageIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> dateAsserted() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> informationSource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Dosage>> dosage() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationStatement fromJson(Json json) {
    ImmutableMedicationStatement.Builder builder = ((ImmutableMedicationStatement.Builder) ImmutableMedicationStatement.builder());
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.dateAssertedIsSet) {
      builder.dateAsserted(json.dateAsserted);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.informationSourceIsSet) {
      builder.informationSource(json.informationSource);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.dosageIsSet) {
      builder.dosage(json.dosage);
    }
    return (ImmutableMedicationStatement) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationStatement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationStatement instance
   */
  public static MedicationStatement copyOf(MedicationStatement instance) {
    if (instance instanceof ImmutableMedicationStatement) {
      return (ImmutableMedicationStatement) instance;
    }
    return ((ImmutableMedicationStatement.Builder) ImmutableMedicationStatement.builder())
        .category(instance.category())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .medicationReference(instance.medicationReference())
        .effectiveDateTime(instance.effectiveDateTime())
        .implicitRules(instance.implicitRules())
        .subject(instance.subject())
        .reasonCode(instance.reasonCode())
        .statusReason(instance.statusReason())
        .language(instance.language())
        .id(instance.id())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .extension(instance.extension())
        .derivedFrom(instance.derivedFrom())
        .partOf(instance.partOf())
        .reasonReference(instance.reasonReference())
        .dateAsserted(instance.dateAsserted())
        .context(instance.context())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .note(instance.note())
        .effectivePeriod(instance.effectivePeriod())
        .status(instance.status())
        .basedOn(instance.basedOn())
        .informationSource(instance.informationSource())
        .meta(instance.meta())
        .dosage(instance.dosage())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationStatement MedicationStatement}.
   * <pre>
   * ImmutableMedicationStatement.builder()
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationStatement#category() category}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicationStatement#text() text}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationStatement#modifierExtension() modifierExtension}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MedicationStatement#identifier() identifier}
   *    .medicationReference(com.medplum.types.fhir.Reference) // optional {@link MedicationStatement#medicationReference() medicationReference}
   *    .effectiveDateTime(String) // optional {@link MedicationStatement#effectiveDateTime() effectiveDateTime}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicationStatement#implicitRules() implicitRules}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link MedicationStatement#subject() subject}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationStatement#reasonCode() reasonCode}
   *    .statusReason(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationStatement#statusReason() statusReason}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicationStatement#language() language}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicationStatement#id() id}
   *    .medicationCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationStatement#extension() extension}
   *    .derivedFrom(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#derivedFrom() derivedFrom}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#partOf() partOf}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#reasonReference() reasonReference}
   *    .dateAsserted(com.medplum.types.fhir.DateTime) // optional {@link MedicationStatement#dateAsserted() dateAsserted}
   *    .context(com.medplum.types.fhir.Reference) // optional {@link MedicationStatement#context() context}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicationStatement#contained() contained}
   *    .resourceType(String) // required {@link MedicationStatement#resourceType() resourceType}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link MedicationStatement#note() note}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link MedicationStatement#effectivePeriod() effectivePeriod}
   *    .status(com.medplum.types.fhir.Code) // optional {@link MedicationStatement#status() status}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#basedOn() basedOn}
   *    .informationSource(com.medplum.types.fhir.Reference) // optional {@link MedicationStatement#informationSource() informationSource}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicationStatement#meta() meta}
   *    .dosage(List&amp;lt;com.medplum.types.fhir.Dosage&amp;gt;) // optional {@link MedicationStatement#dosage() dosage}
   *    .build();
   * </pre>
   * @return A new MedicationStatement builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableMedicationStatement.Builder();
  }

  /**
   * Builds instances of type {@link MedicationStatement MedicationStatement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationStatement", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x10L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_REASON_CODE = 0x80L;
    private static final long OPT_BIT_STATUS_REASON = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_DERIVED_FROM = 0x2000L;
    private static final long OPT_BIT_PART_OF = 0x4000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x8000L;
    private static final long OPT_BIT_DATE_ASSERTED = 0x10000L;
    private static final long OPT_BIT_CONTEXT = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_NOTE = 0x80000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x100000L;
    private static final long OPT_BIT_STATUS = 0x200000L;
    private static final long OPT_BIT_BASED_ON = 0x400000L;
    private static final long OPT_BIT_INFORMATION_SOURCE = 0x800000L;
    private static final long OPT_BIT_META = 0x1000000L;
    private static final long OPT_BIT_DOSAGE = 0x2000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable CodeableConcept category;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference medicationReference;
    private @Nullable String effectiveDateTime;
    private @Nullable Uri implicitRules;
    private @Nullable Reference subject;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<CodeableConcept> statusReason;
    private @Nullable Code language;
    private @Nullable Id id;
    private @Nullable CodeableConcept medicationCodeableConcept;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> derivedFrom;
    private @Nullable List<Reference> partOf;
    private @Nullable List<Reference> reasonReference;
    private @Nullable DateTime dateAsserted;
    private @Nullable Reference context;
    private @Nullable List<ResourceList> contained;
    private @Nullable String resourceType;
    private @Nullable List<Annotation> note;
    private @Nullable Period effectivePeriod;
    private @Nullable Code status;
    private @Nullable List<Reference> basedOn;
    private @Nullable Reference informationSource;
    private @Nullable Meta meta;
    private @Nullable List<Dosage> dosage;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
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
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
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
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationReference(Reference medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = Objects.requireNonNull(medicationReference, "medicationReference");
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medicationReference")
    public final Builder medicationReference(Optional<? extends Reference> medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = medicationReference.orElse(null);
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDateTime(String effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = Objects.requireNonNull(effectiveDateTime, "effectiveDateTime");
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveDateTime")
    public final Builder effectiveDateTime(Optional<String> effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = effectiveDateTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link MedicationStatement#subject() subject} attribute.
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
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(List<CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends List<CodeableConcept>> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
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
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
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
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
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
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
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
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationCodeableConcept(CodeableConcept medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = Objects.requireNonNull(medicationCodeableConcept, "medicationCodeableConcept");
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medicationCodeableConcept")
    public final Builder medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = medicationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(List<Reference> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("derivedFrom")
    public final Builder derivedFrom(Optional<? extends List<Reference>> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateAsserted(DateTime dateAsserted) {
      checkNotIsSet(dateAssertedIsSet(), "dateAsserted");
      this.dateAsserted = Objects.requireNonNull(dateAsserted, "dateAsserted");
      optBits |= OPT_BIT_DATE_ASSERTED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateAsserted")
    public final Builder dateAsserted(Optional<? extends DateTime> dateAsserted) {
      checkNotIsSet(dateAssertedIsSet(), "dateAsserted");
      this.dateAsserted = dateAsserted.orElse(null);
      optBits |= OPT_BIT_DATE_ASSERTED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(Reference context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends Reference> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
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
     * Initializes the value for the {@link MedicationStatement#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
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
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
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
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(Optional<? extends Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
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
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
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
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for chained invocation
     */
    public final Builder informationSource(Reference informationSource) {
      checkNotIsSet(informationSourceIsSet(), "informationSource");
      this.informationSource = Objects.requireNonNull(informationSource, "informationSource");
      optBits |= OPT_BIT_INFORMATION_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("informationSource")
    public final Builder informationSource(Optional<? extends Reference> informationSource) {
      checkNotIsSet(informationSourceIsSet(), "informationSource");
      this.informationSource = informationSource.orElse(null);
      optBits |= OPT_BIT_INFORMATION_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosage(List<Dosage> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = Objects.requireNonNull(dosage, "dosage");
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dosage")
    public final Builder dosage(Optional<? extends List<Dosage>> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = dosage.orElse(null);
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Builds a new {@link MedicationStatement MedicationStatement}.
     * @return An immutable instance of MedicationStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationStatement build() {
      checkRequiredAttributes();
      return new ImmutableMedicationStatement(
          category,
          text,
          modifierExtension,
          identifier,
          medicationReference,
          effectiveDateTime,
          implicitRules,
          subject,
          reasonCode,
          statusReason,
          language,
          id,
          medicationCodeableConcept,
          extension,
          derivedFrom,
          partOf,
          reasonReference,
          dateAsserted,
          context,
          contained,
          resourceType,
          note,
          effectivePeriod,
          status,
          basedOn,
          informationSource,
          meta,
          dosage);
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean dateAssertedIsSet() {
      return (optBits & OPT_BIT_DATE_ASSERTED) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean informationSourceIsSet() {
      return (optBits & OPT_BIT_INFORMATION_SOURCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean dosageIsSet() {
      return (optBits & OPT_BIT_DOSAGE) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationStatement is strict, attribute is already set: ".concat(name));
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
      return "Cannot build MedicationStatement, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationStatement", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link MedicationStatement#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "MedicationStatement", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationStatement#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicationStatement", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(Optional<? extends Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(String effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(Optional<String> effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(List<CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends List<CodeableConcept>> statusReason);

    /**
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(List<Reference> derivedFrom);

    /**
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(Optional<? extends List<Reference>> derivedFrom);

    /**
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateAsserted(DateTime dateAsserted);

    /**
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateAsserted(Optional<? extends DateTime> dateAsserted);

    /**
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(Reference context);

    /**
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(Optional<? extends Reference> context);

    /**
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal informationSource(Reference informationSource);

    /**
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal informationSource(Optional<? extends Reference> informationSource);

    /**
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosage(List<Dosage> dosage);

    /**
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosage(Optional<? extends List<Dosage>> dosage);

    /**
     * Builds a new {@link MedicationStatement MedicationStatement}.
     * @return An immutable instance of MedicationStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationStatement build();
  }
}