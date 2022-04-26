package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Composition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComposition.builder()}.
 */
@Generated(from = "Composition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableComposition implements Composition {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference subject;
  private final @Nullable String title;
  private final @Nullable DateTime date;
  private final List<Reference> author;
  private final @Nullable Reference encounter;
  private final @Nullable Identifier identifier;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable List<Composition_Attester> attester;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable Code confidentiality;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable Reference custodian;
  private final CodeableConcept type;
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable List<Composition_Event> event;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CompositionStatus status;
  private final @Nullable List<Composition_Section> section;
  private final @Nullable List<Composition_RelatesTo> relatesTo;

  private ImmutableComposition(
      @Nullable List<ResourceList> contained,
      @Nullable Reference subject,
      @Nullable String title,
      @Nullable DateTime date,
      List<Reference> author,
      @Nullable Reference encounter,
      @Nullable Identifier identifier,
      String resourceType,
      @Nullable Id id,
      @Nullable List<Composition_Attester> attester,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> category,
      @Nullable Code confidentiality,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable Reference custodian,
      CodeableConcept type,
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable List<Composition_Event> event,
      @Nullable List<Extension> modifierExtension,
      @Nullable CompositionStatus status,
      @Nullable List<Composition_Section> section,
      @Nullable List<Composition_RelatesTo> relatesTo) {
    this.contained = contained;
    this.subject = subject;
    this.title = title;
    this.date = date;
    this.author = author;
    this.encounter = encounter;
    this.identifier = identifier;
    this.resourceType = resourceType;
    this.id = id;
    this.attester = attester;
    this.implicitRules = implicitRules;
    this.category = category;
    this.confidentiality = confidentiality;
    this.extension = extension;
    this.language = language;
    this.custodian = custodian;
    this.type = type;
    this.text = text;
    this.meta = meta;
    this.event = event;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.section = section;
    this.relatesTo = relatesTo;
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public List<Reference> author() {
    return author;
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code attester} attribute
   */
  @JsonProperty("attester")
  @Override
  public Optional<List<Composition_Attester>> attester() {
    return Optional.ofNullable(attester);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code confidentiality} attribute
   */
  @JsonProperty("confidentiality")
  @Override
  public Optional<Code> confidentiality() {
    return Optional.ofNullable(confidentiality);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code custodian} attribute
   */
  @JsonProperty("custodian")
  @Override
  public Optional<Reference> custodian() {
    return Optional.ofNullable(custodian);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code event} attribute
   */
  @JsonProperty("event")
  @Override
  public Optional<List<Composition_Event>> event() {
    return Optional.ofNullable(event);
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
  public Optional<CompositionStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code section} attribute
   */
  @JsonProperty("section")
  @Override
  public Optional<List<Composition_Section>> section() {
    return Optional.ofNullable(section);
  }

  /**
   * @return The value of the {@code relatesTo} attribute
   */
  @JsonProperty("relatesTo")
  @Override
  public Optional<List<Composition_RelatesTo>> relatesTo() {
    return Optional.ofNullable(relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableComposition(
        newValue,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableComposition(
        value,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        newValue,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableComposition(
        this.contained,
        value,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        newValue,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        value,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        newValue,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        value,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Composition#author() author}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withAuthor(Reference... elements) {
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        newValue,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Composition#author() author}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of author elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withAuthor(Iterable<? extends Reference> elements) {
    if (this.author == elements) return this;
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        newValue,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        newValue,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        value,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        newValue,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        value,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Composition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComposition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        newValue,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        newValue,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        value,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#attester() attester} attribute.
   * @param value The value for attester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withAttester(List<Composition_Attester> value) {
    @Nullable List<Composition_Attester> newValue = Objects.requireNonNull(value, "attester");
    if (this.attester == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        newValue,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#attester() attester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withAttester(Optional<? extends List<Composition_Attester>> optional) {
    @Nullable List<Composition_Attester> value = optional.orElse(null);
    if (this.attester == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        value,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        newValue,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        value,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        newValue,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        value,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#confidentiality() confidentiality} attribute.
   * @param value The value for confidentiality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withConfidentiality(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "confidentiality");
    if (this.confidentiality == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        newValue,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#confidentiality() confidentiality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for confidentiality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withConfidentiality(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.confidentiality == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        value,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        newValue,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        value,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        newValue,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        value,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#custodian() custodian} attribute.
   * @param value The value for custodian
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withCustodian(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "custodian");
    if (this.custodian == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        newValue,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#custodian() custodian} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for custodian
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withCustodian(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.custodian == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        value,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Composition#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComposition withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        newValue,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        newValue,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        value,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        newValue,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        value,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#event() event} attribute.
   * @param value The value for event
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withEvent(List<Composition_Event> value) {
    @Nullable List<Composition_Event> newValue = Objects.requireNonNull(value, "event");
    if (this.event == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        newValue,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#event() event} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for event
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withEvent(Optional<? extends List<Composition_Event>> optional) {
    @Nullable List<Composition_Event> value = optional.orElse(null);
    if (this.event == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        value,
        this.modifierExtension,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        newValue,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        value,
        this.status,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withStatus(CompositionStatus value) {
    @Nullable CompositionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        newValue,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withStatus(Optional<? extends CompositionStatus> optional) {
    @Nullable CompositionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        value,
        this.section,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#section() section} attribute.
   * @param value The value for section
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withSection(List<Composition_Section> value) {
    @Nullable List<Composition_Section> newValue = Objects.requireNonNull(value, "section");
    if (this.section == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        newValue,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#section() section} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for section
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withSection(Optional<? extends List<Composition_Section>> optional) {
    @Nullable List<Composition_Section> value = optional.orElse(null);
    if (this.section == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        value,
        this.relatesTo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#relatesTo() relatesTo} attribute.
   * @param value The value for relatesTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withRelatesTo(List<Composition_RelatesTo> value) {
    @Nullable List<Composition_RelatesTo> newValue = Objects.requireNonNull(value, "relatesTo");
    if (this.relatesTo == newValue) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#relatesTo() relatesTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatesTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withRelatesTo(Optional<? extends List<Composition_RelatesTo>> optional) {
    @Nullable List<Composition_RelatesTo> value = optional.orElse(null);
    if (this.relatesTo == value) return this;
    return new ImmutableComposition(
        this.contained,
        this.subject,
        this.title,
        this.date,
        this.author,
        this.encounter,
        this.identifier,
        this.resourceType,
        this.id,
        this.attester,
        this.implicitRules,
        this.category,
        this.confidentiality,
        this.extension,
        this.language,
        this.custodian,
        this.type,
        this.text,
        this.meta,
        this.event,
        this.modifierExtension,
        this.status,
        this.section,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComposition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComposition
        && equalTo((ImmutableComposition) another);
  }

  private boolean equalTo(ImmutableComposition another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(subject, another.subject)
        && Objects.equals(title, another.title)
        && Objects.equals(date, another.date)
        && author.equals(another.author)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(attester, another.attester)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(category, another.category)
        && Objects.equals(confidentiality, another.confidentiality)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(custodian, another.custodian)
        && type.equals(another.type)
        && Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(event, another.event)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(status, another.status)
        && Objects.equals(section, another.section)
        && Objects.equals(relatesTo, another.relatesTo);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code subject}, {@code title}, {@code date}, {@code author}, {@code encounter}, {@code identifier}, {@code resourceType}, {@code id}, {@code attester}, {@code implicitRules}, {@code category}, {@code confidentiality}, {@code extension}, {@code language}, {@code custodian}, {@code type}, {@code text}, {@code meta}, {@code event}, {@code modifierExtension}, {@code status}, {@code section}, {@code relatesTo}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + author.hashCode();
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(attester);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(confidentiality);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(custodian);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(event);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(section);
    h += (h << 5) + Objects.hashCode(relatesTo);
    return h;
  }

  /**
   * Prints the immutable value {@code Composition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Composition{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (subject != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (title != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (date != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("author=").append(author);
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (attester != null) {
      builder.append(", ");
      builder.append("attester=").append(attester);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (confidentiality != null) {
      builder.append(", ");
      builder.append("confidentiality=").append(confidentiality);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (custodian != null) {
      builder.append(", ");
      builder.append("custodian=").append(custodian);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (event != null) {
      builder.append(", ");
      builder.append("event=").append(event);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (section != null) {
      builder.append(", ");
      builder.append("section=").append(section);
    }
    if (relatesTo != null) {
      builder.append(", ");
      builder.append("relatesTo=").append(relatesTo);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Composition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Composition {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable List<Reference> author = Collections.emptyList();
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Composition_Attester>> attester = Optional.empty();
    boolean attesterIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Code> confidentiality = Optional.empty();
    boolean confidentialityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> custodian = Optional.empty();
    boolean custodianIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Composition_Event>> event = Optional.empty();
    boolean eventIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CompositionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Composition_Section>> section = Optional.empty();
    boolean sectionIsSet;
    @Nullable Optional<List<Composition_RelatesTo>> relatesTo = Optional.empty();
    boolean relatesToIsSet;
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
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(List<Reference> author) {
      this.author = author;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("attester")
    public void setAttester(Optional<List<Composition_Attester>> attester) {
      this.attester = attester;
      this.attesterIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("confidentiality")
    public void setConfidentiality(Optional<Code> confidentiality) {
      this.confidentiality = confidentiality;
      this.confidentialityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("custodian")
    public void setCustodian(Optional<Reference> custodian) {
      this.custodian = custodian;
      this.custodianIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
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
    @JsonProperty("event")
    public void setEvent(Optional<List<Composition_Event>> event) {
      this.event = event;
      this.eventIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CompositionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("section")
    public void setSection(Optional<List<Composition_Section>> section) {
      this.section = section;
      this.sectionIsSet = true;
    }
    @JsonProperty("relatesTo")
    public void setRelatesTo(Optional<List<Composition_RelatesTo>> relatesTo) {
      this.relatesTo = relatesTo;
      this.relatesToIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public List<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Composition_Attester>> attester() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> confidentiality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> custodian() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Composition_Event>> event() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CompositionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Composition_Section>> section() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Composition_RelatesTo>> relatesTo() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableComposition fromJson(Json json) {
    ImmutableComposition.Builder builder = ((ImmutableComposition.Builder) ImmutableComposition.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.author != null) {
      builder.addAllAuthor(json.author);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.attesterIsSet) {
      builder.attester(json.attester);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.confidentialityIsSet) {
      builder.confidentiality(json.confidentiality);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.custodianIsSet) {
      builder.custodian(json.custodian);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.eventIsSet) {
      builder.event(json.event);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.sectionIsSet) {
      builder.section(json.section);
    }
    if (json.relatesToIsSet) {
      builder.relatesTo(json.relatesTo);
    }
    return (ImmutableComposition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Composition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Composition instance
   */
  public static Composition copyOf(Composition instance) {
    if (instance instanceof ImmutableComposition) {
      return (ImmutableComposition) instance;
    }
    return ((ImmutableComposition.Builder) ImmutableComposition.builder())
        .contained(instance.contained())
        .subject(instance.subject())
        .title(instance.title())
        .date(instance.date())
        .addAllAuthor(instance.author())
        .encounter(instance.encounter())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .attester(instance.attester())
        .implicitRules(instance.implicitRules())
        .category(instance.category())
        .confidentiality(instance.confidentiality())
        .extension(instance.extension())
        .language(instance.language())
        .custodian(instance.custodian())
        .type(instance.type())
        .text(instance.text())
        .meta(instance.meta())
        .event(instance.event())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .section(instance.section())
        .relatesTo(instance.relatesTo())
        .build();
  }

  /**
   * Creates a builder for {@link Composition Composition}.
   * <pre>
   * ImmutableComposition.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Composition#contained() contained}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link Composition#subject() subject}
   *    .title(String) // optional {@link Composition#title() title}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link Composition#date() date}
   *    .addAuthor|addAllAuthor(com.medplum.types.fhir.Reference) // {@link Composition#author() author} elements
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link Composition#encounter() encounter}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link Composition#identifier() identifier}
   *    .resourceType(String) // required {@link Composition#resourceType() resourceType}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Composition#id() id}
   *    .attester(List&amp;lt;com.medplum.types.fhir.Composition_Attester&amp;gt;) // optional {@link Composition#attester() attester}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Composition#implicitRules() implicitRules}
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Composition#category() category}
   *    .confidentiality(com.medplum.types.fhir.Code) // optional {@link Composition#confidentiality() confidentiality}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Composition#extension() extension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Composition#language() language}
   *    .custodian(com.medplum.types.fhir.Reference) // optional {@link Composition#custodian() custodian}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link Composition#type() type}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Composition#text() text}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Composition#meta() meta}
   *    .event(List&amp;lt;com.medplum.types.fhir.Composition_Event&amp;gt;) // optional {@link Composition#event() event}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Composition#modifierExtension() modifierExtension}
   *    .status(com.medplum.types.fhir.CompositionStatus) // optional {@link Composition#status() status}
   *    .section(List&amp;lt;com.medplum.types.fhir.Composition_Section&amp;gt;) // optional {@link Composition#section() section}
   *    .relatesTo(List&amp;lt;com.medplum.types.fhir.Composition_RelatesTo&amp;gt;) // optional {@link Composition#relatesTo() relatesTo}
   *    .build();
   * </pre>
   * @return A new Composition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableComposition.Builder();
  }

  /**
   * Builds instances of type {@link Composition Composition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Composition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_TITLE = 0x4L;
    private static final long OPT_BIT_DATE = 0x8L;
    private static final long OPT_BIT_ENCOUNTER = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_ATTESTER = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_CATEGORY = 0x200L;
    private static final long OPT_BIT_CONFIDENTIALITY = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_CUSTODIAN = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_EVENT = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_STATUS = 0x40000L;
    private static final long OPT_BIT_SECTION = 0x80000L;
    private static final long OPT_BIT_RELATES_TO = 0x100000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable Reference subject;
    private @Nullable String title;
    private @Nullable DateTime date;
    private final List<Reference> author = new ArrayList<Reference>();
    private @Nullable Reference encounter;
    private @Nullable Identifier identifier;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable List<Composition_Attester> attester;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> category;
    private @Nullable Code confidentiality;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable Reference custodian;
    private @Nullable CodeableConcept type;
    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable List<Composition_Event> event;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CompositionStatus status;
    private @Nullable List<Composition_Section> section;
    private @Nullable List<Composition_RelatesTo> relatesTo;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Composition#contained() contained} to contained.
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
     * Initializes the optional value {@link Composition#contained() contained} to contained.
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
     * Initializes the optional value {@link Composition#subject() subject} to subject.
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
     * Initializes the optional value {@link Composition#subject() subject} to subject.
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
     * Initializes the optional value {@link Composition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#date() date} to date.
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
     * Initializes the optional value {@link Composition#date() date} to date.
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
     * Adds one element to {@link Composition#author() author} list.
     * @param element A author element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuthor(Reference element) {
      this.author.add(Objects.requireNonNull(element, "author element"));
      return this;
    }

    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An array of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuthor(Reference... elements) {
      for (Reference element : elements) {
        this.author.add(Objects.requireNonNull(element, "author element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An iterable of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAuthor(Iterable<? extends Reference> elements) {
      for (Reference element : elements) {
        this.author.add(Objects.requireNonNull(element, "author element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link Composition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Composition#id() id} to id.
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
     * Initializes the optional value {@link Composition#id() id} to id.
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
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for chained invocation
     */
    public final Builder attester(List<Composition_Attester> attester) {
      checkNotIsSet(attesterIsSet(), "attester");
      this.attester = Objects.requireNonNull(attester, "attester");
      optBits |= OPT_BIT_ATTESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attester")
    public final Builder attester(Optional<? extends List<Composition_Attester>> attester) {
      checkNotIsSet(attesterIsSet(), "attester");
      this.attester = attester.orElse(null);
      optBits |= OPT_BIT_ATTESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Composition#category() category} to category.
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
     * Initializes the optional value {@link Composition#category() category} to category.
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
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for chained invocation
     */
    public final Builder confidentiality(Code confidentiality) {
      checkNotIsSet(confidentialityIsSet(), "confidentiality");
      this.confidentiality = Objects.requireNonNull(confidentiality, "confidentiality");
      optBits |= OPT_BIT_CONFIDENTIALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("confidentiality")
    public final Builder confidentiality(Optional<? extends Code> confidentiality) {
      checkNotIsSet(confidentialityIsSet(), "confidentiality");
      this.confidentiality = confidentiality.orElse(null);
      optBits |= OPT_BIT_CONFIDENTIALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition#language() language} to language.
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
     * Initializes the optional value {@link Composition#language() language} to language.
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
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    public final Builder custodian(Reference custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = Objects.requireNonNull(custodian, "custodian");
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("custodian")
    public final Builder custodian(Optional<? extends Reference> custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = custodian.orElse(null);
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the value for the {@link Composition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#text() text} to text.
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
     * Initializes the optional value {@link Composition#text() text} to text.
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
     * Initializes the optional value {@link Composition#meta() meta} to meta.
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
     * Initializes the optional value {@link Composition#meta() meta} to meta.
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
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    public final Builder event(List<Composition_Event> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = Objects.requireNonNull(event, "event");
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("event")
    public final Builder event(Optional<? extends List<Composition_Event>> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = event.orElse(null);
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CompositionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CompositionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for chained invocation
     */
    public final Builder section(List<Composition_Section> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = Objects.requireNonNull(section, "section");
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("section")
    public final Builder section(Optional<? extends List<Composition_Section>> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = section.orElse(null);
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatesTo(List<Composition_RelatesTo> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = Objects.requireNonNull(relatesTo, "relatesTo");
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatesTo")
    public final Builder relatesTo(Optional<? extends List<Composition_RelatesTo>> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = relatesTo.orElse(null);
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Builds a new {@link Composition Composition}.
     * @return An immutable instance of Composition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Composition build() {
      checkRequiredAttributes();
      return new ImmutableComposition(
          contained,
          subject,
          title,
          date,
          createUnmodifiableList(true, author),
          encounter,
          identifier,
          resourceType,
          id,
          attester,
          implicitRules,
          category,
          confidentiality,
          extension,
          language,
          custodian,
          type,
          text,
          meta,
          event,
          modifierExtension,
          status,
          section,
          relatesTo);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean attesterIsSet() {
      return (optBits & OPT_BIT_ATTESTER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean confidentialityIsSet() {
      return (optBits & OPT_BIT_CONFIDENTIALITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean custodianIsSet() {
      return (optBits & OPT_BIT_CUSTODIAN) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean eventIsSet() {
      return (optBits & OPT_BIT_EVENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean sectionIsSet() {
      return (optBits & OPT_BIT_SECTION) != 0;
    }

    private boolean relatesToIsSet() {
      return (optBits & OPT_BIT_RELATES_TO) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Composition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build Composition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Composition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Composition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Composition", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Composition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "Composition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Composition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Composition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Composition#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link Composition#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link Composition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link Composition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link Composition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link Composition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Adds one element to {@link Composition#author() author} list.
     * @param element A author element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAuthor(Reference element);

    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An array of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAuthor(Reference... elements);

    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An iterable of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAuthor(Iterable<? extends Reference> elements);

    /**
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link Composition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Composition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal attester(List<Composition_Attester> attester);

    /**
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attester(Optional<? extends List<Composition_Attester>> attester);

    /**
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Composition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link Composition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal confidentiality(Code confidentiality);

    /**
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal confidentiality(Optional<? extends Code> confidentiality);

    /**
     * Initializes the optional value {@link Composition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Composition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Composition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Composition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    BuildFinal custodian(Reference custodian);

    /**
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal custodian(Optional<? extends Reference> custodian);

    /**
     * Initializes the optional value {@link Composition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Composition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Composition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Composition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    BuildFinal event(List<Composition_Event> event);

    /**
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal event(Optional<? extends List<Composition_Event>> event);

    /**
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CompositionStatus status);

    /**
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CompositionStatus> status);

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for chained invocation
     */
    BuildFinal section(List<Composition_Section> section);

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal section(Optional<? extends List<Composition_Section>> section);

    /**
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatesTo(List<Composition_RelatesTo> relatesTo);

    /**
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatesTo(Optional<? extends List<Composition_RelatesTo>> relatesTo);

    /**
     * Builds a new {@link Composition Composition}.
     * @return An immutable instance of Composition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Composition build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
