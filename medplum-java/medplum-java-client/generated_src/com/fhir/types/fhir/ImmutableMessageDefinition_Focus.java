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
 * Immutable implementation of {@link MessageDefinition_Focus}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageDefinition_Focus.builder()}.
 */
@Generated(from = "MessageDefinition_Focus", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageDefinition_Focus implements MessageDefinition_Focus {
  private final @Nullable String id;
  private final @Nullable UnsignedInt min;
  private final @Nullable Canonical profile;
  private final @Nullable Code code;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String max;

  private ImmutableMessageDefinition_Focus(
      @Nullable String id,
      @Nullable UnsignedInt min,
      @Nullable Canonical profile,
      @Nullable Code code,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String max) {
    this.id = id;
    this.min = min;
    this.profile = profile;
    this.code = code;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.max = max;
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
   * @return The value of the {@code min} attribute
   */
  @JsonProperty("min")
  @Override
  public Optional<UnsignedInt> min() {
    return Optional.ofNullable(min);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_Focus#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageDefinition_Focus(newValue, this.min, this.profile, this.code, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_Focus#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMessageDefinition_Focus(value, this.min, this.profile, this.code, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_Focus#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withMin(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "min");
    if (this.min == newValue) return this;
    return new ImmutableMessageDefinition_Focus(this.id, newValue, this.profile, this.code, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_Focus#min() min} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_Focus withMin(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.min == value) return this;
    return new ImmutableMessageDefinition_Focus(this.id, value, this.profile, this.code, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_Focus#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, newValue, this.code, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_Focus#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_Focus withProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, value, this.code, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_Focus#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, newValue, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_Focus#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_Focus withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, value, this.extension, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_Focus#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, this.code, newValue, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_Focus#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_Focus withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, this.code, value, this.modifierExtension, this.max);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_Focus#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, this.code, this.extension, newValue, this.max);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_Focus#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_Focus withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, this.code, this.extension, value, this.max);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_Focus#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withMax(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "max");
    if (Objects.equals(this.max, newValue)) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, this.code, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_Focus#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_Focus withMax(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.max, value)) return this;
    return new ImmutableMessageDefinition_Focus(this.id, this.min, this.profile, this.code, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageDefinition_Focus} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageDefinition_Focus
        && equalTo((ImmutableMessageDefinition_Focus) another);
  }

  private boolean equalTo(ImmutableMessageDefinition_Focus another) {
    return Objects.equals(id, another.id)
        && Objects.equals(min, another.min)
        && Objects.equals(profile, another.profile)
        && Objects.equals(code, another.code)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(max, another.max);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code min}, {@code profile}, {@code code}, {@code extension}, {@code modifierExtension}, {@code max}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(min);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(max);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageDefinition_Focus} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MessageDefinition_Focus{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (min != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (profile != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (code != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (max != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("max=").append(max);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MessageDefinition_Focus", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MessageDefinition_Focus {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<UnsignedInt> min = Optional.empty();
    boolean minIsSet;
    @Nullable Optional<Canonical> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> max = Optional.empty();
    boolean maxIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("min")
    public void setMin(Optional<UnsignedInt> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<Canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("max")
    public void setMax(Optional<String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> min() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> max() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMessageDefinition_Focus fromJson(Json json) {
    ImmutableMessageDefinition_Focus.Builder builder = ImmutableMessageDefinition_Focus.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    return (ImmutableMessageDefinition_Focus) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageDefinition_Focus} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageDefinition_Focus instance
   */
  public static MessageDefinition_Focus copyOf(MessageDefinition_Focus instance) {
    if (instance instanceof ImmutableMessageDefinition_Focus) {
      return (ImmutableMessageDefinition_Focus) instance;
    }
    return ImmutableMessageDefinition_Focus.builder()
        .id(instance.id())
        .min(instance.min())
        .profile(instance.profile())
        .code(instance.code())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .max(instance.max())
        .build();
  }

  /**
   * Creates a builder for {@link MessageDefinition_Focus MessageDefinition_Focus}.
   * <pre>
   * ImmutableMessageDefinition_Focus.builder()
   *    .id(String) // optional {@link MessageDefinition_Focus#id() id}
   *    .min(com.fhir.types.fhir.UnsignedInt) // optional {@link MessageDefinition_Focus#min() min}
   *    .profile(com.fhir.types.fhir.Canonical) // optional {@link MessageDefinition_Focus#profile() profile}
   *    .code(com.fhir.types.fhir.Code) // optional {@link MessageDefinition_Focus#code() code}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageDefinition_Focus#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageDefinition_Focus#modifierExtension() modifierExtension}
   *    .max(String) // optional {@link MessageDefinition_Focus#max() max}
   *    .build();
   * </pre>
   * @return A new MessageDefinition_Focus builder
   */
  public static ImmutableMessageDefinition_Focus.Builder builder() {
    return new ImmutableMessageDefinition_Focus.Builder();
  }

  /**
   * Builds instances of type {@link MessageDefinition_Focus MessageDefinition_Focus}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MessageDefinition_Focus", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MIN = 0x2L;
    private static final long OPT_BIT_PROFILE = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_MAX = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable UnsignedInt min;
    private @Nullable Canonical profile;
    private @Nullable Code code;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String max;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageDefinition_Focus#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition_Focus#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition_Focus#min() min} to min.
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
     * Initializes the optional value {@link MessageDefinition_Focus#min() min} to min.
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
     * Initializes the optional value {@link MessageDefinition_Focus#profile() profile} to profile.
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
     * Initializes the optional value {@link MessageDefinition_Focus#profile() profile} to profile.
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
     * Initializes the optional value {@link MessageDefinition_Focus#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition_Focus#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition_Focus#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition_Focus#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition_Focus#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition_Focus#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition_Focus#max() max} to max.
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
     * Initializes the optional value {@link MessageDefinition_Focus#max() max} to max.
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
     * Builds a new {@link MessageDefinition_Focus MessageDefinition_Focus}.
     * @return An immutable instance of MessageDefinition_Focus
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MessageDefinition_Focus build() {
      return new ImmutableMessageDefinition_Focus(id, min, profile, code, extension, modifierExtension, max);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MessageDefinition_Focus is strict, attribute is already set: ".concat(name));
    }
  }
}
