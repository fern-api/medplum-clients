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
 * Immutable implementation of {@link Encounter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter.builder()}.
 */
@Generated(from = "Encounter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter implements Encounter {
  private final @Nullable List<Reference> account;
  private final @Nullable Duration length;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable List<Reference> episodeOfCare;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> appointment;
  private final @Nullable List<Encounter_StatusHistory> statusHistory;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference serviceProvider;
  private final @Nullable Period period;
  private final @Nullable List<Encounter_Diagnosis> diagnosis;
  private final @Nullable CodeableConcept priority;
  private final Coding _class;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Id id;
  private final @Nullable Reference partOf;
  private final @Nullable Reference subject;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Encounter_ClassHistory> classHistory;
  private final @Nullable List<Encounter_Location> location;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable CodeableConcept serviceType;
  private final @Nullable List<Encounter_Participant> participant;
  private final @Nullable Encounter_Hospitalization hospitalization;
  private final @Nullable EncounterStatus status;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Uri implicitRules;

  private ImmutableEncounter(
      @Nullable List<Reference> account,
      @Nullable Duration length,
      @Nullable List<CodeableConcept> type,
      @Nullable List<Reference> episodeOfCare,
      @Nullable Narrative text,
      @Nullable List<Reference> appointment,
      @Nullable List<Encounter_StatusHistory> statusHistory,
      @Nullable List<Extension> extension,
      @Nullable List<ResourceList> contained,
      @Nullable Reference serviceProvider,
      @Nullable Period period,
      @Nullable List<Encounter_Diagnosis> diagnosis,
      @Nullable CodeableConcept priority,
      Coding _class,
      @Nullable List<Reference> reasonReference,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable Id id,
      @Nullable Reference partOf,
      @Nullable Reference subject,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Encounter_ClassHistory> classHistory,
      @Nullable List<Encounter_Location> location,
      String resourceType,
      @Nullable Code language,
      @Nullable CodeableConcept serviceType,
      @Nullable List<Encounter_Participant> participant,
      @Nullable Encounter_Hospitalization hospitalization,
      @Nullable EncounterStatus status,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> basedOn,
      @Nullable Uri implicitRules) {
    this.account = account;
    this.length = length;
    this.type = type;
    this.episodeOfCare = episodeOfCare;
    this.text = text;
    this.appointment = appointment;
    this.statusHistory = statusHistory;
    this.extension = extension;
    this.contained = contained;
    this.serviceProvider = serviceProvider;
    this.period = period;
    this.diagnosis = diagnosis;
    this.priority = priority;
    this._class = _class;
    this.reasonReference = reasonReference;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.partOf = partOf;
    this.subject = subject;
    this.reasonCode = reasonCode;
    this.classHistory = classHistory;
    this.location = location;
    this.resourceType = resourceType;
    this.language = language;
    this.serviceType = serviceType;
    this.participant = participant;
    this.hospitalization = hospitalization;
    this.status = status;
    this.identifier = identifier;
    this.basedOn = basedOn;
    this.implicitRules = implicitRules;
  }

  /**
   * @return The value of the {@code account} attribute
   */
  @JsonProperty("account")
  @Override
  public Optional<List<Reference>> account() {
    return Optional.ofNullable(account);
  }

  /**
   * @return The value of the {@code length} attribute
   */
  @JsonProperty("length")
  @Override
  public Optional<Duration> length() {
    return Optional.ofNullable(length);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code episodeOfCare} attribute
   */
  @JsonProperty("episodeOfCare")
  @Override
  public Optional<List<Reference>> episodeOfCare() {
    return Optional.ofNullable(episodeOfCare);
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
   * @return The value of the {@code appointment} attribute
   */
  @JsonProperty("appointment")
  @Override
  public Optional<List<Reference>> appointment() {
    return Optional.ofNullable(appointment);
  }

  /**
   * @return The value of the {@code statusHistory} attribute
   */
  @JsonProperty("statusHistory")
  @Override
  public Optional<List<Encounter_StatusHistory>> statusHistory() {
    return Optional.ofNullable(statusHistory);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code serviceProvider} attribute
   */
  @JsonProperty("serviceProvider")
  @Override
  public Optional<Reference> serviceProvider() {
    return Optional.ofNullable(serviceProvider);
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
   * @return The value of the {@code diagnosis} attribute
   */
  @JsonProperty("diagnosis")
  @Override
  public Optional<List<Encounter_Diagnosis>> diagnosis() {
    return Optional.ofNullable(diagnosis);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<CodeableConcept> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code _class} attribute
   */
  @JsonProperty("class")
  @Override
  public Coding _class() {
    return _class;
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<Reference> partOf() {
    return Optional.ofNullable(partOf);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code classHistory} attribute
   */
  @JsonProperty("classHistory")
  @Override
  public Optional<List<Encounter_ClassHistory>> classHistory() {
    return Optional.ofNullable(classHistory);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<List<Encounter_Location>> location() {
    return Optional.ofNullable(location);
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
   * @return The value of the {@code serviceType} attribute
   */
  @JsonProperty("serviceType")
  @Override
  public Optional<CodeableConcept> serviceType() {
    return Optional.ofNullable(serviceType);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public Optional<List<Encounter_Participant>> participant() {
    return Optional.ofNullable(participant);
  }

  /**
   * @return The value of the {@code hospitalization} attribute
   */
  @JsonProperty("hospitalization")
  @Override
  public Optional<Encounter_Hospitalization> hospitalization() {
    return Optional.ofNullable(hospitalization);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<EncounterStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withAccount(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableEncounter(
        newValue,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withAccount(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableEncounter(
        value,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#length() length} attribute.
   * @param value The value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withLength(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "length");
    if (this.length == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        newValue,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#length() length} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for length
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withLength(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.length == value) return this;
    return new ImmutableEncounter(
        this.account,
        value,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        newValue,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        value,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#episodeOfCare() episodeOfCare} attribute.
   * @param value The value for episodeOfCare
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withEpisodeOfCare(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "episodeOfCare");
    if (this.episodeOfCare == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        newValue,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#episodeOfCare() episodeOfCare} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for episodeOfCare
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withEpisodeOfCare(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.episodeOfCare == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        value,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        newValue,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        value,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#appointment() appointment} attribute.
   * @param value The value for appointment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withAppointment(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "appointment");
    if (this.appointment == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        newValue,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#appointment() appointment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withAppointment(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.appointment == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        value,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#statusHistory() statusHistory} attribute.
   * @param value The value for statusHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withStatusHistory(List<Encounter_StatusHistory> value) {
    @Nullable List<Encounter_StatusHistory> newValue = Objects.requireNonNull(value, "statusHistory");
    if (this.statusHistory == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        newValue,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#statusHistory() statusHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withStatusHistory(Optional<? extends List<Encounter_StatusHistory>> optional) {
    @Nullable List<Encounter_StatusHistory> value = optional.orElse(null);
    if (this.statusHistory == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        value,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        newValue,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        value,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        newValue,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        value,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#serviceProvider() serviceProvider} attribute.
   * @param value The value for serviceProvider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withServiceProvider(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "serviceProvider");
    if (this.serviceProvider == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        newValue,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#serviceProvider() serviceProvider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceProvider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withServiceProvider(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.serviceProvider == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        value,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        newValue,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        value,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withDiagnosis(List<Encounter_Diagnosis> value) {
    @Nullable List<Encounter_Diagnosis> newValue = Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        newValue,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withDiagnosis(Optional<? extends List<Encounter_Diagnosis>> optional) {
    @Nullable List<Encounter_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        value,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withPriority(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        newValue,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withPriority(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        value,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter#_class() _class} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for _class
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter with_class(Coding value) {
    if (this._class == value) return this;
    Coding newValue = Objects.requireNonNull(value, "_class");
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        newValue,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        newValue,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        value,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        newValue,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        value,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        newValue,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        value,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        newValue,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        value,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withPartOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        newValue,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withPartOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        value,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        newValue,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        value,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        newValue,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        value,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#classHistory() classHistory} attribute.
   * @param value The value for classHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withClassHistory(List<Encounter_ClassHistory> value) {
    @Nullable List<Encounter_ClassHistory> newValue = Objects.requireNonNull(value, "classHistory");
    if (this.classHistory == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        newValue,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#classHistory() classHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withClassHistory(Optional<? extends List<Encounter_ClassHistory>> optional) {
    @Nullable List<Encounter_ClassHistory> value = optional.orElse(null);
    if (this.classHistory == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        value,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withLocation(List<Encounter_Location> value) {
    @Nullable List<Encounter_Location> newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        newValue,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withLocation(Optional<? extends List<Encounter_Location>> optional) {
    @Nullable List<Encounter_Location> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        value,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        newValue,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        newValue,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        value,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withServiceType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        newValue,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withServiceType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        value,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withParticipant(List<Encounter_Participant> value) {
    @Nullable List<Encounter_Participant> newValue = Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        newValue,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withParticipant(Optional<? extends List<Encounter_Participant>> optional) {
    @Nullable List<Encounter_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        value,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#hospitalization() hospitalization} attribute.
   * @param value The value for hospitalization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withHospitalization(Encounter_Hospitalization value) {
    @Nullable Encounter_Hospitalization newValue = Objects.requireNonNull(value, "hospitalization");
    if (this.hospitalization == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        newValue,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#hospitalization() hospitalization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hospitalization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withHospitalization(Optional<? extends Encounter_Hospitalization> optional) {
    @Nullable Encounter_Hospitalization value = optional.orElse(null);
    if (this.hospitalization == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        value,
        this.status,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withStatus(EncounterStatus value) {
    @Nullable EncounterStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        newValue,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withStatus(Optional<? extends EncounterStatus> optional) {
    @Nullable EncounterStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        value,
        this.identifier,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        newValue,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        value,
        this.basedOn,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEncounter(
        this.account,
        this.length,
        this.type,
        this.episodeOfCare,
        this.text,
        this.appointment,
        this.statusHistory,
        this.extension,
        this.contained,
        this.serviceProvider,
        this.period,
        this.diagnosis,
        this.priority,
        this._class,
        this.reasonReference,
        this.meta,
        this.modifierExtension,
        this.id,
        this.partOf,
        this.subject,
        this.reasonCode,
        this.classHistory,
        this.location,
        this.resourceType,
        this.language,
        this.serviceType,
        this.participant,
        this.hospitalization,
        this.status,
        this.identifier,
        this.basedOn,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter
        && equalTo((ImmutableEncounter) another);
  }

  private boolean equalTo(ImmutableEncounter another) {
    return Objects.equals(account, another.account)
        && Objects.equals(length, another.length)
        && Objects.equals(type, another.type)
        && Objects.equals(episodeOfCare, another.episodeOfCare)
        && Objects.equals(text, another.text)
        && Objects.equals(appointment, another.appointment)
        && Objects.equals(statusHistory, another.statusHistory)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(serviceProvider, another.serviceProvider)
        && Objects.equals(period, another.period)
        && Objects.equals(diagnosis, another.diagnosis)
        && Objects.equals(priority, another.priority)
        && _class.equals(another._class)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(subject, another.subject)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(classHistory, another.classHistory)
        && Objects.equals(location, another.location)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(serviceType, another.serviceType)
        && Objects.equals(participant, another.participant)
        && Objects.equals(hospitalization, another.hospitalization)
        && Objects.equals(status, another.status)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code account}, {@code length}, {@code type}, {@code episodeOfCare}, {@code text}, {@code appointment}, {@code statusHistory}, {@code extension}, {@code contained}, {@code serviceProvider}, {@code period}, {@code diagnosis}, {@code priority}, {@code _class}, {@code reasonReference}, {@code meta}, {@code modifierExtension}, {@code id}, {@code partOf}, {@code subject}, {@code reasonCode}, {@code classHistory}, {@code location}, {@code resourceType}, {@code language}, {@code serviceType}, {@code participant}, {@code hospitalization}, {@code status}, {@code identifier}, {@code basedOn}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(account);
    h += (h << 5) + Objects.hashCode(length);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(episodeOfCare);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(appointment);
    h += (h << 5) + Objects.hashCode(statusHistory);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(serviceProvider);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(diagnosis);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + _class.hashCode();
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(classHistory);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(serviceType);
    h += (h << 5) + Objects.hashCode(participant);
    h += (h << 5) + Objects.hashCode(hospitalization);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Encounter{");
    if (account != null) {
      builder.append("account=").append(account);
    }
    if (length != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("length=").append(length);
    }
    if (type != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (episodeOfCare != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("episodeOfCare=").append(episodeOfCare);
    }
    if (text != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (appointment != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("appointment=").append(appointment);
    }
    if (statusHistory != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("statusHistory=").append(statusHistory);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (serviceProvider != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("serviceProvider=").append(serviceProvider);
    }
    if (period != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (diagnosis != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    if (priority != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("_class=").append(_class);
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (classHistory != null) {
      builder.append(", ");
      builder.append("classHistory=").append(classHistory);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (serviceType != null) {
      builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (participant != null) {
      builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (hospitalization != null) {
      builder.append(", ");
      builder.append("hospitalization=").append(hospitalization);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Encounter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Encounter {
    @Nullable Optional<List<Reference>> account = Optional.empty();
    boolean accountIsSet;
    @Nullable Optional<Duration> length = Optional.empty();
    boolean lengthIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Reference>> episodeOfCare = Optional.empty();
    boolean episodeOfCareIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> appointment = Optional.empty();
    boolean appointmentIsSet;
    @Nullable Optional<List<Encounter_StatusHistory>> statusHistory = Optional.empty();
    boolean statusHistoryIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> serviceProvider = Optional.empty();
    boolean serviceProviderIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<Encounter_Diagnosis>> diagnosis = Optional.empty();
    boolean diagnosisIsSet;
    @Nullable Optional<CodeableConcept> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Coding _class;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Encounter_ClassHistory>> classHistory = Optional.empty();
    boolean classHistoryIsSet;
    @Nullable Optional<List<Encounter_Location>> location = Optional.empty();
    boolean locationIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<CodeableConcept> serviceType = Optional.empty();
    boolean serviceTypeIsSet;
    @Nullable Optional<List<Encounter_Participant>> participant = Optional.empty();
    boolean participantIsSet;
    @Nullable Optional<Encounter_Hospitalization> hospitalization = Optional.empty();
    boolean hospitalizationIsSet;
    @Nullable Optional<EncounterStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @JsonProperty("account")
    public void setAccount(Optional<List<Reference>> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @JsonProperty("length")
    public void setLength(Optional<Duration> length) {
      this.length = length;
      this.lengthIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("episodeOfCare")
    public void setEpisodeOfCare(Optional<List<Reference>> episodeOfCare) {
      this.episodeOfCare = episodeOfCare;
      this.episodeOfCareIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("appointment")
    public void setAppointment(Optional<List<Reference>> appointment) {
      this.appointment = appointment;
      this.appointmentIsSet = true;
    }
    @JsonProperty("statusHistory")
    public void setStatusHistory(Optional<List<Encounter_StatusHistory>> statusHistory) {
      this.statusHistory = statusHistory;
      this.statusHistoryIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("serviceProvider")
    public void setServiceProvider(Optional<Reference> serviceProvider) {
      this.serviceProvider = serviceProvider;
      this.serviceProviderIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("diagnosis")
    public void setDiagnosis(Optional<List<Encounter_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("class")
    public void set_class(Coding _class) {
      this._class = _class;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("classHistory")
    public void setClassHistory(Optional<List<Encounter_ClassHistory>> classHistory) {
      this.classHistory = classHistory;
      this.classHistoryIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<List<Encounter_Location>> location) {
      this.location = location;
      this.locationIsSet = true;
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
    @JsonProperty("serviceType")
    public void setServiceType(Optional<CodeableConcept> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(Optional<List<Encounter_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @JsonProperty("hospitalization")
    public void setHospitalization(Optional<Encounter_Hospitalization> hospitalization) {
      this.hospitalization = hospitalization;
      this.hospitalizationIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<EncounterStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public Optional<List<Reference>> account() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> length() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> episodeOfCare() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> appointment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Encounter_StatusHistory>> statusHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> serviceProvider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Encounter_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Coding _class() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Encounter_ClassHistory>> classHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Encounter_Location>> location() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Encounter_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Encounter_Hospitalization> hospitalization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EncounterStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEncounter fromJson(Json json) {
    ImmutableEncounter.Builder builder = ((ImmutableEncounter.Builder) ImmutableEncounter.builder());
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.lengthIsSet) {
      builder.length(json.length);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.episodeOfCareIsSet) {
      builder.episodeOfCare(json.episodeOfCare);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.appointmentIsSet) {
      builder.appointment(json.appointment);
    }
    if (json.statusHistoryIsSet) {
      builder.statusHistory(json.statusHistory);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.serviceProviderIsSet) {
      builder.serviceProvider(json.serviceProvider);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json._class != null) {
      builder._class(json._class);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.classHistoryIsSet) {
      builder.classHistory(json.classHistory);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.hospitalizationIsSet) {
      builder.hospitalization(json.hospitalization);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableEncounter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter instance
   */
  public static Encounter copyOf(Encounter instance) {
    if (instance instanceof ImmutableEncounter) {
      return (ImmutableEncounter) instance;
    }
    return ((ImmutableEncounter.Builder) ImmutableEncounter.builder())
        .account(instance.account())
        .length(instance.length())
        .type(instance.type())
        .episodeOfCare(instance.episodeOfCare())
        .text(instance.text())
        .appointment(instance.appointment())
        .statusHistory(instance.statusHistory())
        .extension(instance.extension())
        .contained(instance.contained())
        .serviceProvider(instance.serviceProvider())
        .period(instance.period())
        .diagnosis(instance.diagnosis())
        .priority(instance.priority())
        ._class(instance._class())
        .reasonReference(instance.reasonReference())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .partOf(instance.partOf())
        .subject(instance.subject())
        .reasonCode(instance.reasonCode())
        .classHistory(instance.classHistory())
        .location(instance.location())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .serviceType(instance.serviceType())
        .participant(instance.participant())
        .hospitalization(instance.hospitalization())
        .status(instance.status())
        .identifier(instance.identifier())
        .basedOn(instance.basedOn())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter Encounter}.
   * <pre>
   * ImmutableEncounter.builder()
   *    .account(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Encounter#account() account}
   *    .length(com.fhir.types.fhir.Duration) // optional {@link Encounter#length() length}
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter#type() type}
   *    .episodeOfCare(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Encounter#episodeOfCare() episodeOfCare}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Encounter#text() text}
   *    .appointment(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Encounter#appointment() appointment}
   *    .statusHistory(List&amp;lt;com.fhir.types.fhir.Encounter_StatusHistory&amp;gt;) // optional {@link Encounter#statusHistory() statusHistory}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter#extension() extension}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Encounter#contained() contained}
   *    .serviceProvider(com.fhir.types.fhir.Reference) // optional {@link Encounter#serviceProvider() serviceProvider}
   *    .period(com.fhir.types.fhir.Period) // optional {@link Encounter#period() period}
   *    .diagnosis(List&amp;lt;com.fhir.types.fhir.Encounter_Diagnosis&amp;gt;) // optional {@link Encounter#diagnosis() diagnosis}
   *    .priority(com.fhir.types.fhir.CodeableConcept) // optional {@link Encounter#priority() priority}
   *    ._class(com.fhir.types.fhir.Coding) // required {@link Encounter#_class() _class}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Encounter#reasonReference() reasonReference}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Encounter#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter#modifierExtension() modifierExtension}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Encounter#id() id}
   *    .partOf(com.fhir.types.fhir.Reference) // optional {@link Encounter#partOf() partOf}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link Encounter#subject() subject}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter#reasonCode() reasonCode}
   *    .classHistory(List&amp;lt;com.fhir.types.fhir.Encounter_ClassHistory&amp;gt;) // optional {@link Encounter#classHistory() classHistory}
   *    .location(List&amp;lt;com.fhir.types.fhir.Encounter_Location&amp;gt;) // optional {@link Encounter#location() location}
   *    .resourceType(String) // required {@link Encounter#resourceType() resourceType}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Encounter#language() language}
   *    .serviceType(com.fhir.types.fhir.CodeableConcept) // optional {@link Encounter#serviceType() serviceType}
   *    .participant(List&amp;lt;com.fhir.types.fhir.Encounter_Participant&amp;gt;) // optional {@link Encounter#participant() participant}
   *    .hospitalization(com.fhir.types.fhir.Encounter_Hospitalization) // optional {@link Encounter#hospitalization() hospitalization}
   *    .status(com.fhir.types.fhir.EncounterStatus) // optional {@link Encounter#status() status}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Encounter#identifier() identifier}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Encounter#basedOn() basedOn}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Encounter#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new Encounter builder
   */
  public static _classBuildStage builder() {
    return new ImmutableEncounter.Builder();
  }

  /**
   * Builds instances of type {@link Encounter Encounter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Encounter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements _classBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT__CLASS = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_ACCOUNT = 0x1L;
    private static final long OPT_BIT_LENGTH = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_EPISODE_OF_CARE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_APPOINTMENT = 0x20L;
    private static final long OPT_BIT_STATUS_HISTORY = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_SERVICE_PROVIDER = 0x200L;
    private static final long OPT_BIT_PERIOD = 0x400L;
    private static final long OPT_BIT_DIAGNOSIS = 0x800L;
    private static final long OPT_BIT_PRIORITY = 0x1000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_PART_OF = 0x20000L;
    private static final long OPT_BIT_SUBJECT = 0x40000L;
    private static final long OPT_BIT_REASON_CODE = 0x80000L;
    private static final long OPT_BIT_CLASS_HISTORY = 0x100000L;
    private static final long OPT_BIT_LOCATION = 0x200000L;
    private static final long OPT_BIT_LANGUAGE = 0x400000L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x800000L;
    private static final long OPT_BIT_PARTICIPANT = 0x1000000L;
    private static final long OPT_BIT_HOSPITALIZATION = 0x2000000L;
    private static final long OPT_BIT_STATUS = 0x4000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000000L;
    private static final long OPT_BIT_BASED_ON = 0x10000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Reference> account;
    private @Nullable Duration length;
    private @Nullable List<CodeableConcept> type;
    private @Nullable List<Reference> episodeOfCare;
    private @Nullable Narrative text;
    private @Nullable List<Reference> appointment;
    private @Nullable List<Encounter_StatusHistory> statusHistory;
    private @Nullable List<Extension> extension;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference serviceProvider;
    private @Nullable Period period;
    private @Nullable List<Encounter_Diagnosis> diagnosis;
    private @Nullable CodeableConcept priority;
    private @Nullable Coding _class;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Id id;
    private @Nullable Reference partOf;
    private @Nullable Reference subject;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Encounter_ClassHistory> classHistory;
    private @Nullable List<Encounter_Location> location;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable CodeableConcept serviceType;
    private @Nullable List<Encounter_Participant> participant;
    private @Nullable Encounter_Hospitalization hospitalization;
    private @Nullable EncounterStatus status;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> basedOn;
    private @Nullable Uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(List<Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("account")
    public final Builder account(Optional<? extends List<Reference>> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for chained invocation
     */
    public final Builder length(Duration length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = Objects.requireNonNull(length, "length");
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("length")
    public final Builder length(Optional<? extends Duration> length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = length.orElse(null);
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for chained invocation
     */
    public final Builder episodeOfCare(List<Reference> episodeOfCare) {
      checkNotIsSet(episodeOfCareIsSet(), "episodeOfCare");
      this.episodeOfCare = Objects.requireNonNull(episodeOfCare, "episodeOfCare");
      optBits |= OPT_BIT_EPISODE_OF_CARE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("episodeOfCare")
    public final Builder episodeOfCare(Optional<? extends List<Reference>> episodeOfCare) {
      checkNotIsSet(episodeOfCareIsSet(), "episodeOfCare");
      this.episodeOfCare = episodeOfCare.orElse(null);
      optBits |= OPT_BIT_EPISODE_OF_CARE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#text() text} to text.
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
     * Initializes the optional value {@link Encounter#text() text} to text.
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
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for chained invocation
     */
    public final Builder appointment(List<Reference> appointment) {
      checkNotIsSet(appointmentIsSet(), "appointment");
      this.appointment = Objects.requireNonNull(appointment, "appointment");
      optBits |= OPT_BIT_APPOINTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appointment")
    public final Builder appointment(Optional<? extends List<Reference>> appointment) {
      checkNotIsSet(appointmentIsSet(), "appointment");
      this.appointment = appointment.orElse(null);
      optBits |= OPT_BIT_APPOINTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusHistory(List<Encounter_StatusHistory> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = Objects.requireNonNull(statusHistory, "statusHistory");
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusHistory")
    public final Builder statusHistory(Optional<? extends List<Encounter_StatusHistory>> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = statusHistory.orElse(null);
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
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
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
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
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceProvider(Reference serviceProvider) {
      checkNotIsSet(serviceProviderIsSet(), "serviceProvider");
      this.serviceProvider = Objects.requireNonNull(serviceProvider, "serviceProvider");
      optBits |= OPT_BIT_SERVICE_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serviceProvider")
    public final Builder serviceProvider(Optional<? extends Reference> serviceProvider) {
      checkNotIsSet(serviceProviderIsSet(), "serviceProvider");
      this.serviceProvider = serviceProvider.orElse(null);
      optBits |= OPT_BIT_SERVICE_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#period() period} to period.
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
     * Initializes the optional value {@link Encounter#period() period} to period.
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
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(List<Encounter_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosis")
    public final Builder diagnosis(Optional<? extends List<Encounter_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends CodeableConcept> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the value for the {@link Encounter#_class() _class} attribute.
     * @param _class The value for _class 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("class")
    public final Builder _class(Coding _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = Objects.requireNonNull(_class, "_class");
      initBits &= ~INIT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
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
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
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
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter#id() id} to id.
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
     * Initializes the optional value {@link Encounter#id() id} to id.
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
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(Reference partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
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
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
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
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder classHistory(List<Encounter_ClassHistory> classHistory) {
      checkNotIsSet(classHistoryIsSet(), "classHistory");
      this.classHistory = Objects.requireNonNull(classHistory, "classHistory");
      optBits |= OPT_BIT_CLASS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("classHistory")
    public final Builder classHistory(Optional<? extends List<Encounter_ClassHistory>> classHistory) {
      checkNotIsSet(classHistoryIsSet(), "classHistory");
      this.classHistory = classHistory.orElse(null);
      optBits |= OPT_BIT_CLASS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(List<Encounter_Location> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends List<Encounter_Location>> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the value for the {@link Encounter#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Encounter#language() language} to language.
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
     * Initializes the optional value {@link Encounter#language() language} to language.
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
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceType(CodeableConcept serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = Objects.requireNonNull(serviceType, "serviceType");
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serviceType")
    public final Builder serviceType(Optional<? extends CodeableConcept> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = serviceType.orElse(null);
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(List<Encounter_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participant")
    public final Builder participant(Optional<? extends List<Encounter_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for chained invocation
     */
    public final Builder hospitalization(Encounter_Hospitalization hospitalization) {
      checkNotIsSet(hospitalizationIsSet(), "hospitalization");
      this.hospitalization = Objects.requireNonNull(hospitalization, "hospitalization");
      optBits |= OPT_BIT_HOSPITALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hospitalization")
    public final Builder hospitalization(Optional<? extends Encounter_Hospitalization> hospitalization) {
      checkNotIsSet(hospitalizationIsSet(), "hospitalization");
      this.hospitalization = hospitalization.orElse(null);
      optBits |= OPT_BIT_HOSPITALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(EncounterStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends EncounterStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link Encounter Encounter}.
     * @return An immutable instance of Encounter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Encounter build() {
      checkRequiredAttributes();
      return new ImmutableEncounter(
          account,
          length,
          type,
          episodeOfCare,
          text,
          appointment,
          statusHistory,
          extension,
          contained,
          serviceProvider,
          period,
          diagnosis,
          priority,
          _class,
          reasonReference,
          meta,
          modifierExtension,
          id,
          partOf,
          subject,
          reasonCode,
          classHistory,
          location,
          resourceType,
          language,
          serviceType,
          participant,
          hospitalization,
          status,
          identifier,
          basedOn,
          implicitRules);
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean lengthIsSet() {
      return (optBits & OPT_BIT_LENGTH) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean episodeOfCareIsSet() {
      return (optBits & OPT_BIT_EPISODE_OF_CARE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean appointmentIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT) != 0;
    }

    private boolean statusHistoryIsSet() {
      return (optBits & OPT_BIT_STATUS_HISTORY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean serviceProviderIsSet() {
      return (optBits & OPT_BIT_SERVICE_PROVIDER) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean classHistoryIsSet() {
      return (optBits & OPT_BIT_CLASS_HISTORY) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean hospitalizationIsSet() {
      return (optBits & OPT_BIT_HOSPITALIZATION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean _classIsSet() {
      return (initBits & INIT_BIT__CLASS) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Encounter is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!_classIsSet()) attributes.add("_class");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Encounter, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Encounter", generator = "Immutables")
  public interface _classBuildStage {
    /**
     * Initializes the value for the {@link Encounter#_class() _class} attribute.
     * @param _class The value for _class 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage _class(Coding _class);
  }

  @Generated(from = "Encounter", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Encounter#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Encounter", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(List<Reference> account);

    /**
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(Optional<? extends List<Reference>> account);

    /**
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for chained invocation
     */
    BuildFinal length(Duration length);

    /**
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal length(Optional<? extends Duration> length);

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(List<CodeableConcept> type);

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends List<CodeableConcept>> type);

    /**
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for chained invocation
     */
    BuildFinal episodeOfCare(List<Reference> episodeOfCare);

    /**
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal episodeOfCare(Optional<? extends List<Reference>> episodeOfCare);

    /**
     * Initializes the optional value {@link Encounter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Encounter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appointment(List<Reference> appointment);

    /**
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointment(Optional<? extends List<Reference>> appointment);

    /**
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusHistory(List<Encounter_StatusHistory> statusHistory);

    /**
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusHistory(Optional<? extends List<Encounter_StatusHistory>> statusHistory);

    /**
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceProvider(Reference serviceProvider);

    /**
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceProvider(Optional<? extends Reference> serviceProvider);

    /**
     * Initializes the optional value {@link Encounter#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link Encounter#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(List<Encounter_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(Optional<? extends List<Encounter_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(CodeableConcept priority);

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends CodeableConcept> priority);

    /**
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Encounter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(Reference partOf);

    /**
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends Reference> partOf);

    /**
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classHistory(List<Encounter_ClassHistory> classHistory);

    /**
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classHistory(Optional<? extends List<Encounter_ClassHistory>> classHistory);

    /**
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(List<Encounter_Location> location);

    /**
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends List<Encounter_Location>> location);

    /**
     * Initializes the optional value {@link Encounter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Encounter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(CodeableConcept serviceType);

    /**
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(Optional<? extends CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(List<Encounter_Participant> participant);

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(Optional<? extends List<Encounter_Participant>> participant);

    /**
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hospitalization(Encounter_Hospitalization hospitalization);

    /**
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hospitalization(Optional<? extends Encounter_Hospitalization> hospitalization);

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(EncounterStatus status);

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends EncounterStatus> status);

    /**
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Builds a new {@link Encounter Encounter}.
     * @return An immutable instance of Encounter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Encounter build();
  }
}
