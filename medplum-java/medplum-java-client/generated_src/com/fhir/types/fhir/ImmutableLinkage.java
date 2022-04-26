package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Linkage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLinkage.builder()}.
 */
@Generated(from = "Linkage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLinkage implements Linkage {
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final List<Linkage_Item> item;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference author;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final @Nullable Boolean active;
  private final String resourceType;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableLinkage(
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      List<Linkage_Item> item,
      @Nullable Uri implicitRules,
      @Nullable Reference author,
      @Nullable List<Extension> extension,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable Code language,
      @Nullable Boolean active,
      String resourceType,
      @Nullable List<Extension> modifierExtension) {
    this.text = text;
    this.contained = contained;
    this.item = item;
    this.implicitRules = implicitRules;
    this.author = author;
    this.extension = extension;
    this.id = id;
    this.meta = meta;
    this.language = language;
    this.active = active;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public List<Linkage_Item> item() {
    return item;
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableLinkage(
        newValue,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableLinkage(
        value,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        newValue,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableLinkage(
        this.text,
        value,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Linkage#item() item}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withItem(Linkage_Item... elements) {
    List<Linkage_Item> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableLinkage(
        this.text,
        this.contained,
        newValue,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Linkage#item() item}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of item elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withItem(Iterable<? extends Linkage_Item> elements) {
    if (this.item == elements) return this;
    List<Linkage_Item> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableLinkage(
        this.text,
        this.contained,
        newValue,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        newValue,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        value,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        newValue,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        value,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        newValue,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        value,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        newValue,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        value,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        newValue,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        value,
        this.language,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        newValue,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        value,
        this.active,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        newValue,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        value,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Linkage#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLinkage withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLinkage(
        this.text,
        this.contained,
        this.item,
        this.implicitRules,
        this.author,
        this.extension,
        this.id,
        this.meta,
        this.language,
        this.active,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLinkage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLinkage
        && equalTo((ImmutableLinkage) another);
  }

  private boolean equalTo(ImmutableLinkage another) {
    return Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && item.equals(another.item)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(author, another.author)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && Objects.equals(active, another.active)
        && resourceType.equals(another.resourceType)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code contained}, {@code item}, {@code implicitRules}, {@code author}, {@code extension}, {@code id}, {@code meta}, {@code language}, {@code active}, {@code resourceType}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + item.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Linkage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Linkage{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (contained != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("item=").append(item);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
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
  @Generated(from = "Linkage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Linkage {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable List<Linkage_Item> item = Collections.emptyList();
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("item")
    public void setItem(List<Linkage_Item> item) {
      this.item = item;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
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
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public List<Linkage_Item> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
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
  static ImmutableLinkage fromJson(Json json) {
    ImmutableLinkage.Builder builder = ((ImmutableLinkage.Builder) ImmutableLinkage.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.item != null) {
      builder.addAllItem(json.item);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .text(instance.text())
        .contained(instance.contained())
        .addAllItem(instance.item())
        .implicitRules(instance.implicitRules())
        .author(instance.author())
        .extension(instance.extension())
        .id(instance.id())
        .meta(instance.meta())
        .language(instance.language())
        .active(instance.active())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Linkage Linkage}.
   * <pre>
   * ImmutableLinkage.builder()
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Linkage#text() text}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Linkage#contained() contained}
   *    .addItem|addAllItem(com.fhir.types.fhir.Linkage_Item) // {@link Linkage#item() item} elements
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Linkage#implicitRules() implicitRules}
   *    .author(com.fhir.types.fhir.Reference) // optional {@link Linkage#author() author}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Linkage#extension() extension}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Linkage#id() id}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Linkage#meta() meta}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Linkage#language() language}
   *    .active(Boolean) // optional {@link Linkage#active() active}
   *    .resourceType(String) // required {@link Linkage#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Linkage#modifierExtension() modifierExtension}
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
  @Generated(from = "Linkage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_AUTHOR = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_ACTIVE = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private final List<Linkage_Item> item = new ArrayList<Linkage_Item>();
    private @Nullable Uri implicitRules;
    private @Nullable Reference author;
    private @Nullable List<Extension> extension;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable Boolean active;
    private @Nullable String resourceType;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Linkage#text() text} to text.
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
     * Initializes the optional value {@link Linkage#text() text} to text.
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
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
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
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
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
     * Adds one element to {@link Linkage#item() item} list.
     * @param element A item element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItem(Linkage_Item element) {
      this.item.add(Objects.requireNonNull(element, "item element"));
      return this;
    }

    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An array of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItem(Linkage_Item... elements) {
      for (Linkage_Item element : elements) {
        this.item.add(Objects.requireNonNull(element, "item element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An iterable of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllItem(Iterable<? extends Linkage_Item> elements) {
      for (Linkage_Item element : elements) {
        this.item.add(Objects.requireNonNull(element, "item element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Linkage#author() author} to author.
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
     * Initializes the optional value {@link Linkage#author() author} to author.
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
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
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
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
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
     * Initializes the optional value {@link Linkage#id() id} to id.
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
     * Initializes the optional value {@link Linkage#id() id} to id.
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
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
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
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
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
     * Initializes the optional value {@link Linkage#language() language} to language.
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
     * Initializes the optional value {@link Linkage#language() language} to language.
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the value for the {@link Linkage#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Linkage Linkage}.
     * @return An immutable instance of Linkage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Linkage build() {
      checkRequiredAttributes();
      return new ImmutableLinkage(
          text,
          contained,
          createUnmodifiableList(true, item),
          implicitRules,
          author,
          extension,
          id,
          meta,
          language,
          active,
          resourceType,
          modifierExtension);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Linkage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Linkage, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Linkage", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Linkage#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Linkage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Linkage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Linkage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Linkage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Adds one element to {@link Linkage#item() item} list.
     * @param element A item element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(Linkage_Item element);

    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An array of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(Linkage_Item... elements);

    /**
     * Adds elements to {@link Linkage#item() item} list.
     * @param elements An iterable of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllItem(Iterable<? extends Linkage_Item> elements);

    /**
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Linkage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Linkage#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link Linkage#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Linkage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Linkage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Linkage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Linkage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Linkage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Linkage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Linkage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Linkage Linkage}.
     * @return An immutable instance of Linkage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Linkage build();
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
