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
 * Immutable implementation of {@link ChargeItemDefinition_PropertyGroup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeItemDefinition_PropertyGroup.builder()}.
 */
@Generated(from = "ChargeItemDefinition_PropertyGroup", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableChargeItemDefinition_PropertyGroup
    implements ChargeItemDefinition_PropertyGroup {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ChargeItemDefinition_PriceComponent> priceComponent;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ChargeItemDefinition_Applicability> applicability;

  private ImmutableChargeItemDefinition_PropertyGroup(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<ChargeItemDefinition_PriceComponent> priceComponent,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ChargeItemDefinition_Applicability> applicability) {
    this.id = id;
    this.extension = extension;
    this.priceComponent = priceComponent;
    this.modifierExtension = modifierExtension;
    this.applicability = applicability;
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
   * @return The value of the {@code priceComponent} attribute
   */
  @JsonProperty("priceComponent")
  @Override
  public Optional<List<ChargeItemDefinition_PriceComponent>> priceComponent() {
    return Optional.ofNullable(priceComponent);
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
   * @return The value of the {@code applicability} attribute
   */
  @JsonProperty("applicability")
  @Override
  public Optional<List<ChargeItemDefinition_Applicability>> applicability() {
    return Optional.ofNullable(applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PropertyGroup#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PropertyGroup withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(newValue, this.extension, this.priceComponent, this.modifierExtension, this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PropertyGroup#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PropertyGroup withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(value, this.extension, this.priceComponent, this.modifierExtension, this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PropertyGroup#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PropertyGroup withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, newValue, this.priceComponent, this.modifierExtension, this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PropertyGroup#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PropertyGroup withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, value, this.priceComponent, this.modifierExtension, this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PropertyGroup#priceComponent() priceComponent} attribute.
   * @param value The value for priceComponent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PropertyGroup withPriceComponent(List<ChargeItemDefinition_PriceComponent> value) {
    @Nullable List<ChargeItemDefinition_PriceComponent> newValue = Objects.requireNonNull(value, "priceComponent");
    if (this.priceComponent == newValue) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, this.extension, newValue, this.modifierExtension, this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PropertyGroup#priceComponent() priceComponent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priceComponent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PropertyGroup withPriceComponent(Optional<? extends List<ChargeItemDefinition_PriceComponent>> optional) {
    @Nullable List<ChargeItemDefinition_PriceComponent> value = optional.orElse(null);
    if (this.priceComponent == value) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, this.extension, value, this.modifierExtension, this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PropertyGroup#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PropertyGroup withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, this.extension, this.priceComponent, newValue, this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PropertyGroup#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PropertyGroup withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, this.extension, this.priceComponent, value, this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PropertyGroup#applicability() applicability} attribute.
   * @param value The value for applicability
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PropertyGroup withApplicability(List<ChargeItemDefinition_Applicability> value) {
    @Nullable List<ChargeItemDefinition_Applicability> newValue = Objects.requireNonNull(value, "applicability");
    if (this.applicability == newValue) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, this.extension, this.priceComponent, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PropertyGroup#applicability() applicability} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applicability
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PropertyGroup withApplicability(Optional<? extends List<ChargeItemDefinition_Applicability>> optional) {
    @Nullable List<ChargeItemDefinition_Applicability> value = optional.orElse(null);
    if (this.applicability == value) return this;
    return new ImmutableChargeItemDefinition_PropertyGroup(this.id, this.extension, this.priceComponent, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeItemDefinition_PropertyGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeItemDefinition_PropertyGroup
        && equalTo((ImmutableChargeItemDefinition_PropertyGroup) another);
  }

  private boolean equalTo(ImmutableChargeItemDefinition_PropertyGroup another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(priceComponent, another.priceComponent)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(applicability, another.applicability);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code priceComponent}, {@code modifierExtension}, {@code applicability}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(priceComponent);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(applicability);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeItemDefinition_PropertyGroup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ChargeItemDefinition_PropertyGroup{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (priceComponent != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("priceComponent=").append(priceComponent);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (applicability != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("applicability=").append(applicability);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ChargeItemDefinition_PropertyGroup", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ChargeItemDefinition_PropertyGroup {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ChargeItemDefinition_PriceComponent>> priceComponent = Optional.empty();
    boolean priceComponentIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ChargeItemDefinition_Applicability>> applicability = Optional.empty();
    boolean applicabilityIsSet;
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
    @JsonProperty("priceComponent")
    public void setPriceComponent(Optional<List<ChargeItemDefinition_PriceComponent>> priceComponent) {
      this.priceComponent = priceComponent;
      this.priceComponentIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("applicability")
    public void setApplicability(Optional<List<ChargeItemDefinition_Applicability>> applicability) {
      this.applicability = applicability;
      this.applicabilityIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ChargeItemDefinition_PriceComponent>> priceComponent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ChargeItemDefinition_Applicability>> applicability() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableChargeItemDefinition_PropertyGroup fromJson(Json json) {
    ImmutableChargeItemDefinition_PropertyGroup.Builder builder = ImmutableChargeItemDefinition_PropertyGroup.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.priceComponentIsSet) {
      builder.priceComponent(json.priceComponent);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.applicabilityIsSet) {
      builder.applicability(json.applicability);
    }
    return (ImmutableChargeItemDefinition_PropertyGroup) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChargeItemDefinition_PropertyGroup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeItemDefinition_PropertyGroup instance
   */
  public static ChargeItemDefinition_PropertyGroup copyOf(ChargeItemDefinition_PropertyGroup instance) {
    if (instance instanceof ImmutableChargeItemDefinition_PropertyGroup) {
      return (ImmutableChargeItemDefinition_PropertyGroup) instance;
    }
    return ImmutableChargeItemDefinition_PropertyGroup.builder()
        .id(instance.id())
        .extension(instance.extension())
        .priceComponent(instance.priceComponent())
        .modifierExtension(instance.modifierExtension())
        .applicability(instance.applicability())
        .build();
  }

  /**
   * Creates a builder for {@link ChargeItemDefinition_PropertyGroup ChargeItemDefinition_PropertyGroup}.
   * <pre>
   * ImmutableChargeItemDefinition_PropertyGroup.builder()
   *    .id(String) // optional {@link ChargeItemDefinition_PropertyGroup#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition_PropertyGroup#extension() extension}
   *    .priceComponent(List&amp;lt;com.fhir.types.fhir.ChargeItemDefinition_PriceComponent&amp;gt;) // optional {@link ChargeItemDefinition_PropertyGroup#priceComponent() priceComponent}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition_PropertyGroup#modifierExtension() modifierExtension}
   *    .applicability(List&amp;lt;com.fhir.types.fhir.ChargeItemDefinition_Applicability&amp;gt;) // optional {@link ChargeItemDefinition_PropertyGroup#applicability() applicability}
   *    .build();
   * </pre>
   * @return A new ChargeItemDefinition_PropertyGroup builder
   */
  public static ImmutableChargeItemDefinition_PropertyGroup.Builder builder() {
    return new ImmutableChargeItemDefinition_PropertyGroup.Builder();
  }

  /**
   * Builds instances of type {@link ChargeItemDefinition_PropertyGroup ChargeItemDefinition_PropertyGroup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ChargeItemDefinition_PropertyGroup", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_PRICE_COMPONENT = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_APPLICABILITY = 0x10L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<ChargeItemDefinition_PriceComponent> priceComponent;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ChargeItemDefinition_Applicability> applicability;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#priceComponent() priceComponent} to priceComponent.
     * @param priceComponent The value for priceComponent
     * @return {@code this} builder for chained invocation
     */
    public final Builder priceComponent(List<ChargeItemDefinition_PriceComponent> priceComponent) {
      checkNotIsSet(priceComponentIsSet(), "priceComponent");
      this.priceComponent = Objects.requireNonNull(priceComponent, "priceComponent");
      optBits |= OPT_BIT_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#priceComponent() priceComponent} to priceComponent.
     * @param priceComponent The value for priceComponent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priceComponent")
    public final Builder priceComponent(Optional<? extends List<ChargeItemDefinition_PriceComponent>> priceComponent) {
      checkNotIsSet(priceComponentIsSet(), "priceComponent");
      this.priceComponent = priceComponent.orElse(null);
      optBits |= OPT_BIT_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for chained invocation
     */
    public final Builder applicability(List<ChargeItemDefinition_Applicability> applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = Objects.requireNonNull(applicability, "applicability");
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PropertyGroup#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicability")
    public final Builder applicability(Optional<? extends List<ChargeItemDefinition_Applicability>> applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = applicability.orElse(null);
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Builds a new {@link ChargeItemDefinition_PropertyGroup ChargeItemDefinition_PropertyGroup}.
     * @return An immutable instance of ChargeItemDefinition_PropertyGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ChargeItemDefinition_PropertyGroup build() {
      return new ImmutableChargeItemDefinition_PropertyGroup(id, extension, priceComponent, modifierExtension, applicability);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean priceComponentIsSet() {
      return (optBits & OPT_BIT_PRICE_COMPONENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean applicabilityIsSet() {
      return (optBits & OPT_BIT_APPLICABILITY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ChargeItemDefinition_PropertyGroup is strict, attribute is already set: ".concat(name));
    }
  }
}
