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
 * Immutable implementation of {@link CareTeam}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCareTeam.builder()}.
 */
@Generated(from = "CareTeam", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCareTeam implements CareTeam {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference subject;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable List<Reference> managingOrganization;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<CareTeam_Participant> participant;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Meta meta;
  private final @Nullable String name;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference encounter;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final @Nullable CareteamStatus status;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period period;

  private ImmutableCareTeam(
      @Nullable List<ResourceList> contained,
      @Nullable Reference subject,
      @Nullable List<Reference> reasonReference,
      @Nullable List<Reference> managingOrganization,
      @Nullable List<Identifier> identifier,
      @Nullable List<CareTeam_Participant> participant,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Meta meta,
      @Nullable String name,
      @Nullable List<ContactPoint> telecom,
      @Nullable List<Annotation> note,
      @Nullable List<CodeableConcept> category,
      @Nullable Uri implicitRules,
      @Nullable Reference encounter,
      String resourceType,
      @Nullable Code language,
      @Nullable List<Extension> extension,
      @Nullable CareteamStatus status,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable Period period) {
    this.contained = contained;
    this.subject = subject;
    this.reasonReference = reasonReference;
    this.managingOrganization = managingOrganization;
    this.identifier = identifier;
    this.participant = participant;
    this.reasonCode = reasonCode;
    this.meta = meta;
    this.name = name;
    this.telecom = telecom;
    this.note = note;
    this.category = category;
    this.implicitRules = implicitRules;
    this.encounter = encounter;
    this.resourceType = resourceType;
    this.language = language;
    this.extension = extension;
    this.status = status;
    this.id = id;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.period = period;
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code managingOrganization} attribute
   */
  @JsonProperty("managingOrganization")
  @Override
  public Optional<List<Reference>> managingOrganization() {
    return Optional.ofNullable(managingOrganization);
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
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public Optional<List<CareTeam_Participant>> participant() {
    return Optional.ofNullable(participant);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CareteamStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCareTeam(
        newValue,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCareTeam(
        value,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        newValue,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        value,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        newValue,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        value,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withManagingOrganization(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        newValue,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withManagingOrganization(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        value,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        newValue,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        value,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withParticipant(List<CareTeam_Participant> value) {
    @Nullable List<CareTeam_Participant> newValue = Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        newValue,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withParticipant(Optional<? extends List<CareTeam_Participant>> optional) {
    @Nullable List<CareTeam_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        value,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        newValue,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        value,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        newValue,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        value,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        newValue,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        value,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        newValue,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        value,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        newValue,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        value,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        newValue,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        value,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        newValue,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        value,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        value,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CareTeam#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCareTeam withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        newValue,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        newValue,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        value,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        newValue,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        value,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withStatus(CareteamStatus value) {
    @Nullable CareteamStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        newValue,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withStatus(Optional<? extends CareteamStatus> optional) {
    @Nullable CareteamStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        value,
        this.id,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        newValue,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        value,
        this.text,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        newValue,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        value,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        value,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableCareTeam(
        this.contained,
        this.subject,
        this.reasonReference,
        this.managingOrganization,
        this.identifier,
        this.participant,
        this.reasonCode,
        this.meta,
        this.name,
        this.telecom,
        this.note,
        this.category,
        this.implicitRules,
        this.encounter,
        this.resourceType,
        this.language,
        this.extension,
        this.status,
        this.id,
        this.text,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCareTeam} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCareTeam
        && equalTo((ImmutableCareTeam) another);
  }

  private boolean equalTo(ImmutableCareTeam another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(subject, another.subject)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(managingOrganization, another.managingOrganization)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(participant, another.participant)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(meta, another.meta)
        && Objects.equals(name, another.name)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(note, another.note)
        && Objects.equals(category, another.category)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(encounter, another.encounter)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && Objects.equals(status, another.status)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code subject}, {@code reasonReference}, {@code managingOrganization}, {@code identifier}, {@code participant}, {@code reasonCode}, {@code meta}, {@code name}, {@code telecom}, {@code note}, {@code category}, {@code implicitRules}, {@code encounter}, {@code resourceType}, {@code language}, {@code extension}, {@code status}, {@code id}, {@code text}, {@code modifierExtension}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(managingOrganization);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(participant);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code CareTeam} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CareTeam{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (subject != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (reasonReference != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (managingOrganization != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (identifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (participant != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (reasonCode != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (meta != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (name != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (telecom != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (note != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (category != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (implicitRules != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (encounter != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CareTeam", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CareTeam {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<List<Reference>> managingOrganization = Optional.empty();
    boolean managingOrganizationIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<CareTeam_Participant>> participant = Optional.empty();
    boolean participantIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CareteamStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Optional<List<Reference>> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(Optional<List<CareTeam_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CareteamStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CareTeam_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CareteamStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCareTeam fromJson(Json json) {
    ImmutableCareTeam.Builder builder = ((ImmutableCareTeam.Builder) ImmutableCareTeam.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    return (ImmutableCareTeam) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CareTeam} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CareTeam instance
   */
  public static CareTeam copyOf(CareTeam instance) {
    if (instance instanceof ImmutableCareTeam) {
      return (ImmutableCareTeam) instance;
    }
    return ((ImmutableCareTeam.Builder) ImmutableCareTeam.builder())
        .contained(instance.contained())
        .subject(instance.subject())
        .reasonReference(instance.reasonReference())
        .managingOrganization(instance.managingOrganization())
        .identifier(instance.identifier())
        .participant(instance.participant())
        .reasonCode(instance.reasonCode())
        .meta(instance.meta())
        .name(instance.name())
        .telecom(instance.telecom())
        .note(instance.note())
        .category(instance.category())
        .implicitRules(instance.implicitRules())
        .encounter(instance.encounter())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .extension(instance.extension())
        .status(instance.status())
        .id(instance.id())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link CareTeam CareTeam}.
   * <pre>
   * ImmutableCareTeam.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link CareTeam#contained() contained}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link CareTeam#subject() subject}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CareTeam#reasonReference() reasonReference}
   *    .managingOrganization(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CareTeam#managingOrganization() managingOrganization}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link CareTeam#identifier() identifier}
   *    .participant(List&amp;lt;com.medplum.types.fhir.CareTeam_Participant&amp;gt;) // optional {@link CareTeam#participant() participant}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CareTeam#reasonCode() reasonCode}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link CareTeam#meta() meta}
   *    .name(String) // optional {@link CareTeam#name() name}
   *    .telecom(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link CareTeam#telecom() telecom}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link CareTeam#note() note}
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CareTeam#category() category}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link CareTeam#implicitRules() implicitRules}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link CareTeam#encounter() encounter}
   *    .resourceType(String) // required {@link CareTeam#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link CareTeam#language() language}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CareTeam#extension() extension}
   *    .status(com.medplum.types.fhir.CareteamStatus) // optional {@link CareTeam#status() status}
   *    .id(com.medplum.types.fhir.Id) // optional {@link CareTeam#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link CareTeam#text() text}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CareTeam#modifierExtension() modifierExtension}
   *    .period(com.medplum.types.fhir.Period) // optional {@link CareTeam#period() period}
   *    .build();
   * </pre>
   * @return A new CareTeam builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCareTeam.Builder();
  }

  /**
   * Builds instances of type {@link CareTeam CareTeam}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CareTeam", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x4L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_PARTICIPANT = 0x20L;
    private static final long OPT_BIT_REASON_CODE = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_NAME = 0x100L;
    private static final long OPT_BIT_TELECOM = 0x200L;
    private static final long OPT_BIT_NOTE = 0x400L;
    private static final long OPT_BIT_CATEGORY = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_ENCOUNTER = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private static final long OPT_BIT_PERIOD = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable Reference subject;
    private @Nullable List<Reference> reasonReference;
    private @Nullable List<Reference> managingOrganization;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<CareTeam_Participant> participant;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Meta meta;
    private @Nullable String name;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable List<Annotation> note;
    private @Nullable List<CodeableConcept> category;
    private @Nullable Uri implicitRules;
    private @Nullable Reference encounter;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable CareteamStatus status;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CareTeam#contained() contained} to contained.
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
     * Initializes the optional value {@link CareTeam#contained() contained} to contained.
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
     * Initializes the optional value {@link CareTeam#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link CareTeam#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link CareTeam#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingOrganization(List<Reference> managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = Objects.requireNonNull(managingOrganization, "managingOrganization");
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("managingOrganization")
    public final Builder managingOrganization(Optional<? extends List<Reference>> managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = managingOrganization.orElse(null);
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CareTeam#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CareTeam#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(List<CareTeam_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participant")
    public final Builder participant(Optional<? extends List<CareTeam_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link CareTeam#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link CareTeam#meta() meta} to meta.
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
     * Initializes the optional value {@link CareTeam#meta() meta} to meta.
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
     * Initializes the optional value {@link CareTeam#name() name} to name.
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
     * Initializes the optional value {@link CareTeam#name() name} to name.
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
     * Initializes the optional value {@link CareTeam#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    public final Builder telecom(List<ContactPoint> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = Objects.requireNonNull(telecom, "telecom");
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("telecom")
    public final Builder telecom(Optional<? extends List<ContactPoint>> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = telecom.orElse(null);
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#note() note} to note.
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
     * Initializes the optional value {@link CareTeam#note() note} to note.
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
     * Initializes the optional value {@link CareTeam#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CareTeam#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CareTeam#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link CareTeam#encounter() encounter} to encounter.
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
     * Initializes the value for the {@link CareTeam#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CareTeam#language() language} to language.
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
     * Initializes the optional value {@link CareTeam#language() language} to language.
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
     * Initializes the optional value {@link CareTeam#extension() extension} to extension.
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
     * Initializes the optional value {@link CareTeam#extension() extension} to extension.
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
     * Initializes the optional value {@link CareTeam#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CareteamStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CareteamStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#id() id} to id.
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
     * Initializes the optional value {@link CareTeam#id() id} to id.
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
     * Initializes the optional value {@link CareTeam#text() text} to text.
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
     * Initializes the optional value {@link CareTeam#text() text} to text.
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
     * Initializes the optional value {@link CareTeam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CareTeam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CareTeam#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link CareTeam CareTeam}.
     * @return An immutable instance of CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CareTeam build() {
      checkRequiredAttributes();
      return new ImmutableCareTeam(
          contained,
          subject,
          reasonReference,
          managingOrganization,
          identifier,
          participant,
          reasonCode,
          meta,
          name,
          telecom,
          note,
          category,
          implicitRules,
          encounter,
          resourceType,
          language,
          extension,
          status,
          id,
          text,
          modifierExtension,
          period);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CareTeam is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CareTeam, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CareTeam", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CareTeam#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "CareTeam", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CareTeam#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CareTeam#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CareTeam#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link CareTeam#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link CareTeam#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link CareTeam#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link CareTeam#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(List<Reference> managingOrganization);

    /**
     * Initializes the optional value {@link CareTeam#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(Optional<? extends List<Reference>> managingOrganization);

    /**
     * Initializes the optional value {@link CareTeam#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link CareTeam#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link CareTeam#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(List<CareTeam_Participant> participant);

    /**
     * Initializes the optional value {@link CareTeam#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(Optional<? extends List<CareTeam_Participant>> participant);

    /**
     * Initializes the optional value {@link CareTeam#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link CareTeam#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link CareTeam#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CareTeam#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CareTeam#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link CareTeam#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link CareTeam#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link CareTeam#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link CareTeam#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link CareTeam#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link CareTeam#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link CareTeam#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link CareTeam#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CareTeam#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CareTeam#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link CareTeam#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link CareTeam#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CareTeam#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CareTeam#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CareteamStatus status);

    /**
     * Initializes the optional value {@link CareTeam#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CareteamStatus> status);

    /**
     * Initializes the optional value {@link CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CareTeam#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CareTeam#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CareTeam#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link CareTeam#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Builds a new {@link CareTeam CareTeam}.
     * @return An immutable instance of CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CareTeam build();
  }
}