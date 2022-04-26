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
 * Immutable implementation of {@link CommunicationRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCommunicationRequest.builder()}.
 */
@Generated(from = "CommunicationRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCommunicationRequest implements CommunicationRequest {
  private final @Nullable Code status;
  private final @Nullable Reference requester;
  private final @Nullable Identifier groupIdentifier;
  private final @Nullable List<Reference> about;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable List<Reference> replaces;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable List<Reference> recipient;
  private final @Nullable List<CodeableConcept> medium;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CommunicationRequest_Payload> payload;
  private final @Nullable List<Reference> reasonReference;
  private final String resourceType;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable DateTime authoredOn;
  private final @Nullable Reference encounter;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable List<Annotation> note;
  private final @Nullable Boolean doNotPerform;
  private final @Nullable Reference subject;
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept statusReason;
  private final @Nullable Code priority;
  private final @Nullable Reference sender;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable List<Extension> extension;

  private ImmutableCommunicationRequest(
      @Nullable Code status,
      @Nullable Reference requester,
      @Nullable Identifier groupIdentifier,
      @Nullable List<Reference> about,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable List<Reference> replaces,
      @Nullable String occurrenceDateTime,
      @Nullable List<Reference> recipient,
      @Nullable List<CodeableConcept> medium,
      @Nullable Uri implicitRules,
      @Nullable List<CommunicationRequest_Payload> payload,
      @Nullable List<Reference> reasonReference,
      String resourceType,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier,
      @Nullable DateTime authoredOn,
      @Nullable Reference encounter,
      @Nullable List<CodeableConcept> category,
      @Nullable List<Annotation> note,
      @Nullable Boolean doNotPerform,
      @Nullable Reference subject,
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable CodeableConcept statusReason,
      @Nullable Code priority,
      @Nullable Reference sender,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Reference> basedOn,
      @Nullable List<Extension> modifierExtension,
      @Nullable Period occurrencePeriod,
      @Nullable List<Extension> extension) {
    this.status = status;
    this.requester = requester;
    this.groupIdentifier = groupIdentifier;
    this.about = about;
    this.id = id;
    this.language = language;
    this.replaces = replaces;
    this.occurrenceDateTime = occurrenceDateTime;
    this.recipient = recipient;
    this.medium = medium;
    this.implicitRules = implicitRules;
    this.payload = payload;
    this.reasonReference = reasonReference;
    this.resourceType = resourceType;
    this.contained = contained;
    this.identifier = identifier;
    this.authoredOn = authoredOn;
    this.encounter = encounter;
    this.category = category;
    this.note = note;
    this.doNotPerform = doNotPerform;
    this.subject = subject;
    this.text = text;
    this.meta = meta;
    this.statusReason = statusReason;
    this.priority = priority;
    this.sender = sender;
    this.reasonCode = reasonCode;
    this.basedOn = basedOn;
    this.modifierExtension = modifierExtension;
    this.occurrencePeriod = occurrencePeriod;
    this.extension = extension;
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
   * @return The value of the {@code requester} attribute
   */
  @JsonProperty("requester")
  @Override
  public Optional<Reference> requester() {
    return Optional.ofNullable(requester);
  }

  /**
   * @return The value of the {@code groupIdentifier} attribute
   */
  @JsonProperty("groupIdentifier")
  @Override
  public Optional<Identifier> groupIdentifier() {
    return Optional.ofNullable(groupIdentifier);
  }

  /**
   * @return The value of the {@code about} attribute
   */
  @JsonProperty("about")
  @Override
  public Optional<List<Reference>> about() {
    return Optional.ofNullable(about);
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
   * @return The value of the {@code replaces} attribute
   */
  @JsonProperty("replaces")
  @Override
  public Optional<List<Reference>> replaces() {
    return Optional.ofNullable(replaces);
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
   * @return The value of the {@code recipient} attribute
   */
  @JsonProperty("recipient")
  @Override
  public Optional<List<Reference>> recipient() {
    return Optional.ofNullable(recipient);
  }

  /**
   * @return The value of the {@code medium} attribute
   */
  @JsonProperty("medium")
  @Override
  public Optional<List<CodeableConcept>> medium() {
    return Optional.ofNullable(medium);
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
   * @return The value of the {@code payload} attribute
   */
  @JsonProperty("payload")
  @Override
  public Optional<List<CommunicationRequest_Payload>> payload() {
    return Optional.ofNullable(payload);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code authoredOn} attribute
   */
  @JsonProperty("authoredOn")
  @Override
  public Optional<DateTime> authoredOn() {
    return Optional.ofNullable(authoredOn);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code doNotPerform} attribute
   */
  @JsonProperty("doNotPerform")
  @Override
  public Optional<Boolean> doNotPerform() {
    return Optional.ofNullable(doNotPerform);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<CodeableConcept> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code sender} attribute
   */
  @JsonProperty("sender")
  @Override
  public Optional<Reference> sender() {
    return Optional.ofNullable(sender);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
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
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @JsonProperty("occurrencePeriod")
  @Override
  public Optional<Period> occurrencePeriod() {
    return Optional.ofNullable(occurrencePeriod);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCommunicationRequest(
        newValue,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCommunicationRequest(
        value,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withRequester(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        newValue,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withRequester(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        value,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withGroupIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        newValue,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withGroupIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        value,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#about() about} attribute.
   * @param value The value for about
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withAbout(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "about");
    if (this.about == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        newValue,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#about() about} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for about
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withAbout(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.about == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        value,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        newValue,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        value,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        newValue,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        value,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withReplaces(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        newValue,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withReplaces(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        value,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        newValue,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        value,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withRecipient(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        newValue,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withRecipient(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        value,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#medium() medium} attribute.
   * @param value The value for medium
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withMedium(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "medium");
    if (this.medium == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        newValue,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#medium() medium} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medium
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withMedium(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.medium == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        value,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        newValue,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        value,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#payload() payload} attribute.
   * @param value The value for payload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withPayload(List<CommunicationRequest_Payload> value) {
    @Nullable List<CommunicationRequest_Payload> newValue = Objects.requireNonNull(value, "payload");
    if (this.payload == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        newValue,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#payload() payload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withPayload(Optional<? extends List<CommunicationRequest_Payload>> optional) {
    @Nullable List<CommunicationRequest_Payload> value = optional.orElse(null);
    if (this.payload == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        value,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        newValue,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        value,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommunicationRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCommunicationRequest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        newValue,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        newValue,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        value,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        newValue,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        value,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withAuthoredOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        newValue,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withAuthoredOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        value,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        newValue,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        value,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        newValue,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        value,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        newValue,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        value,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withDoNotPerform(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        newValue,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withDoNotPerform(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        value,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        newValue,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        value,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        newValue,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        value,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        newValue,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        value,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        newValue,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        value,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        newValue,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        value,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#sender() sender} attribute.
   * @param value The value for sender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withSender(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "sender");
    if (this.sender == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        newValue,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#sender() sender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withSender(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.sender == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        value,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        newValue,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        value,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        newValue,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        value,
        this.modifierExtension,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        newValue,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        value,
        this.occurrencePeriod,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCommunicationRequest(
        this.status,
        this.requester,
        this.groupIdentifier,
        this.about,
        this.id,
        this.language,
        this.replaces,
        this.occurrenceDateTime,
        this.recipient,
        this.medium,
        this.implicitRules,
        this.payload,
        this.reasonReference,
        this.resourceType,
        this.contained,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.category,
        this.note,
        this.doNotPerform,
        this.subject,
        this.text,
        this.meta,
        this.statusReason,
        this.priority,
        this.sender,
        this.reasonCode,
        this.basedOn,
        this.modifierExtension,
        this.occurrencePeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCommunicationRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCommunicationRequest
        && equalTo((ImmutableCommunicationRequest) another);
  }

  private boolean equalTo(ImmutableCommunicationRequest another) {
    return Objects.equals(status, another.status)
        && Objects.equals(requester, another.requester)
        && Objects.equals(groupIdentifier, another.groupIdentifier)
        && Objects.equals(about, another.about)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(replaces, another.replaces)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(recipient, another.recipient)
        && Objects.equals(medium, another.medium)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(payload, another.payload)
        && Objects.equals(reasonReference, another.reasonReference)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(authoredOn, another.authoredOn)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(category, another.category)
        && Objects.equals(note, another.note)
        && Objects.equals(doNotPerform, another.doNotPerform)
        && Objects.equals(subject, another.subject)
        && Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(priority, another.priority)
        && Objects.equals(sender, another.sender)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code requester}, {@code groupIdentifier}, {@code about}, {@code id}, {@code language}, {@code replaces}, {@code occurrenceDateTime}, {@code recipient}, {@code medium}, {@code implicitRules}, {@code payload}, {@code reasonReference}, {@code resourceType}, {@code contained}, {@code identifier}, {@code authoredOn}, {@code encounter}, {@code category}, {@code note}, {@code doNotPerform}, {@code subject}, {@code text}, {@code meta}, {@code statusReason}, {@code priority}, {@code sender}, {@code reasonCode}, {@code basedOn}, {@code modifierExtension}, {@code occurrencePeriod}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(requester);
    h += (h << 5) + Objects.hashCode(groupIdentifier);
    h += (h << 5) + Objects.hashCode(about);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(replaces);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(recipient);
    h += (h << 5) + Objects.hashCode(medium);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(payload);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(authoredOn);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(doNotPerform);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(sender);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code CommunicationRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CommunicationRequest{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (requester != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (groupIdentifier != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (about != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("about=").append(about);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (replaces != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (occurrenceDateTime != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (recipient != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (medium != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("medium=").append(medium);
    }
    if (implicitRules != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (payload != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("payload=").append(payload);
    }
    if (reasonReference != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (doNotPerform != null) {
      builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (sender != null) {
      builder.append(", ");
      builder.append("sender=").append(sender);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CommunicationRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CommunicationRequest {
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> requester = Optional.empty();
    boolean requesterIsSet;
    @Nullable Optional<Identifier> groupIdentifier = Optional.empty();
    boolean groupIdentifierIsSet;
    @Nullable Optional<List<Reference>> about = Optional.empty();
    boolean aboutIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> replaces = Optional.empty();
    boolean replacesIsSet;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<List<Reference>> recipient = Optional.empty();
    boolean recipientIsSet;
    @Nullable Optional<List<CodeableConcept>> medium = Optional.empty();
    boolean mediumIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CommunicationRequest_Payload>> payload = Optional.empty();
    boolean payloadIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<DateTime> authoredOn = Optional.empty();
    boolean authoredOnIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Boolean> doNotPerform = Optional.empty();
    boolean doNotPerformIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<Reference> sender = Optional.empty();
    boolean senderIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("requester")
    public void setRequester(Optional<Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @JsonProperty("groupIdentifier")
    public void setGroupIdentifier(Optional<Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @JsonProperty("about")
    public void setAbout(Optional<List<Reference>> about) {
      this.about = about;
      this.aboutIsSet = true;
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
    @JsonProperty("replaces")
    public void setReplaces(Optional<List<Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("recipient")
    public void setRecipient(Optional<List<Reference>> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @JsonProperty("medium")
    public void setMedium(Optional<List<CodeableConcept>> medium) {
      this.medium = medium;
      this.mediumIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("payload")
    public void setPayload(Optional<List<CommunicationRequest_Payload>> payload) {
      this.payload = payload;
      this.payloadIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
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
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("authoredOn")
    public void setAuthoredOn(Optional<DateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Optional<Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("sender")
    public void setSender(Optional<Reference> sender) {
      this.sender = sender;
      this.senderIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> about() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> medium() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CommunicationRequest_Payload>> payload() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> sender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCommunicationRequest fromJson(Json json) {
    ImmutableCommunicationRequest.Builder builder = ((ImmutableCommunicationRequest.Builder) ImmutableCommunicationRequest.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.aboutIsSet) {
      builder.about(json.about);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.mediumIsSet) {
      builder.medium(json.medium);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.payloadIsSet) {
      builder.payload(json.payload);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.senderIsSet) {
      builder.sender(json.sender);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableCommunicationRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CommunicationRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CommunicationRequest instance
   */
  public static CommunicationRequest copyOf(CommunicationRequest instance) {
    if (instance instanceof ImmutableCommunicationRequest) {
      return (ImmutableCommunicationRequest) instance;
    }
    return ((ImmutableCommunicationRequest.Builder) ImmutableCommunicationRequest.builder())
        .status(instance.status())
        .requester(instance.requester())
        .groupIdentifier(instance.groupIdentifier())
        .about(instance.about())
        .id(instance.id())
        .language(instance.language())
        .replaces(instance.replaces())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .recipient(instance.recipient())
        .medium(instance.medium())
        .implicitRules(instance.implicitRules())
        .payload(instance.payload())
        .reasonReference(instance.reasonReference())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .authoredOn(instance.authoredOn())
        .encounter(instance.encounter())
        .category(instance.category())
        .note(instance.note())
        .doNotPerform(instance.doNotPerform())
        .subject(instance.subject())
        .text(instance.text())
        .meta(instance.meta())
        .statusReason(instance.statusReason())
        .priority(instance.priority())
        .sender(instance.sender())
        .reasonCode(instance.reasonCode())
        .basedOn(instance.basedOn())
        .modifierExtension(instance.modifierExtension())
        .occurrencePeriod(instance.occurrencePeriod())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link CommunicationRequest CommunicationRequest}.
   * <pre>
   * ImmutableCommunicationRequest.builder()
   *    .status(com.fhir.types.fhir.Code) // optional {@link CommunicationRequest#status() status}
   *    .requester(com.fhir.types.fhir.Reference) // optional {@link CommunicationRequest#requester() requester}
   *    .groupIdentifier(com.fhir.types.fhir.Identifier) // optional {@link CommunicationRequest#groupIdentifier() groupIdentifier}
   *    .about(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#about() about}
   *    .id(com.fhir.types.fhir.Id) // optional {@link CommunicationRequest#id() id}
   *    .language(com.fhir.types.fhir.Code) // optional {@link CommunicationRequest#language() language}
   *    .replaces(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#replaces() replaces}
   *    .occurrenceDateTime(String) // optional {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime}
   *    .recipient(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#recipient() recipient}
   *    .medium(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link CommunicationRequest#medium() medium}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link CommunicationRequest#implicitRules() implicitRules}
   *    .payload(List&amp;lt;com.fhir.types.fhir.CommunicationRequest_Payload&amp;gt;) // optional {@link CommunicationRequest#payload() payload}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#reasonReference() reasonReference}
   *    .resourceType(String) // required {@link CommunicationRequest#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link CommunicationRequest#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link CommunicationRequest#identifier() identifier}
   *    .authoredOn(com.fhir.types.fhir.DateTime) // optional {@link CommunicationRequest#authoredOn() authoredOn}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link CommunicationRequest#encounter() encounter}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link CommunicationRequest#category() category}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link CommunicationRequest#note() note}
   *    .doNotPerform(Boolean) // optional {@link CommunicationRequest#doNotPerform() doNotPerform}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link CommunicationRequest#subject() subject}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link CommunicationRequest#text() text}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link CommunicationRequest#meta() meta}
   *    .statusReason(com.fhir.types.fhir.CodeableConcept) // optional {@link CommunicationRequest#statusReason() statusReason}
   *    .priority(com.fhir.types.fhir.Code) // optional {@link CommunicationRequest#priority() priority}
   *    .sender(com.fhir.types.fhir.Reference) // optional {@link CommunicationRequest#sender() sender}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link CommunicationRequest#reasonCode() reasonCode}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#basedOn() basedOn}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CommunicationRequest#modifierExtension() modifierExtension}
   *    .occurrencePeriod(com.fhir.types.fhir.Period) // optional {@link CommunicationRequest#occurrencePeriod() occurrencePeriod}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CommunicationRequest#extension() extension}
   *    .build();
   * </pre>
   * @return A new CommunicationRequest builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCommunicationRequest.Builder();
  }

  /**
   * Builds instances of type {@link CommunicationRequest CommunicationRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CommunicationRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_REQUESTER = 0x2L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_ABOUT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_REPLACES = 0x40L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x80L;
    private static final long OPT_BIT_RECIPIENT = 0x100L;
    private static final long OPT_BIT_MEDIUM = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_PAYLOAD = 0x800L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x8000L;
    private static final long OPT_BIT_ENCOUNTER = 0x10000L;
    private static final long OPT_BIT_CATEGORY = 0x20000L;
    private static final long OPT_BIT_NOTE = 0x40000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x80000L;
    private static final long OPT_BIT_SUBJECT = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_META = 0x400000L;
    private static final long OPT_BIT_STATUS_REASON = 0x800000L;
    private static final long OPT_BIT_PRIORITY = 0x1000000L;
    private static final long OPT_BIT_SENDER = 0x2000000L;
    private static final long OPT_BIT_REASON_CODE = 0x4000000L;
    private static final long OPT_BIT_BASED_ON = 0x8000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x20000000L;
    private static final long OPT_BIT_EXTENSION = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Code status;
    private @Nullable Reference requester;
    private @Nullable Identifier groupIdentifier;
    private @Nullable List<Reference> about;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable List<Reference> replaces;
    private @Nullable String occurrenceDateTime;
    private @Nullable List<Reference> recipient;
    private @Nullable List<CodeableConcept> medium;
    private @Nullable Uri implicitRules;
    private @Nullable List<CommunicationRequest_Payload> payload;
    private @Nullable List<Reference> reasonReference;
    private @Nullable String resourceType;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;
    private @Nullable DateTime authoredOn;
    private @Nullable Reference encounter;
    private @Nullable List<CodeableConcept> category;
    private @Nullable List<Annotation> note;
    private @Nullable Boolean doNotPerform;
    private @Nullable Reference subject;
    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept statusReason;
    private @Nullable Code priority;
    private @Nullable Reference sender;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Reference> basedOn;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period occurrencePeriod;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
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
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
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
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requester")
    public final Builder requester(Optional<? extends Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupIdentifier(Identifier groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = Objects.requireNonNull(groupIdentifier, "groupIdentifier");
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupIdentifier")
    public final Builder groupIdentifier(Optional<? extends Identifier> groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = groupIdentifier.orElse(null);
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    public final Builder about(List<Reference> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = Objects.requireNonNull(about, "about");
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("about")
    public final Builder about(Optional<? extends List<Reference>> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = about.orElse(null);
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
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
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
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
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
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
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
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
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(List<Reference> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("replaces")
    public final Builder replaces(Optional<? extends List<Reference>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(List<Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recipient")
    public final Builder recipient(Optional<? extends List<Reference>> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    public final Builder medium(List<CodeableConcept> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = Objects.requireNonNull(medium, "medium");
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medium")
    public final Builder medium(Optional<? extends List<CodeableConcept>> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = medium.orElse(null);
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    public final Builder payload(List<CommunicationRequest_Payload> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = Objects.requireNonNull(payload, "payload");
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payload")
    public final Builder payload(Optional<? extends List<CommunicationRequest_Payload>> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = payload.orElse(null);
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the value for the {@link CommunicationRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(DateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authoredOn")
    public final Builder authoredOn(Optional<? extends DateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
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
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
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
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
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
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
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
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    public final Builder doNotPerform(boolean doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform;
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doNotPerform")
    public final Builder doNotPerform(Optional<Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
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
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
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
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
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
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
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
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(Code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends Code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    public final Builder sender(Reference sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = Objects.requireNonNull(sender, "sender");
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sender")
    public final Builder sender(Optional<? extends Reference> sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = sender.orElse(null);
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
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
     * Builds a new {@link CommunicationRequest CommunicationRequest}.
     * @return An immutable instance of CommunicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CommunicationRequest build() {
      checkRequiredAttributes();
      return new ImmutableCommunicationRequest(
          status,
          requester,
          groupIdentifier,
          about,
          id,
          language,
          replaces,
          occurrenceDateTime,
          recipient,
          medium,
          implicitRules,
          payload,
          reasonReference,
          resourceType,
          contained,
          identifier,
          authoredOn,
          encounter,
          category,
          note,
          doNotPerform,
          subject,
          text,
          meta,
          statusReason,
          priority,
          sender,
          reasonCode,
          basedOn,
          modifierExtension,
          occurrencePeriod,
          extension);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean aboutIsSet() {
      return (optBits & OPT_BIT_ABOUT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean mediumIsSet() {
      return (optBits & OPT_BIT_MEDIUM) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean payloadIsSet() {
      return (optBits & OPT_BIT_PAYLOAD) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean senderIsSet() {
      return (optBits & OPT_BIT_SENDER) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CommunicationRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CommunicationRequest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CommunicationRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CommunicationRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "CommunicationRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(Reference requester);

    /**
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(Optional<? extends Reference> requester);

    /**
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(Optional<? extends Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    BuildFinal about(List<Reference> about);

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal about(Optional<? extends List<Reference>> about);

    /**
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(List<Reference> replaces);

    /**
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(Optional<? extends List<Reference>> replaces);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(List<Reference> recipient);

    /**
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(Optional<? extends List<Reference>> recipient);

    /**
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medium(List<CodeableConcept> medium);

    /**
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medium(Optional<? extends List<CodeableConcept>> medium);

    /**
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payload(List<CommunicationRequest_Payload> payload);

    /**
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payload(Optional<? extends List<CommunicationRequest_Payload>> payload);

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(DateTime authoredOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(Optional<? extends DateTime> authoredOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doNotPerform(boolean doNotPerform);

    /**
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doNotPerform(Optional<Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sender(Reference sender);

    /**
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sender(Optional<? extends Reference> sender);

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link CommunicationRequest CommunicationRequest}.
     * @return An immutable instance of CommunicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CommunicationRequest build();
  }
}
