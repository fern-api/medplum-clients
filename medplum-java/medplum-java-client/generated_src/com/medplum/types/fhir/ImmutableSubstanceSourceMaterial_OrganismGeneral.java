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
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept kingdom;
  private final @Nullable CodeableConcept phylum;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept _class;
  private final @Nullable CodeableConcept order;

  private ImmutableSubstanceSourceMaterial_OrganismGeneral(
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept kingdom,
      @Nullable CodeableConcept phylum,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable CodeableConcept _class,
      @Nullable CodeableConcept order) {
    this.extension = extension;
    this.kingdom = kingdom;
    this.phylum = phylum;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this._class = _class;
    this.order = order;
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
   * @return The value of the {@code kingdom} attribute
   */
  @JsonProperty("kingdom")
  @Override
  public Optional<CodeableConcept> kingdom() {
    return Optional.ofNullable(kingdom);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(newValue, this.kingdom, this.phylum, this.modifierExtension, this.id, this._class, this.order);
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
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(value, this.kingdom, this.phylum, this.modifierExtension, this.id, this._class, this.order);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#kingdom() kingdom} attribute.
   * @param value The value for kingdom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withKingdom(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "kingdom");
    if (this.kingdom == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.extension, newValue, this.phylum, this.modifierExtension, this.id, this._class, this.order);
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
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.extension, value, this.phylum, this.modifierExtension, this.id, this._class, this.order);
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
        this.extension,
        this.kingdom,
        newValue,
        this.modifierExtension,
        this.id,
        this._class,
        this.order);
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
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.extension, this.kingdom, value, this.modifierExtension, this.id, this._class, this.order);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_OrganismGeneral#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_OrganismGeneral withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.extension, this.kingdom, this.phylum, newValue, this.id, this._class, this.order);
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
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.extension, this.kingdom, this.phylum, value, this.id, this._class, this.order);
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
        this.extension,
        this.kingdom,
        this.phylum,
        this.modifierExtension,
        newValue,
        this._class,
        this.order);
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
        this.extension,
        this.kingdom,
        this.phylum,
        this.modifierExtension,
        value,
        this._class,
        this.order);
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
        this.extension,
        this.kingdom,
        this.phylum,
        this.modifierExtension,
        this.id,
        newValue,
        this.order);
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
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.extension, this.kingdom, this.phylum, this.modifierExtension, this.id, value, this.order);
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
        this.extension,
        this.kingdom,
        this.phylum,
        this.modifierExtension,
        this.id,
        this._class,
        newValue);
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
    return new ImmutableSubstanceSourceMaterial_OrganismGeneral(this.extension, this.kingdom, this.phylum, this.modifierExtension, this.id, this._class, value);
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
    return Objects.equals(extension, another.extension)
        && Objects.equals(kingdom, another.kingdom)
        && Objects.equals(phylum, another.phylum)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(_class, another._class)
        && Objects.equals(order, another.order);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code kingdom}, {@code phylum}, {@code modifierExtension}, {@code id}, {@code _class}, {@code order}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(kingdom);
    h += (h << 5) + Objects.hashCode(phylum);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(_class);
    h += (h << 5) + Objects.hashCode(order);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial_OrganismGeneral} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial_OrganismGeneral{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (kingdom != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("kingdom=").append(kingdom);
    }
    if (phylum != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("phylum=").append(phylum);
    }
    if (modifierExtension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (_class != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("_class=").append(_class);
    }
    if (order != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("order=").append(order);
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
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> kingdom = Optional.empty();
    boolean kingdomIsSet;
    @Nullable Optional<CodeableConcept> phylum = Optional.empty();
    boolean phylumIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> _class = Optional.empty();
    boolean _classIsSet;
    @Nullable Optional<CodeableConcept> order = Optional.empty();
    boolean orderIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("kingdom")
    public void setKingdom(Optional<CodeableConcept> kingdom) {
      this.kingdom = kingdom;
      this.kingdomIsSet = true;
    }
    @JsonProperty("phylum")
    public void setPhylum(Optional<CodeableConcept> phylum) {
      this.phylum = phylum;
      this.phylumIsSet = true;
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
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> kingdom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> phylum() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> _class() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> order() { throw new UnsupportedOperationException(); }
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
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.kingdomIsSet) {
      builder.kingdom(json.kingdom);
    }
    if (json.phylumIsSet) {
      builder.phylum(json.phylum);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json._classIsSet) {
      builder._class(json._class);
    }
    if (json.orderIsSet) {
      builder.order(json.order);
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
        .extension(instance.extension())
        .kingdom(instance.kingdom())
        .phylum(instance.phylum())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        ._class(instance._class())
        .order(instance.order())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial_OrganismGeneral SubstanceSourceMaterial_OrganismGeneral}.
   * <pre>
   * ImmutableSubstanceSourceMaterial_OrganismGeneral.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_OrganismGeneral#extension() extension}
   *    .kingdom(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#kingdom() kingdom}
   *    .phylum(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#phylum() phylum}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_OrganismGeneral#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link SubstanceSourceMaterial_OrganismGeneral#id() id}
   *    ._class(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#_class() _class}
   *    .order(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_OrganismGeneral#order() order}
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
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_KINGDOM = 0x2L;
    private static final long OPT_BIT_PHYLUM = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT__CLASS = 0x20L;
    private static final long OPT_BIT_ORDER = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept kingdom;
    private @Nullable CodeableConcept phylum;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept _class;
    private @Nullable CodeableConcept order;

    private Builder() {
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
     * Builds a new {@link SubstanceSourceMaterial_OrganismGeneral SubstanceSourceMaterial_OrganismGeneral}.
     * @return An immutable instance of SubstanceSourceMaterial_OrganismGeneral
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial_OrganismGeneral build() {
      return new ImmutableSubstanceSourceMaterial_OrganismGeneral(extension, kingdom, phylum, modifierExtension, id, _class, order);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean kingdomIsSet() {
      return (optBits & OPT_BIT_KINGDOM) != 0;
    }

    private boolean phylumIsSet() {
      return (optBits & OPT_BIT_PHYLUM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean _classIsSet() {
      return (optBits & OPT_BIT__CLASS) != 0;
    }

    private boolean orderIsSet() {
      return (optBits & OPT_BIT_ORDER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial_OrganismGeneral is strict, attribute is already set: ".concat(name));
    }
  }
}
