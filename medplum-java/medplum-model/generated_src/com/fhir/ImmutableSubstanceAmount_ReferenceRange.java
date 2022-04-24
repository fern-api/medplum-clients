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
 * Immutable implementation of {@link SubstanceAmount_ReferenceRange}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceAmount_ReferenceRange.builder()}.
 */
@Generated(from = "SubstanceAmount_ReferenceRange", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceAmount_ReferenceRange implements SubstanceAmount_ReferenceRange {
  private final @Nullable List<Extension> extension;
  private final @Nullable Quantity highLimit;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Quantity lowLimit;

  private ImmutableSubstanceAmount_ReferenceRange(
      @Nullable List<Extension> extension,
      @Nullable Quantity highLimit,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Quantity lowLimit) {
    this.extension = extension;
    this.highLimit = highLimit;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.lowLimit = lowLimit;
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
   * @return The value of the {@code highLimit} attribute
   */
  @JsonProperty("highLimit")
  @Override
  public Optional<Quantity> highLimit() {
    return Optional.ofNullable(highLimit);
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
   * @return The value of the {@code lowLimit} attribute
   */
  @JsonProperty("lowLimit")
  @Override
  public Optional<Quantity> lowLimit() {
    return Optional.ofNullable(lowLimit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount_ReferenceRange#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount_ReferenceRange withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(newValue, this.highLimit, this.modifierExtension, this.id, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount_ReferenceRange#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount_ReferenceRange withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(value, this.highLimit, this.modifierExtension, this.id, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount_ReferenceRange#highLimit() highLimit} attribute.
   * @param value The value for highLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount_ReferenceRange withHighLimit(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "highLimit");
    if (this.highLimit == newValue) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, newValue, this.modifierExtension, this.id, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount_ReferenceRange#highLimit() highLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for highLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount_ReferenceRange withHighLimit(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.highLimit == value) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, value, this.modifierExtension, this.id, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount_ReferenceRange#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount_ReferenceRange withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, this.highLimit, newValue, this.id, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount_ReferenceRange#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount_ReferenceRange withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, this.highLimit, value, this.id, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount_ReferenceRange#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount_ReferenceRange withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, this.highLimit, this.modifierExtension, newValue, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount_ReferenceRange#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount_ReferenceRange withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, this.highLimit, this.modifierExtension, value, this.lowLimit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount_ReferenceRange#lowLimit() lowLimit} attribute.
   * @param value The value for lowLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount_ReferenceRange withLowLimit(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "lowLimit");
    if (this.lowLimit == newValue) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, this.highLimit, this.modifierExtension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount_ReferenceRange#lowLimit() lowLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lowLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount_ReferenceRange withLowLimit(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.lowLimit == value) return this;
    return new ImmutableSubstanceAmount_ReferenceRange(this.extension, this.highLimit, this.modifierExtension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceAmount_ReferenceRange} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceAmount_ReferenceRange
        && equalTo((ImmutableSubstanceAmount_ReferenceRange) another);
  }

  private boolean equalTo(ImmutableSubstanceAmount_ReferenceRange another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(highLimit, another.highLimit)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(lowLimit, another.lowLimit);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code highLimit}, {@code modifierExtension}, {@code id}, {@code lowLimit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(highLimit);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(lowLimit);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceAmount_ReferenceRange} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceAmount_ReferenceRange{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (highLimit != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("highLimit=").append(highLimit);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (lowLimit != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("lowLimit=").append(lowLimit);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceAmount_ReferenceRange", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceAmount_ReferenceRange {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Quantity> highLimit = Optional.empty();
    boolean highLimitIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> lowLimit = Optional.empty();
    boolean lowLimitIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("highLimit")
    public void setHighLimit(Optional<Quantity> highLimit) {
      this.highLimit = highLimit;
      this.highLimitIsSet = true;
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
    @JsonProperty("lowLimit")
    public void setLowLimit(Optional<Quantity> lowLimit) {
      this.lowLimit = lowLimit;
      this.lowLimitIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> highLimit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> lowLimit() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceAmount_ReferenceRange fromJson(Json json) {
    ImmutableSubstanceAmount_ReferenceRange.Builder builder = ImmutableSubstanceAmount_ReferenceRange.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.highLimitIsSet) {
      builder.highLimit(json.highLimit);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.lowLimitIsSet) {
      builder.lowLimit(json.lowLimit);
    }
    return (ImmutableSubstanceAmount_ReferenceRange) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceAmount_ReferenceRange} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceAmount_ReferenceRange instance
   */
  public static SubstanceAmount_ReferenceRange copyOf(SubstanceAmount_ReferenceRange instance) {
    if (instance instanceof ImmutableSubstanceAmount_ReferenceRange) {
      return (ImmutableSubstanceAmount_ReferenceRange) instance;
    }
    return ImmutableSubstanceAmount_ReferenceRange.builder()
        .extension(instance.extension())
        .highLimit(instance.highLimit())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .lowLimit(instance.lowLimit())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceAmount_ReferenceRange SubstanceAmount_ReferenceRange}.
   * <pre>
   * ImmutableSubstanceAmount_ReferenceRange.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceAmount_ReferenceRange#extension() extension}
   *    .highLimit(com.fhir.Quantity) // optional {@link SubstanceAmount_ReferenceRange#highLimit() highLimit}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceAmount_ReferenceRange#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link SubstanceAmount_ReferenceRange#id() id}
   *    .lowLimit(com.fhir.Quantity) // optional {@link SubstanceAmount_ReferenceRange#lowLimit() lowLimit}
   *    .build();
   * </pre>
   * @return A new SubstanceAmount_ReferenceRange builder
   */
  public static ImmutableSubstanceAmount_ReferenceRange.Builder builder() {
    return new ImmutableSubstanceAmount_ReferenceRange.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceAmount_ReferenceRange SubstanceAmount_ReferenceRange}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceAmount_ReferenceRange", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_HIGH_LIMIT = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_LOW_LIMIT = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Quantity highLimit;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Quantity lowLimit;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#highLimit() highLimit} to highLimit.
     * @param highLimit The value for highLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder highLimit(Quantity highLimit) {
      checkNotIsSet(highLimitIsSet(), "highLimit");
      this.highLimit = Objects.requireNonNull(highLimit, "highLimit");
      optBits |= OPT_BIT_HIGH_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#highLimit() highLimit} to highLimit.
     * @param highLimit The value for highLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("highLimit")
    public final Builder highLimit(Optional<? extends Quantity> highLimit) {
      checkNotIsSet(highLimitIsSet(), "highLimit");
      this.highLimit = highLimit.orElse(null);
      optBits |= OPT_BIT_HIGH_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#id() id} to id.
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
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#id() id} to id.
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
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#lowLimit() lowLimit} to lowLimit.
     * @param lowLimit The value for lowLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder lowLimit(Quantity lowLimit) {
      checkNotIsSet(lowLimitIsSet(), "lowLimit");
      this.lowLimit = Objects.requireNonNull(lowLimit, "lowLimit");
      optBits |= OPT_BIT_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount_ReferenceRange#lowLimit() lowLimit} to lowLimit.
     * @param lowLimit The value for lowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lowLimit")
    public final Builder lowLimit(Optional<? extends Quantity> lowLimit) {
      checkNotIsSet(lowLimitIsSet(), "lowLimit");
      this.lowLimit = lowLimit.orElse(null);
      optBits |= OPT_BIT_LOW_LIMIT;
      return this;
    }

    /**
     * Builds a new {@link SubstanceAmount_ReferenceRange SubstanceAmount_ReferenceRange}.
     * @return An immutable instance of SubstanceAmount_ReferenceRange
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceAmount_ReferenceRange build() {
      return new ImmutableSubstanceAmount_ReferenceRange(extension, highLimit, modifierExtension, id, lowLimit);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean highLimitIsSet() {
      return (optBits & OPT_BIT_HIGH_LIMIT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean lowLimitIsSet() {
      return (optBits & OPT_BIT_LOW_LIMIT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceAmount_ReferenceRange is strict, attribute is already set: ".concat(name));
    }
  }
}
