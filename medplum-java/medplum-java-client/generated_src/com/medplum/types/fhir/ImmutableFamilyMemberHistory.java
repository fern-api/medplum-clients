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
 * Immutable implementation of {@link FamilyMemberHistory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFamilyMemberHistory.builder()}.
 */
@Generated(from = "FamilyMemberHistory", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableFamilyMemberHistory implements FamilyMemberHistory {
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final @Nullable DateTime date;
  private final @Nullable String ageString;
  private final @Nullable Age deceasedAge;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept dataAbsentReason;
  private final @Nullable Narrative text;
  private final @Nullable Boolean deceasedBoolean;
  private final @Nullable String bornString;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String name;
  private final @Nullable Boolean estimatedAge;
  private final String resourceType;
  private final @Nullable Period bornPeriod;
  private final @Nullable Range ageRange;
  private final @Nullable Age ageAge;
  private final Reference patient;
  private final @Nullable String bornDate;
  private final @Nullable String deceasedString;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable List<FamilyMemberHistory_Condition> condition;
  private final @Nullable String deceasedDate;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable FamilymemberhistoryStatus status;
  private final @Nullable CodeableConcept sex;
  private final @Nullable Uri implicitRules;
  private final CodeableConcept relationship;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable Range deceasedRange;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<CodeableConcept> reasonCode;

  private ImmutableFamilyMemberHistory(
      @Nullable Meta meta,
      @Nullable Code language,
      @Nullable DateTime date,
      @Nullable String ageString,
      @Nullable Age deceasedAge,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept dataAbsentReason,
      @Nullable Narrative text,
      @Nullable Boolean deceasedBoolean,
      @Nullable String bornString,
      @Nullable List<ResourceList> contained,
      @Nullable String name,
      @Nullable Boolean estimatedAge,
      String resourceType,
      @Nullable Period bornPeriod,
      @Nullable Range ageRange,
      @Nullable Age ageAge,
      Reference patient,
      @Nullable String bornDate,
      @Nullable String deceasedString,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable List<FamilyMemberHistory_Condition> condition,
      @Nullable String deceasedDate,
      @Nullable List<Reference> reasonReference,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable FamilymemberhistoryStatus status,
      @Nullable CodeableConcept sex,
      @Nullable Uri implicitRules,
      CodeableConcept relationship,
      @Nullable List<Identifier> identifier,
      @Nullable List<Uri> instantiatesUri,
      @Nullable Range deceasedRange,
      @Nullable List<Annotation> note,
      @Nullable List<CodeableConcept> reasonCode) {
    this.meta = meta;
    this.language = language;
    this.date = date;
    this.ageString = ageString;
    this.deceasedAge = deceasedAge;
    this.extension = extension;
    this.dataAbsentReason = dataAbsentReason;
    this.text = text;
    this.deceasedBoolean = deceasedBoolean;
    this.bornString = bornString;
    this.contained = contained;
    this.name = name;
    this.estimatedAge = estimatedAge;
    this.resourceType = resourceType;
    this.bornPeriod = bornPeriod;
    this.ageRange = ageRange;
    this.ageAge = ageAge;
    this.patient = patient;
    this.bornDate = bornDate;
    this.deceasedString = deceasedString;
    this.instantiatesCanonical = instantiatesCanonical;
    this.condition = condition;
    this.deceasedDate = deceasedDate;
    this.reasonReference = reasonReference;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.sex = sex;
    this.implicitRules = implicitRules;
    this.relationship = relationship;
    this.identifier = identifier;
    this.instantiatesUri = instantiatesUri;
    this.deceasedRange = deceasedRange;
    this.note = note;
    this.reasonCode = reasonCode;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code ageString} attribute
   */
  @JsonProperty("ageString")
  @Override
  public Optional<String> ageString() {
    return Optional.ofNullable(ageString);
  }

  /**
   * @return The value of the {@code deceasedAge} attribute
   */
  @JsonProperty("deceasedAge")
  @Override
  public Optional<Age> deceasedAge() {
    return Optional.ofNullable(deceasedAge);
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
   * @return The value of the {@code dataAbsentReason} attribute
   */
  @JsonProperty("dataAbsentReason")
  @Override
  public Optional<CodeableConcept> dataAbsentReason() {
    return Optional.ofNullable(dataAbsentReason);
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
   * @return The value of the {@code deceasedBoolean} attribute
   */
  @JsonProperty("deceasedBoolean")
  @Override
  public Optional<Boolean> deceasedBoolean() {
    return Optional.ofNullable(deceasedBoolean);
  }

  /**
   * @return The value of the {@code bornString} attribute
   */
  @JsonProperty("bornString")
  @Override
  public Optional<String> bornString() {
    return Optional.ofNullable(bornString);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code estimatedAge} attribute
   */
  @JsonProperty("estimatedAge")
  @Override
  public Optional<Boolean> estimatedAge() {
    return Optional.ofNullable(estimatedAge);
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
   * @return The value of the {@code bornPeriod} attribute
   */
  @JsonProperty("bornPeriod")
  @Override
  public Optional<Period> bornPeriod() {
    return Optional.ofNullable(bornPeriod);
  }

  /**
   * @return The value of the {@code ageRange} attribute
   */
  @JsonProperty("ageRange")
  @Override
  public Optional<Range> ageRange() {
    return Optional.ofNullable(ageRange);
  }

  /**
   * @return The value of the {@code ageAge} attribute
   */
  @JsonProperty("ageAge")
  @Override
  public Optional<Age> ageAge() {
    return Optional.ofNullable(ageAge);
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
   * @return The value of the {@code bornDate} attribute
   */
  @JsonProperty("bornDate")
  @Override
  public Optional<String> bornDate() {
    return Optional.ofNullable(bornDate);
  }

  /**
   * @return The value of the {@code deceasedString} attribute
   */
  @JsonProperty("deceasedString")
  @Override
  public Optional<String> deceasedString() {
    return Optional.ofNullable(deceasedString);
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
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<List<FamilyMemberHistory_Condition>> condition() {
    return Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code deceasedDate} attribute
   */
  @JsonProperty("deceasedDate")
  @Override
  public Optional<String> deceasedDate() {
    return Optional.ofNullable(deceasedDate);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<FamilymemberhistoryStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code sex} attribute
   */
  @JsonProperty("sex")
  @Override
  public Optional<CodeableConcept> sex() {
    return Optional.ofNullable(sex);
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
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public CodeableConcept relationship() {
    return relationship;
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code deceasedRange} attribute
   */
  @JsonProperty("deceasedRange")
  @Override
  public Optional<Range> deceasedRange() {
    return Optional.ofNullable(deceasedRange);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        newValue,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableFamilyMemberHistory(
        value,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        newValue,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        value,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        newValue,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        value,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#ageString() ageString} attribute.
   * @param value The value for ageString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "ageString");
    if (Objects.equals(this.ageString, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        newValue,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#ageString() ageString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.ageString, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        value,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedAge() deceasedAge} attribute.
   * @param value The value for deceasedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "deceasedAge");
    if (this.deceasedAge == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        newValue,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedAge() deceasedAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDeceasedAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.deceasedAge == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        value,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        newValue,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        value,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} attribute.
   * @param value The value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDataAbsentReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "dataAbsentReason");
    if (this.dataAbsentReason == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        newValue,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDataAbsentReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.dataAbsentReason == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        value,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        newValue,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        value,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} attribute.
   * @param value The value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.deceasedBoolean, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        newValue,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.deceasedBoolean, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        value,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#bornString() bornString} attribute.
   * @param value The value for bornString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "bornString");
    if (Objects.equals(this.bornString, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        newValue,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#bornString() bornString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bornString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.bornString, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        value,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        newValue,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        value,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        newValue,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        value,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#estimatedAge() estimatedAge} attribute.
   * @param value The value for estimatedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withEstimatedAge(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.estimatedAge, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        newValue,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#estimatedAge() estimatedAge} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for estimatedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withEstimatedAge(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.estimatedAge, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        value,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FamilyMemberHistory#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFamilyMemberHistory withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        newValue,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#bornPeriod() bornPeriod} attribute.
   * @param value The value for bornPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "bornPeriod");
    if (this.bornPeriod == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        newValue,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#bornPeriod() bornPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bornPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withBornPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.bornPeriod == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        value,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#ageRange() ageRange} attribute.
   * @param value The value for ageRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "ageRange");
    if (this.ageRange == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        newValue,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#ageRange() ageRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withAgeRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.ageRange == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        value,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#ageAge() ageAge} attribute.
   * @param value The value for ageAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withAgeAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "ageAge");
    if (this.ageAge == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        newValue,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#ageAge() ageAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withAgeAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.ageAge == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        value,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FamilyMemberHistory#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFamilyMemberHistory withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        newValue,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#bornDate() bornDate} attribute.
   * @param value The value for bornDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "bornDate");
    if (Objects.equals(this.bornDate, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        newValue,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#bornDate() bornDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bornDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withBornDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.bornDate, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        value,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedString() deceasedString} attribute.
   * @param value The value for deceasedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "deceasedString");
    if (Objects.equals(this.deceasedString, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        newValue,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedString() deceasedString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.deceasedString, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        value,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        newValue,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        value,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withCondition(List<FamilyMemberHistory_Condition> value) {
    @Nullable List<FamilyMemberHistory_Condition> newValue = Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        newValue,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withCondition(Optional<? extends List<FamilyMemberHistory_Condition>> optional) {
    @Nullable List<FamilyMemberHistory_Condition> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        value,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedDate() deceasedDate} attribute.
   * @param value The value for deceasedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "deceasedDate");
    if (Objects.equals(this.deceasedDate, newValue)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        newValue,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedDate() deceasedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.deceasedDate, value)) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        value,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        newValue,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        value,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        newValue,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        value,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        newValue,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        value,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withStatus(FamilymemberhistoryStatus value) {
    @Nullable FamilymemberhistoryStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        newValue,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withStatus(Optional<? extends FamilymemberhistoryStatus> optional) {
    @Nullable FamilymemberhistoryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        value,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#sex() sex} attribute.
   * @param value The value for sex
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withSex(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "sex");
    if (this.sex == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        newValue,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#sex() sex} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sex
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withSex(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.sex == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        value,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        newValue,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        value,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FamilyMemberHistory#relationship() relationship} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relationship
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFamilyMemberHistory withRelationship(CodeableConcept value) {
    if (this.relationship == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "relationship");
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        newValue,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        newValue,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        value,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        newValue,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        value,
        this.deceasedRange,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#deceasedRange() deceasedRange} attribute.
   * @param value The value for deceasedRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withDeceasedRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "deceasedRange");
    if (this.deceasedRange == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        newValue,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#deceasedRange() deceasedRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withDeceasedRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.deceasedRange == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        value,
        this.note,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        newValue,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        value,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableFamilyMemberHistory(
        this.meta,
        this.language,
        this.date,
        this.ageString,
        this.deceasedAge,
        this.extension,
        this.dataAbsentReason,
        this.text,
        this.deceasedBoolean,
        this.bornString,
        this.contained,
        this.name,
        this.estimatedAge,
        this.resourceType,
        this.bornPeriod,
        this.ageRange,
        this.ageAge,
        this.patient,
        this.bornDate,
        this.deceasedString,
        this.instantiatesCanonical,
        this.condition,
        this.deceasedDate,
        this.reasonReference,
        this.id,
        this.modifierExtension,
        this.status,
        this.sex,
        this.implicitRules,
        this.relationship,
        this.identifier,
        this.instantiatesUri,
        this.deceasedRange,
        this.note,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFamilyMemberHistory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFamilyMemberHistory
        && equalTo((ImmutableFamilyMemberHistory) another);
  }

  private boolean equalTo(ImmutableFamilyMemberHistory another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && Objects.equals(date, another.date)
        && Objects.equals(ageString, another.ageString)
        && Objects.equals(deceasedAge, another.deceasedAge)
        && Objects.equals(extension, another.extension)
        && Objects.equals(dataAbsentReason, another.dataAbsentReason)
        && Objects.equals(text, another.text)
        && Objects.equals(deceasedBoolean, another.deceasedBoolean)
        && Objects.equals(bornString, another.bornString)
        && Objects.equals(contained, another.contained)
        && Objects.equals(name, another.name)
        && Objects.equals(estimatedAge, another.estimatedAge)
        && resourceType.equals(another.resourceType)
        && Objects.equals(bornPeriod, another.bornPeriod)
        && Objects.equals(ageRange, another.ageRange)
        && Objects.equals(ageAge, another.ageAge)
        && patient.equals(another.patient)
        && Objects.equals(bornDate, another.bornDate)
        && Objects.equals(deceasedString, another.deceasedString)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(condition, another.condition)
        && Objects.equals(deceasedDate, another.deceasedDate)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(status, another.status)
        && Objects.equals(sex, another.sex)
        && Objects.equals(implicitRules, another.implicitRules)
        && relationship.equals(another.relationship)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(deceasedRange, another.deceasedRange)
        && Objects.equals(note, another.note)
        && Objects.equals(reasonCode, another.reasonCode);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code language}, {@code date}, {@code ageString}, {@code deceasedAge}, {@code extension}, {@code dataAbsentReason}, {@code text}, {@code deceasedBoolean}, {@code bornString}, {@code contained}, {@code name}, {@code estimatedAge}, {@code resourceType}, {@code bornPeriod}, {@code ageRange}, {@code ageAge}, {@code patient}, {@code bornDate}, {@code deceasedString}, {@code instantiatesCanonical}, {@code condition}, {@code deceasedDate}, {@code reasonReference}, {@code id}, {@code modifierExtension}, {@code status}, {@code sex}, {@code implicitRules}, {@code relationship}, {@code identifier}, {@code instantiatesUri}, {@code deceasedRange}, {@code note}, {@code reasonCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(ageString);
    h += (h << 5) + Objects.hashCode(deceasedAge);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(dataAbsentReason);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(deceasedBoolean);
    h += (h << 5) + Objects.hashCode(bornString);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(estimatedAge);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(bornPeriod);
    h += (h << 5) + Objects.hashCode(ageRange);
    h += (h << 5) + Objects.hashCode(ageAge);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(bornDate);
    h += (h << 5) + Objects.hashCode(deceasedString);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(deceasedDate);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(sex);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + relationship.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(deceasedRange);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(reasonCode);
    return h;
  }

  /**
   * Prints the immutable value {@code FamilyMemberHistory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("FamilyMemberHistory{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (date != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (ageString != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("ageString=").append(ageString);
    }
    if (deceasedAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("deceasedAge=").append(deceasedAge);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (dataAbsentReason != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("dataAbsentReason=").append(dataAbsentReason);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (deceasedBoolean != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("deceasedBoolean=").append(deceasedBoolean);
    }
    if (bornString != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("bornString=").append(bornString);
    }
    if (contained != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (estimatedAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("estimatedAge=").append(estimatedAge);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (bornPeriod != null) {
      builder.append(", ");
      builder.append("bornPeriod=").append(bornPeriod);
    }
    if (ageRange != null) {
      builder.append(", ");
      builder.append("ageRange=").append(ageRange);
    }
    if (ageAge != null) {
      builder.append(", ");
      builder.append("ageAge=").append(ageAge);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (bornDate != null) {
      builder.append(", ");
      builder.append("bornDate=").append(bornDate);
    }
    if (deceasedString != null) {
      builder.append(", ");
      builder.append("deceasedString=").append(deceasedString);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (condition != null) {
      builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (deceasedDate != null) {
      builder.append(", ");
      builder.append("deceasedDate=").append(deceasedDate);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (sex != null) {
      builder.append(", ");
      builder.append("sex=").append(sex);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("relationship=").append(relationship);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (deceasedRange != null) {
      builder.append(", ");
      builder.append("deceasedRange=").append(deceasedRange);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "FamilyMemberHistory", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements FamilyMemberHistory {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> ageString = Optional.empty();
    boolean ageStringIsSet;
    @Nullable Optional<Age> deceasedAge = Optional.empty();
    boolean deceasedAgeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> dataAbsentReason = Optional.empty();
    boolean dataAbsentReasonIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Boolean> deceasedBoolean = Optional.empty();
    boolean deceasedBooleanIsSet;
    @Nullable Optional<String> bornString = Optional.empty();
    boolean bornStringIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Boolean> estimatedAge = Optional.empty();
    boolean estimatedAgeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Period> bornPeriod = Optional.empty();
    boolean bornPeriodIsSet;
    @Nullable Optional<Range> ageRange = Optional.empty();
    boolean ageRangeIsSet;
    @Nullable Optional<Age> ageAge = Optional.empty();
    boolean ageAgeIsSet;
    @Nullable Reference patient;
    @Nullable Optional<String> bornDate = Optional.empty();
    boolean bornDateIsSet;
    @Nullable Optional<String> deceasedString = Optional.empty();
    boolean deceasedStringIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<List<FamilyMemberHistory_Condition>> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<String> deceasedDate = Optional.empty();
    boolean deceasedDateIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<FamilymemberhistoryStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<CodeableConcept> sex = Optional.empty();
    boolean sexIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable CodeableConcept relationship;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<Range> deceasedRange = Optional.empty();
    boolean deceasedRangeIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("ageString")
    public void setAgeString(Optional<String> ageString) {
      this.ageString = ageString;
      this.ageStringIsSet = true;
    }
    @JsonProperty("deceasedAge")
    public void setDeceasedAge(Optional<Age> deceasedAge) {
      this.deceasedAge = deceasedAge;
      this.deceasedAgeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(Optional<CodeableConcept> dataAbsentReason) {
      this.dataAbsentReason = dataAbsentReason;
      this.dataAbsentReasonIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("deceasedBoolean")
    public void setDeceasedBoolean(Optional<Boolean> deceasedBoolean) {
      this.deceasedBoolean = deceasedBoolean;
      this.deceasedBooleanIsSet = true;
    }
    @JsonProperty("bornString")
    public void setBornString(Optional<String> bornString) {
      this.bornString = bornString;
      this.bornStringIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("estimatedAge")
    public void setEstimatedAge(Optional<Boolean> estimatedAge) {
      this.estimatedAge = estimatedAge;
      this.estimatedAgeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("bornPeriod")
    public void setBornPeriod(Optional<Period> bornPeriod) {
      this.bornPeriod = bornPeriod;
      this.bornPeriodIsSet = true;
    }
    @JsonProperty("ageRange")
    public void setAgeRange(Optional<Range> ageRange) {
      this.ageRange = ageRange;
      this.ageRangeIsSet = true;
    }
    @JsonProperty("ageAge")
    public void setAgeAge(Optional<Age> ageAge) {
      this.ageAge = ageAge;
      this.ageAgeIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("bornDate")
    public void setBornDate(Optional<String> bornDate) {
      this.bornDate = bornDate;
      this.bornDateIsSet = true;
    }
    @JsonProperty("deceasedString")
    public void setDeceasedString(Optional<String> deceasedString) {
      this.deceasedString = deceasedString;
      this.deceasedStringIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<List<FamilyMemberHistory_Condition>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("deceasedDate")
    public void setDeceasedDate(Optional<String> deceasedDate) {
      this.deceasedDate = deceasedDate;
      this.deceasedDateIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
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
    @JsonProperty("status")
    public void setStatus(Optional<FamilymemberhistoryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("sex")
    public void setSex(Optional<CodeableConcept> sex) {
      this.sex = sex;
      this.sexIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(CodeableConcept relationship) {
      this.relationship = relationship;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("deceasedRange")
    public void setDeceasedRange(Optional<Range> deceasedRange) {
      this.deceasedRange = deceasedRange;
      this.deceasedRangeIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> ageString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> deceasedAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> dataAbsentReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> deceasedBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> bornString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> estimatedAge() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> bornPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> ageRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> ageAge() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> bornDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> deceasedString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<FamilyMemberHistory_Condition>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> deceasedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<FamilymemberhistoryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> sex() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> deceasedRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFamilyMemberHistory fromJson(Json json) {
    ImmutableFamilyMemberHistory.Builder builder = ((ImmutableFamilyMemberHistory.Builder) ImmutableFamilyMemberHistory.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.ageStringIsSet) {
      builder.ageString(json.ageString);
    }
    if (json.deceasedAgeIsSet) {
      builder.deceasedAge(json.deceasedAge);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dataAbsentReasonIsSet) {
      builder.dataAbsentReason(json.dataAbsentReason);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.deceasedBooleanIsSet) {
      builder.deceasedBoolean(json.deceasedBoolean);
    }
    if (json.bornStringIsSet) {
      builder.bornString(json.bornString);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.estimatedAgeIsSet) {
      builder.estimatedAge(json.estimatedAge);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.bornPeriodIsSet) {
      builder.bornPeriod(json.bornPeriod);
    }
    if (json.ageRangeIsSet) {
      builder.ageRange(json.ageRange);
    }
    if (json.ageAgeIsSet) {
      builder.ageAge(json.ageAge);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.bornDateIsSet) {
      builder.bornDate(json.bornDate);
    }
    if (json.deceasedStringIsSet) {
      builder.deceasedString(json.deceasedString);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.deceasedDateIsSet) {
      builder.deceasedDate(json.deceasedDate);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.sexIsSet) {
      builder.sex(json.sex);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.relationship != null) {
      builder.relationship(json.relationship);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.deceasedRangeIsSet) {
      builder.deceasedRange(json.deceasedRange);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
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
        .meta(instance.meta())
        .language(instance.language())
        .date(instance.date())
        .ageString(instance.ageString())
        .deceasedAge(instance.deceasedAge())
        .extension(instance.extension())
        .dataAbsentReason(instance.dataAbsentReason())
        .text(instance.text())
        .deceasedBoolean(instance.deceasedBoolean())
        .bornString(instance.bornString())
        .contained(instance.contained())
        .name(instance.name())
        .estimatedAge(instance.estimatedAge())
        .resourceType(instance.resourceType())
        .bornPeriod(instance.bornPeriod())
        .ageRange(instance.ageRange())
        .ageAge(instance.ageAge())
        .patient(instance.patient())
        .bornDate(instance.bornDate())
        .deceasedString(instance.deceasedString())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .condition(instance.condition())
        .deceasedDate(instance.deceasedDate())
        .reasonReference(instance.reasonReference())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .sex(instance.sex())
        .implicitRules(instance.implicitRules())
        .relationship(instance.relationship())
        .identifier(instance.identifier())
        .instantiatesUri(instance.instantiatesUri())
        .deceasedRange(instance.deceasedRange())
        .note(instance.note())
        .reasonCode(instance.reasonCode())
        .build();
  }

  /**
   * Creates a builder for {@link FamilyMemberHistory FamilyMemberHistory}.
   * <pre>
   * ImmutableFamilyMemberHistory.builder()
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link FamilyMemberHistory#meta() meta}
   *    .language(com.medplum.types.fhir.Code) // optional {@link FamilyMemberHistory#language() language}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link FamilyMemberHistory#date() date}
   *    .ageString(String) // optional {@link FamilyMemberHistory#ageString() ageString}
   *    .deceasedAge(com.medplum.types.fhir.Age) // optional {@link FamilyMemberHistory#deceasedAge() deceasedAge}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link FamilyMemberHistory#extension() extension}
   *    .dataAbsentReason(com.medplum.types.fhir.CodeableConcept) // optional {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link FamilyMemberHistory#text() text}
   *    .deceasedBoolean(Boolean) // optional {@link FamilyMemberHistory#deceasedBoolean() deceasedBoolean}
   *    .bornString(String) // optional {@link FamilyMemberHistory#bornString() bornString}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link FamilyMemberHistory#contained() contained}
   *    .name(String) // optional {@link FamilyMemberHistory#name() name}
   *    .estimatedAge(Boolean) // optional {@link FamilyMemberHistory#estimatedAge() estimatedAge}
   *    .resourceType(String) // required {@link FamilyMemberHistory#resourceType() resourceType}
   *    .bornPeriod(com.medplum.types.fhir.Period) // optional {@link FamilyMemberHistory#bornPeriod() bornPeriod}
   *    .ageRange(com.medplum.types.fhir.Range) // optional {@link FamilyMemberHistory#ageRange() ageRange}
   *    .ageAge(com.medplum.types.fhir.Age) // optional {@link FamilyMemberHistory#ageAge() ageAge}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link FamilyMemberHistory#patient() patient}
   *    .bornDate(String) // optional {@link FamilyMemberHistory#bornDate() bornDate}
   *    .deceasedString(String) // optional {@link FamilyMemberHistory#deceasedString() deceasedString}
   *    .instantiatesCanonical(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical}
   *    .condition(List&amp;lt;com.medplum.types.fhir.FamilyMemberHistory_Condition&amp;gt;) // optional {@link FamilyMemberHistory#condition() condition}
   *    .deceasedDate(String) // optional {@link FamilyMemberHistory#deceasedDate() deceasedDate}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link FamilyMemberHistory#reasonReference() reasonReference}
   *    .id(com.medplum.types.fhir.Id) // optional {@link FamilyMemberHistory#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link FamilyMemberHistory#modifierExtension() modifierExtension}
   *    .status(com.medplum.types.fhir.FamilymemberhistoryStatus) // optional {@link FamilyMemberHistory#status() status}
   *    .sex(com.medplum.types.fhir.CodeableConcept) // optional {@link FamilyMemberHistory#sex() sex}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link FamilyMemberHistory#implicitRules() implicitRules}
   *    .relationship(com.medplum.types.fhir.CodeableConcept) // required {@link FamilyMemberHistory#relationship() relationship}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link FamilyMemberHistory#identifier() identifier}
   *    .instantiatesUri(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link FamilyMemberHistory#instantiatesUri() instantiatesUri}
   *    .deceasedRange(com.medplum.types.fhir.Range) // optional {@link FamilyMemberHistory#deceasedRange() deceasedRange}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link FamilyMemberHistory#note() note}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link FamilyMemberHistory#reasonCode() reasonCode}
   *    .build();
   * </pre>
   * @return A new FamilyMemberHistory builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableFamilyMemberHistory.Builder();
  }

  /**
   * Builds instances of type {@link FamilyMemberHistory FamilyMemberHistory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "FamilyMemberHistory", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements ResourceTypeBuildStage, PatientBuildStage, RelationshipBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long INIT_BIT_RELATIONSHIP = 0x4L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_AGE_STRING = 0x8L;
    private static final long OPT_BIT_DECEASED_AGE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_DATA_ABSENT_REASON = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_DECEASED_BOOLEAN = 0x100L;
    private static final long OPT_BIT_BORN_STRING = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_NAME = 0x800L;
    private static final long OPT_BIT_ESTIMATED_AGE = 0x1000L;
    private static final long OPT_BIT_BORN_PERIOD = 0x2000L;
    private static final long OPT_BIT_AGE_RANGE = 0x4000L;
    private static final long OPT_BIT_AGE_AGE = 0x8000L;
    private static final long OPT_BIT_BORN_DATE = 0x10000L;
    private static final long OPT_BIT_DECEASED_STRING = 0x20000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x40000L;
    private static final long OPT_BIT_CONDITION = 0x80000L;
    private static final long OPT_BIT_DECEASED_DATE = 0x100000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x200000L;
    private static final long OPT_BIT_ID = 0x400000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800000L;
    private static final long OPT_BIT_STATUS = 0x1000000L;
    private static final long OPT_BIT_SEX = 0x2000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x10000000L;
    private static final long OPT_BIT_DECEASED_RANGE = 0x20000000L;
    private static final long OPT_BIT_NOTE = 0x40000000L;
    private static final long OPT_BIT_REASON_CODE = 0x80000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable DateTime date;
    private @Nullable String ageString;
    private @Nullable Age deceasedAge;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept dataAbsentReason;
    private @Nullable Narrative text;
    private @Nullable Boolean deceasedBoolean;
    private @Nullable String bornString;
    private @Nullable List<ResourceList> contained;
    private @Nullable String name;
    private @Nullable Boolean estimatedAge;
    private @Nullable String resourceType;
    private @Nullable Period bornPeriod;
    private @Nullable Range ageRange;
    private @Nullable Age ageAge;
    private @Nullable Reference patient;
    private @Nullable String bornDate;
    private @Nullable String deceasedString;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable List<FamilyMemberHistory_Condition> condition;
    private @Nullable String deceasedDate;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable FamilymemberhistoryStatus status;
    private @Nullable CodeableConcept sex;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept relationship;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable Range deceasedRange;
    private @Nullable List<Annotation> note;
    private @Nullable List<CodeableConcept> reasonCode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
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
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
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
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
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
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
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
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageString(String ageString) {
      checkNotIsSet(ageStringIsSet(), "ageString");
      this.ageString = Objects.requireNonNull(ageString, "ageString");
      optBits |= OPT_BIT_AGE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageString")
    public final Builder ageString(Optional<String> ageString) {
      checkNotIsSet(ageStringIsSet(), "ageString");
      this.ageString = ageString.orElse(null);
      optBits |= OPT_BIT_AGE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedAge(Age deceasedAge) {
      checkNotIsSet(deceasedAgeIsSet(), "deceasedAge");
      this.deceasedAge = Objects.requireNonNull(deceasedAge, "deceasedAge");
      optBits |= OPT_BIT_DECEASED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deceasedAge")
    public final Builder deceasedAge(Optional<? extends Age> deceasedAge) {
      checkNotIsSet(deceasedAgeIsSet(), "deceasedAge");
      this.deceasedAge = deceasedAge.orElse(null);
      optBits |= OPT_BIT_DECEASED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
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
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
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
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataAbsentReason(CodeableConcept dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = Objects.requireNonNull(dataAbsentReason, "dataAbsentReason");
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataAbsentReason")
    public final Builder dataAbsentReason(Optional<? extends CodeableConcept> dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = dataAbsentReason.orElse(null);
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
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
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
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
    @JsonProperty("deceasedBoolean")
    public final Builder deceasedBoolean(Optional<Boolean> deceasedBoolean) {
      checkNotIsSet(deceasedBooleanIsSet(), "deceasedBoolean");
      this.deceasedBoolean = deceasedBoolean.orElse(null);
      optBits |= OPT_BIT_DECEASED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for chained invocation
     */
    public final Builder bornString(String bornString) {
      checkNotIsSet(bornStringIsSet(), "bornString");
      this.bornString = Objects.requireNonNull(bornString, "bornString");
      optBits |= OPT_BIT_BORN_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bornString")
    public final Builder bornString(Optional<String> bornString) {
      checkNotIsSet(bornStringIsSet(), "bornString");
      this.bornString = bornString.orElse(null);
      optBits |= OPT_BIT_BORN_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
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
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
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
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
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
    @JsonProperty("estimatedAge")
    public final Builder estimatedAge(Optional<Boolean> estimatedAge) {
      checkNotIsSet(estimatedAgeIsSet(), "estimatedAge");
      this.estimatedAge = estimatedAge.orElse(null);
      optBits |= OPT_BIT_ESTIMATED_AGE;
      return this;
    }

    /**
     * Initializes the value for the {@link FamilyMemberHistory#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder bornPeriod(Period bornPeriod) {
      checkNotIsSet(bornPeriodIsSet(), "bornPeriod");
      this.bornPeriod = Objects.requireNonNull(bornPeriod, "bornPeriod");
      optBits |= OPT_BIT_BORN_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bornPeriod")
    public final Builder bornPeriod(Optional<? extends Period> bornPeriod) {
      checkNotIsSet(bornPeriodIsSet(), "bornPeriod");
      this.bornPeriod = bornPeriod.orElse(null);
      optBits |= OPT_BIT_BORN_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageRange(Range ageRange) {
      checkNotIsSet(ageRangeIsSet(), "ageRange");
      this.ageRange = Objects.requireNonNull(ageRange, "ageRange");
      optBits |= OPT_BIT_AGE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageRange")
    public final Builder ageRange(Optional<? extends Range> ageRange) {
      checkNotIsSet(ageRangeIsSet(), "ageRange");
      this.ageRange = ageRange.orElse(null);
      optBits |= OPT_BIT_AGE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageAge(Age ageAge) {
      checkNotIsSet(ageAgeIsSet(), "ageAge");
      this.ageAge = Objects.requireNonNull(ageAge, "ageAge");
      optBits |= OPT_BIT_AGE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageAge")
    public final Builder ageAge(Optional<? extends Age> ageAge) {
      checkNotIsSet(ageAgeIsSet(), "ageAge");
      this.ageAge = ageAge.orElse(null);
      optBits |= OPT_BIT_AGE_AGE;
      return this;
    }

    /**
     * Initializes the value for the {@link FamilyMemberHistory#patient() patient} attribute.
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
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder bornDate(String bornDate) {
      checkNotIsSet(bornDateIsSet(), "bornDate");
      this.bornDate = Objects.requireNonNull(bornDate, "bornDate");
      optBits |= OPT_BIT_BORN_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bornDate")
    public final Builder bornDate(Optional<String> bornDate) {
      checkNotIsSet(bornDateIsSet(), "bornDate");
      this.bornDate = bornDate.orElse(null);
      optBits |= OPT_BIT_BORN_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedString(String deceasedString) {
      checkNotIsSet(deceasedStringIsSet(), "deceasedString");
      this.deceasedString = Objects.requireNonNull(deceasedString, "deceasedString");
      optBits |= OPT_BIT_DECEASED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deceasedString")
    public final Builder deceasedString(Optional<String> deceasedString) {
      checkNotIsSet(deceasedStringIsSet(), "deceasedString");
      this.deceasedString = deceasedString.orElse(null);
      optBits |= OPT_BIT_DECEASED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(List<FamilyMemberHistory_Condition> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<? extends List<FamilyMemberHistory_Condition>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedDate(String deceasedDate) {
      checkNotIsSet(deceasedDateIsSet(), "deceasedDate");
      this.deceasedDate = Objects.requireNonNull(deceasedDate, "deceasedDate");
      optBits |= OPT_BIT_DECEASED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deceasedDate")
    public final Builder deceasedDate(Optional<String> deceasedDate) {
      checkNotIsSet(deceasedDateIsSet(), "deceasedDate");
      this.deceasedDate = deceasedDate.orElse(null);
      optBits |= OPT_BIT_DECEASED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
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
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
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
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(FamilymemberhistoryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends FamilymemberhistoryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for chained invocation
     */
    public final Builder sex(CodeableConcept sex) {
      checkNotIsSet(sexIsSet(), "sex");
      this.sex = Objects.requireNonNull(sex, "sex");
      optBits |= OPT_BIT_SEX;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sex")
    public final Builder sex(Optional<? extends CodeableConcept> sex) {
      checkNotIsSet(sexIsSet(), "sex");
      this.sex = sex.orElse(null);
      optBits |= OPT_BIT_SEX;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link FamilyMemberHistory#relationship() relationship} attribute.
     * @param relationship The value for relationship 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(CodeableConcept relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      initBits &= ~INIT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedRange(Range deceasedRange) {
      checkNotIsSet(deceasedRangeIsSet(), "deceasedRange");
      this.deceasedRange = Objects.requireNonNull(deceasedRange, "deceasedRange");
      optBits |= OPT_BIT_DECEASED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deceasedRange")
    public final Builder deceasedRange(Optional<? extends Range> deceasedRange) {
      checkNotIsSet(deceasedRangeIsSet(), "deceasedRange");
      this.deceasedRange = deceasedRange.orElse(null);
      optBits |= OPT_BIT_DECEASED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
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
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
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
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
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
     * Builds a new {@link FamilyMemberHistory FamilyMemberHistory}.
     * @return An immutable instance of FamilyMemberHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public FamilyMemberHistory build() {
      checkRequiredAttributes();
      return new ImmutableFamilyMemberHistory(
          meta,
          language,
          date,
          ageString,
          deceasedAge,
          extension,
          dataAbsentReason,
          text,
          deceasedBoolean,
          bornString,
          contained,
          name,
          estimatedAge,
          resourceType,
          bornPeriod,
          ageRange,
          ageAge,
          patient,
          bornDate,
          deceasedString,
          instantiatesCanonical,
          condition,
          deceasedDate,
          reasonReference,
          id,
          modifierExtension,
          status,
          sex,
          implicitRules,
          relationship,
          identifier,
          instantiatesUri,
          deceasedRange,
          note,
          reasonCode);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean ageStringIsSet() {
      return (optBits & OPT_BIT_AGE_STRING) != 0;
    }

    private boolean deceasedAgeIsSet() {
      return (optBits & OPT_BIT_DECEASED_AGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dataAbsentReasonIsSet() {
      return (optBits & OPT_BIT_DATA_ABSENT_REASON) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean deceasedBooleanIsSet() {
      return (optBits & OPT_BIT_DECEASED_BOOLEAN) != 0;
    }

    private boolean bornStringIsSet() {
      return (optBits & OPT_BIT_BORN_STRING) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean estimatedAgeIsSet() {
      return (optBits & OPT_BIT_ESTIMATED_AGE) != 0;
    }

    private boolean bornPeriodIsSet() {
      return (optBits & OPT_BIT_BORN_PERIOD) != 0;
    }

    private boolean ageRangeIsSet() {
      return (optBits & OPT_BIT_AGE_RANGE) != 0;
    }

    private boolean ageAgeIsSet() {
      return (optBits & OPT_BIT_AGE_AGE) != 0;
    }

    private boolean bornDateIsSet() {
      return (optBits & OPT_BIT_BORN_DATE) != 0;
    }

    private boolean deceasedStringIsSet() {
      return (optBits & OPT_BIT_DECEASED_STRING) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean deceasedDateIsSet() {
      return (optBits & OPT_BIT_DECEASED_DATE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean sexIsSet() {
      return (optBits & OPT_BIT_SEX) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean deceasedRangeIsSet() {
      return (optBits & OPT_BIT_DECEASED_RANGE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean relationshipIsSet() {
      return (initBits & INIT_BIT_RELATIONSHIP) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of FamilyMemberHistory is strict, attribute is already set: ".concat(name));
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
      if (!relationshipIsSet()) attributes.add("relationship");
      return "Cannot build FamilyMemberHistory, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link FamilyMemberHistory#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link FamilyMemberHistory#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    RelationshipBuildStage patient(Reference patient);
  }

  @Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface RelationshipBuildStage {
    /**
     * Initializes the value for the {@link FamilyMemberHistory#relationship() relationship} attribute.
     * @param relationship The value for relationship 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relationship(CodeableConcept relationship);
  }

  @Generated(from = "FamilyMemberHistory", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ageString(String ageString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageString() ageString} to ageString.
     * @param ageString The value for ageString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ageString(Optional<String> ageString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedAge(Age deceasedAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedAge() deceasedAge} to deceasedAge.
     * @param deceasedAge The value for deceasedAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedAge(Optional<? extends Age> deceasedAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataAbsentReason(CodeableConcept dataAbsentReason);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataAbsentReason(Optional<? extends CodeableConcept> dataAbsentReason);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

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
    BuildFinal deceasedBoolean(Optional<Boolean> deceasedBoolean);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bornString(String bornString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornString() bornString} to bornString.
     * @param bornString The value for bornString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bornString(Optional<String> bornString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

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
    BuildFinal estimatedAge(Optional<Boolean> estimatedAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bornPeriod(Period bornPeriod);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornPeriod() bornPeriod} to bornPeriod.
     * @param bornPeriod The value for bornPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bornPeriod(Optional<? extends Period> bornPeriod);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ageRange(Range ageRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ageRange(Optional<? extends Range> ageRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ageAge(Age ageAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#ageAge() ageAge} to ageAge.
     * @param ageAge The value for ageAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ageAge(Optional<? extends Age> ageAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bornDate(String bornDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#bornDate() bornDate} to bornDate.
     * @param bornDate The value for bornDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bornDate(Optional<String> bornDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedString(String deceasedString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedString() deceasedString} to deceasedString.
     * @param deceasedString The value for deceasedString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedString(Optional<String> deceasedString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(List<FamilyMemberHistory_Condition> condition);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(Optional<? extends List<FamilyMemberHistory_Condition>> condition);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedDate(String deceasedDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedDate() deceasedDate} to deceasedDate.
     * @param deceasedDate The value for deceasedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedDate(Optional<String> deceasedDate);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(FamilymemberhistoryStatus status);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends FamilymemberhistoryStatus> status);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sex(CodeableConcept sex);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#sex() sex} to sex.
     * @param sex The value for sex
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sex(Optional<? extends CodeableConcept> sex);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedRange(Range deceasedRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#deceasedRange() deceasedRange} to deceasedRange.
     * @param deceasedRange The value for deceasedRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedRange(Optional<? extends Range> deceasedRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link FamilyMemberHistory#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Builds a new {@link FamilyMemberHistory FamilyMemberHistory}.
     * @return An immutable instance of FamilyMemberHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    FamilyMemberHistory build();
  }
}