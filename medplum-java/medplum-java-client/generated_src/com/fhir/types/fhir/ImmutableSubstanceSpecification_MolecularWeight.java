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
 * Immutable implementation of {@link SubstanceSpecification_MolecularWeight}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_MolecularWeight.builder()}.
 */
@Generated(from = "SubstanceSpecification_MolecularWeight", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_MolecularWeight
    implements SubstanceSpecification_MolecularWeight {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable CodeableConcept method;
  private final @Nullable Quantity amount;

  private ImmutableSubstanceSpecification_MolecularWeight(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept type,
      @Nullable String id,
      @Nullable CodeableConcept method,
      @Nullable Quantity amount) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.id = id;
    this.method = method;
    this.amount = amount;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<Quantity> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_MolecularWeight#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_MolecularWeight withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(newValue, this.modifierExtension, this.type, this.id, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_MolecularWeight#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_MolecularWeight withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(value, this.modifierExtension, this.type, this.id, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_MolecularWeight#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_MolecularWeight withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, newValue, this.type, this.id, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_MolecularWeight#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_MolecularWeight withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, value, this.type, this.id, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_MolecularWeight#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_MolecularWeight withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, newValue, this.id, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_MolecularWeight#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_MolecularWeight withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, value, this.id, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_MolecularWeight#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_MolecularWeight withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, this.type, newValue, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_MolecularWeight#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_MolecularWeight withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, this.type, value, this.method, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_MolecularWeight#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_MolecularWeight withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, this.type, this.id, newValue, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_MolecularWeight#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_MolecularWeight withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, this.type, this.id, value, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_MolecularWeight#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_MolecularWeight withAmount(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, this.type, this.id, this.method, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_MolecularWeight#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_MolecularWeight withAmount(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableSubstanceSpecification_MolecularWeight(this.extension, this.modifierExtension, this.type, this.id, this.method, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_MolecularWeight} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_MolecularWeight
        && equalTo((ImmutableSubstanceSpecification_MolecularWeight) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_MolecularWeight another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(method, another.method)
        && Objects.equals(amount, another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code type}, {@code id}, {@code method}, {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(amount);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_MolecularWeight} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_MolecularWeight{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (method != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (amount != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_MolecularWeight", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_MolecularWeight {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<Quantity> amount = Optional.empty();
    boolean amountIsSet;
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
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Optional<Quantity> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> amount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_MolecularWeight fromJson(Json json) {
    ImmutableSubstanceSpecification_MolecularWeight.Builder builder = ImmutableSubstanceSpecification_MolecularWeight.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    return (ImmutableSubstanceSpecification_MolecularWeight) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_MolecularWeight} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_MolecularWeight instance
   */
  public static SubstanceSpecification_MolecularWeight copyOf(SubstanceSpecification_MolecularWeight instance) {
    if (instance instanceof ImmutableSubstanceSpecification_MolecularWeight) {
      return (ImmutableSubstanceSpecification_MolecularWeight) instance;
    }
    return ImmutableSubstanceSpecification_MolecularWeight.builder()
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .id(instance.id())
        .method(instance.method())
        .amount(instance.amount())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_MolecularWeight SubstanceSpecification_MolecularWeight}.
   * <pre>
   * ImmutableSubstanceSpecification_MolecularWeight.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_MolecularWeight#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_MolecularWeight#modifierExtension() modifierExtension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_MolecularWeight#type() type}
   *    .id(String) // optional {@link SubstanceSpecification_MolecularWeight#id() id}
   *    .method(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_MolecularWeight#method() method}
   *    .amount(com.fhir.types.fhir.Quantity) // optional {@link SubstanceSpecification_MolecularWeight#amount() amount}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_MolecularWeight builder
   */
  public static ImmutableSubstanceSpecification_MolecularWeight.Builder builder() {
    return new ImmutableSubstanceSpecification_MolecularWeight.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_MolecularWeight SubstanceSpecification_MolecularWeight}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_MolecularWeight", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_METHOD = 0x10L;
    private static final long OPT_BIT_AMOUNT = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable CodeableConcept method;
    private @Nullable Quantity amount;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(Quantity amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_MolecularWeight#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends Quantity> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_MolecularWeight SubstanceSpecification_MolecularWeight}.
     * @return An immutable instance of SubstanceSpecification_MolecularWeight
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_MolecularWeight build() {
      return new ImmutableSubstanceSpecification_MolecularWeight(extension, modifierExtension, type, id, method, amount);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_MolecularWeight is strict, attribute is already set: ".concat(name));
    }
  }
}
