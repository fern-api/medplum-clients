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
 * Immutable implementation of {@link GraphDefinition_Link}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGraphDefinition_Link.builder()}.
 */
@Generated(from = "GraphDefinition_Link", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGraphDefinition_Link implements GraphDefinition_Link {
  private final @Nullable String path;
  private final @Nullable String max;
  private final @Nullable List<Extension> extension;
  private final @Nullable String description;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Integer min;
  private final @Nullable String sliceName;
  private final @Nullable List<GraphDefinition_Target> target;

  private ImmutableGraphDefinition_Link(
      @Nullable String path,
      @Nullable String max,
      @Nullable List<Extension> extension,
      @Nullable String description,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Integer min,
      @Nullable String sliceName,
      @Nullable List<GraphDefinition_Target> target) {
    this.path = path;
    this.max = max;
    this.extension = extension;
    this.description = description;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.min = min;
    this.sliceName = sliceName;
    this.target = target;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code min} attribute
   */
  @JsonProperty("min")
  @Override
  public Optional<Integer> min() {
    return Optional.ofNullable(min);
  }

  /**
   * @return The value of the {@code sliceName} attribute
   */
  @JsonProperty("sliceName")
  @Override
  public Optional<String> sliceName() {
    return Optional.ofNullable(sliceName);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<GraphDefinition_Target>> target() {
    return Optional.ofNullable(target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableGraphDefinition_Link(
        newValue,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableGraphDefinition_Link(
        value,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withMax(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "max");
    if (Objects.equals(this.max, newValue)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        newValue,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withMax(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.max, value)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        value,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        newValue,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Link withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        value,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        newValue,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        value,
        this.modifierExtension,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        newValue,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Link withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        value,
        this.min,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withMin(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.min, newValue)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        newValue,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#min() min} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withMin(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.min, value)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        value,
        this.sliceName,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#sliceName() sliceName} attribute.
   * @param value The value for sliceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withSliceName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sliceName");
    if (Objects.equals(this.sliceName, newValue)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        newValue,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#sliceName() sliceName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sliceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withSliceName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.sliceName, value)) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        value,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Link#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Link withTarget(List<GraphDefinition_Target> value) {
    @Nullable List<GraphDefinition_Target> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Link#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Link withTarget(Optional<? extends List<GraphDefinition_Target>> optional) {
    @Nullable List<GraphDefinition_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableGraphDefinition_Link(
        this.path,
        this.max,
        this.extension,
        this.description,
        this.id,
        this.modifierExtension,
        this.min,
        this.sliceName,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGraphDefinition_Link} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGraphDefinition_Link
        && equalTo((ImmutableGraphDefinition_Link) another);
  }

  private boolean equalTo(ImmutableGraphDefinition_Link another) {
    return Objects.equals(path, another.path)
        && Objects.equals(max, another.max)
        && Objects.equals(extension, another.extension)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(min, another.min)
        && Objects.equals(sliceName, another.sliceName)
        && Objects.equals(target, another.target);
  }

  /**
   * Computes a hash code from attributes: {@code path}, {@code max}, {@code extension}, {@code description}, {@code id}, {@code modifierExtension}, {@code min}, {@code sliceName}, {@code target}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(path);
    h += (h << 5) + Objects.hashCode(max);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(min);
    h += (h << 5) + Objects.hashCode(sliceName);
    h += (h << 5) + Objects.hashCode(target);
    return h;
  }

  /**
   * Prints the immutable value {@code GraphDefinition_Link} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("GraphDefinition_Link{");
    if (path != null) {
      builder.append("path=").append(path);
    }
    if (max != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("max=").append(max);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (min != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (sliceName != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("sliceName=").append(sliceName);
    }
    if (target != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("target=").append(target);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "GraphDefinition_Link", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GraphDefinition_Link {
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @Nullable Optional<String> max = Optional.empty();
    boolean maxIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Integer> min = Optional.empty();
    boolean minIsSet;
    @Nullable Optional<String> sliceName = Optional.empty();
    boolean sliceNameIsSet;
    @Nullable Optional<List<GraphDefinition_Target>> target = Optional.empty();
    boolean targetIsSet;
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
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
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("min")
    public void setMin(Optional<Integer> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @JsonProperty("sliceName")
    public void setSliceName(Optional<String> sliceName) {
      this.sliceName = sliceName;
      this.sliceNameIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<List<GraphDefinition_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> max() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> min() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sliceName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<GraphDefinition_Target>> target() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGraphDefinition_Link fromJson(Json json) {
    ImmutableGraphDefinition_Link.Builder builder = ImmutableGraphDefinition_Link.builder();
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.sliceNameIsSet) {
      builder.sliceName(json.sliceName);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    return (ImmutableGraphDefinition_Link) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GraphDefinition_Link} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GraphDefinition_Link instance
   */
  public static GraphDefinition_Link copyOf(GraphDefinition_Link instance) {
    if (instance instanceof ImmutableGraphDefinition_Link) {
      return (ImmutableGraphDefinition_Link) instance;
    }
    return ImmutableGraphDefinition_Link.builder()
        .path(instance.path())
        .max(instance.max())
        .extension(instance.extension())
        .description(instance.description())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .min(instance.min())
        .sliceName(instance.sliceName())
        .target(instance.target())
        .build();
  }

  /**
   * Creates a builder for {@link GraphDefinition_Link GraphDefinition_Link}.
   * <pre>
   * ImmutableGraphDefinition_Link.builder()
   *    .path(String) // optional {@link GraphDefinition_Link#path() path}
   *    .max(String) // optional {@link GraphDefinition_Link#max() max}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Link#extension() extension}
   *    .description(String) // optional {@link GraphDefinition_Link#description() description}
   *    .id(String) // optional {@link GraphDefinition_Link#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Link#modifierExtension() modifierExtension}
   *    .min(Integer) // optional {@link GraphDefinition_Link#min() min}
   *    .sliceName(String) // optional {@link GraphDefinition_Link#sliceName() sliceName}
   *    .target(List&amp;lt;com.fhir.types.fhir.GraphDefinition_Target&amp;gt;) // optional {@link GraphDefinition_Link#target() target}
   *    .build();
   * </pre>
   * @return A new GraphDefinition_Link builder
   */
  public static ImmutableGraphDefinition_Link.Builder builder() {
    return new ImmutableGraphDefinition_Link.Builder();
  }

  /**
   * Builds instances of type {@link GraphDefinition_Link GraphDefinition_Link}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GraphDefinition_Link", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PATH = 0x1L;
    private static final long OPT_BIT_MAX = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_DESCRIPTION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_MIN = 0x40L;
    private static final long OPT_BIT_SLICE_NAME = 0x80L;
    private static final long OPT_BIT_TARGET = 0x100L;
    private long optBits;

    private @Nullable String path;
    private @Nullable String max;
    private @Nullable List<Extension> extension;
    private @Nullable String description;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Integer min;
    private @Nullable String sliceName;
    private @Nullable List<GraphDefinition_Target> target;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#path() path} to path.
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
     * Initializes the optional value {@link GraphDefinition_Link#path() path} to path.
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
     * Initializes the optional value {@link GraphDefinition_Link#max() max} to max.
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
     * Initializes the optional value {@link GraphDefinition_Link#max() max} to max.
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
     * Initializes the optional value {@link GraphDefinition_Link#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Link#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Link#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Link#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Link#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition_Link#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition_Link#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for chained invocation
     */
    public final Builder min(int min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min;
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("min")
    public final Builder min(Optional<Integer> min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min.orElse(null);
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#sliceName() sliceName} to sliceName.
     * @param sliceName The value for sliceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder sliceName(String sliceName) {
      checkNotIsSet(sliceNameIsSet(), "sliceName");
      this.sliceName = Objects.requireNonNull(sliceName, "sliceName");
      optBits |= OPT_BIT_SLICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#sliceName() sliceName} to sliceName.
     * @param sliceName The value for sliceName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sliceName")
    public final Builder sliceName(Optional<String> sliceName) {
      checkNotIsSet(sliceNameIsSet(), "sliceName");
      this.sliceName = sliceName.orElse(null);
      optBits |= OPT_BIT_SLICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<GraphDefinition_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Link#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<GraphDefinition_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Builds a new {@link GraphDefinition_Link GraphDefinition_Link}.
     * @return An immutable instance of GraphDefinition_Link
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public GraphDefinition_Link build() {
      return new ImmutableGraphDefinition_Link(path, max, extension, description, id, modifierExtension, min, sliceName, target);
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean sliceNameIsSet() {
      return (optBits & OPT_BIT_SLICE_NAME) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of GraphDefinition_Link is strict, attribute is already set: ".concat(name));
    }
  }
}
