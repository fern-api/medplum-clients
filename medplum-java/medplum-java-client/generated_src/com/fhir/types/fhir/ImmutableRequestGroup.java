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
 * Immutable implementation of {@link RequestGroup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestGroup.builder()}.
 */
@Generated(from = "RequestGroup", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRequestGroup implements RequestGroup {
  private final @Nullable List<Reference> basedOn;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable Reference author;
  private final @Nullable Reference encounter;
  private final @Nullable Reference subject;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> replaces;
  private final @Nullable Code intent;
  private final @Nullable DateTime authoredOn;
  private final @Nullable List<RequestGroup_Action> action;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;
  private final @Nullable Code status;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final @Nullable Id id;
  private final @Nullable List<Annotation> note;
  private final @Nullable Identifier groupIdentifier;
  private final @Nullable Code language;
  private final @Nullable Code priority;

  private ImmutableRequestGroup(
      @Nullable List<Reference> basedOn,
      @Nullable List<ResourceList> contained,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable Reference author,
      @Nullable Reference encounter,
      @Nullable Reference subject,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> replaces,
      @Nullable Code intent,
      @Nullable DateTime authoredOn,
      @Nullable List<RequestGroup_Action> action,
      @Nullable CodeableConcept code,
      @Nullable List<Reference> reasonReference,
      @Nullable List<Uri> instantiatesUri,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      String resourceType,
      @Nullable Code status,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Meta meta,
      @Nullable Narrative text,
      @Nullable Id id,
      @Nullable List<Annotation> note,
      @Nullable Identifier groupIdentifier,
      @Nullable Code language,
      @Nullable Code priority) {
    this.basedOn = basedOn;
    this.contained = contained;
    this.instantiatesCanonical = instantiatesCanonical;
    this.author = author;
    this.encounter = encounter;
    this.subject = subject;
    this.identifier = identifier;
    this.replaces = replaces;
    this.intent = intent;
    this.authoredOn = authoredOn;
    this.action = action;
    this.code = code;
    this.reasonReference = reasonReference;
    this.instantiatesUri = instantiatesUri;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.status = status;
    this.reasonCode = reasonCode;
    this.meta = meta;
    this.text = text;
    this.id = id;
    this.note = note;
    this.groupIdentifier = groupIdentifier;
    this.language = language;
    this.priority = priority;
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code replaces} attribute
   */
  @JsonProperty("replaces")
  @Override
  public Optional<List<Reference>> replaces() {
    return Optional.ofNullable(replaces);
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
   * @return The value of the {@code authoredOn} attribute
   */
  @JsonProperty("authoredOn")
  @Override
  public Optional<DateTime> authoredOn() {
    return Optional.ofNullable(authoredOn);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<List<RequestGroup_Action>> action() {
    return Optional.ofNullable(action);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableRequestGroup(
        newValue,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableRequestGroup(
        value,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        newValue,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        value,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        newValue,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        value,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        newValue,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        value,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        newValue,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        value,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        newValue,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        value,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        newValue,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        value,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withReplaces(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        newValue,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withReplaces(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        value,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withIntent(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        newValue,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withIntent(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        value,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withAuthoredOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        newValue,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withAuthoredOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        value,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withAction(List<RequestGroup_Action> value) {
    @Nullable List<RequestGroup_Action> newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        newValue,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withAction(Optional<? extends List<RequestGroup_Action>> optional) {
    @Nullable List<RequestGroup_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        value,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        newValue,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        value,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        newValue,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        value,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        newValue,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        value,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        newValue,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        value,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        newValue,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        value,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RequestGroup#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRequestGroup withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        newValue,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        value,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        newValue,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        value,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        newValue,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        value,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        newValue,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        value,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        newValue,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        value,
        this.note,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        newValue,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        value,
        this.groupIdentifier,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withGroupIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        newValue,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withGroupIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        value,
        this.language,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        newValue,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        value,
        this.priority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableRequestGroup(
        this.basedOn,
        this.contained,
        this.instantiatesCanonical,
        this.author,
        this.encounter,
        this.subject,
        this.identifier,
        this.replaces,
        this.intent,
        this.authoredOn,
        this.action,
        this.code,
        this.reasonReference,
        this.instantiatesUri,
        this.implicitRules,
        this.extension,
        this.modifierExtension,
        this.resourceType,
        this.status,
        this.reasonCode,
        this.meta,
        this.text,
        this.id,
        this.note,
        this.groupIdentifier,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestGroup
        && equalTo((ImmutableRequestGroup) another);
  }

  private boolean equalTo(ImmutableRequestGroup another) {
    return Objects.equals(basedOn, another.basedOn)
        && Objects.equals(contained, another.contained)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(author, another.author)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(subject, another.subject)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(replaces, another.replaces)
        && Objects.equals(intent, another.intent)
        && Objects.equals(authoredOn, another.authoredOn)
        && Objects.equals(action, another.action)
        && Objects.equals(code, another.code)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && Objects.equals(status, another.status)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id)
        && Objects.equals(note, another.note)
        && Objects.equals(groupIdentifier, another.groupIdentifier)
        && Objects.equals(language, another.language)
        && Objects.equals(priority, another.priority);
  }

  /**
   * Computes a hash code from attributes: {@code basedOn}, {@code contained}, {@code instantiatesCanonical}, {@code author}, {@code encounter}, {@code subject}, {@code identifier}, {@code replaces}, {@code intent}, {@code authoredOn}, {@code action}, {@code code}, {@code reasonReference}, {@code instantiatesUri}, {@code implicitRules}, {@code extension}, {@code modifierExtension}, {@code resourceType}, {@code status}, {@code reasonCode}, {@code meta}, {@code text}, {@code id}, {@code note}, {@code groupIdentifier}, {@code language}, {@code priority}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(replaces);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(authoredOn);
    h += (h << 5) + Objects.hashCode(action);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(groupIdentifier);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(priority);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestGroup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RequestGroup{");
    if (basedOn != null) {
      builder.append("basedOn=").append(basedOn);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (author != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (encounter != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (subject != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (identifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (replaces != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (intent != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (authoredOn != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (action != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("action=").append(action);
    }
    if (code != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (reasonReference != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (groupIdentifier != null) {
      builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RequestGroup", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RequestGroup {
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> replaces = Optional.empty();
    boolean replacesIsSet;
    @Nullable Optional<Code> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<DateTime> authoredOn = Optional.empty();
    boolean authoredOnIsSet;
    @Nullable Optional<List<RequestGroup_Action>> action = Optional.empty();
    boolean actionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Identifier> groupIdentifier = Optional.empty();
    boolean groupIdentifierIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("replaces")
    public void setReplaces(Optional<List<Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<Code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("authoredOn")
    public void setAuthoredOn(Optional<DateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(Optional<List<RequestGroup_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
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
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("groupIdentifier")
    public void setGroupIdentifier(Optional<Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RequestGroup_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRequestGroup fromJson(Json json) {
    ImmutableRequestGroup.Builder builder = ((ImmutableRequestGroup.Builder) ImmutableRequestGroup.builder());
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    return (ImmutableRequestGroup) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RequestGroup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RequestGroup instance
   */
  public static RequestGroup copyOf(RequestGroup instance) {
    if (instance instanceof ImmutableRequestGroup) {
      return (ImmutableRequestGroup) instance;
    }
    return ((ImmutableRequestGroup.Builder) ImmutableRequestGroup.builder())
        .basedOn(instance.basedOn())
        .contained(instance.contained())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .author(instance.author())
        .encounter(instance.encounter())
        .subject(instance.subject())
        .identifier(instance.identifier())
        .replaces(instance.replaces())
        .intent(instance.intent())
        .authoredOn(instance.authoredOn())
        .action(instance.action())
        .code(instance.code())
        .reasonReference(instance.reasonReference())
        .instantiatesUri(instance.instantiatesUri())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .status(instance.status())
        .reasonCode(instance.reasonCode())
        .meta(instance.meta())
        .text(instance.text())
        .id(instance.id())
        .note(instance.note())
        .groupIdentifier(instance.groupIdentifier())
        .language(instance.language())
        .priority(instance.priority())
        .build();
  }

  /**
   * Creates a builder for {@link RequestGroup RequestGroup}.
   * <pre>
   * ImmutableRequestGroup.builder()
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link RequestGroup#basedOn() basedOn}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link RequestGroup#contained() contained}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link RequestGroup#instantiatesCanonical() instantiatesCanonical}
   *    .author(com.fhir.types.fhir.Reference) // optional {@link RequestGroup#author() author}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link RequestGroup#encounter() encounter}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link RequestGroup#subject() subject}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link RequestGroup#identifier() identifier}
   *    .replaces(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link RequestGroup#replaces() replaces}
   *    .intent(com.fhir.types.fhir.Code) // optional {@link RequestGroup#intent() intent}
   *    .authoredOn(com.fhir.types.fhir.DateTime) // optional {@link RequestGroup#authoredOn() authoredOn}
   *    .action(List&amp;lt;com.fhir.types.fhir.RequestGroup_Action&amp;gt;) // optional {@link RequestGroup#action() action}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link RequestGroup#code() code}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link RequestGroup#reasonReference() reasonReference}
   *    .instantiatesUri(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link RequestGroup#instantiatesUri() instantiatesUri}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link RequestGroup#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RequestGroup#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RequestGroup#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link RequestGroup#resourceType() resourceType}
   *    .status(com.fhir.types.fhir.Code) // optional {@link RequestGroup#status() status}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link RequestGroup#reasonCode() reasonCode}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link RequestGroup#meta() meta}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link RequestGroup#text() text}
   *    .id(com.fhir.types.fhir.Id) // optional {@link RequestGroup#id() id}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link RequestGroup#note() note}
   *    .groupIdentifier(com.fhir.types.fhir.Identifier) // optional {@link RequestGroup#groupIdentifier() groupIdentifier}
   *    .language(com.fhir.types.fhir.Code) // optional {@link RequestGroup#language() language}
   *    .priority(com.fhir.types.fhir.Code) // optional {@link RequestGroup#priority() priority}
   *    .build();
   * </pre>
   * @return A new RequestGroup builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableRequestGroup.Builder();
  }

  /**
   * Builds instances of type {@link RequestGroup RequestGroup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RequestGroup", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_BASED_ON = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x4L;
    private static final long OPT_BIT_AUTHOR = 0x8L;
    private static final long OPT_BIT_ENCOUNTER = 0x10L;
    private static final long OPT_BIT_SUBJECT = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_REPLACES = 0x80L;
    private static final long OPT_BIT_INTENT = 0x100L;
    private static final long OPT_BIT_AUTHORED_ON = 0x200L;
    private static final long OPT_BIT_ACTION = 0x400L;
    private static final long OPT_BIT_CODE = 0x800L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x1000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_STATUS = 0x20000L;
    private static final long OPT_BIT_REASON_CODE = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_TEXT = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_NOTE = 0x400000L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x800000L;
    private static final long OPT_BIT_LANGUAGE = 0x1000000L;
    private static final long OPT_BIT_PRIORITY = 0x2000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Reference> basedOn;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable Reference author;
    private @Nullable Reference encounter;
    private @Nullable Reference subject;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> replaces;
    private @Nullable Code intent;
    private @Nullable DateTime authoredOn;
    private @Nullable List<RequestGroup_Action> action;
    private @Nullable CodeableConcept code;
    private @Nullable List<Reference> reasonReference;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;
    private @Nullable Code status;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable Id id;
    private @Nullable List<Annotation> note;
    private @Nullable Identifier groupIdentifier;
    private @Nullable Code language;
    private @Nullable Code priority;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
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
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
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
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link RequestGroup#author() author} to author.
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
     * Initializes the optional value {@link RequestGroup#author() author} to author.
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
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
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
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
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
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
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
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
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
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
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
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
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
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(List<RequestGroup_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends List<RequestGroup_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#code() code} to code.
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
     * Initializes the optional value {@link RequestGroup#code() code} to code.
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
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link RequestGroup#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link RequestGroup#status() status} to status.
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
     * Initializes the optional value {@link RequestGroup#status() status} to status.
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
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
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
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
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
     * Initializes the optional value {@link RequestGroup#text() text} to text.
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
     * Initializes the optional value {@link RequestGroup#text() text} to text.
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
     * Initializes the optional value {@link RequestGroup#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup#note() note} to note.
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
     * Initializes the optional value {@link RequestGroup#note() note} to note.
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
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link RequestGroup#language() language} to language.
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
     * Initializes the optional value {@link RequestGroup#language() language} to language.
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
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
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
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
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
     * Builds a new {@link RequestGroup RequestGroup}.
     * @return An immutable instance of RequestGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RequestGroup build() {
      checkRequiredAttributes();
      return new ImmutableRequestGroup(
          basedOn,
          contained,
          instantiatesCanonical,
          author,
          encounter,
          subject,
          identifier,
          replaces,
          intent,
          authoredOn,
          action,
          code,
          reasonReference,
          instantiatesUri,
          implicitRules,
          extension,
          modifierExtension,
          resourceType,
          status,
          reasonCode,
          meta,
          text,
          id,
          note,
          groupIdentifier,
          language,
          priority);
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RequestGroup is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build RequestGroup, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "RequestGroup", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link RequestGroup#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "RequestGroup", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link RequestGroup#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link RequestGroup#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(List<Reference> replaces);

    /**
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(Optional<? extends List<Reference>> replaces);

    /**
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(Code intent);

    /**
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends Code> intent);

    /**
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(DateTime authoredOn);

    /**
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(Optional<? extends DateTime> authoredOn);

    /**
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(List<RequestGroup_Action> action);

    /**
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(Optional<? extends List<RequestGroup_Action>> action);

    /**
     * Initializes the optional value {@link RequestGroup#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link RequestGroup#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RequestGroup#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link RequestGroup#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link RequestGroup#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link RequestGroup#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link RequestGroup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link RequestGroup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link RequestGroup#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link RequestGroup#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(Optional<? extends Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link RequestGroup#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link RequestGroup#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Builds a new {@link RequestGroup RequestGroup}.
     * @return An immutable instance of RequestGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RequestGroup build();
  }
}
