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
  private final @Nullable DateTime receivedTime;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> parent;
  private final @Nullable List<CodeableConcept> condition;
  private final @Nullable Meta meta;
  private final @Nullable Specimen_Collection collection;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Identifier accessionIdentifier;
  private final String resourceType;
  private final @Nullable SpecimenStatus status;
  private final @Nullable List<Specimen_Processing> processing;
  private final @Nullable Id id;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<Reference> request;
  private final @Nullable Reference subject;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Annotation> note;
  private final @Nullable Narrative text;
  private final @Nullable List<Specimen_Container> container;

  private ImmutableSpecimen(
      @Nullable DateTime receivedTime,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> parent,
      @Nullable List<CodeableConcept> condition,
      @Nullable Meta meta,
      @Nullable Specimen_Collection collection,
      @Nullable List<Extension> modifierExtension,
      @Nullable Identifier accessionIdentifier,
      String resourceType,
      @Nullable SpecimenStatus status,
      @Nullable List<Specimen_Processing> processing,
      @Nullable Id id,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<Reference> request,
      @Nullable Reference subject,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable List<Annotation> note,
      @Nullable Narrative text,
      @Nullable List<Specimen_Container> container) {
    this.receivedTime = receivedTime;
    this.contained = contained;
    this.identifier = identifier;
    this.parent = parent;
    this.condition = condition;
    this.meta = meta;
    this.collection = collection;
    this.modifierExtension = modifierExtension;
    this.accessionIdentifier = accessionIdentifier;
    this.resourceType = resourceType;
    this.status = status;
    this.processing = processing;
    this.id = id;
    this.implicitRules = implicitRules;
    this.language = language;
    this.request = request;
    this.subject = subject;
    this.type = type;
    this.extension = extension;
    this.note = note;
    this.text = text;
    this.container = container;
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
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<List<Reference>> parent() {
    return Optional.ofNullable(parent);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
  public Optional<SpecimenStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#receivedTime() receivedTime} attribute.
   * @param value The value for receivedTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withReceivedTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "receivedTime");
    if (this.receivedTime == newValue) return this;
    return new ImmutableSpecimen(
        newValue,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        value,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        newValue,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        value,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        newValue,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        value,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        newValue,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        value,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        newValue,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        value,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        newValue,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        value,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        newValue,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        value,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        newValue,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        value,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        newValue,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        value,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        newValue,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        newValue,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        value,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        newValue,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        value,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        newValue,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        value,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        newValue,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        value,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        newValue,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        value,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        newValue,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        value,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        newValue,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        value,
        this.type,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        newValue,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        value,
        this.extension,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        newValue,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        value,
        this.note,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        newValue,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        value,
        this.text,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        newValue,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        value,
        this.container);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
        newValue);
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
        this.receivedTime,
        this.contained,
        this.identifier,
        this.parent,
        this.condition,
        this.meta,
        this.collection,
        this.modifierExtension,
        this.accessionIdentifier,
        this.resourceType,
        this.status,
        this.processing,
        this.id,
        this.implicitRules,
        this.language,
        this.request,
        this.subject,
        this.type,
        this.extension,
        this.note,
        this.text,
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
    return Objects.equals(receivedTime, another.receivedTime)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(parent, another.parent)
        && Objects.equals(condition, another.condition)
        && Objects.equals(meta, another.meta)
        && Objects.equals(collection, another.collection)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(accessionIdentifier, another.accessionIdentifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(status, another.status)
        && Objects.equals(processing, another.processing)
        && Objects.equals(id, another.id)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(request, another.request)
        && Objects.equals(subject, another.subject)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(note, another.note)
        && Objects.equals(text, another.text)
        && Objects.equals(container, another.container);
  }

  /**
   * Computes a hash code from attributes: {@code receivedTime}, {@code contained}, {@code identifier}, {@code parent}, {@code condition}, {@code meta}, {@code collection}, {@code modifierExtension}, {@code accessionIdentifier}, {@code resourceType}, {@code status}, {@code processing}, {@code id}, {@code implicitRules}, {@code language}, {@code request}, {@code subject}, {@code type}, {@code extension}, {@code note}, {@code text}, {@code container}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(receivedTime);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(collection);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(accessionIdentifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(processing);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(container);
    return h;
  }

  /**
   * Prints the immutable value {@code Specimen} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Specimen{");
    if (receivedTime != null) {
      builder.append("receivedTime=").append(receivedTime);
    }
    if (contained != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (parent != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (condition != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (meta != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (collection != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("collection=").append(collection);
    }
    if (modifierExtension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (accessionIdentifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("accessionIdentifier=").append(accessionIdentifier);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (processing != null) {
      builder.append(", ");
      builder.append("processing=").append(processing);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (container != null) {
      builder.append(", ");
      builder.append("container=").append(container);
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
    @Nullable Optional<DateTime> receivedTime = Optional.empty();
    boolean receivedTimeIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Optional<List<CodeableConcept>> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Specimen_Collection> collection = Optional.empty();
    boolean collectionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Identifier> accessionIdentifier = Optional.empty();
    boolean accessionIdentifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<SpecimenStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Specimen_Processing>> processing = Optional.empty();
    boolean processingIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Specimen_Container>> container = Optional.empty();
    boolean containerIsSet;
    @JsonProperty("receivedTime")
    public void setReceivedTime(Optional<DateTime> receivedTime) {
      this.receivedTime = receivedTime;
      this.receivedTimeIsSet = true;
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
    @JsonProperty("parent")
    public void setParent(Optional<List<Reference>> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<List<CodeableConcept>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("collection")
    public void setCollection(Optional<Specimen_Collection> collection) {
      this.collection = collection;
      this.collectionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("accessionIdentifier")
    public void setAccessionIdentifier(Optional<Identifier> accessionIdentifier) {
      this.accessionIdentifier = accessionIdentifier;
      this.accessionIdentifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("status")
    public void setStatus(Optional<SpecimenStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("processing")
    public void setProcessing(Optional<List<Specimen_Processing>> processing) {
      this.processing = processing;
      this.processingIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<List<Reference>> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("container")
    public void setContainer(Optional<List<Specimen_Container>> container) {
      this.container = container;
      this.containerIsSet = true;
    }
    @Override
    public Optional<DateTime> receivedTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Specimen_Collection> collection() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> accessionIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SpecimenStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Specimen_Processing>> processing() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Specimen_Container>> container() { throw new UnsupportedOperationException(); }
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
    if (json.receivedTimeIsSet) {
      builder.receivedTime(json.receivedTime);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.collectionIsSet) {
      builder.collection(json.collection);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.accessionIdentifierIsSet) {
      builder.accessionIdentifier(json.accessionIdentifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.processingIsSet) {
      builder.processing(json.processing);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containerIsSet) {
      builder.container(json.container);
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
        .receivedTime(instance.receivedTime())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .parent(instance.parent())
        .condition(instance.condition())
        .meta(instance.meta())
        .collection(instance.collection())
        .modifierExtension(instance.modifierExtension())
        .accessionIdentifier(instance.accessionIdentifier())
        .resourceType(instance.resourceType())
        .status(instance.status())
        .processing(instance.processing())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .request(instance.request())
        .subject(instance.subject())
        .type(instance.type())
        .extension(instance.extension())
        .note(instance.note())
        .text(instance.text())
        .container(instance.container())
        .build();
  }

  /**
   * Creates a builder for {@link Specimen Specimen}.
   * <pre>
   * ImmutableSpecimen.builder()
   *    .receivedTime(com.fhir.types.fhir.DateTime) // optional {@link Specimen#receivedTime() receivedTime}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Specimen#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Specimen#identifier() identifier}
   *    .parent(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Specimen#parent() parent}
   *    .condition(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Specimen#condition() condition}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Specimen#meta() meta}
   *    .collection(com.fhir.types.fhir.Specimen_Collection) // optional {@link Specimen#collection() collection}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Specimen#modifierExtension() modifierExtension}
   *    .accessionIdentifier(com.fhir.types.fhir.Identifier) // optional {@link Specimen#accessionIdentifier() accessionIdentifier}
   *    .resourceType(String) // required {@link Specimen#resourceType() resourceType}
   *    .status(com.fhir.types.fhir.SpecimenStatus) // optional {@link Specimen#status() status}
   *    .processing(List&amp;lt;com.fhir.types.fhir.Specimen_Processing&amp;gt;) // optional {@link Specimen#processing() processing}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Specimen#id() id}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Specimen#implicitRules() implicitRules}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Specimen#language() language}
   *    .request(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Specimen#request() request}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link Specimen#subject() subject}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Specimen#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Specimen#extension() extension}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Specimen#note() note}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Specimen#text() text}
   *    .container(List&amp;lt;com.fhir.types.fhir.Specimen_Container&amp;gt;) // optional {@link Specimen#container() container}
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
    private static final long OPT_BIT_RECEIVED_TIME = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_PARENT = 0x8L;
    private static final long OPT_BIT_CONDITION = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_COLLECTION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_ACCESSION_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_PROCESSING = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_REQUEST = 0x4000L;
    private static final long OPT_BIT_SUBJECT = 0x8000L;
    private static final long OPT_BIT_TYPE = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_NOTE = 0x40000L;
    private static final long OPT_BIT_TEXT = 0x80000L;
    private static final long OPT_BIT_CONTAINER = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable DateTime receivedTime;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> parent;
    private @Nullable List<CodeableConcept> condition;
    private @Nullable Meta meta;
    private @Nullable Specimen_Collection collection;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Identifier accessionIdentifier;
    private @Nullable String resourceType;
    private @Nullable SpecimenStatus status;
    private @Nullable List<Specimen_Processing> processing;
    private @Nullable Id id;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<Reference> request;
    private @Nullable Reference subject;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Annotation> note;
    private @Nullable Narrative text;
    private @Nullable List<Specimen_Container> container;

    private Builder() {
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
     * Builds a new {@link Specimen Specimen}.
     * @return An immutable instance of Specimen
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Specimen build() {
      checkRequiredAttributes();
      return new ImmutableSpecimen(
          receivedTime,
          contained,
          identifier,
          parent,
          condition,
          meta,
          collection,
          modifierExtension,
          accessionIdentifier,
          resourceType,
          status,
          processing,
          id,
          implicitRules,
          language,
          request,
          subject,
          type,
          extension,
          note,
          text,
          container);
    }

    private boolean receivedTimeIsSet() {
      return (optBits & OPT_BIT_RECEIVED_TIME) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean collectionIsSet() {
      return (optBits & OPT_BIT_COLLECTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean accessionIdentifierIsSet() {
      return (optBits & OPT_BIT_ACCESSION_IDENTIFIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean processingIsSet() {
      return (optBits & OPT_BIT_PROCESSING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containerIsSet() {
      return (optBits & OPT_BIT_CONTAINER) != 0;
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
     * Builds a new {@link Specimen Specimen}.
     * @return An immutable instance of Specimen
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Specimen build();
  }
}
