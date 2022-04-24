//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link FamilyMemberHistory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFamilyMemberHistory.builder()}.
 */
@org.immutables.value.Generated(from = "FamilyMemberHistory", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableFamilyMemberHistory implements com.fhir.FamilyMemberHistory {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable java.lang.Boolean estimatedAge;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Age deceasedAge;
  private final @javax.annotation.Nullable java.lang.String ageString;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Range ageRange;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept dataAbsentReason;
  private final @javax.annotation.Nullable java.lang.String deceasedString;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.FamilyMemberHistory_Condition> condition;
  private final @javax.annotation.Nullable java.lang.String bornDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.lang.String deceasedDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.FamilymemberhistoryStatus status;
  private final @javax.annotation.Nullable com.fhir.Period bornPeriod;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.Boolean deceasedBoolean;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String bornString;
  private final @javax.annotation.Nullable com.fhir.Age ageAge;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Range deceasedRange;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept sex;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final com.fhir.Reference patient;
  private final com.fhir.CodeableConcept relationship;
  private final java.lang.String resourceType;

  private ImmutableFamilyMemberHistory(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable java.lang.Boolean estimatedAge,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Age deceasedAge,
      @javax.annotation.Nullable java.lang.String ageString,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Range ageRange,
      @javax.annotation.Nullable com.fhir.CodeableConcept dataAbsentReason,
      @javax.annotation.Nullable java.lang.String deceasedString,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.FamilyMemberHistory_Condition> condition,
      @javax.annotation.Nullable java.lang.String bornDate,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.lang.String deceasedDate,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.FamilymemberhistoryStatus status,
      @javax.annotation.Nullable com.fhir.Period bornPeriod,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.Boolean deceasedBoolean,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String bornString,
      @javax.annotation.Nullable com.fhir.Age ageAge,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Range deceasedRange,
      @javax.annotation.Nullable com.fhir.CodeableConcept sex,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      com.fhir.Reference patient,
      com.fhir.CodeableConcept relationship,
      java.lang.String resourceType) {
    this.reasonReference = reasonReference;
    this.estimatedAge = estimatedAge;
    this.meta = meta;
    this.deceasedAge = deceasedAge;
    this.ageString = ageString;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.ageRange = ageRange;
    this.dataAbsentReason = dataAbsentReason;
    this.deceasedString = deceasedString;
    this.note = note;
    this.condition = condition;
    this.bornDate = bornDate;
    this.reasonCode = reasonCode;
    this.deceasedDate = deceasedDate;
    this.identifier = identifier;
    this.status = status;
    this.bornPeriod = bornPeriod;
    this.language = language;
    this.name = name;
    this.deceasedBoolean = deceasedBoolean;
    this.extension = extension;
    this.bornString = bornString;
    this.ageAge = ageAge;
    this.date = date;
    this.contained = contained;
    this.instantiatesCanonical = instantiatesCanonical;
    this.id = id;
    this.text = text;
    this.deceasedRange = deceasedRange;
    this.sex = sex;
    this.instantiatesUri = instantiatesUri;
    this.patient = patient;
    this.relationship = relationship;
    this.resourceType = resourceType;
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code estimatedAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("estimatedAge")
  @Override
  public java.util.Optional<java.lang.Boolean> estimatedAge() {
    return java.util.Optional.ofNullable(estimatedAge);
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
   * @return The value of the {@code deceasedAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deceasedAge")
  @Override
  public java.util.Optional<com.fhir.Age> deceasedAge() {
    return java.util.Optional.ofNullable(deceasedAge);
  }

  /**
   * @return The value of the {@code ageString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ageString")
  @Override
  public java.util.Optional<java.lang.String> ageString() {
    return java.util.Optional.ofNullable(ageString);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code ageRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ageRange")
  @Override
  public java.util.Optional<com.fhir.Range> ageRange() {
    return java.util.Optional.ofNullable(ageRange);
  }

  /**
   * @return The value of the {@code dataAbsentReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dataAbsentReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason() {
    return java.util.Optional.ofNullable(dataAbsentReason);
  }

  /**
   * @return The value of the {@code deceasedString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deceasedString")
  @Override
  public java.util.Optional<java.lang.String> deceasedString() {
    return java.util.Optional.ofNullable(deceasedString);
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
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public java.util.Optional<java.util.List<com.fhir.FamilyMemberHistory_Condition>> condition() {
    return java.util.Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code bornDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bornDate")
  @Override
  public java.util.Optional<java.lang.String> bornDate() {
    return java.util.Optional.ofNullable(bornDate);
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code deceasedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deceasedDate")
  @Override
  public java.util.Optional<java.lang.String> deceasedDate() {
    return java.util.Optional.ofNullable(deceasedDate);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.FamilymemberhistoryStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code bornPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bornPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> bornPeriod() {
    return java.util.Optional.ofNullable(bornPeriod);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code deceasedBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deceasedBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> deceasedBoolean() {
    return java.util.Optional.ofNullable(deceasedBoolean);
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
   * @return The value of the {@code bornString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bornString")
  @Override
  public java.util.Optional<java.lang.String> bornString() {
    return java.util.Optional.ofNullable(bornString);
  }

  /**
   * @return The value of the {@code ageAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ageAge")
  @Override
  public java.util.Optional<com.fhir.Age> ageAge() {
    return java.util.Optional.ofNullable(ageAge);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code deceasedRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deceasedRange")
  @Override
  public java.util.Optional<com.fhir.Range> deceasedRange() {
    return java.util.Optional.ofNullable(deceasedRange);
  }

  /**
   * @return The value of the {@code sex} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sex")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> sex() {
    return java.util.Optional.ofNullable(sex);
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
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relationship")
  @Override
  public com.fhir.CodeableConcept relationship() {
    return relationship;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        newValue,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableFamilyMemberHistory(
        value,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#estimatedAge() estimatedAge} attribute.
   * @param value The value for estimatedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withEstimatedAge(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.estimatedAge, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        newValue,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#estimatedAge() estimatedAge} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for estimatedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withEstimatedAge(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.estimatedAge, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        value,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        newValue,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        value,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedAge() deceasedAge} attribute.
   * @param value The value for deceasedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "deceasedAge");
    if (this.deceasedAge == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        newValue,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedAge() deceasedAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDeceasedAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.deceasedAge == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        value,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#ageString() ageString} attribute.
   * @param value The value for ageString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "ageString");
    if (java.util.Objects.equals(this.ageString, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#ageString() ageString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.ageString, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        newValue,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        value,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        newValue,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        value,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#ageRange() ageRange} attribute.
   * @param value The value for ageRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "ageRange");
    if (this.ageRange == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#ageRange() ageRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withAgeRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.ageRange == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} attribute.
   * @param value The value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDataAbsentReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "dataAbsentReason");
    if (this.dataAbsentReason == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        newValue,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDataAbsentReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.dataAbsentReason == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        value,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedString() deceasedString} attribute.
   * @param value The value for deceasedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "deceasedString");
    if (java.util.Objects.equals(this.deceasedString, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        newValue,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedString() deceasedString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.deceasedString, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        value,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        newValue,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        value,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withCondition(java.util.List<com.fhir.FamilyMemberHistory_Condition> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.FamilyMemberHistory_Condition> newValue = java.util.Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        newValue,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withCondition(java.util.Optional<? extends java.util.List<com.fhir.FamilyMemberHistory_Condition>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.FamilyMemberHistory_Condition> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        value,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#bornDate() bornDate} attribute.
   * @param value The value for bornDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "bornDate");
    if (java.util.Objects.equals(this.bornDate, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        newValue,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#bornDate() bornDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bornDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.bornDate, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        value,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        newValue,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        value,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedDate() deceasedDate} attribute.
   * @param value The value for deceasedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "deceasedDate");
    if (java.util.Objects.equals(this.deceasedDate, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        newValue,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedDate() deceasedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.deceasedDate, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        value,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        newValue,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        value,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withStatus(com.fhir.FamilymemberhistoryStatus value) {
    @javax.annotation.Nullable com.fhir.FamilymemberhistoryStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        newValue,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withStatus(java.util.Optional<? extends com.fhir.FamilymemberhistoryStatus> optional) {
    @javax.annotation.Nullable com.fhir.FamilymemberhistoryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        value,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#bornPeriod() bornPeriod} attribute.
   * @param value The value for bornPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "bornPeriod");
    if (this.bornPeriod == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        newValue,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#bornPeriod() bornPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bornPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withBornPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.bornPeriod == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        value,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        newValue,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        value,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        newValue,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        value,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} attribute.
   * @param value The value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.deceasedBoolean, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        newValue,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.deceasedBoolean, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        value,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        newValue,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        value,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#bornString() bornString} attribute.
   * @param value The value for bornString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "bornString");
    if (java.util.Objects.equals(this.bornString, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        newValue,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#bornString() bornString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bornString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.bornString, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        value,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#ageAge() ageAge} attribute.
   * @param value The value for ageAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "ageAge");
    if (this.ageAge == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        newValue,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#ageAge() ageAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withAgeAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.ageAge == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        value,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        newValue,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        value,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        newValue,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        value,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        newValue,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        value,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        newValue,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        value,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        newValue,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        value,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedRange() deceasedRange} attribute.
   * @param value The value for deceasedRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "deceasedRange");
    if (this.deceasedRange == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        newValue,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedRange() deceasedRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDeceasedRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.deceasedRange == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        value,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#sex() sex} attribute.
   * @param value The value for sex
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withSex(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "sex");
    if (this.sex == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        newValue,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#sex() sex} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sex
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withSex(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.sex == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        value,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        newValue,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        value,
        this.patient,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FamilyMemberHistory#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFamilyMemberHistory withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        newValue,
        this.relationship,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FamilyMemberHistory#relationship() relationship} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relationship
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFamilyMemberHistory withRelationship(com.fhir.CodeableConcept value) {
    if (this.relationship == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "relationship");
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FamilyMemberHistory#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFamilyMemberHistory withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.reasonReference,
        this.estimatedAge,
        this.meta,
        this.deceasedAge,
        this.ageString,
        this.implicitRules,
        this.modifierExtension,
        this.ageRange,
        this.dataAbsentReason,
        this.deceasedString,
        this.note,
        this.condition,
        this.bornDate,
        this.reasonCode,
        this.deceasedDate,
        this.identifier,
        this.status,
        this.bornPeriod,
        this.language,
        this.name,
        this.deceasedBoolean,
        this.extension,
        this.bornString,
        this.ageAge,
        this.date,
        this.contained,
        this.instantiatesCanonical,
        this.id,
        this.text,
        this.deceasedRange,
        this.sex,
        this.instantiatesUri,
        this.patient,
        this.relationship,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFamilyMemberHistory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFamilyMemberHistory
        && equalTo((ImmutableFamilyMemberHistory) another);
  }

  private boolean equalTo(ImmutableFamilyMemberHistory another) {
    return java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(estimatedAge, another.estimatedAge)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(deceasedAge, another.deceasedAge)
        && java.util.Objects.equals(ageString, another.ageString)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(ageRange, another.ageRange)
        && java.util.Objects.equals(dataAbsentReason, another.dataAbsentReason)
        && java.util.Objects.equals(deceasedString, another.deceasedString)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(condition, another.condition)
        && java.util.Objects.equals(bornDate, another.bornDate)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(deceasedDate, another.deceasedDate)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(bornPeriod, another.bornPeriod)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(deceasedBoolean, another.deceasedBoolean)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(bornString, another.bornString)
        && java.util.Objects.equals(ageAge, another.ageAge)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(deceasedRange, another.deceasedRange)
        && java.util.Objects.equals(sex, another.sex)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && patient.equals(another.patient)
        && relationship.equals(another.relationship)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code reasonReference}, {@code estimatedAge}, {@code meta}, {@code deceasedAge}, {@code ageString}, {@code implicitRules}, {@code modifierExtension}, {@code ageRange}, {@code dataAbsentReason}, {@code deceasedString}, {@code note}, {@code condition}, {@code bornDate}, {@code reasonCode}, {@code deceasedDate}, {@code identifier}, {@code status}, {@code bornPeriod}, {@code language}, {@code name}, {@code deceasedBoolean}, {@code extension}, {@code bornString}, {@code ageAge}, {@code date}, {@code contained}, {@code instantiatesCanonical}, {@code id}, {@code text}, {@code deceasedRange}, {@code sex}, {@code instantiatesUri}, {@code patient}, {@code relationship}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(estimatedAge);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(deceasedAge);
    h += (h << 5) + java.util.Objects.hashCode(ageString);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(ageRange);
    h += (h << 5) + java.util.Objects.hashCode(dataAbsentReason);
    h += (h << 5) + java.util.Objects.hashCode(deceasedString);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(condition);
    h += (h << 5) + java.util.Objects.hashCode(bornDate);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(deceasedDate);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(bornPeriod);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(deceasedBoolean);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(bornString);
    h += (h << 5) + java.util.Objects.hashCode(ageAge);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(deceasedRange);
    h += (h << 5) + java.util.Objects.hashCode(sex);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + relationship.hashCode();
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code FamilyMemberHistory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("FamilyMemberHistory{");
    if (reasonReference != null) {
      builder.append("reasonReference=").append(reasonReference);
    }
    if (estimatedAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("estimatedAge=").append(estimatedAge);
    }
    if (meta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (deceasedAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("deceasedAge=").append(deceasedAge);
    }
    if (ageString != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("ageString=").append(ageString);
    }
    if (implicitRules != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (ageRange != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("ageRange=").append(ageRange);
    }
    if (dataAbsentReason != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("dataAbsentReason=").append(dataAbsentReason);
    }
    if (deceasedString != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("deceasedString=").append(deceasedString);
    }
    if (note != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (condition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (bornDate != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("bornDate=").append(bornDate);
    }
    if (reasonCode != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (deceasedDate != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("deceasedDate=").append(deceasedDate);
    }
    if (identifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (status != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (bornPeriod != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("bornPeriod=").append(bornPeriod);
    }
    if (language != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (deceasedBoolean != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("deceasedBoolean=").append(deceasedBoolean);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (bornString != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("bornString=").append(bornString);
    }
    if (ageAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("ageAge=").append(ageAge);
    }
    if (date != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (contained != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (deceasedRange != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("deceasedRange=").append(deceasedRange);
    }
    if (sex != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("sex=").append(sex);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("patient=").append(patient);
    builder.append(", ");
    builder.append("relationship=").append(relationship);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "FamilyMemberHistory", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.FamilyMemberHistory {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> estimatedAge = java.util.Optional.empty();
    boolean estimatedAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> deceasedAge = java.util.Optional.empty();
    boolean deceasedAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> ageString = java.util.Optional.empty();
    boolean ageStringIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> ageRange = java.util.Optional.empty();
    boolean ageRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason = java.util.Optional.empty();
    boolean dataAbsentReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> deceasedString = java.util.Optional.empty();
    boolean deceasedStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.FamilyMemberHistory_Condition>> condition = java.util.Optional.empty();
    boolean conditionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> bornDate = java.util.Optional.empty();
    boolean bornDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> deceasedDate = java.util.Optional.empty();
    boolean deceasedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.FamilymemberhistoryStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> bornPeriod = java.util.Optional.empty();
    boolean bornPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> deceasedBoolean = java.util.Optional.empty();
    boolean deceasedBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> bornString = java.util.Optional.empty();
    boolean bornStringIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> ageAge = java.util.Optional.empty();
    boolean ageAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> deceasedRange = java.util.Optional.empty();
    boolean deceasedRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> sex = java.util.Optional.empty();
    boolean sexIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable com.fhir.CodeableConcept relationship;
    @javax.annotation.Nullable java.lang.String resourceType;
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedAge")
    public void setEstimatedAge(java.util.Optional<java.lang.Boolean> estimatedAge) {
      this.estimatedAge = estimatedAge;
      this.estimatedAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedAge")
    public void setDeceasedAge(java.util.Optional<com.fhir.Age> deceasedAge) {
      this.deceasedAge = deceasedAge;
      this.deceasedAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ageString")
    public void setAgeString(java.util.Optional<java.lang.String> ageString) {
      this.ageString = ageString;
      this.ageStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ageRange")
    public void setAgeRange(java.util.Optional<com.fhir.Range> ageRange) {
      this.ageRange = ageRange;
      this.ageRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason) {
      this.dataAbsentReason = dataAbsentReason;
      this.dataAbsentReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedString")
    public void setDeceasedString(java.util.Optional<java.lang.String> deceasedString) {
      this.deceasedString = deceasedString;
      this.deceasedStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(java.util.Optional<java.util.List<com.fhir.FamilyMemberHistory_Condition>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bornDate")
    public void setBornDate(java.util.Optional<java.lang.String> bornDate) {
      this.bornDate = bornDate;
      this.bornDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedDate")
    public void setDeceasedDate(java.util.Optional<java.lang.String> deceasedDate) {
      this.deceasedDate = deceasedDate;
      this.deceasedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.FamilymemberhistoryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bornPeriod")
    public void setBornPeriod(java.util.Optional<com.fhir.Period> bornPeriod) {
      this.bornPeriod = bornPeriod;
      this.bornPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedBoolean")
    public void setDeceasedBoolean(java.util.Optional<java.lang.Boolean> deceasedBoolean) {
      this.deceasedBoolean = deceasedBoolean;
      this.deceasedBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bornString")
    public void setBornString(java.util.Optional<java.lang.String> bornString) {
      this.bornString = bornString;
      this.bornStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ageAge")
    public void setAgeAge(java.util.Optional<com.fhir.Age> ageAge) {
      this.ageAge = ageAge;
      this.ageAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedRange")
    public void setDeceasedRange(java.util.Optional<com.fhir.Range> deceasedRange) {
      this.deceasedRange = deceasedRange;
      this.deceasedRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sex")
    public void setSex(java.util.Optional<com.fhir.CodeableConcept> sex) {
      this.sex = sex;
      this.sexIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public void setRelationship(com.fhir.CodeableConcept relationship) {
      this.relationship = relationship;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> estimatedAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> deceasedAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> ageString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> ageRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> deceasedString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.FamilyMemberHistory_Condition>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> bornDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> deceasedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.FamilymemberhistoryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> bornPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> deceasedBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> bornString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> ageAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> deceasedRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> sex() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept relationship() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableFamilyMemberHistory fromJson(Json json) {
    ImmutableFamilyMemberHistory.Builder builder = ((ImmutableFamilyMemberHistory.Builder) ImmutableFamilyMemberHistory.builder());
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.estimatedAgeIsSet) {
      builder.estimatedAge(json.estimatedAge);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.deceasedAgeIsSet) {
      builder.deceasedAge(json.deceasedAge);
    }
    if (json.ageStringIsSet) {
      builder.ageString(json.ageString);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.ageRangeIsSet) {
      builder.ageRange(json.ageRange);
    }
    if (json.dataAbsentReasonIsSet) {
      builder.dataAbsentReason(json.dataAbsentReason);
    }
    if (json.deceasedStringIsSet) {
      builder.deceasedString(json.deceasedString);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.bornDateIsSet) {
      builder.bornDate(json.bornDate);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.deceasedDateIsSet) {
      builder.deceasedDate(json.deceasedDate);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.bornPeriodIsSet) {
      builder.bornPeriod(json.bornPeriod);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.deceasedBooleanIsSet) {
      builder.deceasedBoolean(json.deceasedBoolean);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.bornStringIsSet) {
      builder.bornString(json.bornString);
    }
    if (json.ageAgeIsSet) {
      builder.ageAge(json.ageAge);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.deceasedRangeIsSet) {
      builder.deceasedRange(json.deceasedRange);
    }
    if (json.sexIsSet) {
      builder.sex(json.sex);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.relationship != null) {
      builder.relationship(json.relationship);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableFamilyMemberHistory) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FamilyMemberHistory} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FamilyMemberHistory instance
   */
  public static FamilyMemberHistory copyOf(FamilyMemberHistory instance) {
    if (instance instanceof ImmutableFamilyMemberHistory) {
      return (ImmutableFamilyMemberHistory) instance;
    }
    return ((ImmutableFamilyMemberHistory.Builder) ImmutableFamilyMemberHistory.builder())
        .reasonReference(instance.reasonReference())
        .estimatedAge(instance.estimatedAge())
        .meta(instance.meta())
        .deceasedAge(instance.deceasedAge())
        .ageString(instance.ageString())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .ageRange(instance.ageRange())
        .dataAbsentReason(instance.dataAbsentReason())
        .deceasedString(instance.deceasedString())
        .note(instance.note())
        .condition(instance.condition())
        .bornDate(instance.bornDate())
        .reasonCode(instance.reasonCode())
        .deceasedDate(instance.deceasedDate())
        .identifier(instance.identifier())
        .status(instance.status())
        .bornPeriod(instance.bornPeriod())
        .language(instance.language())
        .name(instance.name())
        .deceasedBoolean(instance.deceasedBoolean())
        .extension(instance.extension())
        .bornString(instance.bornString())
        .ageAge(instance.ageAge())
        .date(instance.date())
        .contained(instance.contained())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .id(instance.id())
        .text(instance.text())
        .deceasedRange(instance.deceasedRange())
        .sex(instance.sex())
        .instantiatesUri(instance.instantiatesUri())
        .patient(instance.patient())
        .relationship(instance.relationship())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link FamilyMemberHistory FamilyMemberHistory}.
   * <pre>
   * ImmutableFamilyMemberHistory.builder()
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link FamilyMemberHistory#reasonReference() reasonReference}
   *    .estimatedAge(Boolean) // optional {@link FamilyMemberHistory#estimatedAge() estimatedAge}
   *    .meta(com.fhir.Meta) // optional {@link FamilyMemberHistory#meta() meta}
   *    .deceasedAge(com.fhir.Age) // optional {@link FamilyMemberHistory#deceasedAge() deceasedAge}
   *    .ageString(String) // optional {@link FamilyMemberHistory#ageString() ageString}
   *    .implicitRules(com.fhir.uri) // optional {@link FamilyMemberHistory#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link FamilyMemberHistory#modifierExtension() modifierExtension}
   *    .ageRange(com.fhir.Range) // optional {@link FamilyMemberHistory#ageRange() ageRange}
   *    .dataAbsentReason(com.fhir.CodeableConcept) // optional {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason}
   *    .deceasedString(String) // optional {@link FamilyMemberHistory#deceasedString() deceasedString}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link FamilyMemberHistory#note() note}
   *    .condition(List&amp;lt;com.fhir.FamilyMemberHistory_Condition&amp;gt;) // optional {@link FamilyMemberHistory#condition() condition}
   *    .bornDate(String) // optional {@link FamilyMemberHistory#bornDate() bornDate}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link FamilyMemberHistory#reasonCode() reasonCode}
   *    .deceasedDate(String) // optional {@link FamilyMemberHistory#deceasedDate() deceasedDate}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link FamilyMemberHistory#identifier() identifier}
   *    .status(com.fhir.FamilymemberhistoryStatus) // optional {@link FamilyMemberHistory#status() status}
   *    .bornPeriod(com.fhir.Period) // optional {@link FamilyMemberHistory#bornPeriod() bornPeriod}
   *    .language(com.fhir.code) // optional {@link FamilyMemberHistory#language() language}
   *    .name(String) // optional {@link FamilyMemberHistory#name() name}
   *    .deceasedBoolean(Boolean) // optional {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link FamilyMemberHistory#extension() extension}
   *    .bornString(String) // optional {@link FamilyMemberHistory#bornString() bornString}
   *    .ageAge(com.fhir.Age) // optional {@link FamilyMemberHistory#ageAge() ageAge}
   *    .date(com.fhir.dateTime) // optional {@link FamilyMemberHistory#date() date}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link FamilyMemberHistory#contained() contained}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical}
   *    .id(com.fhir.id) // optional {@link FamilyMemberHistory#id() id}
   *    .text(com.fhir.Narrative) // optional {@link FamilyMemberHistory#text() text}
   *    .deceasedRange(com.fhir.Range) // optional {@link FamilyMemberHistory#deceasedRange() deceasedRange}
   *    .sex(com.fhir.CodeableConcept) // optional {@link FamilyMemberHistory#sex() sex}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link FamilyMemberHistory#instantiatesUri() instantiatesUri}
   *    .patient(com.fhir.Reference) // required {@link FamilyMemberHistory#patient() patient}
   *    .relationship(com.fhir.CodeableConcept) // required {@link FamilyMemberHistory#relationship() relationship}
   *    .resourceType(String) // required {@link FamilyMemberHistory#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new FamilyMemberHistory builder
   */
  public static PatientBuildStage builder() {
    return new ImmutableFamilyMemberHistory.Builder();
  }

  /**
   * Builds instances of type {@link FamilyMemberHistory FamilyMemberHistory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "FamilyMemberHistory", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements PatientBuildStage, RelationshipBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PATIENT = 0x1L;
    private static final long INIT_BIT_RELATIONSHIP = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x1L;
    private static final long OPT_BIT_ESTIMATED_AGE = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_DECEASED_AGE = 0x8L;
    private static final long OPT_BIT_AGE_STRING = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_AGE_RANGE = 0x80L;
    private static final long OPT_BIT_DATA_ABSENT_REASON = 0x100L;
    private static final long OPT_BIT_DECEASED_STRING = 0x200L;
    private static final long OPT_BIT_NOTE = 0x400L;
    private static final long OPT_BIT_CONDITION = 0x800L;
    private static final long OPT_BIT_BORN_DATE = 0x1000L;
    private static final long OPT_BIT_REASON_CODE = 0x2000L;
    private static final long OPT_BIT_DECEASED_DATE = 0x4000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_BORN_PERIOD = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_NAME = 0x80000L;
    private static final long OPT_BIT_DECEASED_BOOLEAN = 0x100000L;
    private static final long OPT_BIT_EXTENSION = 0x200000L;
    private static final long OPT_BIT_BORN_STRING = 0x400000L;
    private static final long OPT_BIT_AGE_AGE = 0x800000L;
    private static final long OPT_BIT_DATE = 0x1000000L;
    private static final long OPT_BIT_CONTAINED = 0x2000000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x4000000L;
    private static final long OPT_BIT_ID = 0x8000000L;
    private static final long OPT_BIT_TEXT = 0x10000000L;
    private static final long OPT_BIT_DECEASED_RANGE = 0x20000000L;
    private static final long OPT_BIT_SEX = 0x40000000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x80000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable java.lang.Boolean estimatedAge;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Age deceasedAge;
    private @javax.annotation.Nullable java.lang.String ageString;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Range ageRange;
    private @javax.annotation.Nullable com.fhir.CodeableConcept dataAbsentReason;
    private @javax.annotation.Nullable java.lang.String deceasedString;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.FamilyMemberHistory_Condition> condition;
    private @javax.annotation.Nullable java.lang.String bornDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.lang.String deceasedDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.FamilymemberhistoryStatus status;
    private @javax.annotation.Nullable com.fhir.Period bornPeriod;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.Boolean deceasedBoolean;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String bornString;
    private @javax.annotation.Nullable com.fhir.Age ageAge;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Range deceasedRange;
    private @javax.annotation.Nullable com.fhir.CodeableConcept sex;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable com.fhir.CodeableConcept relationship;
    private @javax.annotation.Nullable java.lang.String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(java.util.List<com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#estimatedAge() estimatedAge} to estimatedAge.
     * @param estimatedAge The value for estimatedAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder estimatedAge(boolean estimatedAge) {
      checkNotIsSet(estimatedAgeIsSet(), "estimatedAge");
      this.estimatedAge = estimatedAge;
      optBits |= OPT_BIT_ESTIMATED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#estimatedAge() estimatedAge} to estimatedAge.
     * @param estimatedAge The value for estimatedAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedAge")
    public final Builder estimatedAge(java.util.Optional<java.lang.Boolean> estimatedAge) {
      checkNotIsSet(estimatedAgeIsSet(), "estimatedAge");
      this.estimatedAge = estimatedAge.orElse(null);
      optBits |= OPT_BIT_ESTIMATED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
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
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
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
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedAge(com.fhir.Age deceasedAge) {
      checkNotIsSet(deceasedAgeIsSet(), "deceasedAge");
      this.deceasedAge = java.util.Objects.requireNonNull(deceasedAge, "deceasedAge");
      optBits |= OPT_BIT_DECEASED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedAge")
    public final Builder deceasedAge(java.util.Optional<? extends com.fhir.Age> deceasedAge) {
      checkNotIsSet(deceasedAgeIsSet(), "deceasedAge");
      this.deceasedAge = deceasedAge.orElse(null);
      optBits |= OPT_BIT_DECEASED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageString(java.lang.String ageString) {
      checkNotIsSet(ageStringIsSet(), "ageString");
      this.ageString = java.util.Objects.requireNonNull(ageString, "ageString");
      optBits |= OPT_BIT_AGE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ageString")
    public final Builder ageString(java.util.Optional<java.lang.String> ageString) {
      checkNotIsSet(ageStringIsSet(), "ageString");
      this.ageString = ageString.orElse(null);
      optBits |= OPT_BIT_AGE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageRange(com.fhir.Range ageRange) {
      checkNotIsSet(ageRangeIsSet(), "ageRange");
      this.ageRange = java.util.Objects.requireNonNull(ageRange, "ageRange");
      optBits |= OPT_BIT_AGE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ageRange")
    public final Builder ageRange(java.util.Optional<? extends com.fhir.Range> ageRange) {
      checkNotIsSet(ageRangeIsSet(), "ageRange");
      this.ageRange = ageRange.orElse(null);
      optBits |= OPT_BIT_AGE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataAbsentReason(com.fhir.CodeableConcept dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = java.util.Objects.requireNonNull(dataAbsentReason, "dataAbsentReason");
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAbsentReason")
    public final Builder dataAbsentReason(java.util.Optional<? extends com.fhir.CodeableConcept> dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = dataAbsentReason.orElse(null);
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedString(java.lang.String deceasedString) {
      checkNotIsSet(deceasedStringIsSet(), "deceasedString");
      this.deceasedString = java.util.Objects.requireNonNull(deceasedString, "deceasedString");
      optBits |= OPT_BIT_DECEASED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedString")
    public final Builder deceasedString(java.util.Optional<java.lang.String> deceasedString) {
      checkNotIsSet(deceasedStringIsSet(), "deceasedString");
      this.deceasedString = deceasedString.orElse(null);
      optBits |= OPT_BIT_DECEASED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
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
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
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
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(java.util.List<com.fhir.FamilyMemberHistory_Condition> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(java.util.Optional<? extends java.util.List<com.fhir.FamilyMemberHistory_Condition>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder bornDate(java.lang.String bornDate) {
      checkNotIsSet(bornDateIsSet(), "bornDate");
      this.bornDate = java.util.Objects.requireNonNull(bornDate, "bornDate");
      optBits |= OPT_BIT_BORN_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bornDate")
    public final Builder bornDate(java.util.Optional<java.lang.String> bornDate) {
      checkNotIsSet(bornDateIsSet(), "bornDate");
      this.bornDate = bornDate.orElse(null);
      optBits |= OPT_BIT_BORN_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedDate(java.lang.String deceasedDate) {
      checkNotIsSet(deceasedDateIsSet(), "deceasedDate");
      this.deceasedDate = java.util.Objects.requireNonNull(deceasedDate, "deceasedDate");
      optBits |= OPT_BIT_DECEASED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedDate")
    public final Builder deceasedDate(java.util.Optional<java.lang.String> deceasedDate) {
      checkNotIsSet(deceasedDateIsSet(), "deceasedDate");
      this.deceasedDate = deceasedDate.orElse(null);
      optBits |= OPT_BIT_DECEASED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.FamilymemberhistoryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.FamilymemberhistoryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder bornPeriod(com.fhir.Period bornPeriod) {
      checkNotIsSet(bornPeriodIsSet(), "bornPeriod");
      this.bornPeriod = java.util.Objects.requireNonNull(bornPeriod, "bornPeriod");
      optBits |= OPT_BIT_BORN_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bornPeriod")
    public final Builder bornPeriod(java.util.Optional<? extends com.fhir.Period> bornPeriod) {
      checkNotIsSet(bornPeriodIsSet(), "bornPeriod");
      this.bornPeriod = bornPeriod.orElse(null);
      optBits |= OPT_BIT_BORN_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
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
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
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
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedBoolean(boolean deceasedBoolean) {
      checkNotIsSet(deceasedBooleanIsSet(), "deceasedBoolean");
      this.deceasedBoolean = deceasedBoolean;
      optBits |= OPT_BIT_DECEASED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedBoolean")
    public final Builder deceasedBoolean(java.util.Optional<java.lang.Boolean> deceasedBoolean) {
      checkNotIsSet(deceasedBooleanIsSet(), "deceasedBoolean");
      this.deceasedBoolean = deceasedBoolean.orElse(null);
      optBits |= OPT_BIT_DECEASED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
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
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
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
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for chained invocation
     */
    public final Builder bornString(java.lang.String bornString) {
      checkNotIsSet(bornStringIsSet(), "bornString");
      this.bornString = java.util.Objects.requireNonNull(bornString, "bornString");
      optBits |= OPT_BIT_BORN_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bornString")
    public final Builder bornString(java.util.Optional<java.lang.String> bornString) {
      checkNotIsSet(bornStringIsSet(), "bornString");
      this.bornString = bornString.orElse(null);
      optBits |= OPT_BIT_BORN_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageAge(com.fhir.Age ageAge) {
      checkNotIsSet(ageAgeIsSet(), "ageAge");
      this.ageAge = java.util.Objects.requireNonNull(ageAge, "ageAge");
      optBits |= OPT_BIT_AGE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ageAge")
    public final Builder ageAge(java.util.Optional<? extends com.fhir.Age> ageAge) {
      checkNotIsSet(ageAgeIsSet(), "ageAge");
      this.ageAge = ageAge.orElse(null);
      optBits |= OPT_BIT_AGE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
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
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
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
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
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
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
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
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
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
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
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
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedRange(com.fhir.Range deceasedRange) {
      checkNotIsSet(deceasedRangeIsSet(), "deceasedRange");
      this.deceasedRange = java.util.Objects.requireNonNull(deceasedRange, "deceasedRange");
      optBits |= OPT_BIT_DECEASED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedRange")
    public final Builder deceasedRange(java.util.Optional<? extends com.fhir.Range> deceasedRange) {
      checkNotIsSet(deceasedRangeIsSet(), "deceasedRange");
      this.deceasedRange = deceasedRange.orElse(null);
      optBits |= OPT_BIT_DECEASED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for chained invocation
     */
    public final Builder sex(com.fhir.CodeableConcept sex) {
      checkNotIsSet(sexIsSet(), "sex");
      this.sex = java.util.Objects.requireNonNull(sex, "sex");
      optBits |= OPT_BIT_SEX;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sex")
    public final Builder sex(java.util.Optional<? extends com.fhir.CodeableConcept> sex) {
      checkNotIsSet(sexIsSet(), "sex");
      this.sex = sex.orElse(null);
      optBits |= OPT_BIT_SEX;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the value for the {@link FamilyMemberHistory#patient() patient} attribute.
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
     * Initializes the value for the {@link FamilyMemberHistory#relationship() relationship} attribute.
     * @param relationship The value for relationship 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public final Builder relationship(com.fhir.CodeableConcept relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = java.util.Objects.requireNonNull(relationship, "relationship");
      initBits &= ~INIT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the value for the {@link FamilyMemberHistory#resourceType() resourceType} attribute.
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
     * Builds a new {@link FamilyMemberHistory FamilyMemberHistory}.
     * @return An immutable instance of FamilyMemberHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.FamilyMemberHistory build() {
      checkRequiredAttributes();
      return new ImmutableFamilyMemberHistory(
          reasonReference,
          estimatedAge,
          meta,
          deceasedAge,
          ageString,
          implicitRules,
          modifierExtension,
          ageRange,
          dataAbsentReason,
          deceasedString,
          note,
          condition,
          bornDate,
          reasonCode,
          deceasedDate,
          identifier,
          status,
          bornPeriod,
          language,
          name,
          deceasedBoolean,
          extension,
          bornString,
          ageAge,
          date,
          contained,
          instantiatesCanonical,
          id,
          text,
          deceasedRange,
          sex,
          instantiatesUri,
          patient,
          relationship,
          resourceType);
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean estimatedAgeIsSet() {
      return (optBits & OPT_BIT_ESTIMATED_AGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean deceasedAgeIsSet() {
      return (optBits & OPT_BIT_DECEASED_AGE) != 0;
    }

    private boolean ageStringIsSet() {
      return (optBits & OPT_BIT_AGE_STRING) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean ageRangeIsSet() {
      return (optBits & OPT_BIT_AGE_RANGE) != 0;
    }

    private boolean dataAbsentReasonIsSet() {
      return (optBits & OPT_BIT_DATA_ABSENT_REASON) != 0;
    }

    private boolean deceasedStringIsSet() {
      return (optBits & OPT_BIT_DECEASED_STRING) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean bornDateIsSet() {
      return (optBits & OPT_BIT_BORN_DATE) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean deceasedDateIsSet() {
      return (optBits & OPT_BIT_DECEASED_DATE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean bornPeriodIsSet() {
      return (optBits & OPT_BIT_BORN_PERIOD) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean deceasedBooleanIsSet() {
      return (optBits & OPT_BIT_DECEASED_BOOLEAN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean bornStringIsSet() {
      return (optBits & OPT_BIT_BORN_STRING) != 0;
    }

    private boolean ageAgeIsSet() {
      return (optBits & OPT_BIT_AGE_AGE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean deceasedRangeIsSet() {
      return (optBits & OPT_BIT_DECEASED_RANGE) != 0;
    }

    private boolean sexIsSet() {
      return (optBits & OPT_BIT_SEX) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean relationshipIsSet() {
      return (initBits & INIT_BIT_RELATIONSHIP) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of FamilyMemberHistory is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!patientIsSet()) attributes.add("patient");
      if (!relationshipIsSet()) attributes.add("relationship");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build FamilyMemberHistory, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link FamilyMemberHistory#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    RelationshipBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface RelationshipBuildStage {
    /**
     * Initializes the value for the {@link FamilyMemberHistory#relationship() relationship} attribute.
     * @param relationship The value for relationship 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage relationship(com.fhir.CodeableConcept relationship);
  }

  @org.immutables.value.Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link FamilyMemberHistory#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#estimatedAge() estimatedAge} to estimatedAge.
     * @param estimatedAge The value for estimatedAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal estimatedAge(boolean estimatedAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#estimatedAge() estimatedAge} to estimatedAge.
     * @param estimatedAge The value for estimatedAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal estimatedAge(java.util.Optional<java.lang.Boolean> estimatedAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedAge(com.fhir.Age deceasedAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedAge(java.util.Optional<? extends com.fhir.Age> deceasedAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ageString(java.lang.String ageString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ageString(java.util.Optional<java.lang.String> ageString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ageRange(com.fhir.Range ageRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ageRange(java.util.Optional<? extends com.fhir.Range> ageRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataAbsentReason(com.fhir.CodeableConcept dataAbsentReason);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataAbsentReason(java.util.Optional<? extends com.fhir.CodeableConcept> dataAbsentReason);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedString(java.lang.String deceasedString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedString(java.util.Optional<java.lang.String> deceasedString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(java.util.List<com.fhir.FamilyMemberHistory_Condition> condition);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(java.util.Optional<? extends java.util.List<com.fhir.FamilyMemberHistory_Condition>> condition);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bornDate(java.lang.String bornDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bornDate(java.util.Optional<java.lang.String> bornDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedDate(java.lang.String deceasedDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedDate(java.util.Optional<java.lang.String> deceasedDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.FamilymemberhistoryStatus status);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.FamilymemberhistoryStatus> status);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bornPeriod(com.fhir.Period bornPeriod);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bornPeriod(java.util.Optional<? extends com.fhir.Period> bornPeriod);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedBoolean(boolean deceasedBoolean);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedBoolean(java.util.Optional<java.lang.Boolean> deceasedBoolean);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bornString(java.lang.String bornString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bornString(java.util.Optional<java.lang.String> bornString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ageAge(com.fhir.Age ageAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ageAge(java.util.Optional<? extends com.fhir.Age> ageAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedRange(com.fhir.Range deceasedRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedRange(java.util.Optional<? extends com.fhir.Range> deceasedRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sex(com.fhir.CodeableConcept sex);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sex(java.util.Optional<? extends com.fhir.CodeableConcept> sex);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Builds a new {@link FamilyMemberHistory FamilyMemberHistory}.
     * @return An immutable instance of FamilyMemberHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    FamilyMemberHistory build();
  }
}
