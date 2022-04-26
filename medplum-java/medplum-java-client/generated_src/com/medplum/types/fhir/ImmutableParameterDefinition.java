package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ParameterDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParameterDefinition.builder()}.
 */
@Generated(from = "ParameterDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableParameterDefinition implements ParameterDefinition {
  private final @Nullable String max;
  private final @Nullable Integer min;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable String documentation;
  private final @Nullable Canonical profile;
  private final @Nullable Code name;
  private final @Nullable Code use;
  private final @Nullable Code type;

  private ImmutableParameterDefinition(
      @Nullable String max,
      @Nullable Integer min,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable String documentation,
      @Nullable Canonical profile,
      @Nullable Code name,
      @Nullable Code use,
      @Nullable Code type) {
    this.max = max;
    this.min = min;
    this.id = id;
    this.extension = extension;
    this.documentation = documentation;
    this.profile = profile;
    this.name = name;
    this.use = use;
    this.type = type;
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
   * @return The value of the {@code min} attribute
   */
  @JsonProperty("min")
  @Override
  public Optional<Integer> min() {
    return Optional.ofNullable(min);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<String> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<Canonical> profile() {
    return Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<Code> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<Code> use() {
    return Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Code> type() {
    return Optional.ofNullable(type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMax(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "max");
    if (Objects.equals(this.max, newValue)) return this;
    return new ImmutableParameterDefinition(
        newValue,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMax(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.max, value)) return this;
    return new ImmutableParameterDefinition(
        value,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMin(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.min, newValue)) return this;
    return new ImmutableParameterDefinition(
        this.max,
        newValue,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#min() min} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMin(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.min, value)) return this;
    return new ImmutableParameterDefinition(
        this.max,
        value,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        newValue,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        value,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        newValue,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        value,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withDocumentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentation");
    if (Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        newValue,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withDocumentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentation, value)) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        value,
        this.profile,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        newValue,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        value,
        this.name,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withName(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        newValue,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withName(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        value,
        this.use,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withUse(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withUse(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableParameterDefinition(
        this.max,
        this.min,
        this.id,
        this.extension,
        this.documentation,
        this.profile,
        this.name,
        this.use,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParameterDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParameterDefinition
        && equalTo((ImmutableParameterDefinition) another);
  }

  private boolean equalTo(ImmutableParameterDefinition another) {
    return Objects.equals(max, another.max)
        && Objects.equals(min, another.min)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(profile, another.profile)
        && Objects.equals(name, another.name)
        && Objects.equals(use, another.use)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code max}, {@code min}, {@code id}, {@code extension}, {@code documentation}, {@code profile}, {@code name}, {@code use}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(max);
    h += (h << 5) + Objects.hashCode(min);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code ParameterDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ParameterDefinition{");
    if (max != null) {
      builder.append("max=").append(max);
    }
    if (min != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (documentation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (profile != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (use != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ParameterDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ParameterDefinition {
    @Nullable Optional<String> max = Optional.empty();
    boolean maxIsSet;
    @Nullable Optional<Integer> min = Optional.empty();
    boolean minIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<Canonical> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<Code> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Code> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<Code> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("max")
    public void setMax(Optional<String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @JsonProperty("min")
    public void setMin(Optional<Integer> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<Canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<Code> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<Code> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public Optional<String> max() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> min() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableParameterDefinition fromJson(Json json) {
    ImmutableParameterDefinition.Builder builder = ImmutableParameterDefinition.builder();
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableParameterDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ParameterDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ParameterDefinition instance
   */
  public static ParameterDefinition copyOf(ParameterDefinition instance) {
    if (instance instanceof ImmutableParameterDefinition) {
      return (ImmutableParameterDefinition) instance;
    }
    return ImmutableParameterDefinition.builder()
        .max(instance.max())
        .min(instance.min())
        .id(instance.id())
        .extension(instance.extension())
        .documentation(instance.documentation())
        .profile(instance.profile())
        .name(instance.name())
        .use(instance.use())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link ParameterDefinition ParameterDefinition}.
   * <pre>
   * ImmutableParameterDefinition.builder()
   *    .max(String) // optional {@link ParameterDefinition#max() max}
   *    .min(Integer) // optional {@link ParameterDefinition#min() min}
   *    .id(String) // optional {@link ParameterDefinition#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ParameterDefinition#extension() extension}
   *    .documentation(String) // optional {@link ParameterDefinition#documentation() documentation}
   *    .profile(com.medplum.types.fhir.Canonical) // optional {@link ParameterDefinition#profile() profile}
   *    .name(com.medplum.types.fhir.Code) // optional {@link ParameterDefinition#name() name}
   *    .use(com.medplum.types.fhir.Code) // optional {@link ParameterDefinition#use() use}
   *    .type(com.medplum.types.fhir.Code) // optional {@link ParameterDefinition#type() type}
   *    .build();
   * </pre>
   * @return A new ParameterDefinition builder
   */
  public static ImmutableParameterDefinition.Builder builder() {
    return new ImmutableParameterDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ParameterDefinition ParameterDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ParameterDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MAX = 0x1L;
    private static final long OPT_BIT_MIN = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DOCUMENTATION = 0x10L;
    private static final long OPT_BIT_PROFILE = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private static final long OPT_BIT_USE = 0x80L;
    private static final long OPT_BIT_TYPE = 0x100L;
    private long optBits;

    private @Nullable String max;
    private @Nullable Integer min;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable String documentation;
    private @Nullable Canonical profile;
    private @Nullable Code name;
    private @Nullable Code use;
    private @Nullable Code type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#max() max} to max.
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
     * Initializes the optional value {@link ParameterDefinition#max() max} to max.
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
     * Initializes the optional value {@link ParameterDefinition#min() min} to min.
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
     * Initializes the optional value {@link ParameterDefinition#min() min} to min.
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
     * Initializes the optional value {@link ParameterDefinition#id() id} to id.
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
     * Initializes the optional value {@link ParameterDefinition#id() id} to id.
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
     * Initializes the optional value {@link ParameterDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ParameterDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ParameterDefinition#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(Canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(Code name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends Code> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(Code use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends Code> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ParameterDefinition ParameterDefinition}.
     * @return An immutable instance of ParameterDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ParameterDefinition build() {
      return new ImmutableParameterDefinition(max, min, id, extension, documentation, profile, name, use, type);
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ParameterDefinition is strict, attribute is already set: ".concat(name));
    }
  }
}
