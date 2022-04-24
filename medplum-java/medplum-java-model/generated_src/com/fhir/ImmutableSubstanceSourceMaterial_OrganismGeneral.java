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
 * Immutable implementation of {@link SubstanceSourceMaterial_OrganismGeneral}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial_OrganismGeneral.builder()}.
 */
@Generated(from = "SubstanceSourceMaterial_OrganismGeneral", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial_OrganismGeneral
    implements SubstanceSourceMaterial_OrganismGeneral {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept _class;
  private final @Nullable CodeableConcept order;
  private final @Nullable String id;
  private final @Nullable CodeableConcept phylum;
  private final @Nullable CodeableConcept kingdom;
  private final @Nullable List<Extension> extension;

  private ImmutableSubstanceSourceMaterial_OrganismGeneral(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept _class,
      @Nullable CodeableConcept order,
      @Nullable String id,
      @Nullable CodeableConcept phylum,
      @Nullable CodeableConcept kingdom,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this._class = _class;
    this.order = order;
    this.id = id;
    this.phylum = phylum;
    this.kingdom = kingdom;
    this.extension = extension;
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
   * @return The value of the {@code _class} attribute
   */
  @JsonProperty("class")
  @Override
  public Optional<CodeableConcept> _class() {
    return Optional.ofNullable(_class);
  }

  /**
   * @return The value of the {@code order} attribute
   */
  @JsonProperty("order")
  @Override
  public Optional<CodeableConcept> order() {
    return Optional.ofNullable(order);
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
   * @return The value of the {@code phylum} attribute
   */
  @JsonProperty("phylum")
  @Override
  public Optional<CodeableConcept> phylum() {
    return Optional.ofNullable(phylum);
  }

  /**
   * @return The value of the {@code kingdom} attribute
   */
  @JsonProperty("kingdom")
  @Override
  public Optional<CodeableConcept> kingdom() {
    return Optional.ofNullable(kingdom);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(newValue, this._class, this.order, this.id, this.phylum, this.kingdom, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_OrganismGeneral#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(value, this._class, this.order, this.id, this.phylum, this.kingdom, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#_class() _class} attribute.
   * @param value The value for _class
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral with_class(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "_class");
    if (this._class == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(
        this.modifierExtension,
        newValue,
        this.order,
        this.id,
        this.phylum,
        this.kingdom,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_OrganismGeneral#_class() _class} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _class
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral with_class(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this._class == value) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.modifierExtension, value, this.order, this.id, this.phylum, this.kingdom, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#order() order} attribute.
   * @param value The value for order
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withOrder(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "order");
    if (this.order == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(
        this.modifierExtension,
        this._class,
        newValue,
        this.id,
        this.phylum,
        this.kingdom,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_OrganismGeneral#order() order} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for order
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withOrder(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.order == value) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.modifierExtension, this._class, value, this.id, this.phylum, this.kingdom, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(
        this.modifierExtension,
        this._class,
        this.order,
        newValue,
        this.phylum,
        this.kingdom,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_OrganismGeneral#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(
        this.modifierExtension,
        this._class,
        this.order,
        value,
        this.phylum,
        this.kingdom,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#phylum() phylum} attribute.
   * @param value The value for phylum
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withPhylum(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "phylum");
    if (this.phylum == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(
        this.modifierExtension,
        this._class,
        this.order,
        this.id,
        newValue,
        this.kingdom,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_OrganismGeneral#phylum() phylum} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for phylum
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withPhylum(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.phylum == value) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.modifierExtension, this._class, this.order, this.id, value, this.kingdom, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#kingdom() kingdom} attribute.
   * @param value The value for kingdom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withKingdom(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "kingdom");
    if (this.kingdom == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.modifierExtension, this._class, this.order, this.id, this.phylum, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_OrganismGeneral#kingdom() kingdom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kingdom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withKingdom(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.kingdom == value) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.modifierExtension, this._class, this.order, this.id, this.phylum, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.modifierExtension, this._class, this.order, this.id, this.phylum, this.kingdom, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_OrganismGeneral#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.modifierExtension, this._class, this.order, this.id, this.phylum, this.kingdom, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial_OrganismGeneral} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial_OrganismGeneral
        && equalTo((ImmutableSubstanceSourceMaterial_OrganismGeneral) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial_OrganismGeneral another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(_class, another._class)
        && Objects.equals(order, another.order)
        && Objects.equals(id, another.id)
        && Objects.equals(phylum, another.phylum)
        && Objects.equals(kingdom, another.kingdom)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code _class}, {@code order}, {@code id}, {@code phylum}, {@code kingdom}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(_class);
    h += (h << 5) + Objects.hashCode(order);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(phylum);
    h += (h << 5) + Objects.hashCode(kingdom);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial_OrganismGeneral} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial_OrganismGeneral{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (_class != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("_class=").append(_class);
    }
    if (order != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("order=").append(order);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (phylum != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("phylum=").append(phylum);
    }
    if (kingdom != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("kingdom=").append(kingdom);
    }
    if (extension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSourceMaterial_OrganismGeneral", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSourceMaterial_OrganismGeneral {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> _class = Optional.empty();
    boolean _classIsSet;
    @Nullable Optional<CodeableConcept> order = Optional.empty();
    boolean orderIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> phylum = Optional.empty();
    boolean phylumIsSet;
    @Nullable Optional<CodeableConcept> kingdom = Optional.empty();
    boolean kingdomIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("class")
    public void set_class(Optional<CodeableConcept> _class) {
      this._class = _class;
      this._classIsSet = true;
    }
    @JsonProperty("order")
    public void setOrder(Optional<CodeableConcept> order) {
      this.order = order;
      this.orderIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("phylum")
    public void setPhylum(Optional<CodeableConcept> phylum) {
      this.phylum = phylum;
      this.phylumIsSet = true;
    }
    @JsonProperty("kingdom")
    public void setKingdom(Optional<CodeableConcept> kingdom) {
      this.kingdom = kingdom;
      this.kingdomIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> _class() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> order() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> phylum() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> kingdom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSourceMaterial_OrganismGeneral fromJson(Json json) {
    ImmutableSubstanceSourceMaterial_OrganismGeneral.Builder builder = ImmutableSubstanceSourceMaterial_OrganismGeneral.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json._classIsSet) {
      builder._class(json._class);
    }
    if (json.orderIsSet) {
      builder.order(json.order);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.phylumIsSet) {
      builder.phylum(json.phylum);
    }
    if (json.kingdomIsSet) {
      builder.kingdom(json.kingdom);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSubstanceSourceMaterial_OrganismGeneral) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial_OrganismGeneral} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial_OrganismGeneral instance
   */
  public static SubstanceSourceMaterial_OrganismGeneral copyOf(SubstanceSourceMaterial_OrganismGeneral instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial_OrganismGeneral) {
      return (ImmutableSubstanceSourceMaterial_OrganismGeneral) instance;
    }
    return ImmutableSubstanceSourceMaterial_OrganismGeneral.builder()
        .modifierExtension(instance.modifierExtension())
        ._class(instance._class())
        .order(instance.order())
        .id(instance.id())
        .phylum(instance.phylum())
        .kingdom(instance.kingdom())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial_OrganismGeneral SubstanceSourceMaterial_OrganismGeneral}.
   * <pre>
   * ImmutableSubstanceSourceMaterial_OrganismGeneral.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_OrganismGeneral#modifierExtension() modifierExtension}
   *    ._class(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#_class() _class}
   *    .order(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#order() order}
   *    .id(String) // optional {@link SubstanceSourceMaterial_OrganismGeneral#id() id}
   *    .phylum(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#phylum() phylum}
   *    .kingdom(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#kingdom() kingdom}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_OrganismGeneral#extension() extension}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial_OrganismGeneral builder
   */
  public static ImmutableSubstanceSourceMaterial_OrganismGeneral.Builder builder() {
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial_OrganismGeneral SubstanceSourceMaterial_OrganismGeneral}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSourceMaterial_OrganismGeneral", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT__CLASS = 0x2L;
    private static final long OPT_BIT_ORDER = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_PHYLUM = 0x10L;
    private static final long OPT_BIT_KINGDOM = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept _class;
    private @Nullable CodeableConcept order;
    private @Nullable String id;
    private @Nullable CodeableConcept phylum;
    private @Nullable CodeableConcept kingdom;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    public final Builder _class(CodeableConcept _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = Objects.requireNonNull(_class, "_class");
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("class")
    public final Builder _class(Optional<? extends CodeableConcept> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = _class.orElse(null);
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for chained invocation
     */
    public final Builder order(CodeableConcept order) {
      checkNotIsSet(orderIsSet(), "order");
      this.order = Objects.requireNonNull(order, "order");
      optBits |= OPT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("order")
    public final Builder order(Optional<? extends CodeableConcept> order) {
      checkNotIsSet(orderIsSet(), "order");
      this.order = order.orElse(null);
      optBits |= OPT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#phylum() phylum} to phylum.
     * @param phylum The value for phylum
     * @return {@code this} builder for chained invocation
     */
    public final Builder phylum(CodeableConcept phylum) {
      checkNotIsSet(phylumIsSet(), "phylum");
      this.phylum = Objects.requireNonNull(phylum, "phylum");
      optBits |= OPT_BIT_PHYLUM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#phylum() phylum} to phylum.
     * @param phylum The value for phylum
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("phylum")
    public final Builder phylum(Optional<? extends CodeableConcept> phylum) {
      checkNotIsSet(phylumIsSet(), "phylum");
      this.phylum = phylum.orElse(null);
      optBits |= OPT_BIT_PHYLUM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#kingdom() kingdom} to kingdom.
     * @param kingdom The value for kingdom
     * @return {@code this} builder for chained invocation
     */
    public final Builder kingdom(CodeableConcept kingdom) {
      checkNotIsSet(kingdomIsSet(), "kingdom");
      this.kingdom = Objects.requireNonNull(kingdom, "kingdom");
      optBits |= OPT_BIT_KINGDOM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#kingdom() kingdom} to kingdom.
     * @param kingdom The value for kingdom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kingdom")
    public final Builder kingdom(Optional<? extends CodeableConcept> kingdom) {
      checkNotIsSet(kingdomIsSet(), "kingdom");
      this.kingdom = kingdom.orElse(null);
      optBits |= OPT_BIT_KINGDOM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_OrganismGeneral#extension() extension} to extension.
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
     * Builds a new {@link SubstanceSourceMaterial_OrganismGeneral SubstanceSourceMaterial_OrganismGeneral}.
     * @return An immutable instance of SubstanceSourceMaterial_OrganismGeneral
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial_OrganismGeneral build() {
      return new ImmutableSubstanceSourceMaterial_OrganismGeneral(modifierExtension, _class, order, id, phylum, kingdom, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean _classIsSet() {
      return (optBits & OPT_BIT__CLASS) != 0;
    }

    private boolean orderIsSet() {
      return (optBits & OPT_BIT_ORDER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean phylumIsSet() {
      return (optBits & OPT_BIT_PHYLUM) != 0;
    }

    private boolean kingdomIsSet() {
      return (optBits & OPT_BIT_KINGDOM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial_OrganismGeneral is strict, attribute is already set: ".concat(name));
    }
  }
}
