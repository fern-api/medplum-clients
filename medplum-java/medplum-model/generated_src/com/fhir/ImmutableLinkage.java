//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Linkage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLinkage.builder()}.
 */
@org.immutables.value.Generated(from = "Linkage", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLinkage implements com.fhir.Linkage {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final java.util.List<com.fhir.Linkage_Item> item;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;

  private ImmutableLinkage(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference author,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.code language,
      java.util.List<com.fhir.Linkage_Item> item,
      @javax.annotation.Nullable com.fhir.uri implicitRules) {
    this.modifierExtension = modifierExtension;
    this.author = author;
    this.extension = extension;
    this.active = active;
    this.contained = contained;
    this.id = id;
    this.meta = meta;
    this.resourceType = resourceType;
    this.text = text;
    this.language = language;
    this.item = item;
    this.implicitRules = implicitRules;
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<com.fhir.Reference> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.List<com.fhir.Linkage_Item> item() {
    return item;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLinkage(
        newValue,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLinkage(
        value,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        newValue,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        value,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        newValue,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        value,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        newValue,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        value,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        newValue,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        value,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        newValue,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        value,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        newValue,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        value,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Linkage#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLinkage withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        newValue,
        this.text,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        newValue,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        value,
        this.language,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        newValue,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        value,
        this.item,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Linkage#item() item}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withItem(com.fhir.Linkage_Item... elements) {
    java.util.List<com.fhir.Linkage_Item> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Linkage#item() item}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of item elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withItem(Iterable<? extends com.fhir.Linkage_Item> elements) {
    if (this.item == elements) return this;
    java.util.List<com.fhir.Linkage_Item> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableLinkage(
        this.modifierExtension,
        this.author,
        this.extension,
        this.active,
        this.contained,
        this.id,
        this.meta,
        this.resourceType,
        this.text,
        this.language,
        this.item,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLinkage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLinkage
        && equalTo((ImmutableLinkage) another);
  }

  private boolean equalTo(ImmutableLinkage another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(language, another.language)
        && item.equals(another.item)
        && java.util.Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code author}, {@code extension}, {@code active}, {@code contained}, {@code id}, {@code meta}, {@code resourceType}, {@code text}, {@code language}, {@code item}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + item.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code Linkage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Linkage{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (author != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (extension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (active != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (contained != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("item=").append(item);
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
  @org.immutables.value.Generated(from = "Linkage", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Linkage {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Linkage_Item> item = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.List<com.fhir.Linkage_Item> item) {
      this.item = item;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Linkage_Item> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableLinkage fromJson(Json json) {
    ImmutableLinkage.Builder builder = ((ImmutableLinkage.Builder) ImmutableLinkage.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.item != null) {
      builder.addAllItem(json.item);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableLinkage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Linkage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Linkage instance
   */
  public static Linkage copyOf(Linkage instance) {
    if (instance instanceof ImmutableLinkage) {
      return (ImmutableLinkage) instance;
    }
    return ((ImmutableLinkage.Builder) ImmutableLinkage.builder())
        .modifierExtension(instance.modifierExtension())
        .author(instance.author())
        .extension(instance.extension())
        .active(instance.active())
        .contained(instance.contained())
        .id(instance.id())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .language(instance.language())
        .addAllItem(instance.item())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link Linkage Linkage}.
   * <pre>
   * ImmutableLinkage.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Linkage#modifierExtension() modifierExtension}
   *    .author(com.fhir.Reference) // optional {@link Linkage#author() author}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Linkage#extension() extension}
   *    .active(Boolean) // optional {@link Linkage#active() active}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Linkage#contained() contained}
   *    .id(com.fhir.id) // optional {@link Linkage#id() id}
   *    .meta(com.fhir.Meta) // optional {@link Linkage#meta() meta}
   *    .resourceType(String) // required {@link Linkage#resourceType() resourceType}
   *    .text(com.fhir.Narrative) // optional {@link Linkage#text() text}
   *    .language(com.fhir.code) // optional {@link Linkage#language() language}
   *    .addItem|addAllItem(com.fhir.Linkage_Item) // {@link Linkage#item() item} elements
   *    .implicitRules(com.fhir.uri) // optional {@link Linkage#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new Linkage builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableLinkage.Builder();
  }

  /**
   * Builds instances of type {@link Linkage Linkage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Linkage", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_AUTHOR = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ACTIVE = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.code language;
    private final java.util.List<com.fhir.Linkage_Item> item = new java.util.ArrayList<com.fhir.Linkage_Item>();
    private @javax.annotation.Nullable com.fhir.uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Linkage#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(com.fhir.Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
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
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
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
     * Initializes the optional value {@link Linkage#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public final Builder active(java.util.Optional<java.lang.Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
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
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
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
     * Initializes the optional value {@link Linkage#id() id} to id.
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
     * Initializes the optional value {@link Linkage#id() id} to id.
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
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
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
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
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
     * Initializes the value for the {@link Linkage#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Linkage#text() text} to text.
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
     * Initializes the optional value {@link Linkage#text() text} to text.
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
     * Initializes the optional value {@link Linkage#language() language} to language.
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
     * Initializes the optional value {@link Linkage#language() language} to language.
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
     * Adds one element to {@link Linkage#item() item} list.
     * @param element A item element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItem(com.fhir.Linkage_Item element) {
      this.item.add(java.util.Objects.requireNonNull(element, "item element"));
      return this;
    }

    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An array of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItem(com.fhir.Linkage_Item... elements) {
      for (com.fhir.Linkage_Item element : elements) {
        this.item.add(java.util.Objects.requireNonNull(element, "item element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An iterable of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllItem(Iterable<? extends com.fhir.Linkage_Item> elements) {
      for (com.fhir.Linkage_Item element : elements) {
        this.item.add(java.util.Objects.requireNonNull(element, "item element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link Linkage Linkage}.
     * @return An immutable instance of Linkage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Linkage build() {
      checkRequiredAttributes();
      return new ImmutableLinkage(
          modifierExtension,
          author,
          extension,
          active,
          contained,
          id,
          meta,
          resourceType,
          text,
          language,
          createUnmodifiableList(true, item),
          implicitRules);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Linkage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Linkage, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Linkage", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Linkage#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Linkage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Linkage#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link Linkage#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Linkage#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Linkage#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Linkage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Linkage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Linkage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Linkage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Linkage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Linkage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Adds one element to {@link Linkage#item() item} list.
     * @param element A item element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(com.fhir.Linkage_Item element);

    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An array of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(com.fhir.Linkage_Item... elements);

    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An iterable of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllItem(Iterable<? extends com.fhir.Linkage_Item> elements);

    /**
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Builds a new {@link Linkage Linkage}.
     * @return An immutable instance of Linkage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Linkage build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
