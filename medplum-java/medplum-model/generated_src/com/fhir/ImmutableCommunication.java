//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Communication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCommunication.builder()}.
 */
@org.immutables.value.Generated(from = "Communication", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCommunication implements com.fhir.Communication {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.dateTime sent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient;
  private final @javax.annotation.Nullable com.fhir.dateTime received;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> about;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> inResponseTo;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Communication_Payload> payload;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept topic;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> medium;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.Reference sender;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;

  private ImmutableCommunication(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.dateTime sent,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient,
      @javax.annotation.Nullable com.fhir.dateTime received,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> about,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> inResponseTo,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Communication_Payload> payload,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable com.fhir.CodeableConcept topic,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> medium,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.Reference sender,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn) {
    this.reasonReference = reasonReference;
    this.meta = meta;
    this.instantiatesCanonical = instantiatesCanonical;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.sent = sent;
    this.contained = contained;
    this.priority = priority;
    this.recipient = recipient;
    this.received = received;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.text = text;
    this.instantiatesUri = instantiatesUri;
    this.about = about;
    this.encounter = encounter;
    this.implicitRules = implicitRules;
    this.inResponseTo = inResponseTo;
    this.status = status;
    this.reasonCode = reasonCode;
    this.extension = extension;
    this.subject = subject;
    this.payload = payload;
    this.language = language;
    this.partOf = partOf;
    this.statusReason = statusReason;
    this.topic = topic;
    this.medium = medium;
    this.category = category;
    this.note = note;
    this.sender = sender;
    this.basedOn = basedOn;
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code sent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sent")
  @Override
  public java.util.Optional<com.fhir.dateTime> sent() {
    return java.util.Optional.ofNullable(sent);
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
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recipient")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> recipient() {
    return java.util.Optional.ofNullable(recipient);
  }

  /**
   * @return The value of the {@code received} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("received")
  @Override
  public java.util.Optional<com.fhir.dateTime> received() {
    return java.util.Optional.ofNullable(received);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code about} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("about")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> about() {
    return java.util.Optional.ofNullable(about);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code inResponseTo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("inResponseTo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> inResponseTo() {
    return java.util.Optional.ofNullable(inResponseTo);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code payload} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payload")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Communication_Payload>> payload() {
    return java.util.Optional.ofNullable(payload);
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
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code topic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topic")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> topic() {
    return java.util.Optional.ofNullable(topic);
  }

  /**
   * @return The value of the {@code medium} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medium")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium() {
    return java.util.Optional.ofNullable(medium);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code sender} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sender")
  @Override
  public java.util.Optional<com.fhir.Reference> sender() {
    return java.util.Optional.ofNullable(sender);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableCommunication(
        newValue,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableCommunication(
        value,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        newValue,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        value,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        newValue,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        value,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Communication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCommunication withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        newValue,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        newValue,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        value,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#sent() sent} attribute.
   * @param value The value for sent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withSent(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "sent");
    if (this.sent == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        newValue,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#sent() sent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withSent(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.sent == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        value,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        newValue,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        value,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        newValue,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        value,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withRecipient(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        newValue,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withRecipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        value,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#received() received} attribute.
   * @param value The value for received
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withReceived(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "received");
    if (this.received == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        newValue,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#received() received} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for received
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withReceived(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.received == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        value,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        newValue,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        value,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        newValue,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        value,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        newValue,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        value,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        newValue,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        value,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#about() about} attribute.
   * @param value The value for about
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withAbout(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "about");
    if (this.about == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        newValue,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#about() about} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for about
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withAbout(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.about == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        value,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        newValue,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        value,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        newValue,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        value,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#inResponseTo() inResponseTo} attribute.
   * @param value The value for inResponseTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withInResponseTo(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "inResponseTo");
    if (this.inResponseTo == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        newValue,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#inResponseTo() inResponseTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inResponseTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withInResponseTo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.inResponseTo == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        value,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        newValue,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        value,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        newValue,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        value,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        newValue,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        value,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        newValue,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        value,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#payload() payload} attribute.
   * @param value The value for payload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withPayload(java.util.List<com.fhir.Communication_Payload> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Communication_Payload> newValue = java.util.Objects.requireNonNull(value, "payload");
    if (this.payload == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        newValue,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#payload() payload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withPayload(java.util.Optional<? extends java.util.List<com.fhir.Communication_Payload>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Communication_Payload> value = optional.orElse(null);
    if (this.payload == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        value,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        newValue,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        value,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        newValue,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        value,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        newValue,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        value,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withTopic(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        newValue,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withTopic(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        value,
        this.medium,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#medium() medium} attribute.
   * @param value The value for medium
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withMedium(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "medium");
    if (this.medium == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        newValue,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#medium() medium} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medium
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withMedium(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.medium == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        value,
        this.category,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        newValue,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        value,
        this.note,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        newValue,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        value,
        this.sender,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#sender() sender} attribute.
   * @param value The value for sender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withSender(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "sender");
    if (this.sender == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        newValue,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#sender() sender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withSender(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.sender == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        value,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableCommunication(
        this.reasonReference,
        this.meta,
        this.instantiatesCanonical,
        this.resourceType,
        this.identifier,
        this.sent,
        this.contained,
        this.priority,
        this.recipient,
        this.received,
        this.modifierExtension,
        this.id,
        this.text,
        this.instantiatesUri,
        this.about,
        this.encounter,
        this.implicitRules,
        this.inResponseTo,
        this.status,
        this.reasonCode,
        this.extension,
        this.subject,
        this.payload,
        this.language,
        this.partOf,
        this.statusReason,
        this.topic,
        this.medium,
        this.category,
        this.note,
        this.sender,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCommunication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCommunication
        && equalTo((ImmutableCommunication) another);
  }

  private boolean equalTo(ImmutableCommunication another) {
    return java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(sent, another.sent)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(recipient, another.recipient)
        && java.util.Objects.equals(received, another.received)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(about, another.about)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(inResponseTo, another.inResponseTo)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(payload, another.payload)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(medium, another.medium)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(sender, another.sender)
        && java.util.Objects.equals(basedOn, another.basedOn);
  }

  /**
   * Computes a hash code from attributes: {@code reasonReference}, {@code meta}, {@code instantiatesCanonical}, {@code resourceType}, {@code identifier}, {@code sent}, {@code contained}, {@code priority}, {@code recipient}, {@code received}, {@code modifierExtension}, {@code id}, {@code text}, {@code instantiatesUri}, {@code about}, {@code encounter}, {@code implicitRules}, {@code inResponseTo}, {@code status}, {@code reasonCode}, {@code extension}, {@code subject}, {@code payload}, {@code language}, {@code partOf}, {@code statusReason}, {@code topic}, {@code medium}, {@code category}, {@code note}, {@code sender}, {@code basedOn}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(sent);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(recipient);
    h += (h << 5) + java.util.Objects.hashCode(received);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(about);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(inResponseTo);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(payload);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(medium);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(sender);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    return h;
  }

  /**
   * Prints the immutable value {@code Communication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Communication{");
    if (reasonReference != null) {
      builder.append("reasonReference=").append(reasonReference);
    }
    if (meta != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (sent != null) {
      builder.append(", ");
      builder.append("sent=").append(sent);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (recipient != null) {
      builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (received != null) {
      builder.append(", ");
      builder.append("received=").append(received);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (about != null) {
      builder.append(", ");
      builder.append("about=").append(about);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (inResponseTo != null) {
      builder.append(", ");
      builder.append("inResponseTo=").append(inResponseTo);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (payload != null) {
      builder.append(", ");
      builder.append("payload=").append(payload);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (medium != null) {
      builder.append(", ");
      builder.append("medium=").append(medium);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (sender != null) {
      builder.append(", ");
      builder.append("sender=").append(sender);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Communication", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Communication {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> sent = java.util.Optional.empty();
    boolean sentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> recipient = java.util.Optional.empty();
    boolean recipientIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> received = java.util.Optional.empty();
    boolean receivedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> about = java.util.Optional.empty();
    boolean aboutIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> inResponseTo = java.util.Optional.empty();
    boolean inResponseToIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Communication_Payload>> payload = java.util.Optional.empty();
    boolean payloadIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium = java.util.Optional.empty();
    boolean mediumIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> sender = java.util.Optional.empty();
    boolean senderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sent")
    public void setSent(java.util.Optional<com.fhir.dateTime> sent) {
      this.sent = sent;
      this.sentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public void setRecipient(java.util.Optional<java.util.List<com.fhir.Reference>> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("received")
    public void setReceived(java.util.Optional<com.fhir.dateTime> received) {
      this.received = received;
      this.receivedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("about")
    public void setAbout(java.util.Optional<java.util.List<com.fhir.Reference>> about) {
      this.about = about;
      this.aboutIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("inResponseTo")
    public void setInResponseTo(java.util.Optional<java.util.List<com.fhir.Reference>> inResponseTo) {
      this.inResponseTo = inResponseTo;
      this.inResponseToIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    public void setPayload(java.util.Optional<java.util.List<com.fhir.Communication_Payload>> payload) {
      this.payload = payload;
      this.payloadIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<com.fhir.CodeableConcept> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    public void setMedium(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium) {
      this.medium = medium;
      this.mediumIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    public void setSender(java.util.Optional<com.fhir.Reference> sender) {
      this.sender = sender;
      this.senderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> sent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> received() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> about() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> inResponseTo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Communication_Payload>> payload() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> sender() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCommunication fromJson(Json json) {
    ImmutableCommunication.Builder builder = ((ImmutableCommunication.Builder) ImmutableCommunication.builder());
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.sentIsSet) {
      builder.sent(json.sent);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.receivedIsSet) {
      builder.received(json.received);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.aboutIsSet) {
      builder.about(json.about);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.inResponseToIsSet) {
      builder.inResponseTo(json.inResponseTo);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.payloadIsSet) {
      builder.payload(json.payload);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.mediumIsSet) {
      builder.medium(json.medium);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.senderIsSet) {
      builder.sender(json.sender);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    return (ImmutableCommunication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Communication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Communication instance
   */
  public static Communication copyOf(Communication instance) {
    if (instance instanceof ImmutableCommunication) {
      return (ImmutableCommunication) instance;
    }
    return ((ImmutableCommunication.Builder) ImmutableCommunication.builder())
        .reasonReference(instance.reasonReference())
        .meta(instance.meta())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .sent(instance.sent())
        .contained(instance.contained())
        .priority(instance.priority())
        .recipient(instance.recipient())
        .received(instance.received())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .text(instance.text())
        .instantiatesUri(instance.instantiatesUri())
        .about(instance.about())
        .encounter(instance.encounter())
        .implicitRules(instance.implicitRules())
        .inResponseTo(instance.inResponseTo())
        .status(instance.status())
        .reasonCode(instance.reasonCode())
        .extension(instance.extension())
        .subject(instance.subject())
        .payload(instance.payload())
        .language(instance.language())
        .partOf(instance.partOf())
        .statusReason(instance.statusReason())
        .topic(instance.topic())
        .medium(instance.medium())
        .category(instance.category())
        .note(instance.note())
        .sender(instance.sender())
        .basedOn(instance.basedOn())
        .build();
  }

  /**
   * Creates a builder for {@link Communication Communication}.
   * <pre>
   * ImmutableCommunication.builder()
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Communication#reasonReference() reasonReference}
   *    .meta(com.fhir.Meta) // optional {@link Communication#meta() meta}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link Communication#instantiatesCanonical() instantiatesCanonical}
   *    .resourceType(String) // required {@link Communication#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Communication#identifier() identifier}
   *    .sent(com.fhir.dateTime) // optional {@link Communication#sent() sent}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Communication#contained() contained}
   *    .priority(com.fhir.code) // optional {@link Communication#priority() priority}
   *    .recipient(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Communication#recipient() recipient}
   *    .received(com.fhir.dateTime) // optional {@link Communication#received() received}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Communication#modifierExtension() modifierExtension}
   *    .id(com.fhir.id) // optional {@link Communication#id() id}
   *    .text(com.fhir.Narrative) // optional {@link Communication#text() text}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link Communication#instantiatesUri() instantiatesUri}
   *    .about(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Communication#about() about}
   *    .encounter(com.fhir.Reference) // optional {@link Communication#encounter() encounter}
   *    .implicitRules(com.fhir.uri) // optional {@link Communication#implicitRules() implicitRules}
   *    .inResponseTo(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Communication#inResponseTo() inResponseTo}
   *    .status(com.fhir.code) // optional {@link Communication#status() status}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Communication#reasonCode() reasonCode}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Communication#extension() extension}
   *    .subject(com.fhir.Reference) // optional {@link Communication#subject() subject}
   *    .payload(List&amp;lt;com.fhir.Communication_Payload&amp;gt;) // optional {@link Communication#payload() payload}
   *    .language(com.fhir.code) // optional {@link Communication#language() language}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Communication#partOf() partOf}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link Communication#statusReason() statusReason}
   *    .topic(com.fhir.CodeableConcept) // optional {@link Communication#topic() topic}
   *    .medium(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Communication#medium() medium}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Communication#category() category}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Communication#note() note}
   *    .sender(com.fhir.Reference) // optional {@link Communication#sender() sender}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Communication#basedOn() basedOn}
   *    .build();
   * </pre>
   * @return A new Communication builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCommunication.Builder();
  }

  /**
   * Builds instances of type {@link Communication Communication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Communication", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_SENT = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_PRIORITY = 0x40L;
    private static final long OPT_BIT_RECIPIENT = 0x80L;
    private static final long OPT_BIT_RECEIVED = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x1000L;
    private static final long OPT_BIT_ABOUT = 0x2000L;
    private static final long OPT_BIT_ENCOUNTER = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_IN_RESPONSE_TO = 0x10000L;
    private static final long OPT_BIT_STATUS = 0x20000L;
    private static final long OPT_BIT_REASON_CODE = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_SUBJECT = 0x100000L;
    private static final long OPT_BIT_PAYLOAD = 0x200000L;
    private static final long OPT_BIT_LANGUAGE = 0x400000L;
    private static final long OPT_BIT_PART_OF = 0x800000L;
    private static final long OPT_BIT_STATUS_REASON = 0x1000000L;
    private static final long OPT_BIT_TOPIC = 0x2000000L;
    private static final long OPT_BIT_MEDIUM = 0x4000000L;
    private static final long OPT_BIT_CATEGORY = 0x8000000L;
    private static final long OPT_BIT_NOTE = 0x10000000L;
    private static final long OPT_BIT_SENDER = 0x20000000L;
    private static final long OPT_BIT_BASED_ON = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.dateTime sent;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient;
    private @javax.annotation.Nullable com.fhir.dateTime received;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> about;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> inResponseTo;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Communication_Payload> payload;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable com.fhir.CodeableConcept topic;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> medium;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Reference sender;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Communication#meta() meta} to meta.
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
     * Initializes the optional value {@link Communication#meta() meta} to meta.
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
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the value for the {@link Communication#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for chained invocation
     */
    public final Builder sent(com.fhir.dateTime sent) {
      checkNotIsSet(sentIsSet(), "sent");
      this.sent = java.util.Objects.requireNonNull(sent, "sent");
      optBits |= OPT_BIT_SENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sent")
    public final Builder sent(java.util.Optional<? extends com.fhir.dateTime> sent) {
      checkNotIsSet(sentIsSet(), "sent");
      this.sent = sent.orElse(null);
      optBits |= OPT_BIT_SENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#contained() contained} to contained.
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
     * Initializes the optional value {@link Communication#contained() contained} to contained.
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
     * Initializes the optional value {@link Communication#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(java.util.List<com.fhir.Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = java.util.Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public final Builder recipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for chained invocation
     */
    public final Builder received(com.fhir.dateTime received) {
      checkNotIsSet(receivedIsSet(), "received");
      this.received = java.util.Objects.requireNonNull(received, "received");
      optBits |= OPT_BIT_RECEIVED;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("received")
    public final Builder received(java.util.Optional<? extends com.fhir.dateTime> received) {
      checkNotIsSet(receivedIsSet(), "received");
      this.received = received.orElse(null);
      optBits |= OPT_BIT_RECEIVED;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Communication#id() id} to id.
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
     * Initializes the optional value {@link Communication#id() id} to id.
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
     * Initializes the optional value {@link Communication#text() text} to text.
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
     * Initializes the optional value {@link Communication#text() text} to text.
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
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    public final Builder about(java.util.List<com.fhir.Reference> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = java.util.Objects.requireNonNull(about, "about");
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("about")
    public final Builder about(java.util.Optional<? extends java.util.List<com.fhir.Reference>> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = about.orElse(null);
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder inResponseTo(java.util.List<com.fhir.Reference> inResponseTo) {
      checkNotIsSet(inResponseToIsSet(), "inResponseTo");
      this.inResponseTo = java.util.Objects.requireNonNull(inResponseTo, "inResponseTo");
      optBits |= OPT_BIT_IN_RESPONSE_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inResponseTo")
    public final Builder inResponseTo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> inResponseTo) {
      checkNotIsSet(inResponseToIsSet(), "inResponseTo");
      this.inResponseTo = inResponseTo.orElse(null);
      optBits |= OPT_BIT_IN_RESPONSE_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#status() status} to status.
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
     * Initializes the optional value {@link Communication#status() status} to status.
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
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    public final Builder payload(java.util.List<com.fhir.Communication_Payload> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = java.util.Objects.requireNonNull(payload, "payload");
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    public final Builder payload(java.util.Optional<? extends java.util.List<com.fhir.Communication_Payload>> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = payload.orElse(null);
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#language() language} to language.
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
     * Initializes the optional value {@link Communication#language() language} to language.
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
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(com.fhir.CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    public final Builder topic(com.fhir.CodeableConcept topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = java.util.Objects.requireNonNull(topic, "topic");
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public final Builder topic(java.util.Optional<? extends com.fhir.CodeableConcept> topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = topic.orElse(null);
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    public final Builder medium(java.util.List<com.fhir.CodeableConcept> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = java.util.Objects.requireNonNull(medium, "medium");
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    public final Builder medium(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = medium.orElse(null);
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#note() note} to note.
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
     * Initializes the optional value {@link Communication#note() note} to note.
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
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    public final Builder sender(com.fhir.Reference sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = java.util.Objects.requireNonNull(sender, "sender");
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    public final Builder sender(java.util.Optional<? extends com.fhir.Reference> sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = sender.orElse(null);
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Builds a new {@link Communication Communication}.
     * @return An immutable instance of Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Communication build() {
      checkRequiredAttributes();
      return new ImmutableCommunication(
          reasonReference,
          meta,
          instantiatesCanonical,
          resourceType,
          identifier,
          sent,
          contained,
          priority,
          recipient,
          received,
          modifierExtension,
          id,
          text,
          instantiatesUri,
          about,
          encounter,
          implicitRules,
          inResponseTo,
          status,
          reasonCode,
          extension,
          subject,
          payload,
          language,
          partOf,
          statusReason,
          topic,
          medium,
          category,
          note,
          sender,
          basedOn);
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean sentIsSet() {
      return (optBits & OPT_BIT_SENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean receivedIsSet() {
      return (optBits & OPT_BIT_RECEIVED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean aboutIsSet() {
      return (optBits & OPT_BIT_ABOUT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean inResponseToIsSet() {
      return (optBits & OPT_BIT_IN_RESPONSE_TO) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean payloadIsSet() {
      return (optBits & OPT_BIT_PAYLOAD) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean mediumIsSet() {
      return (optBits & OPT_BIT_MEDIUM) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean senderIsSet() {
      return (optBits & OPT_BIT_SENDER) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Communication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Communication, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Communication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Communication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Communication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Communication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Communication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sent(com.fhir.dateTime sent);

    /**
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sent(java.util.Optional<? extends com.fhir.dateTime> sent);

    /**
     * Initializes the optional value {@link Communication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Communication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Communication#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link Communication#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(java.util.List<com.fhir.Reference> recipient);

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> recipient);

    /**
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for chained invocation
     */
    BuildFinal received(com.fhir.dateTime received);

    /**
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal received(java.util.Optional<? extends com.fhir.dateTime> received);

    /**
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Communication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Communication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    BuildFinal about(java.util.List<com.fhir.Reference> about);

    /**
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal about(java.util.Optional<? extends java.util.List<com.fhir.Reference>> about);

    /**
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal inResponseTo(java.util.List<com.fhir.Reference> inResponseTo);

    /**
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal inResponseTo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> inResponseTo);

    /**
     * Initializes the optional value {@link Communication#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link Communication#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payload(java.util.List<com.fhir.Communication_Payload> payload);

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payload(java.util.Optional<? extends java.util.List<com.fhir.Communication_Payload>> payload);

    /**
     * Initializes the optional value {@link Communication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Communication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(com.fhir.CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(com.fhir.CodeableConcept topic);

    /**
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medium(java.util.List<com.fhir.CodeableConcept> medium);

    /**
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medium(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> medium);

    /**
     * Initializes the optional value {@link Communication#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Communication#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Communication#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Communication#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sender(com.fhir.Reference sender);

    /**
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sender(java.util.Optional<? extends com.fhir.Reference> sender);

    /**
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Builds a new {@link Communication Communication}.
     * @return An immutable instance of Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Communication build();
  }
}
