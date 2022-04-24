//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ValueSet_Compose}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Compose.builder()}.
 */
@org.immutables.value.Generated(from = "ValueSet_Compose", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Compose implements com.fhir.ValueSet_Compose {
  private final java.util.List<com.fhir.ValueSet_Include> include;
  private final @javax.annotation.Nullable java.lang.Boolean inactive;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Include> exclude;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.date lockedDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableValueSet_Compose(
      java.util.List<com.fhir.ValueSet_Include> include,
      @javax.annotation.Nullable java.lang.Boolean inactive,
      @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Include> exclude,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.date lockedDate,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.include = include;
    this.inactive = inactive;
    this.exclude = exclude;
    this.id = id;
    this.extension = extension;
    this.lockedDate = lockedDate;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code include} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("include")
  @Override
  public java.util.List<com.fhir.ValueSet_Include> include() {
    return include;
  }

  /**
   * @return The value of the {@code inactive} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("inactive")
  @Override
  public java.util.Optional<java.lang.Boolean> inactive() {
    return java.util.Optional.ofNullable(inactive);
  }

  /**
   * @return The value of the {@code exclude} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exclude")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ValueSet_Include>> exclude() {
    return java.util.Optional.ofNullable(exclude);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code lockedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lockedDate")
  @Override
  public java.util.Optional<com.fhir.date> lockedDate() {
    return java.util.Optional.ofNullable(lockedDate);
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
   * Copy the current immutable object with elements that replace the content of {@link ValueSet_Compose#include() include}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInclude(com.fhir.ValueSet_Include... elements) {
    java.util.List<com.fhir.ValueSet_Include> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableValueSet_Compose(
        newValue,
        this.inactive,
        this.exclude,
        this.id,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ValueSet_Compose#include() include}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of include elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInclude(Iterable<? extends com.fhir.ValueSet_Include> elements) {
    if (this.include == elements) return this;
    java.util.List<com.fhir.ValueSet_Include> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableValueSet_Compose(
        newValue,
        this.inactive,
        this.exclude,
        this.id,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#inactive() inactive} attribute.
   * @param value The value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInactive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.inactive, newValue)) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        newValue,
        this.exclude,
        this.id,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#inactive() inactive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInactive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.inactive, value)) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        value,
        this.exclude,
        this.id,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#exclude() exclude} attribute.
   * @param value The value for exclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withExclude(java.util.List<com.fhir.ValueSet_Include> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Include> newValue = java.util.Objects.requireNonNull(value, "exclude");
    if (this.exclude == newValue) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        newValue,
        this.id,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#exclude() exclude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exclude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withExclude(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Include>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Include> value = optional.orElse(null);
    if (this.exclude == value) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        value,
        this.id,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        this.exclude,
        newValue,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        this.exclude,
        value,
        this.extension,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        this.exclude,
        this.id,
        newValue,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        this.exclude,
        this.id,
        value,
        this.lockedDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#lockedDate() lockedDate} attribute.
   * @param value The value for lockedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withLockedDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lockedDate");
    if (this.lockedDate == newValue) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        this.exclude,
        this.id,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#lockedDate() lockedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lockedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withLockedDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lockedDate == value) return this;
    return new ImmutableValueSet_Compose(
        this.include,
        this.inactive,
        this.exclude,
        this.id,
        this.extension,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Compose(this.include, this.inactive, this.exclude, this.id, this.extension, this.lockedDate, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Compose(this.include, this.inactive, this.exclude, this.id, this.extension, this.lockedDate, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Compose} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Compose
        && equalTo((ImmutableValueSet_Compose) another);
  }

  private boolean equalTo(ImmutableValueSet_Compose another) {
    return include.equals(another.include)
        && java.util.Objects.equals(inactive, another.inactive)
        && java.util.Objects.equals(exclude, another.exclude)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(lockedDate, another.lockedDate)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code include}, {@code inactive}, {@code exclude}, {@code id}, {@code extension}, {@code lockedDate}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + include.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(inactive);
    h += (h << 5) + java.util.Objects.hashCode(exclude);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(lockedDate);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Compose} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ValueSet_Compose{");
    builder.append("include=").append(include);
    if (inactive != null) {
      builder.append(", ");
      builder.append("inactive=").append(inactive);
    }
    if (exclude != null) {
      builder.append(", ");
      builder.append("exclude=").append(exclude);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (lockedDate != null) {
      builder.append(", ");
      builder.append("lockedDate=").append(lockedDate);
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
  @org.immutables.value.Generated(from = "ValueSet_Compose", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ValueSet_Compose {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Include> include = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> inactive = java.util.Optional.empty();
    boolean inactiveIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ValueSet_Include>> exclude = java.util.Optional.empty();
    boolean excludeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lockedDate = java.util.Optional.empty();
    boolean lockedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("include")
    public void setInclude(java.util.List<com.fhir.ValueSet_Include> include) {
      this.include = include;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("inactive")
    public void setInactive(java.util.Optional<java.lang.Boolean> inactive) {
      this.inactive = inactive;
      this.inactiveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    public void setExclude(java.util.Optional<java.util.List<com.fhir.ValueSet_Include>> exclude) {
      this.exclude = exclude;
      this.excludeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lockedDate")
    public void setLockedDate(java.util.Optional<com.fhir.date> lockedDate) {
      this.lockedDate = lockedDate;
      this.lockedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.List<com.fhir.ValueSet_Include> include() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> inactive() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ValueSet_Include>> exclude() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lockedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Compose fromJson(Json json) {
    ImmutableValueSet_Compose.Builder builder = ImmutableValueSet_Compose.builder();
    if (json.include != null) {
      builder.addAllInclude(json.include);
    }
    if (json.inactiveIsSet) {
      builder.inactive(json.inactive);
    }
    if (json.excludeIsSet) {
      builder.exclude(json.exclude);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.lockedDateIsSet) {
      builder.lockedDate(json.lockedDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableValueSet_Compose) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Compose} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Compose instance
   */
  public static ValueSet_Compose copyOf(ValueSet_Compose instance) {
    if (instance instanceof ImmutableValueSet_Compose) {
      return (ImmutableValueSet_Compose) instance;
    }
    return ImmutableValueSet_Compose.builder()
        .addAllInclude(instance.include())
        .inactive(instance.inactive())
        .exclude(instance.exclude())
        .id(instance.id())
        .extension(instance.extension())
        .lockedDate(instance.lockedDate())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Compose ValueSet_Compose}.
   * <pre>
   * ImmutableValueSet_Compose.builder()
   *    .addInclude|addAllInclude(com.fhir.ValueSet_Include) // {@link ValueSet_Compose#include() include} elements
   *    .inactive(Boolean) // optional {@link ValueSet_Compose#inactive() inactive}
   *    .exclude(List&amp;lt;com.fhir.ValueSet_Include&amp;gt;) // optional {@link ValueSet_Compose#exclude() exclude}
   *    .id(String) // optional {@link ValueSet_Compose#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Compose#extension() extension}
   *    .lockedDate(com.fhir.date) // optional {@link ValueSet_Compose#lockedDate() lockedDate}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Compose#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ValueSet_Compose builder
   */
  public static ImmutableValueSet_Compose.Builder builder() {
    return new ImmutableValueSet_Compose.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Compose ValueSet_Compose}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ValueSet_Compose", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_INACTIVE = 0x1L;
    private static final long OPT_BIT_EXCLUDE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_LOCKED_DATE = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private final java.util.List<com.fhir.ValueSet_Include> include = new java.util.ArrayList<com.fhir.ValueSet_Include>();
    private @javax.annotation.Nullable java.lang.Boolean inactive;
    private @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Include> exclude;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.date lockedDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Adds one element to {@link ValueSet_Compose#include() include} list.
     * @param element A include element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(com.fhir.ValueSet_Include element) {
      this.include.add(java.util.Objects.requireNonNull(element, "include element"));
      return this;
    }

    /**
     * Adds elements to {@link ValueSet_Compose#include() include} list.
     * @param elements An array of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(com.fhir.ValueSet_Include... elements) {
      for (com.fhir.ValueSet_Include element : elements) {
        this.include.add(java.util.Objects.requireNonNull(element, "include element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ValueSet_Compose#include() include} list.
     * @param elements An iterable of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInclude(Iterable<? extends com.fhir.ValueSet_Include> elements) {
      for (com.fhir.ValueSet_Include element : elements) {
        this.include.add(java.util.Objects.requireNonNull(element, "include element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for chained invocation
     */
    public final Builder inactive(boolean inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive;
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inactive")
    public final Builder inactive(java.util.Optional<java.lang.Boolean> inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive.orElse(null);
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#exclude() exclude} to exclude.
     * @param exclude The value for exclude
     * @return {@code this} builder for chained invocation
     */
    public final Builder exclude(java.util.List<com.fhir.ValueSet_Include> exclude) {
      checkNotIsSet(excludeIsSet(), "exclude");
      this.exclude = java.util.Objects.requireNonNull(exclude, "exclude");
      optBits |= OPT_BIT_EXCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#exclude() exclude} to exclude.
     * @param exclude The value for exclude
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    public final Builder exclude(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Include>> exclude) {
      checkNotIsSet(excludeIsSet(), "exclude");
      this.exclude = exclude.orElse(null);
      optBits |= OPT_BIT_EXCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Compose#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Compose#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lockedDate(com.fhir.date lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = java.util.Objects.requireNonNull(lockedDate, "lockedDate");
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockedDate")
    public final Builder lockedDate(java.util.Optional<? extends com.fhir.date> lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = lockedDate.orElse(null);
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Compose#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ValueSet_Compose ValueSet_Compose}.
     * @return An immutable instance of ValueSet_Compose
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ValueSet_Compose build() {
      return new ImmutableValueSet_Compose(
          createUnmodifiableList(true, include),
          inactive,
          exclude,
          id,
          extension,
          lockedDate,
          modifierExtension);
    }

    private boolean inactiveIsSet() {
      return (optBits & OPT_BIT_INACTIVE) != 0;
    }

    private boolean excludeIsSet() {
      return (optBits & OPT_BIT_EXCLUDE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean lockedDateIsSet() {
      return (optBits & OPT_BIT_LOCKED_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ValueSet_Compose is strict, attribute is already set: ".concat(name));
    }
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
