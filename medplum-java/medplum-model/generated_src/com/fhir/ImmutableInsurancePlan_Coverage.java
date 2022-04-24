package com.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link InsurancePlan_Coverage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_Coverage.builder()}.
 */
@Generated(from = "InsurancePlan_Coverage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_Coverage implements InsurancePlan_Coverage {
  private final @Nullable List<Extension> modifierExtension;
  private final List<InsurancePlan_Benefit> benefit;
  private final CodeableConcept type;
  private final @Nullable List<Reference> network;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableInsurancePlan_Coverage(
      @Nullable List<Extension> modifierExtension,
      List<InsurancePlan_Benefit> benefit,
      CodeableConcept type,
      @Nullable List<Reference> network,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.benefit = benefit;
    this.type = type;
    this.network = network;
    this.extension = extension;
    this.id = id;
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
   * @return The value of the {@code benefit} attribute
   */
  @JsonProperty("benefit")
  @Override
  public List<InsurancePlan_Benefit> benefit() {
    return benefit;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<List<Reference>> network() {
    return Optional.ofNullable(network);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Coverage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_Coverage(newValue, this.benefit, this.type, this.network, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Coverage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Coverage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_Coverage(value, this.benefit, this.type, this.network, this.extension, this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InsurancePlan_Coverage#benefit() benefit}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withBenefit(InsurancePlan_Benefit... elements) {
    List<InsurancePlan_Benefit> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, newValue, this.type, this.network, this.extension, this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InsurancePlan_Coverage#benefit() benefit}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of benefit elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withBenefit(Iterable<? extends InsurancePlan_Benefit> elements) {
    if (this.benefit == elements) return this;
    List<InsurancePlan_Benefit> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, newValue, this.type, this.network, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InsurancePlan_Coverage#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, this.benefit, newValue, this.network, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Coverage#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withNetwork(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, this.benefit, this.type, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Coverage#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Coverage withNetwork(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, this.benefit, this.type, value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Coverage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, this.benefit, this.type, this.network, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Coverage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Coverage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, this.benefit, this.type, this.network, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Coverage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, this.benefit, this.type, this.network, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Coverage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Coverage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_Coverage(this.modifierExtension, this.benefit, this.type, this.network, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_Coverage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_Coverage
        && equalTo((ImmutableInsurancePlan_Coverage) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_Coverage another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && benefit.equals(another.benefit)
        && type.equals(another.type)
        && Objects.equals(network, another.network)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code benefit}, {@code type}, {@code network}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + benefit.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_Coverage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_Coverage{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("benefit=").append(benefit);
    builder.append(", ");
    builder.append("type=").append(type);
    if (network != null) {
      builder.append(", ");
      builder.append("network=").append(network);
    }
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
  @Generated(from = "InsurancePlan_Coverage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_Coverage {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable List<InsurancePlan_Benefit> benefit = Collections.emptyList();
    @Nullable CodeableConcept type;
    @Nullable Optional<List<Reference>> network = Optional.empty();
    boolean networkIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("benefit")
    public void setBenefit(List<InsurancePlan_Benefit> benefit) {
      this.benefit = benefit;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<List<Reference>> network) {
      this.network = network;
      this.networkIsSet = true;
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
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public List<InsurancePlan_Benefit> benefit() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> network() { throw new UnsupportedOperationException(); }
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
  static ImmutableInsurancePlan_Coverage fromJson(Json json) {
    ImmutableInsurancePlan_Coverage.Builder builder = ((ImmutableInsurancePlan_Coverage.Builder) ImmutableInsurancePlan_Coverage.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.benefit != null) {
      builder.addAllBenefit(json.benefit);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableInsurancePlan_Coverage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_Coverage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_Coverage instance
   */
  public static InsurancePlan_Coverage copyOf(InsurancePlan_Coverage instance) {
    if (instance instanceof ImmutableInsurancePlan_Coverage) {
      return (ImmutableInsurancePlan_Coverage) instance;
    }
    return ((ImmutableInsurancePlan_Coverage.Builder) ImmutableInsurancePlan_Coverage.builder())
        .modifierExtension(instance.modifierExtension())
        .addAllBenefit(instance.benefit())
        .type(instance.type())
        .network(instance.network())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_Coverage InsurancePlan_Coverage}.
   * <pre>
   * ImmutableInsurancePlan_Coverage.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Coverage#modifierExtension() modifierExtension}
   *    .addBenefit|addAllBenefit(com.fhir.InsurancePlan_Benefit) // {@link InsurancePlan_Coverage#benefit() benefit} elements
   *    .type(com.fhir.CodeableConcept) // required {@link InsurancePlan_Coverage#type() type}
   *    .network(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link InsurancePlan_Coverage#network() network}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Coverage#extension() extension}
   *    .id(String) // optional {@link InsurancePlan_Coverage#id() id}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_Coverage builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableInsurancePlan_Coverage.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_Coverage InsurancePlan_Coverage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InsurancePlan_Coverage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_NETWORK = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private final List<InsurancePlan_Benefit> benefit = new ArrayList<InsurancePlan_Benefit>();
    private @Nullable CodeableConcept type;
    private @Nullable List<Reference> network;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Coverage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link InsurancePlan_Coverage#benefit() benefit} list.
     * @param element A benefit element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addBenefit(InsurancePlan_Benefit element) {
      this.benefit.add(Objects.requireNonNull(element, "benefit element"));
      return this;
    }

    /**
     * Adds elements to {@link InsurancePlan_Coverage#benefit() benefit} list.
     * @param elements An array of benefit elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addBenefit(InsurancePlan_Benefit... elements) {
      for (InsurancePlan_Benefit element : elements) {
        this.benefit.add(Objects.requireNonNull(element, "benefit element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link InsurancePlan_Coverage#benefit() benefit} list.
     * @param elements An iterable of benefit elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllBenefit(Iterable<? extends InsurancePlan_Benefit> elements) {
      for (InsurancePlan_Benefit element : elements) {
        this.benefit.add(Objects.requireNonNull(element, "benefit element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link InsurancePlan_Coverage#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(List<Reference> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<? extends List<Reference>> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Coverage#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Coverage#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Coverage#id() id} to id.
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
     * Builds a new {@link InsurancePlan_Coverage InsurancePlan_Coverage}.
     * @return An immutable instance of InsurancePlan_Coverage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_Coverage build() {
      checkRequiredAttributes();
      return new ImmutableInsurancePlan_Coverage(modifierExtension, createUnmodifiableList(true, benefit), type, network, extension, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_Coverage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build InsurancePlan_Coverage, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "InsurancePlan_Coverage", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link InsurancePlan_Coverage#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "InsurancePlan_Coverage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Adds one element to {@link InsurancePlan_Coverage#benefit() benefit} list.
     * @param element A benefit element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addBenefit(InsurancePlan_Benefit element);

    /**
     * Adds elements to {@link InsurancePlan_Coverage#benefit() benefit} list.
     * @param elements An array of benefit elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addBenefit(InsurancePlan_Benefit... elements);

    /**
     * Adds elements to {@link InsurancePlan_Coverage#benefit() benefit} list.
     * @param elements An iterable of benefit elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllBenefit(Iterable<? extends InsurancePlan_Benefit> elements);

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(List<Reference> network);

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(Optional<? extends List<Reference>> network);

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link InsurancePlan_Coverage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link InsurancePlan_Coverage InsurancePlan_Coverage}.
     * @return An immutable instance of InsurancePlan_Coverage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    InsurancePlan_Coverage build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
