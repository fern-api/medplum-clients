package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ElementDefinition_Base}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Base.builder()}.
 */
@Generated(from = "ElementDefinition_Base", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Base implements ElementDefinition_Base {
  private final @Nullable UnsignedInt min;
  private final @Nullable String max;
  private final @Nullable List<Extension> extension;
  private final @Nullable String path;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutableElementDefinition_Base(
      @Nullable UnsignedInt min,
      @Nullable String max,
      @Nullable List<Extension> extension,
      @Nullable String path,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.min = min;
    this.max = max;
    this.extension = extension;
    this.path = path;
    this.modifierExtension = modifierExtension;
    this.id = id;
  }

  /**
   * @return The value of the {@code min} attribute
   */
  @JsonProperty("min")
  @Override
  public Optional<UnsignedInt> min() {
    return Optional.ofNullable(min);
  }

  /**
   * @return The value of the {@code max} attribute
   */
  @JsonProperty("max")
  @Override
  public Optional<String> max() {
    return Optional.ofNullable(max);
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
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public Optional<String> path() {
    return Optional.ofNullable(path);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withMin(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "min");
    if (this.min == newValue) return this;
    return new ImmutableElementDefinition_Base(newValue, this.max, this.extension, this.path, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#min() min} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Base withMin(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.min == value) return this;
    return new ImmutableElementDefinition_Base(value, this.max, this.extension, this.path, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withMax(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "max");
    if (Objects.equals(this.max, newValue)) return this;
    return new ImmutableElementDefinition_Base(this.min, newValue, this.extension, this.path, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withMax(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.max, value)) return this;
    return new ImmutableElementDefinition_Base(this.min, value, this.extension, this.path, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, newValue, this.path, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Base withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, value, this.path, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, this.extension, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, this.extension, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, this.extension, this.path, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Base withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, this.extension, this.path, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Base#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, this.extension, this.path, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Base#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Base withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Base(this.min, this.max, this.extension, this.path, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Base} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Base
        && equalTo((ImmutableElementDefinition_Base) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Base another) {
    return Objects.equals(min, another.min)
        && Objects.equals(max, another.max)
        && Objects.equals(extension, another.extension)
        && Objects.equals(path, another.path)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code min}, {@code max}, {@code extension}, {@code path}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(min);
    h += (h << 5) + Objects.hashCode(max);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(path);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Base} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ElementDefinition_Base{");
    if (min != null) {
      builder.append("min=").append(min);
    }
    if (max != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("max=").append(max);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (path != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ElementDefinition_Base", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ElementDefinition_Base {
    @Nullable Optional<UnsignedInt> min = Optional.empty();
    boolean minIsSet;
    @Nullable Optional<String> max = Optional.empty();
    boolean maxIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("min")
    public void setMin(Optional<UnsignedInt> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @JsonProperty("max")
    public void setMax(Optional<String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<UnsignedInt> min() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> max() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Base fromJson(Json json) {
    ImmutableElementDefinition_Base.Builder builder = ImmutableElementDefinition_Base.builder();
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .min(instance.min())
        .max(instance.max())
        .extension(instance.extension())
        .path(instance.path())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Base ElementDefinition_Base}.
   * <pre>
   * ImmutableElementDefinition_Base.builder()
   *    .min(com.fhir.types.fhir.UnsignedInt) // optional {@link ElementDefinition_Base#min() min}
   *    .max(String) // optional {@link ElementDefinition_Base#max() max}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Base#extension() extension}
   *    .path(String) // optional {@link ElementDefinition_Base#path() path}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Base#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ElementDefinition_Base#id() id}
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
  @Generated(from = "ElementDefinition_Base", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MIN = 0x1L;
    private static final long OPT_BIT_MAX = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_PATH = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable UnsignedInt min;
    private @Nullable String max;
    private @Nullable List<Extension> extension;
    private @Nullable String path;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for chained invocation
     */
    public final Builder min(UnsignedInt min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = Objects.requireNonNull(min, "min");
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("min")
    public final Builder min(Optional<? extends UnsignedInt> min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min.orElse(null);
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for chained invocation
     */
    public final Builder max(String max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = Objects.requireNonNull(max, "max");
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("max")
    public final Builder max(Optional<String> max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = max.orElse(null);
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Base#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Base#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("path")
    public final Builder path(Optional<String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Base#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Base#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Base#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link ElementDefinition_Base ElementDefinition_Base}.
     * @return An immutable instance of ElementDefinition_Base
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ElementDefinition_Base build() {
      return new ImmutableElementDefinition_Base(min, max, extension, path, modifierExtension, id);
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ElementDefinition_Base is strict, attribute is already set: ".concat(name));
    }
  }
}
