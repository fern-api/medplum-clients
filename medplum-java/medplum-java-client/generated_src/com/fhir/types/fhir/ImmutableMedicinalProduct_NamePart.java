package com.fhir.types.fhir;

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
 * Immutable implementation of {@link MedicinalProduct_NamePart}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct_NamePart.builder()}.
 */
@Generated(from = "MedicinalProduct_NamePart", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct_NamePart implements MedicinalProduct_NamePart {
  private final @Nullable List<Extension> extension;
  private final @Nullable String part;
  private final @Nullable String id;
  private final Coding type;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedicinalProduct_NamePart(
      @Nullable List<Extension> extension,
      @Nullable String part,
      @Nullable String id,
      Coding type,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.part = part;
    this.id = id;
    this.type = type;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code part} attribute
   */
  @JsonProperty("part")
  @Override
  public Optional<String> part() {
    return Optional.ofNullable(part);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Coding type() {
    return type;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_NamePart#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_NamePart withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct_NamePart(newValue, this.part, this.id, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_NamePart#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_NamePart withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct_NamePart(value, this.part, this.id, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_NamePart#part() part} attribute.
   * @param value The value for part
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_NamePart withPart(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "part");
    if (Objects.equals(this.part, newValue)) return this;
    return new ImmutableMedicinalProduct_NamePart(this.extension, newValue, this.id, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_NamePart#part() part} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for part
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_NamePart withPart(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.part, value)) return this;
    return new ImmutableMedicinalProduct_NamePart(this.extension, value, this.id, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_NamePart#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_NamePart withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProduct_NamePart(this.extension, this.part, newValue, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_NamePart#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_NamePart withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProduct_NamePart(this.extension, this.part, value, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProduct_NamePart#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProduct_NamePart withType(Coding value) {
    if (this.type == value) return this;
    Coding newValue = Objects.requireNonNull(value, "type");
    return new ImmutableMedicinalProduct_NamePart(this.extension, this.part, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_NamePart#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_NamePart withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct_NamePart(this.extension, this.part, this.id, this.type, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_NamePart#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_NamePart withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct_NamePart(this.extension, this.part, this.id, this.type, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct_NamePart} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct_NamePart
        && equalTo((ImmutableMedicinalProduct_NamePart) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct_NamePart another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(part, another.part)
        && Objects.equals(id, another.id)
        && type.equals(another.type)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code part}, {@code id}, {@code type}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(part);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct_NamePart} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProduct_NamePart{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (part != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("part=").append(part);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 26) builder.append(", ");
    builder.append("type=").append(type);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProduct_NamePart", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProduct_NamePart {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> part = Optional.empty();
    boolean partIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Coding type;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("part")
    public void setPart(Optional<String> part) {
      this.part = part;
      this.partIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Coding type) {
      this.type = type;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> part() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Coding type() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProduct_NamePart fromJson(Json json) {
    ImmutableMedicinalProduct_NamePart.Builder builder = ((ImmutableMedicinalProduct_NamePart.Builder) ImmutableMedicinalProduct_NamePart.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.partIsSet) {
      builder.part(json.part);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicinalProduct_NamePart) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProduct_NamePart} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProduct_NamePart instance
   */
  public static MedicinalProduct_NamePart copyOf(MedicinalProduct_NamePart instance) {
    if (instance instanceof ImmutableMedicinalProduct_NamePart) {
      return (ImmutableMedicinalProduct_NamePart) instance;
    }
    return ((ImmutableMedicinalProduct_NamePart.Builder) ImmutableMedicinalProduct_NamePart.builder())
        .extension(instance.extension())
        .part(instance.part())
        .id(instance.id())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct_NamePart MedicinalProduct_NamePart}.
   * <pre>
   * ImmutableMedicinalProduct_NamePart.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_NamePart#extension() extension}
   *    .part(String) // optional {@link MedicinalProduct_NamePart#part() part}
   *    .id(String) // optional {@link MedicinalProduct_NamePart#id() id}
   *    .type(com.fhir.types.fhir.Coding) // required {@link MedicinalProduct_NamePart#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_NamePart#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicinalProduct_NamePart builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableMedicinalProduct_NamePart.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProduct_NamePart MedicinalProduct_NamePart}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProduct_NamePart", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_PART = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String part;
    private @Nullable String id;
    private @Nullable Coding type;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_NamePart#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_NamePart#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for chained invocation
     */
    public final Builder part(String part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = Objects.requireNonNull(part, "part");
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("part")
    public final Builder part(Optional<String> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = part.orElse(null);
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_NamePart#id() id} to id.
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
     * Initializes the value for the {@link MedicinalProduct_NamePart#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_NamePart#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MedicinalProduct_NamePart MedicinalProduct_NamePart}.
     * @return An immutable instance of MedicinalProduct_NamePart
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProduct_NamePart build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProduct_NamePart(extension, part, id, type, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean partIsSet() {
      return (optBits & OPT_BIT_PART) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProduct_NamePart is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build MedicinalProduct_NamePart, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProduct_NamePart", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProduct_NamePart#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Coding type);
  }

  @Generated(from = "MedicinalProduct_NamePart", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for chained invocation
     */
    BuildFinal part(String part);

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal part(Optional<String> part);

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProduct_NamePart#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicinalProduct_NamePart MedicinalProduct_NamePart}.
     * @return An immutable instance of MedicinalProduct_NamePart
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProduct_NamePart build();
  }
}
