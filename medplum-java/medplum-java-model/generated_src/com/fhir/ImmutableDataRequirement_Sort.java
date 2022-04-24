package com.fhir;

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
 * Immutable implementation of {@link DataRequirement_Sort}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataRequirement_Sort.builder()}.
 */
@Generated(from = "DataRequirement_Sort", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDataRequirement_Sort implements DataRequirement_Sort {
  private final @Nullable Datarequirement_sortDirection direction;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable String path;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableDataRequirement_Sort(
      @Nullable Datarequirement_sortDirection direction,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable String path,
      @Nullable List<Extension> modifierExtension) {
    this.direction = direction;
    this.extension = extension;
    this.id = id;
    this.path = path;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code direction} attribute
   */
  @JsonProperty("direction")
  @Override
  public Optional<Datarequirement_sortDirection> direction() {
    return Optional.ofNullable(direction);
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
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_Sort#direction() direction} attribute.
   * @param value The value for direction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_Sort withDirection(Datarequirement_sortDirection value) {
    @Nullable Datarequirement_sortDirection newValue = Objects.requireNonNull(value, "direction");
    if (this.direction == newValue) return this;
    return new ImmutableDataRequirement_Sort(newValue, this.extension, this.id, this.path, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_Sort#direction() direction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for direction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_Sort withDirection(Optional<? extends Datarequirement_sortDirection> optional) {
    @Nullable Datarequirement_sortDirection value = optional.orElse(null);
    if (this.direction == value) return this;
    return new ImmutableDataRequirement_Sort(value, this.extension, this.id, this.path, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_Sort#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_Sort withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDataRequirement_Sort(this.direction, newValue, this.id, this.path, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_Sort#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_Sort withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDataRequirement_Sort(this.direction, value, this.id, this.path, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_Sort#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_Sort withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDataRequirement_Sort(this.direction, this.extension, newValue, this.path, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_Sort#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_Sort withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDataRequirement_Sort(this.direction, this.extension, value, this.path, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_Sort#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_Sort withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableDataRequirement_Sort(this.direction, this.extension, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_Sort#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_Sort withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableDataRequirement_Sort(this.direction, this.extension, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_Sort#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_Sort withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDataRequirement_Sort(this.direction, this.extension, this.id, this.path, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_Sort#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_Sort withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDataRequirement_Sort(this.direction, this.extension, this.id, this.path, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataRequirement_Sort} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataRequirement_Sort
        && equalTo((ImmutableDataRequirement_Sort) another);
  }

  private boolean equalTo(ImmutableDataRequirement_Sort another) {
    return Objects.equals(direction, another.direction)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(path, another.path)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code direction}, {@code extension}, {@code id}, {@code path}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(direction);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(path);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code DataRequirement_Sort} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DataRequirement_Sort{");
    if (direction != null) {
      builder.append("direction=").append(direction);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (path != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DataRequirement_Sort", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DataRequirement_Sort {
    @Nullable Optional<Datarequirement_sortDirection> direction = Optional.empty();
    boolean directionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("direction")
    public void setDirection(Optional<Datarequirement_sortDirection> direction) {
      this.direction = direction;
      this.directionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
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
    @Override
    public Optional<Datarequirement_sortDirection> direction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
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
  static ImmutableDataRequirement_Sort fromJson(Json json) {
    ImmutableDataRequirement_Sort.Builder builder = ImmutableDataRequirement_Sort.builder();
    if (json.directionIsSet) {
      builder.direction(json.direction);
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
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableDataRequirement_Sort) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DataRequirement_Sort} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DataRequirement_Sort instance
   */
  public static DataRequirement_Sort copyOf(DataRequirement_Sort instance) {
    if (instance instanceof ImmutableDataRequirement_Sort) {
      return (ImmutableDataRequirement_Sort) instance;
    }
    return ImmutableDataRequirement_Sort.builder()
        .direction(instance.direction())
        .extension(instance.extension())
        .id(instance.id())
        .path(instance.path())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link DataRequirement_Sort DataRequirement_Sort}.
   * <pre>
   * ImmutableDataRequirement_Sort.builder()
   *    .direction(com.fhir.Datarequirement_sortDirection) // optional {@link DataRequirement_Sort#direction() direction}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DataRequirement_Sort#extension() extension}
   *    .id(String) // optional {@link DataRequirement_Sort#id() id}
   *    .path(String) // optional {@link DataRequirement_Sort#path() path}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DataRequirement_Sort#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new DataRequirement_Sort builder
   */
  public static ImmutableDataRequirement_Sort.Builder builder() {
    return new ImmutableDataRequirement_Sort.Builder();
  }

  /**
   * Builds instances of type {@link DataRequirement_Sort DataRequirement_Sort}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DataRequirement_Sort", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DIRECTION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_PATH = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable Datarequirement_sortDirection direction;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable String path;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DataRequirement_Sort#direction() direction} to direction.
     * @param direction The value for direction
     * @return {@code this} builder for chained invocation
     */
    public final Builder direction(Datarequirement_sortDirection direction) {
      checkNotIsSet(directionIsSet(), "direction");
      this.direction = Objects.requireNonNull(direction, "direction");
      optBits |= OPT_BIT_DIRECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_Sort#direction() direction} to direction.
     * @param direction The value for direction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("direction")
    public final Builder direction(Optional<? extends Datarequirement_sortDirection> direction) {
      checkNotIsSet(directionIsSet(), "direction");
      this.direction = direction.orElse(null);
      optBits |= OPT_BIT_DIRECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_Sort#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_Sort#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_Sort#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement_Sort#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement_Sort#path() path} to path.
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
     * Initializes the optional value {@link DataRequirement_Sort#path() path} to path.
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
     * Initializes the optional value {@link DataRequirement_Sort#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DataRequirement_Sort#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link DataRequirement_Sort DataRequirement_Sort}.
     * @return An immutable instance of DataRequirement_Sort
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DataRequirement_Sort build() {
      return new ImmutableDataRequirement_Sort(direction, extension, id, path, modifierExtension);
    }

    private boolean directionIsSet() {
      return (optBits & OPT_BIT_DIRECTION) != 0;
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

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DataRequirement_Sort is strict, attribute is already set: ".concat(name));
    }
  }
}
