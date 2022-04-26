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
 * Immutable implementation of {@link OperationOutcome}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationOutcome.builder()}.
 */
@Generated(from = "OperationOutcome", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationOutcome implements OperationOutcome {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable ResourceList resource;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Narrative text;
  private final List<OperationOutcome_Issue> issue;
  private final @Nullable Integer status;

  private ImmutableOperationOutcome(
      @Nullable List<ResourceList> contained,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<Extension> modifierExtension,
      @Nullable ResourceList resource,
      @Nullable Meta meta,
      @Nullable Id id,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable Narrative text,
      List<OperationOutcome_Issue> issue,
      @Nullable Integer status) {
    this.contained = contained;
    this.implicitRules = implicitRules;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.resource = resource;
    this.meta = meta;
    this.id = id;
    this.resourceType = resourceType;
    this.extension = extension;
    this.text = text;
    this.issue = issue;
    this.status = status;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<ResourceList> resource() {
    return Optional.ofNullable(resource);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code issue} attribute
   */
  @JsonProperty("issue")
  @Override
  public List<OperationOutcome_Issue> issue() {
    return issue;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Integer> status() {
    return Optional.ofNullable(status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableOperationOutcome(
        newValue,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableOperationOutcome(
        value,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        newValue,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        value,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        newValue,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        value,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withResource(ResourceList value) {
    @Nullable ResourceList newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        newValue,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withResource(Optional<? extends ResourceList> optional) {
    @Nullable ResourceList value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        value,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        newValue,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        value,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        newValue,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        value,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OperationOutcome#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOperationOutcome withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        newValue,
        this.extension,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        newValue,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        value,
        this.text,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        newValue,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        value,
        this.issue,
        this.status);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link OperationOutcome#issue() issue}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withIssue(OperationOutcome_Issue... elements) {
    List<OperationOutcome_Issue> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link OperationOutcome#issue() issue}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of issue elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withIssue(Iterable<? extends OperationOutcome_Issue> elements) {
    if (this.issue == elements) return this;
    List<OperationOutcome_Issue> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withStatus(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.status, newValue)) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome#status() status} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome withStatus(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.status, value)) return this;
    return new ImmutableOperationOutcome(
        this.contained,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resource,
        this.meta,
        this.id,
        this.resourceType,
        this.extension,
        this.text,
        this.issue,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationOutcome} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationOutcome
        && equalTo((ImmutableOperationOutcome) another);
  }

  private boolean equalTo(ImmutableOperationOutcome another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(resource, another.resource)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(text, another.text)
        && issue.equals(another.issue)
        && Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code implicitRules}, {@code language}, {@code modifierExtension}, {@code resource}, {@code meta}, {@code id}, {@code resourceType}, {@code extension}, {@code text}, {@code issue}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + issue.hashCode();
    h += (h << 5) + Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationOutcome} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OperationOutcome{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (implicitRules != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (resource != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (meta != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("issue=").append(issue);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "OperationOutcome", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OperationOutcome {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<ResourceList> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable List<OperationOutcome_Issue> issue = Collections.emptyList();
    @Nullable Optional<Integer> status = Optional.empty();
    boolean statusIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<ResourceList> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("issue")
    public void setIssue(List<OperationOutcome_Issue> issue) {
      this.issue = issue;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Integer> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResourceList> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public List<OperationOutcome_Issue> issue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOperationOutcome fromJson(Json json) {
    ImmutableOperationOutcome.Builder builder = ((ImmutableOperationOutcome.Builder) ImmutableOperationOutcome.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.issue != null) {
      builder.addAllIssue(json.issue);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    return (ImmutableOperationOutcome) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationOutcome} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationOutcome instance
   */
  public static OperationOutcome copyOf(OperationOutcome instance) {
    if (instance instanceof ImmutableOperationOutcome) {
      return (ImmutableOperationOutcome) instance;
    }
    return ((ImmutableOperationOutcome.Builder) ImmutableOperationOutcome.builder())
        .contained(instance.contained())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .resource(instance.resource())
        .meta(instance.meta())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .text(instance.text())
        .addAllIssue(instance.issue())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link OperationOutcome OperationOutcome}.
   * <pre>
   * ImmutableOperationOutcome.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link OperationOutcome#contained() contained}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link OperationOutcome#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link OperationOutcome#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationOutcome#modifierExtension() modifierExtension}
   *    .resource(com.medplum.types.fhir.ResourceList) // optional {@link OperationOutcome#resource() resource}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link OperationOutcome#meta() meta}
   *    .id(com.medplum.types.fhir.Id) // optional {@link OperationOutcome#id() id}
   *    .resourceType(String) // required {@link OperationOutcome#resourceType() resourceType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationOutcome#extension() extension}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link OperationOutcome#text() text}
   *    .addIssue|addAllIssue(com.medplum.types.fhir.OperationOutcome_Issue) // {@link OperationOutcome#issue() issue} elements
   *    .status(Integer) // optional {@link OperationOutcome#status() status}
   *    .build();
   * </pre>
   * @return A new OperationOutcome builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableOperationOutcome.Builder();
  }

  /**
   * Builds instances of type {@link OperationOutcome OperationOutcome}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "OperationOutcome", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_RESOURCE = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable ResourceList resource;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable Narrative text;
    private final List<OperationOutcome_Issue> issue = new ArrayList<OperationOutcome_Issue>();
    private @Nullable Integer status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationOutcome#contained() contained} to contained.
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
     * Initializes the optional value {@link OperationOutcome#contained() contained} to contained.
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
     * Initializes the optional value {@link OperationOutcome#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OperationOutcome#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OperationOutcome#language() language} to language.
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
     * Initializes the optional value {@link OperationOutcome#language() language} to language.
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
     * Initializes the optional value {@link OperationOutcome#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationOutcome#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationOutcome#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(ResourceList resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends ResourceList> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome#meta() meta} to meta.
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
     * Initializes the optional value {@link OperationOutcome#meta() meta} to meta.
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
     * Initializes the optional value {@link OperationOutcome#id() id} to id.
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
     * Initializes the optional value {@link OperationOutcome#id() id} to id.
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
     * Initializes the value for the {@link OperationOutcome#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link OperationOutcome#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationOutcome#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationOutcome#text() text} to text.
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
     * Initializes the optional value {@link OperationOutcome#text() text} to text.
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
     * Adds one element to {@link OperationOutcome#issue() issue} list.
     * @param element A issue element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIssue(OperationOutcome_Issue element) {
      this.issue.add(Objects.requireNonNull(element, "issue element"));
      return this;
    }

    /**
     * Adds elements to {@link OperationOutcome#issue() issue} list.
     * @param elements An array of issue elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIssue(OperationOutcome_Issue... elements) {
      for (OperationOutcome_Issue element : elements) {
        this.issue.add(Objects.requireNonNull(element, "issue element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link OperationOutcome#issue() issue} list.
     * @param elements An iterable of issue elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllIssue(Iterable<? extends OperationOutcome_Issue> elements) {
      for (OperationOutcome_Issue element : elements) {
        this.issue.add(Objects.requireNonNull(element, "issue element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(int status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status;
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<Integer> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link OperationOutcome OperationOutcome}.
     * @return An immutable instance of OperationOutcome
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public OperationOutcome build() {
      checkRequiredAttributes();
      return new ImmutableOperationOutcome(
          contained,
          implicitRules,
          language,
          modifierExtension,
          resource,
          meta,
          id,
          resourceType,
          extension,
          text,
          createUnmodifiableList(true, issue),
          status);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of OperationOutcome is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build OperationOutcome, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "OperationOutcome", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link OperationOutcome#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "OperationOutcome", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link OperationOutcome#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link OperationOutcome#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link OperationOutcome#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link OperationOutcome#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link OperationOutcome#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link OperationOutcome#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link OperationOutcome#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link OperationOutcome#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link OperationOutcome#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resource(ResourceList resource);

    /**
     * Initializes the optional value {@link OperationOutcome#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resource(Optional<? extends ResourceList> resource);

    /**
     * Initializes the optional value {@link OperationOutcome#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link OperationOutcome#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link OperationOutcome#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link OperationOutcome#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link OperationOutcome#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link OperationOutcome#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link OperationOutcome#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link OperationOutcome#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Adds one element to {@link OperationOutcome#issue() issue} list.
     * @param element A issue element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addIssue(OperationOutcome_Issue element);

    /**
     * Adds elements to {@link OperationOutcome#issue() issue} list.
     * @param elements An array of issue elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addIssue(OperationOutcome_Issue... elements);

    /**
     * Adds elements to {@link OperationOutcome#issue() issue} list.
     * @param elements An iterable of issue elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllIssue(Iterable<? extends OperationOutcome_Issue> elements);

    /**
     * Initializes the optional value {@link OperationOutcome#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(int status);

    /**
     * Initializes the optional value {@link OperationOutcome#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<Integer> status);

    /**
     * Builds a new {@link OperationOutcome OperationOutcome}.
     * @return An immutable instance of OperationOutcome
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    OperationOutcome build();
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
