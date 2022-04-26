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
 * Immutable implementation of {@link VisionPrescription_Prism}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVisionPrescription_Prism.builder()}.
 */
@Generated(from = "VisionPrescription_Prism", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVisionPrescription_Prism implements VisionPrescription_Prism {
  private final @Nullable Decimal amount;
  private final @Nullable Visionprescription_PrismBase base;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableVisionPrescription_Prism(
      @Nullable Decimal amount,
      @Nullable Visionprescription_PrismBase base,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.amount = amount;
    this.base = base;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<Decimal> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * @return The value of the {@code base} attribute
   */
  @JsonProperty("base")
  @Override
  public Optional<Visionprescription_PrismBase> base() {
    return Optional.ofNullable(base);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withAmount(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableVisionPrescription_Prism(newValue, this.base, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withAmount(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableVisionPrescription_Prism(value, this.base, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withBase(Visionprescription_PrismBase value) {
    @Nullable Visionprescription_PrismBase newValue = Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, newValue, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withBase(Optional<? extends Visionprescription_PrismBase> optional) {
    @Nullable Visionprescription_PrismBase value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, value, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, this.base, newValue, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, this.base, value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, this.base, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, this.base, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, this.base, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVisionPrescription_Prism(this.amount, this.base, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVisionPrescription_Prism} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVisionPrescription_Prism
        && equalTo((ImmutableVisionPrescription_Prism) another);
  }

  private boolean equalTo(ImmutableVisionPrescription_Prism another) {
    return Objects.equals(amount, another.amount)
        && Objects.equals(base, another.base)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code amount}, {@code base}, {@code id}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(base);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code VisionPrescription_Prism} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VisionPrescription_Prism{");
    if (amount != null) {
      builder.append("amount=").append(amount);
    }
    if (base != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("base=").append(base);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "VisionPrescription_Prism", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements VisionPrescription_Prism {
    @Nullable Optional<Decimal> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<Visionprescription_PrismBase> base = Optional.empty();
    boolean baseIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("amount")
    public void setAmount(Optional<Decimal> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @JsonProperty("base")
    public void setBase(Optional<Visionprescription_PrismBase> base) {
      this.base = base;
      this.baseIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Decimal> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Visionprescription_PrismBase> base() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableVisionPrescription_Prism fromJson(Json json) {
    ImmutableVisionPrescription_Prism.Builder builder = ImmutableVisionPrescription_Prism.builder();
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableVisionPrescription_Prism) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VisionPrescription_Prism} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VisionPrescription_Prism instance
   */
  public static VisionPrescription_Prism copyOf(VisionPrescription_Prism instance) {
    if (instance instanceof ImmutableVisionPrescription_Prism) {
      return (ImmutableVisionPrescription_Prism) instance;
    }
    return ImmutableVisionPrescription_Prism.builder()
        .amount(instance.amount())
        .base(instance.base())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link VisionPrescription_Prism VisionPrescription_Prism}.
   * <pre>
   * ImmutableVisionPrescription_Prism.builder()
   *    .amount(com.fhir.types.fhir.Decimal) // optional {@link VisionPrescription_Prism#amount() amount}
   *    .base(Visionprescription_PrismBase) // optional {@link VisionPrescription_Prism#base() base}
   *    .id(String) // optional {@link VisionPrescription_Prism#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_Prism#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_Prism#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new VisionPrescription_Prism builder
   */
  public static ImmutableVisionPrescription_Prism.Builder builder() {
    return new ImmutableVisionPrescription_Prism.Builder();
  }

  /**
   * Builds instances of type {@link VisionPrescription_Prism VisionPrescription_Prism}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "VisionPrescription_Prism", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AMOUNT = 0x1L;
    private static final long OPT_BIT_BASE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable Decimal amount;
    private @Nullable Visionprescription_PrismBase base;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(Decimal amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends Decimal> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    public final Builder base(Visionprescription_PrismBase base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = Objects.requireNonNull(base, "base");
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("base")
    public final Builder base(Optional<? extends Visionprescription_PrismBase> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = base.orElse(null);
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#id() id} to id.
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
     * Initializes the optional value {@link VisionPrescription_Prism#id() id} to id.
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
     * Initializes the optional value {@link VisionPrescription_Prism#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_Prism#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_Prism#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription_Prism#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link VisionPrescription_Prism VisionPrescription_Prism}.
     * @return An immutable instance of VisionPrescription_Prism
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VisionPrescription_Prism build() {
      return new ImmutableVisionPrescription_Prism(amount, base, id, extension, modifierExtension);
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of VisionPrescription_Prism is strict, attribute is already set: ".concat(name));
    }
  }
}
