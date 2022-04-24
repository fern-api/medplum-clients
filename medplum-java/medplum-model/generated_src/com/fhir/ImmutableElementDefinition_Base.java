//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ElementDefinition_Base}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Base.builder()}.
 */
@org.immutables.value.Generated(from = "ElementDefinition_Base", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Base implements com.fhir.ElementDefinition_Base {
  private final @javax.annotation.Nullable java.lang.String max;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.unsignedInt min;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String path;

  private ImmutableElementDefinition_Base(
      @javax.annotation.Nullable java.lang.String max,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.unsignedInt min,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String path) {
    this.max = max;
    this.modifierExtension = modifierExtension;
    this.min = min;
    this.extension = extension;
    this.id = id;
    this.path = path;
  }

  /**
   * @return The value of the {@code max} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("max")
  @Override
  public java.util.Optional<java.lang.String> max() {
    return java.util.Optional.ofNullable(max);
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
   * @return The value of the {@code min} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("min")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> min() {
    return java.util.Optional.ofNullable(min);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code path} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("path")
  @Override
  public java.util.Optional<java.lang.String> path() {
    return java.util.Optional.ofNullable(path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withMax(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "max");
    if (java.util.Objects.equals(this.max, newValue)) return this;
    return new ImmutableElementDefinition_Base(newValue, this.modifierExtension, this.min, this.extension, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withMax(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.max, value)) return this;
    return new ImmutableElementDefinition_Base(value, this.modifierExtension, this.min, this.extension, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Base(this.max, newValue, this.min, this.extension, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Base withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Base(this.max, value, this.min, this.extension, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withMin(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "min");
    if (this.min == newValue) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, newValue, this.extension, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#min() min} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Base withMin(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.min == value) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, value, this.extension, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, this.min, newValue, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Base withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, this.min, value, this.id, this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, this.min, this.extension, newValue, this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, this.min, this.extension, value, this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withPath(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "path");
    if (java.util.Objects.equals(this.path, newValue)) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, this.min, this.extension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withPath(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.path, value)) return this;
    return new ImmutableElementDefinition_Base(this.max, this.modifierExtension, this.min, this.extension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Base} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Base
        && equalTo((ImmutableElementDefinition_Base) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Base another) {
    return java.util.Objects.equals(max, another.max)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(min, another.min)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(path, another.path);
  }

  /**
   * Computes a hash code from attributes: {@code max}, {@code modifierExtension}, {@code min}, {@code extension}, {@code id}, {@code path}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(max);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(min);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(path);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Base} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ElementDefinition_Base{");
    if (max != null) {
      builder.append("max=").append(max);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (min != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (path != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("path=").append(path);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Base", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ElementDefinition_Base {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> max = java.util.Optional.empty();
    boolean maxIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> min = java.util.Optional.empty();
    boolean minIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> path = java.util.Optional.empty();
    boolean pathIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public void setMax(java.util.Optional<java.lang.String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public void setMin(java.util.Optional<com.fhir.unsignedInt> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public void setPath(java.util.Optional<java.lang.String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> max() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> min() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> path() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Base fromJson(Json json) {
    ImmutableElementDefinition_Base.Builder builder = ImmutableElementDefinition_Base.builder();
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    return (ImmutableElementDefinition_Base) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Base} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Base instance
   */
  public static ElementDefinition_Base copyOf(ElementDefinition_Base instance) {
    if (instance instanceof ImmutableElementDefinition_Base) {
      return (ImmutableElementDefinition_Base) instance;
    }
    return ImmutableElementDefinition_Base.builder()
        .max(instance.max())
        .modifierExtension(instance.modifierExtension())
        .min(instance.min())
        .extension(instance.extension())
        .id(instance.id())
        .path(instance.path())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Base ElementDefinition_Base}.
   * <pre>
   * ImmutableElementDefinition_Base.builder()
   *    .max(String) // optional {@link ElementDefinition_Base#max() max}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Base#modifierExtension() modifierExtension}
   *    .min(com.fhir.unsignedInt) // optional {@link ElementDefinition_Base#min() min}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Base#extension() extension}
   *    .id(String) // optional {@link ElementDefinition_Base#id() id}
   *    .path(String) // optional {@link ElementDefinition_Base#path() path}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Base builder
   */
  public static ImmutableElementDefinition_Base.Builder builder() {
    return new ImmutableElementDefinition_Base.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Base ElementDefinition_Base}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Base", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MAX = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_MIN = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_PATH = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String max;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.unsignedInt min;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String path;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for chained invocation
     */
    public final Builder max(java.lang.String max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = java.util.Objects.requireNonNull(max, "max");
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public final Builder max(java.util.Optional<java.lang.String> max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = max.orElse(null);
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Base#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Base#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for chained invocation
     */
    public final Builder min(com.fhir.unsignedInt min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = java.util.Objects.requireNonNull(min, "min");
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public final Builder min(java.util.Optional<? extends com.fhir.unsignedInt> min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min.orElse(null);
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Base#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Base#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Base#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Base#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(java.lang.String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = java.util.Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public final Builder path(java.util.Optional<java.lang.String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Builds a new {@link ElementDefinition_Base ElementDefinition_Base}.
     * @return An immutable instance of ElementDefinition_Base
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ElementDefinition_Base build() {
      return new ImmutableElementDefinition_Base(max, modifierExtension, min, extension, id, path);
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ElementDefinition_Base is strict, attribute is already set: ".concat(name));
    }
  }
}
