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
 * Immutable implementation of {@link Specimen}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimen.builder()}.
 */
@Generated(from = "Specimen", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimen implements Specimen {
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> parent;
  private final @Nullable List<Annotation> note;
  private final @Nullable Specimen_Collection collection;
  private final @Nullable CodeableConcept type;
  private final @Nullable DateTime receivedTime;
  private final @Nullable List<Specimen_Processing> processing;
  private final @Nullable Reference subject;
  private final @Nullable Identifier accessionIdentifier;
  private final @Nullable List<CodeableConcept> condition;
  private final String resourceType;
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Reference> request;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable SpecimenStatus status;
  private final @Nullable List<Specimen_Container> container;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableSpecimen(
      @Nullable Code language,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> parent,
      @Nullable List<Annotation> note,
      @Nullable Specimen_Collection collection,
      @Nullable CodeableConcept type,
      @Nullable DateTime receivedTime,
      @Nullable List<Specimen_Processing> processing,
      @Nullable Reference subject,
      @Nullable Identifier accessionIdentifier,
      @Nullable List<CodeableConcept> condition,
      String resourceType,
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      @Nullable List<Reference> request,
      @Nullable List<Identifier> identifier,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable SpecimenStatus status,
      @Nullable List<Specimen_Container> container,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension) {
    this.language = language;
    this.extension = extension;
    this.parent = parent;
    this.note = note;
    this.collection = collection;
    this.type = type;
    this.receivedTime = receivedTime;
    this.processing = processing;
    this.subject = subject;
    this.accessionIdentifier = accessionIdentifier;
    this.condition = condition;
    this.resourceType = resourceType;
    this.text = text;
    this.contained = contained;
    this.request = request;
    this.identifier = identifier;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.status = status;
    this.container = container;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<List<Reference>> parent() {
    return Optional.ofNullable(parent);
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
   * @return The value of the {@code collection} attribute
   */
  @JsonProperty("collection")
  @Override
  public Optional<Specimen_Collection> collection() {
    return Optional.ofNullable(collection);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code receivedTime} attribute
   */
  @JsonProperty("receivedTime")
  @Override
  public Optional<DateTime> receivedTime() {
    return Optional.ofNullable(receivedTime);
  }

  /**
   * @return The value of the {@code processing} attribute
   */
  @JsonProperty("processing")
  @Override
  public Optional<List<Specimen_Processing>> processing() {
    return Optional.ofNullable(processing);
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
   * @return The value of the {@code accessionIdentifier} attribute
   */
  @JsonProperty("accessionIdentifier")
  @Override
  public Optional<Identifier> accessionIdentifier() {
    return Optional.ofNullable(accessionIdentifier);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<List<CodeableConcept>> condition() {
    return Optional.ofNullable(condition);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<List<Reference>> request() {
    return Optional.ofNullable(request);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<SpecimenStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code container} attribute
   */
  @JsonProperty("container")
  @Override
  public Optional<List<Specimen_Container>> container() {
    return Optional.ofNullable(container);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSpecimen(
        newValue,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSpecimen(
        value,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        newValue,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimen(
        this.language,
        value,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withParent(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        newValue,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withParent(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        value,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        newValue,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        value,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#collection() collection} attribute.
   * @param value The value for collection
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withCollection(Specimen_Collection value) {
    @Nullable Specimen_Collection newValue = Objects.requireNonNull(value, "collection");
    if (this.collection == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        newValue,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#collection() collection} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collection
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withCollection(Optional<? extends Specimen_Collection> optional) {
    @Nullable Specimen_Collection value = optional.orElse(null);
    if (this.collection == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        value,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        newValue,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        value,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#receivedTime() receivedTime} attribute.
   * @param value The value for receivedTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withReceivedTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "receivedTime");
    if (this.receivedTime == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        newValue,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#receivedTime() receivedTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receivedTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withReceivedTime(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.receivedTime == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        value,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#processing() processing} attribute.
   * @param value The value for processing
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withProcessing(List<Specimen_Processing> value) {
    @Nullable List<Specimen_Processing> newValue = Objects.requireNonNull(value, "processing");
    if (this.processing == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        newValue,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#processing() processing} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processing
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withProcessing(Optional<? extends List<Specimen_Processing>> optional) {
    @Nullable List<Specimen_Processing> value = optional.orElse(null);
    if (this.processing == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        value,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        newValue,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        value,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#accessionIdentifier() accessionIdentifier} attribute.
   * @param value The value for accessionIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withAccessionIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "accessionIdentifier");
    if (this.accessionIdentifier == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        newValue,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#accessionIdentifier() accessionIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accessionIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withAccessionIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.accessionIdentifier == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        value,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withCondition(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        newValue,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withCondition(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        value,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Specimen#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecimen withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        newValue,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        newValue,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        value,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        newValue,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        value,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withRequest(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        newValue,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withRequest(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        value,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        newValue,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        value,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        newValue,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        value,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        newValue,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        value,
        this.status,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withStatus(SpecimenStatus value) {
    @Nullable SpecimenStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        newValue,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withStatus(Optional<? extends SpecimenStatus> optional) {
    @Nullable SpecimenStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        value,
        this.container,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#container() container} attribute.
   * @param value The value for container
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withContainer(List<Specimen_Container> value) {
    @Nullable List<Specimen_Container> newValue = Objects.requireNonNull(value, "container");
    if (this.container == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#container() container} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for container
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withContainer(Optional<? extends List<Specimen_Container>> optional) {
    @Nullable List<Specimen_Container> value = optional.orElse(null);
    if (this.container == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        value,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimen(
        this.language,
        this.extension,
        this.parent,
        this.note,
        this.collection,
        this.type,
        this.receivedTime,
        this.processing,
        this.subject,
        this.accessionIdentifier,
        this.condition,
        this.resourceType,
        this.text,
        this.contained,
        this.request,
        this.identifier,
        this.meta,
        this.implicitRules,
        this.status,
        this.container,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimen} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimen
        && equalTo((ImmutableSpecimen) another);
  }

  private boolean equalTo(ImmutableSpecimen another) {
    return Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && Objects.equals(parent, another.parent)
        && Objects.equals(note, another.note)
        && Objects.equals(collection, another.collection)
        && Objects.equals(type, another.type)
        && Objects.equals(receivedTime, another.receivedTime)
        && Objects.equals(processing, another.processing)
        && Objects.equals(subject, another.subject)
        && Objects.equals(accessionIdentifier, another.accessionIdentifier)
        && Objects.equals(condition, another.condition)
        && resourceType.equals(another.resourceType)
        && Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && Objects.equals(request, another.request)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(status, another.status)
        && Objects.equals(container, another.container)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code extension}, {@code parent}, {@code note}, {@code collection}, {@code type}, {@code receivedTime}, {@code processing}, {@code subject}, {@code accessionIdentifier}, {@code condition}, {@code resourceType}, {@code text}, {@code contained}, {@code request}, {@code identifier}, {@code meta}, {@code implicitRules}, {@code status}, {@code container}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(collection);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(receivedTime);
    h += (h << 5) + Objects.hashCode(processing);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(accessionIdentifier);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(container);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Specimen} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Specimen{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (extension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (parent != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (note != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (collection != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("collection=").append(collection);
    }
    if (type != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (receivedTime != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("receivedTime=").append(receivedTime);
    }
    if (processing != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("processing=").append(processing);
    }
    if (subject != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (accessionIdentifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("accessionIdentifier=").append(accessionIdentifier);
    }
    if (condition != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (container != null) {
      builder.append(", ");
      builder.append("container=").append(container);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Specimen", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Specimen {
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Specimen_Collection> collection = Optional.empty();
    boolean collectionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<DateTime> receivedTime = Optional.empty();
    boolean receivedTimeIsSet;
    @Nullable Optional<List<Specimen_Processing>> processing = Optional.empty();
    boolean processingIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Identifier> accessionIdentifier = Optional.empty();
    boolean accessionIdentifierIsSet;
    @Nullable Optional<List<CodeableConcept>> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Reference>> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<SpecimenStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Specimen_Container>> container = Optional.empty();
    boolean containerIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("parent")
    public void setParent(Optional<List<Reference>> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("collection")
    public void setCollection(Optional<Specimen_Collection> collection) {
      this.collection = collection;
      this.collectionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("receivedTime")
    public void setReceivedTime(Optional<DateTime> receivedTime) {
      this.receivedTime = receivedTime;
      this.receivedTimeIsSet = true;
    }
    @JsonProperty("processing")
    public void setProcessing(Optional<List<Specimen_Processing>> processing) {
      this.processing = processing;
      this.processingIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("accessionIdentifier")
    public void setAccessionIdentifier(Optional<Identifier> accessionIdentifier) {
      this.accessionIdentifier = accessionIdentifier;
      this.accessionIdentifierIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<List<CodeableConcept>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<List<Reference>> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<SpecimenStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("container")
    public void setContainer(Optional<List<Specimen_Container>> container) {
      this.container = container;
      this.containerIsSet = true;
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
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Specimen_Collection> collection() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> receivedTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Specimen_Processing>> processing() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> accessionIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SpecimenStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Specimen_Container>> container() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimen fromJson(Json json) {
    ImmutableSpecimen.Builder builder = ((ImmutableSpecimen.Builder) ImmutableSpecimen.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.collectionIsSet) {
      builder.collection(json.collection);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.receivedTimeIsSet) {
      builder.receivedTime(json.receivedTime);
    }
    if (json.processingIsSet) {
      builder.processing(json.processing);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.accessionIdentifierIsSet) {
      builder.accessionIdentifier(json.accessionIdentifier);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.containerIsSet) {
      builder.container(json.container);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableSpecimen) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Specimen} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Specimen instance
   */
  public static Specimen copyOf(Specimen instance) {
    if (instance instanceof ImmutableSpecimen) {
      return (ImmutableSpecimen) instance;
    }
    return ((ImmutableSpecimen.Builder) ImmutableSpecimen.builder())
        .language(instance.language())
        .extension(instance.extension())
        .parent(instance.parent())
        .note(instance.note())
        .collection(instance.collection())
        .type(instance.type())
        .receivedTime(instance.receivedTime())
        .processing(instance.processing())
        .subject(instance.subject())
        .accessionIdentifier(instance.accessionIdentifier())
        .condition(instance.condition())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .contained(instance.contained())
        .request(instance.request())
        .identifier(instance.identifier())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .status(instance.status())
        .container(instance.container())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Specimen Specimen}.
   * <pre>
   * ImmutableSpecimen.builder()
   *    .language(com.medplum.types.fhir.Code) // optional {@link Specimen#language() language}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Specimen#extension() extension}
   *    .parent(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Specimen#parent() parent}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link Specimen#note() note}
   *    .collection(com.medplum.types.fhir.Specimen_Collection) // optional {@link Specimen#collection() collection}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Specimen#type() type}
   *    .receivedTime(com.medplum.types.fhir.DateTime) // optional {@link Specimen#receivedTime() receivedTime}
   *    .processing(List&amp;lt;com.medplum.types.fhir.Specimen_Processing&amp;gt;) // optional {@link Specimen#processing() processing}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link Specimen#subject() subject}
   *    .accessionIdentifier(com.medplum.types.fhir.Identifier) // optional {@link Specimen#accessionIdentifier() accessionIdentifier}
   *    .condition(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Specimen#condition() condition}
   *    .resourceType(String) // required {@link Specimen#resourceType() resourceType}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Specimen#text() text}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Specimen#contained() contained}
   *    .request(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Specimen#request() request}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Specimen#identifier() identifier}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Specimen#meta() meta}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Specimen#implicitRules() implicitRules}
   *    .status(com.medplum.types.fhir.SpecimenStatus) // optional {@link Specimen#status() status}
   *    .container(List&amp;lt;com.medplum.types.fhir.Specimen_Container&amp;gt;) // optional {@link Specimen#container() container}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Specimen#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Specimen#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Specimen builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSpecimen.Builder();
  }

  /**
   * Builds instances of type {@link Specimen Specimen}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Specimen", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_PARENT = 0x4L;
    private static final long OPT_BIT_NOTE = 0x8L;
    private static final long OPT_BIT_COLLECTION = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_RECEIVED_TIME = 0x40L;
    private static final long OPT_BIT_PROCESSING = 0x80L;
    private static final long OPT_BIT_SUBJECT = 0x100L;
    private static final long OPT_BIT_ACCESSION_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_CONDITION = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_REQUEST = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_STATUS = 0x20000L;
    private static final long OPT_BIT_CONTAINER = 0x40000L;
    private static final long OPT_BIT_ID = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> parent;
    private @Nullable List<Annotation> note;
    private @Nullable Specimen_Collection collection;
    private @Nullable CodeableConcept type;
    private @Nullable DateTime receivedTime;
    private @Nullable List<Specimen_Processing> processing;
    private @Nullable Reference subject;
    private @Nullable Identifier accessionIdentifier;
    private @Nullable List<CodeableConcept> condition;
    private @Nullable String resourceType;
    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Reference> request;
    private @Nullable List<Identifier> identifier;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable SpecimenStatus status;
    private @Nullable List<Specimen_Container> container;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Specimen#language() language} to language.
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
     * Initializes the optional value {@link Specimen#language() language} to language.
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
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
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
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
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
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(List<Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder parent(Optional<? extends List<Reference>> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#note() note} to note.
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
     * Initializes the optional value {@link Specimen#note() note} to note.
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
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    public final Builder collection(Specimen_Collection collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = Objects.requireNonNull(collection, "collection");
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collection")
    public final Builder collection(Optional<? extends Specimen_Collection> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = collection.orElse(null);
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder receivedTime(DateTime receivedTime) {
      checkNotIsSet(receivedTimeIsSet(), "receivedTime");
      this.receivedTime = Objects.requireNonNull(receivedTime, "receivedTime");
      optBits |= OPT_BIT_RECEIVED_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("receivedTime")
    public final Builder receivedTime(Optional<? extends DateTime> receivedTime) {
      checkNotIsSet(receivedTimeIsSet(), "receivedTime");
      this.receivedTime = receivedTime.orElse(null);
      optBits |= OPT_BIT_RECEIVED_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    public final Builder processing(List<Specimen_Processing> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = Objects.requireNonNull(processing, "processing");
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("processing")
    public final Builder processing(Optional<? extends List<Specimen_Processing>> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = processing.orElse(null);
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
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
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
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
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder accessionIdentifier(Identifier accessionIdentifier) {
      checkNotIsSet(accessionIdentifierIsSet(), "accessionIdentifier");
      this.accessionIdentifier = Objects.requireNonNull(accessionIdentifier, "accessionIdentifier");
      optBits |= OPT_BIT_ACCESSION_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("accessionIdentifier")
    public final Builder accessionIdentifier(Optional<? extends Identifier> accessionIdentifier) {
      checkNotIsSet(accessionIdentifierIsSet(), "accessionIdentifier");
      this.accessionIdentifier = accessionIdentifier.orElse(null);
      optBits |= OPT_BIT_ACCESSION_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(List<CodeableConcept> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<? extends List<CodeableConcept>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the value for the {@link Specimen#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Specimen#text() text} to text.
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
     * Initializes the optional value {@link Specimen#text() text} to text.
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
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
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
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
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
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(List<Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends List<Reference>> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
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
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
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
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(SpecimenStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends SpecimenStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for chained invocation
     */
    public final Builder container(List<Specimen_Container> container) {
      checkNotIsSet(containerIsSet(), "container");
      this.container = Objects.requireNonNull(container, "container");
      optBits |= OPT_BIT_CONTAINER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("container")
    public final Builder container(Optional<? extends List<Specimen_Container>> container) {
      checkNotIsSet(containerIsSet(), "container");
      this.container = container.orElse(null);
      optBits |= OPT_BIT_CONTAINER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#id() id} to id.
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
     * Initializes the optional value {@link Specimen#id() id} to id.
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
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Specimen Specimen}.
     * @return An immutable instance of Specimen
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Specimen build() {
      checkRequiredAttributes();
      return new ImmutableSpecimen(
          language,
          extension,
          parent,
          note,
          collection,
          type,
          receivedTime,
          processing,
          subject,
          accessionIdentifier,
          condition,
          resourceType,
          text,
          contained,
          request,
          identifier,
          meta,
          implicitRules,
          status,
          container,
          id,
          modifierExtension);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean collectionIsSet() {
      return (optBits & OPT_BIT_COLLECTION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean receivedTimeIsSet() {
      return (optBits & OPT_BIT_RECEIVED_TIME) != 0;
    }

    private boolean processingIsSet() {
      return (optBits & OPT_BIT_PROCESSING) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean accessionIdentifierIsSet() {
      return (optBits & OPT_BIT_ACCESSION_IDENTIFIER) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean containerIsSet() {
      return (optBits & OPT_BIT_CONTAINER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Specimen is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Specimen, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Specimen", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Specimen#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Specimen", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Specimen#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Specimen#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(List<Reference> parent);

    /**
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(Optional<? extends List<Reference>> parent);

    /**
     * Initializes the optional value {@link Specimen#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Specimen#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    BuildFinal collection(Specimen_Collection collection);

    /**
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal collection(Optional<? extends Specimen_Collection> collection);

    /**
     * Initializes the optional value {@link Specimen#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Specimen#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal receivedTime(DateTime receivedTime);

    /**
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal receivedTime(Optional<? extends DateTime> receivedTime);

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processing(List<Specimen_Processing> processing);

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processing(Optional<? extends List<Specimen_Processing>> processing);

    /**
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accessionIdentifier(Identifier accessionIdentifier);

    /**
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accessionIdentifier(Optional<? extends Identifier> accessionIdentifier);

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(List<CodeableConcept> condition);

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(Optional<? extends List<CodeableConcept>> condition);

    /**
     * Initializes the optional value {@link Specimen#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Specimen#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(List<Reference> request);

    /**
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends List<Reference>> request);

    /**
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(SpecimenStatus status);

    /**
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends SpecimenStatus> status);

    /**
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for chained invocation
     */
    BuildFinal container(List<Specimen_Container> container);

    /**
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal container(Optional<? extends List<Specimen_Container>> container);

    /**
     * Initializes the optional value {@link Specimen#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Specimen#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Specimen Specimen}.
     * @return An immutable instance of Specimen
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Specimen build();
  }
}
