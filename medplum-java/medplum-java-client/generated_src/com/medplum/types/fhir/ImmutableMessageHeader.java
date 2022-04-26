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
 * Immutable implementation of {@link MessageHeader}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageHeader.builder()}.
 */
@Generated(from = "MessageHeader", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageHeader implements MessageHeader {
  private final @Nullable Reference responsible;
  private final @Nullable Canonical definition;
  private final @Nullable CodeableConcept reason;
  private final @Nullable Reference enterer;
  private final @Nullable List<MessageHeader_Destination> destination;
  private final @Nullable Id id;
  private final @Nullable Reference sender;
  private final MessageHeader_Source source;
  private final @Nullable List<Reference> focus;
  private final @Nullable List<ResourceList> contained;
  private final String resourceType;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Code language;
  private final @Nullable Uri implicitRules;
  private final @Nullable Coding eventCoding;
  private final @Nullable String eventUri;
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable MessageHeader_Response response;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference author;

  private ImmutableMessageHeader(
      @Nullable Reference responsible,
      @Nullable Canonical definition,
      @Nullable CodeableConcept reason,
      @Nullable Reference enterer,
      @Nullable List<MessageHeader_Destination> destination,
      @Nullable Id id,
      @Nullable Reference sender,
      MessageHeader_Source source,
      @Nullable List<Reference> focus,
      @Nullable List<ResourceList> contained,
      String resourceType,
      @Nullable List<Extension> modifierExtension,
      @Nullable Code language,
      @Nullable Uri implicitRules,
      @Nullable Coding eventCoding,
      @Nullable String eventUri,
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable MessageHeader_Response response,
      @Nullable List<Extension> extension,
      @Nullable Reference author) {
    this.responsible = responsible;
    this.definition = definition;
    this.reason = reason;
    this.enterer = enterer;
    this.destination = destination;
    this.id = id;
    this.sender = sender;
    this.source = source;
    this.focus = focus;
    this.contained = contained;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.implicitRules = implicitRules;
    this.eventCoding = eventCoding;
    this.eventUri = eventUri;
    this.text = text;
    this.meta = meta;
    this.response = response;
    this.extension = extension;
    this.author = author;
  }

  /**
   * @return The value of the {@code responsible} attribute
   */
  @JsonProperty("responsible")
  @Override
  public Optional<Reference> responsible() {
    return Optional.ofNullable(responsible);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<Canonical> definition() {
    return Optional.ofNullable(definition);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<CodeableConcept> reason() {
    return Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code enterer} attribute
   */
  @JsonProperty("enterer")
  @Override
  public Optional<Reference> enterer() {
    return Optional.ofNullable(enterer);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @JsonProperty("destination")
  @Override
  public Optional<List<MessageHeader_Destination>> destination() {
    return Optional.ofNullable(destination);
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
   * @return The value of the {@code sender} attribute
   */
  @JsonProperty("sender")
  @Override
  public Optional<Reference> sender() {
    return Optional.ofNullable(sender);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public MessageHeader_Source source() {
    return source;
  }

  /**
   * @return The value of the {@code focus} attribute
   */
  @JsonProperty("focus")
  @Override
  public Optional<List<Reference>> focus() {
    return Optional.ofNullable(focus);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code eventCoding} attribute
   */
  @JsonProperty("eventCoding")
  @Override
  public Optional<Coding> eventCoding() {
    return Optional.ofNullable(eventCoding);
  }

  /**
   * @return The value of the {@code eventUri} attribute
   */
  @JsonProperty("eventUri")
  @Override
  public Optional<String> eventUri() {
    return Optional.ofNullable(eventUri);
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
   * @return The value of the {@code response} attribute
   */
  @JsonProperty("response")
  @Override
  public Optional<MessageHeader_Response> response() {
    return Optional.ofNullable(response);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withResponsible(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "responsible");
    if (this.responsible == newValue) return this;
    return new ImmutableMessageHeader(
        newValue,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#responsible() responsible} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withResponsible(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.responsible == value) return this;
    return new ImmutableMessageHeader(
        value,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withDefinition(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        newValue,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withDefinition(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        value,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        newValue,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        value,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEnterer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        newValue,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withEnterer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        value,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withDestination(List<MessageHeader_Destination> value) {
    @Nullable List<MessageHeader_Destination> newValue = Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        newValue,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withDestination(Optional<? extends List<MessageHeader_Destination>> optional) {
    @Nullable List<MessageHeader_Destination> value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        value,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        newValue,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        value,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#sender() sender} attribute.
   * @param value The value for sender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withSender(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "sender");
    if (this.sender == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        newValue,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#sender() sender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withSender(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.sender == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        value,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageHeader#source() source} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageHeader withSource(MessageHeader_Source value) {
    if (this.source == value) return this;
    MessageHeader_Source newValue = Objects.requireNonNull(value, "source");
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        newValue,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withFocus(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        newValue,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withFocus(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        value,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        value,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageHeader#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageHeader withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        newValue,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        newValue,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        value,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        newValue,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        value,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#eventCoding() eventCoding} attribute.
   * @param value The value for eventCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEventCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "eventCoding");
    if (this.eventCoding == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        newValue,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#eventCoding() eventCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withEventCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.eventCoding == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        value,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#eventUri() eventUri} attribute.
   * @param value The value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEventUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "eventUri");
    if (Objects.equals(this.eventUri, newValue)) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        newValue,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#eventUri() eventUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEventUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.eventUri, value)) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        value,
        this.text,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        newValue,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        value,
        this.meta,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        newValue,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        value,
        this.response,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withResponse(MessageHeader_Response value) {
    @Nullable MessageHeader_Response newValue = Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        newValue,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withResponse(Optional<? extends MessageHeader_Response> optional) {
    @Nullable MessageHeader_Response value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        value,
        this.extension,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        newValue,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        value,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableMessageHeader(
        this.responsible,
        this.definition,
        this.reason,
        this.enterer,
        this.destination,
        this.id,
        this.sender,
        this.source,
        this.focus,
        this.contained,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.implicitRules,
        this.eventCoding,
        this.eventUri,
        this.text,
        this.meta,
        this.response,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageHeader} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageHeader
        && equalTo((ImmutableMessageHeader) another);
  }

  private boolean equalTo(ImmutableMessageHeader another) {
    return Objects.equals(responsible, another.responsible)
        && Objects.equals(definition, another.definition)
        && Objects.equals(reason, another.reason)
        && Objects.equals(enterer, another.enterer)
        && Objects.equals(destination, another.destination)
        && Objects.equals(id, another.id)
        && Objects.equals(sender, another.sender)
        && source.equals(another.source)
        && Objects.equals(focus, another.focus)
        && Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(language, another.language)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(eventCoding, another.eventCoding)
        && Objects.equals(eventUri, another.eventUri)
        && Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(response, another.response)
        && Objects.equals(extension, another.extension)
        && Objects.equals(author, another.author);
  }

  /**
   * Computes a hash code from attributes: {@code responsible}, {@code definition}, {@code reason}, {@code enterer}, {@code destination}, {@code id}, {@code sender}, {@code source}, {@code focus}, {@code contained}, {@code resourceType}, {@code modifierExtension}, {@code language}, {@code implicitRules}, {@code eventCoding}, {@code eventUri}, {@code text}, {@code meta}, {@code response}, {@code extension}, {@code author}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(responsible);
    h += (h << 5) + Objects.hashCode(definition);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(enterer);
    h += (h << 5) + Objects.hashCode(destination);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(sender);
    h += (h << 5) + source.hashCode();
    h += (h << 5) + Objects.hashCode(focus);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(eventCoding);
    h += (h << 5) + Objects.hashCode(eventUri);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(author);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageHeader} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MessageHeader{");
    if (responsible != null) {
      builder.append("responsible=").append(responsible);
    }
    if (definition != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (reason != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (enterer != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (destination != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sender != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("sender=").append(sender);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("source=").append(source);
    if (focus != null) {
      builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (eventCoding != null) {
      builder.append(", ");
      builder.append("eventCoding=").append(eventCoding);
    }
    if (eventUri != null) {
      builder.append(", ");
      builder.append("eventUri=").append(eventUri);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (response != null) {
      builder.append(", ");
      builder.append("response=").append(response);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MessageHeader", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MessageHeader {
    @Nullable Optional<Reference> responsible = Optional.empty();
    boolean responsibleIsSet;
    @Nullable Optional<Canonical> definition = Optional.empty();
    boolean definitionIsSet;
    @Nullable Optional<CodeableConcept> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<Reference> enterer = Optional.empty();
    boolean entererIsSet;
    @Nullable Optional<List<MessageHeader_Destination>> destination = Optional.empty();
    boolean destinationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> sender = Optional.empty();
    boolean senderIsSet;
    @Nullable MessageHeader_Source source;
    @Nullable Optional<List<Reference>> focus = Optional.empty();
    boolean focusIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Coding> eventCoding = Optional.empty();
    boolean eventCodingIsSet;
    @Nullable Optional<String> eventUri = Optional.empty();
    boolean eventUriIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<MessageHeader_Response> response = Optional.empty();
    boolean responseIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @JsonProperty("responsible")
    public void setResponsible(Optional<Reference> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<Canonical> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<CodeableConcept> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("enterer")
    public void setEnterer(Optional<Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @JsonProperty("destination")
    public void setDestination(Optional<List<MessageHeader_Destination>> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("sender")
    public void setSender(Optional<Reference> sender) {
      this.sender = sender;
      this.senderIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(MessageHeader_Source source) {
      this.source = source;
    }
    @JsonProperty("focus")
    public void setFocus(Optional<List<Reference>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("eventCoding")
    public void setEventCoding(Optional<Coding> eventCoding) {
      this.eventCoding = eventCoding;
      this.eventCodingIsSet = true;
    }
    @JsonProperty("eventUri")
    public void setEventUri(Optional<String> eventUri) {
      this.eventUri = eventUri;
      this.eventUriIsSet = true;
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
    @JsonProperty("response")
    public void setResponse(Optional<MessageHeader_Response> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @Override
    public Optional<Reference> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> definition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MessageHeader_Destination>> destination() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> sender() { throw new UnsupportedOperationException(); }
    @Override
    public MessageHeader_Source source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> eventCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> eventUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MessageHeader_Response> response() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMessageHeader fromJson(Json json) {
    ImmutableMessageHeader.Builder builder = ((ImmutableMessageHeader.Builder) ImmutableMessageHeader.builder());
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.senderIsSet) {
      builder.sender(json.sender);
    }
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.eventCodingIsSet) {
      builder.eventCoding(json.eventCoding);
    }
    if (json.eventUriIsSet) {
      builder.eventUri(json.eventUri);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    return (ImmutableMessageHeader) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageHeader} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageHeader instance
   */
  public static MessageHeader copyOf(MessageHeader instance) {
    if (instance instanceof ImmutableMessageHeader) {
      return (ImmutableMessageHeader) instance;
    }
    return ((ImmutableMessageHeader.Builder) ImmutableMessageHeader.builder())
        .responsible(instance.responsible())
        .definition(instance.definition())
        .reason(instance.reason())
        .enterer(instance.enterer())
        .destination(instance.destination())
        .id(instance.id())
        .sender(instance.sender())
        .source(instance.source())
        .focus(instance.focus())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .implicitRules(instance.implicitRules())
        .eventCoding(instance.eventCoding())
        .eventUri(instance.eventUri())
        .text(instance.text())
        .meta(instance.meta())
        .response(instance.response())
        .extension(instance.extension())
        .author(instance.author())
        .build();
  }

  /**
   * Creates a builder for {@link MessageHeader MessageHeader}.
   * <pre>
   * ImmutableMessageHeader.builder()
   *    .responsible(com.medplum.types.fhir.Reference) // optional {@link MessageHeader#responsible() responsible}
   *    .definition(com.medplum.types.fhir.Canonical) // optional {@link MessageHeader#definition() definition}
   *    .reason(com.medplum.types.fhir.CodeableConcept) // optional {@link MessageHeader#reason() reason}
   *    .enterer(com.medplum.types.fhir.Reference) // optional {@link MessageHeader#enterer() enterer}
   *    .destination(List&amp;lt;com.medplum.types.fhir.MessageHeader_Destination&amp;gt;) // optional {@link MessageHeader#destination() destination}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MessageHeader#id() id}
   *    .sender(com.medplum.types.fhir.Reference) // optional {@link MessageHeader#sender() sender}
   *    .source(com.medplum.types.fhir.MessageHeader_Source) // required {@link MessageHeader#source() source}
   *    .focus(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MessageHeader#focus() focus}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MessageHeader#contained() contained}
   *    .resourceType(String) // required {@link MessageHeader#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader#modifierExtension() modifierExtension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MessageHeader#language() language}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MessageHeader#implicitRules() implicitRules}
   *    .eventCoding(com.medplum.types.fhir.Coding) // optional {@link MessageHeader#eventCoding() eventCoding}
   *    .eventUri(String) // optional {@link MessageHeader#eventUri() eventUri}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MessageHeader#text() text}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MessageHeader#meta() meta}
   *    .response(com.medplum.types.fhir.MessageHeader_Response) // optional {@link MessageHeader#response() response}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader#extension() extension}
   *    .author(com.medplum.types.fhir.Reference) // optional {@link MessageHeader#author() author}
   *    .build();
   * </pre>
   * @return A new MessageHeader builder
   */
  public static SourceBuildStage builder() {
    return new ImmutableMessageHeader.Builder();
  }

  /**
   * Builds instances of type {@link MessageHeader MessageHeader}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MessageHeader", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SourceBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SOURCE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_RESPONSIBLE = 0x1L;
    private static final long OPT_BIT_DEFINITION = 0x2L;
    private static final long OPT_BIT_REASON = 0x4L;
    private static final long OPT_BIT_ENTERER = 0x8L;
    private static final long OPT_BIT_DESTINATION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_SENDER = 0x40L;
    private static final long OPT_BIT_FOCUS = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_EVENT_CODING = 0x1000L;
    private static final long OPT_BIT_EVENT_URI = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_RESPONSE = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_AUTHOR = 0x40000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Reference responsible;
    private @Nullable Canonical definition;
    private @Nullable CodeableConcept reason;
    private @Nullable Reference enterer;
    private @Nullable List<MessageHeader_Destination> destination;
    private @Nullable Id id;
    private @Nullable Reference sender;
    private @Nullable MessageHeader_Source source;
    private @Nullable List<Reference> focus;
    private @Nullable List<ResourceList> contained;
    private @Nullable String resourceType;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Code language;
    private @Nullable Uri implicitRules;
    private @Nullable Coding eventCoding;
    private @Nullable String eventUri;
    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable MessageHeader_Response response;
    private @Nullable List<Extension> extension;
    private @Nullable Reference author;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsible(Reference responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = Objects.requireNonNull(responsible, "responsible");
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responsible")
    public final Builder responsible(Optional<? extends Reference> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(Canonical definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Optional<? extends Canonical> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(CodeableConcept reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    public final Builder enterer(Reference enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = Objects.requireNonNull(enterer, "enterer");
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enterer")
    public final Builder enterer(Optional<? extends Reference> enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = enterer.orElse(null);
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(List<MessageHeader_Destination> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("destination")
    public final Builder destination(Optional<? extends List<MessageHeader_Destination>> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
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
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
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
     * Initializes the value for the {@link MessageHeader#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(MessageHeader_Source source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      initBits &= ~INIT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(List<Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("focus")
    public final Builder focus(Optional<? extends List<Reference>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
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
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
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
     * Initializes the value for the {@link MessageHeader#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader#language() language} to language.
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
     * Initializes the optional value {@link MessageHeader#language() language} to language.
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
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventCoding(Coding eventCoding) {
      checkNotIsSet(eventCodingIsSet(), "eventCoding");
      this.eventCoding = Objects.requireNonNull(eventCoding, "eventCoding");
      optBits |= OPT_BIT_EVENT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("eventCoding")
    public final Builder eventCoding(Optional<? extends Coding> eventCoding) {
      checkNotIsSet(eventCodingIsSet(), "eventCoding");
      this.eventCoding = eventCoding.orElse(null);
      optBits |= OPT_BIT_EVENT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventUri(String eventUri) {
      checkNotIsSet(eventUriIsSet(), "eventUri");
      this.eventUri = Objects.requireNonNull(eventUri, "eventUri");
      optBits |= OPT_BIT_EVENT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("eventUri")
    public final Builder eventUri(Optional<String> eventUri) {
      checkNotIsSet(eventUriIsSet(), "eventUri");
      this.eventUri = eventUri.orElse(null);
      optBits |= OPT_BIT_EVENT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#text() text} to text.
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
     * Initializes the optional value {@link MessageHeader#text() text} to text.
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
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(MessageHeader_Response response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("response")
    public final Builder response(Optional<? extends MessageHeader_Response> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Builds a new {@link MessageHeader MessageHeader}.
     * @return An immutable instance of MessageHeader
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MessageHeader build() {
      checkRequiredAttributes();
      return new ImmutableMessageHeader(
          responsible,
          definition,
          reason,
          enterer,
          destination,
          id,
          sender,
          source,
          focus,
          contained,
          resourceType,
          modifierExtension,
          language,
          implicitRules,
          eventCoding,
          eventUri,
          text,
          meta,
          response,
          extension,
          author);
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean senderIsSet() {
      return (optBits & OPT_BIT_SENDER) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean eventCodingIsSet() {
      return (optBits & OPT_BIT_EVENT_CODING) != 0;
    }

    private boolean eventUriIsSet() {
      return (optBits & OPT_BIT_EVENT_URI) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean sourceIsSet() {
      return (initBits & INIT_BIT_SOURCE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MessageHeader is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!sourceIsSet()) attributes.add("source");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MessageHeader, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MessageHeader", generator = "Immutables")
  public interface SourceBuildStage {
    /**
     * Initializes the value for the {@link MessageHeader#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage source(MessageHeader_Source source);
  }

  @Generated(from = "MessageHeader", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MessageHeader#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MessageHeader", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(Reference responsible);

    /**
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(Optional<? extends Reference> responsible);

    /**
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definition(Canonical definition);

    /**
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(Optional<? extends Canonical> definition);

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(CodeableConcept reason);

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends CodeableConcept> reason);

    /**
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(Reference enterer);

    /**
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(Optional<? extends Reference> enterer);

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(List<MessageHeader_Destination> destination);

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(Optional<? extends List<MessageHeader_Destination>> destination);

    /**
     * Initializes the optional value {@link MessageHeader#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MessageHeader#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sender(Reference sender);

    /**
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sender(Optional<? extends Reference> sender);

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(List<Reference> focus);

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(Optional<? extends List<Reference>> focus);

    /**
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MessageHeader#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MessageHeader#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventCoding(Coding eventCoding);

    /**
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventCoding(Optional<? extends Coding> eventCoding);

    /**
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventUri(String eventUri);

    /**
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventUri(Optional<String> eventUri);

    /**
     * Initializes the optional value {@link MessageHeader#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MessageHeader#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    BuildFinal response(MessageHeader_Response response);

    /**
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal response(Optional<? extends MessageHeader_Response> response);

    /**
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MessageHeader#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link MessageHeader#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Builds a new {@link MessageHeader MessageHeader}.
     * @return An immutable instance of MessageHeader
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MessageHeader build();
  }
}
