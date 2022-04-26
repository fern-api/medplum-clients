package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link OperationDefinition_Binding}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationDefinition_Binding.builder()}.
 */
@Generated(from = "OperationDefinition_Binding", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationDefinition_Binding
    implements OperationDefinition_Binding {
  private final @Nullable Operationdefinition_bindingStrength strength;
  private final @Nullable List<Extension> modifierExtension;
  private final Canonical valueSet;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableOperationDefinition_Binding(
      @Nullable Operationdefinition_bindingStrength strength,
      @Nullable List<Extension> modifierExtension,
      Canonical valueSet,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.strength = strength;
    this.modifierExtension = modifierExtension;
    this.valueSet = valueSet;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code strength} attribute
   */
  @JsonProperty("strength")
  @Override
  public Optional<Operationdefinition_bindingStrength> strength() {
    return Optional.ofNullable(strength);
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
   * @return The value of the {@code valueSet} attribute
   */
  @JsonProperty("valueSet")
  @Override
  public Canonical valueSet() {
    return valueSet;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#strength() strength} attribute.
   * @param value The value for strength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withStrength(Operationdefinition_bindingStrength value) {
    @Nullable Operationdefinition_bindingStrength newValue = Objects.requireNonNull(value, "strength");
    if (this.strength == newValue) return this;
    return new ImmutableOperationDefinition_Binding(newValue, this.modifierExtension, this.valueSet, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#strength() strength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Binding withStrength(Optional<? extends Operationdefinition_bindingStrength> optional) {
    @Nullable Operationdefinition_bindingStrength value = optional.orElse(null);
    if (this.strength == value) return this;
    return new ImmutableOperationDefinition_Binding(value, this.modifierExtension, this.valueSet, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationDefinition_Binding(this.strength, newValue, this.valueSet, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Binding withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationDefinition_Binding(this.strength, value, this.valueSet, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OperationDefinition_Binding#valueSet() valueSet} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for valueSet
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withValueSet(Canonical value) {
    if (this.valueSet == value) return this;
    Canonical newValue = Objects.requireNonNull(value, "valueSet");
    return new ImmutableOperationDefinition_Binding(this.strength, this.modifierExtension, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationDefinition_Binding(this.strength, this.modifierExtension, this.valueSet, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Binding withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationDefinition_Binding(this.strength, this.modifierExtension, this.valueSet, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableOperationDefinition_Binding(this.strength, this.modifierExtension, this.valueSet, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableOperationDefinition_Binding(this.strength, this.modifierExtension, this.valueSet, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationDefinition_Binding} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationDefinition_Binding
        && equalTo((ImmutableOperationDefinition_Binding) another);
  }

  private boolean equalTo(ImmutableOperationDefinition_Binding another) {
    return Objects.equals(strength, another.strength)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && valueSet.equals(another.valueSet)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code strength}, {@code modifierExtension}, {@code valueSet}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(strength);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + valueSet.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationDefinition_Binding} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OperationDefinition_Binding{");
    if (strength != null) {
      builder.append("strength=").append(strength);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("valueSet=").append(valueSet);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OperationDefinition_Binding {
    @Nullable Optional<Operationdefinition_bindingStrength> strength = Optional.empty();
    boolean strengthIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Canonical valueSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("strength")
    public void setStrength(Optional<Operationdefinition_bindingStrength> strength) {
      this.strength = strength;
      this.strengthIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueSet")
    public void setValueSet(Canonical valueSet) {
      this.valueSet = valueSet;
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
    @Override
    public Optional<Operationdefinition_bindingStrength> strength() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Canonical valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableOperationDefinition_Binding fromJson(Json json) {
    ImmutableOperationDefinition_Binding.Builder builder = ((ImmutableOperationDefinition_Binding.Builder) ImmutableOperationDefinition_Binding.builder());
    if (json.strengthIsSet) {
      builder.strength(json.strength);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueSet != null) {
      builder.valueSet(json.valueSet);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableOperationDefinition_Binding) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationDefinition_Binding} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationDefinition_Binding instance
   */
  public static OperationDefinition_Binding copyOf(OperationDefinition_Binding instance) {
    if (instance instanceof ImmutableOperationDefinition_Binding) {
      return (ImmutableOperationDefinition_Binding) instance;
    }
    return ((ImmutableOperationDefinition_Binding.Builder) ImmutableOperationDefinition_Binding.builder())
        .strength(instance.strength())
        .modifierExtension(instance.modifierExtension())
        .valueSet(instance.valueSet())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link OperationDefinition_Binding OperationDefinition_Binding}.
   * <pre>
   * ImmutableOperationDefinition_Binding.builder()
   *    .strength(com.medplum.types.fhir.Operationdefinition_bindingStrength) // optional {@link OperationDefinition_Binding#strength() strength}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Binding#modifierExtension() modifierExtension}
   *    .valueSet(com.medplum.types.fhir.Canonical) // required {@link OperationDefinition_Binding#valueSet() valueSet}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Binding#extension() extension}
   *    .id(String) // optional {@link OperationDefinition_Binding#id() id}
   *    .build();
   * </pre>
   * @return A new OperationDefinition_Binding builder
   */
  public static ValueSetBuildStage builder() {
    return new ImmutableOperationDefinition_Binding.Builder();
  }

  /**
   * Builds instances of type {@link OperationDefinition_Binding OperationDefinition_Binding}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ValueSetBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE_SET = 0x1L;
    private static final long OPT_BIT_STRENGTH = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Operationdefinition_bindingStrength strength;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Canonical valueSet;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    public final Builder strength(Operationdefinition_bindingStrength strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = Objects.requireNonNull(strength, "strength");
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strength")
    public final Builder strength(Optional<? extends Operationdefinition_bindingStrength> strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = strength.orElse(null);
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link OperationDefinition_Binding#valueSet() valueSet} attribute.
     * @param valueSet The value for valueSet 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSet")
    public final Builder valueSet(Canonical valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = Objects.requireNonNull(valueSet, "valueSet");
      initBits &= ~INIT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
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
     * Builds a new {@link OperationDefinition_Binding OperationDefinition_Binding}.
     * @return An immutable instance of OperationDefinition_Binding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public OperationDefinition_Binding build() {
      checkRequiredAttributes();
      return new ImmutableOperationDefinition_Binding(strength, modifierExtension, valueSet, extension, id);
    }

    private boolean strengthIsSet() {
      return (optBits & OPT_BIT_STRENGTH) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueSetIsSet() {
      return (initBits & INIT_BIT_VALUE_SET) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of OperationDefinition_Binding is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!valueSetIsSet()) attributes.add("valueSet");
      return "Cannot build OperationDefinition_Binding, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  public interface ValueSetBuildStage {
    /**
     * Initializes the value for the {@link OperationDefinition_Binding#valueSet() valueSet} attribute.
     * @param valueSet The value for valueSet 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSet(Canonical valueSet);
  }

  @Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    BuildFinal strength(Operationdefinition_bindingStrength strength);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal strength(Optional<? extends Operationdefinition_bindingStrength> strength);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link OperationDefinition_Binding OperationDefinition_Binding}.
     * @return An immutable instance of OperationDefinition_Binding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    OperationDefinition_Binding build();
  }
}
