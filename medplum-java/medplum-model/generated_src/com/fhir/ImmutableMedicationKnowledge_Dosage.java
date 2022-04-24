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
 * Immutable implementation of {@link MedicationKnowledge_Dosage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_Dosage.builder()}.
 */
@Generated(from = "MedicationKnowledge_Dosage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_Dosage implements MedicationKnowledge_Dosage {
  private final CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final List<Dosage> dosage;

  private ImmutableMedicationKnowledge_Dosage(
      CodeableConcept type,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      List<Dosage> dosage) {
    this.type = type;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.dosage = dosage;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code dosage} attribute
   */
  @JsonProperty("dosage")
  @Override
  public List<Dosage> dosage() {
    return dosage;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationKnowledge_Dosage#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationKnowledge_Dosage withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableMedicationKnowledge_Dosage(newValue, this.id, this.modifierExtension, this.extension, this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Dosage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Dosage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_Dosage(this.type, newValue, this.modifierExtension, this.extension, this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Dosage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Dosage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_Dosage(this.type, value, this.modifierExtension, this.extension, this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Dosage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Dosage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_Dosage(this.type, this.id, newValue, this.extension, this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Dosage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Dosage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_Dosage(this.type, this.id, value, this.extension, this.dosage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Dosage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Dosage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_Dosage(this.type, this.id, this.modifierExtension, newValue, this.dosage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Dosage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Dosage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_Dosage(this.type, this.id, this.modifierExtension, value, this.dosage);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicationKnowledge_Dosage#dosage() dosage}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Dosage withDosage(Dosage... elements) {
    List<Dosage> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMedicationKnowledge_Dosage(this.type, this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicationKnowledge_Dosage#dosage() dosage}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of dosage elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Dosage withDosage(Iterable<? extends Dosage> elements) {
    if (this.dosage == elements) return this;
    List<Dosage> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMedicationKnowledge_Dosage(this.type, this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_Dosage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_Dosage
        && equalTo((ImmutableMedicationKnowledge_Dosage) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_Dosage another) {
    return type.equals(another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && dosage.equals(another.dosage);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code id}, {@code modifierExtension}, {@code extension}, {@code dosage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + dosage.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_Dosage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_Dosage{");
    builder.append("type=").append(type);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("dosage=").append(dosage);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_Dosage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_Dosage {
    @Nullable CodeableConcept type;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable List<Dosage> dosage = Collections.emptyList();
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("dosage")
    public void setDosage(List<Dosage> dosage) {
      this.dosage = dosage;
    }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public List<Dosage> dosage() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_Dosage fromJson(Json json) {
    ImmutableMedicationKnowledge_Dosage.Builder builder = ((ImmutableMedicationKnowledge_Dosage.Builder) ImmutableMedicationKnowledge_Dosage.builder());
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dosage != null) {
      builder.addAllDosage(json.dosage);
    }
    return (ImmutableMedicationKnowledge_Dosage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_Dosage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_Dosage instance
   */
  public static MedicationKnowledge_Dosage copyOf(MedicationKnowledge_Dosage instance) {
    if (instance instanceof ImmutableMedicationKnowledge_Dosage) {
      return (ImmutableMedicationKnowledge_Dosage) instance;
    }
    return ((ImmutableMedicationKnowledge_Dosage.Builder) ImmutableMedicationKnowledge_Dosage.builder())
        .type(instance.type())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .addAllDosage(instance.dosage())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_Dosage MedicationKnowledge_Dosage}.
   * <pre>
   * ImmutableMedicationKnowledge_Dosage.builder()
   *    .type(com.fhir.CodeableConcept) // required {@link MedicationKnowledge_Dosage#type() type}
   *    .id(String) // optional {@link MedicationKnowledge_Dosage#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Dosage#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Dosage#extension() extension}
   *    .addDosage|addAllDosage(com.fhir.Dosage) // {@link MedicationKnowledge_Dosage#dosage() dosage} elements
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_Dosage builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableMedicationKnowledge_Dosage.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_Dosage MedicationKnowledge_Dosage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_Dosage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private final List<Dosage> dosage = new ArrayList<Dosage>();

    private Builder() {
    }

    /**
     * Initializes the value for the {@link MedicationKnowledge_Dosage#type() type} attribute.
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
     * Initializes the optional value {@link MedicationKnowledge_Dosage#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Dosage#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Dosage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Dosage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Dosage#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Dosage#extension() extension} to extension.
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
     * Adds one element to {@link MedicationKnowledge_Dosage#dosage() dosage} list.
     * @param element A dosage element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDosage(Dosage element) {
      this.dosage.add(Objects.requireNonNull(element, "dosage element"));
      return this;
    }

    /**
     * Adds elements to {@link MedicationKnowledge_Dosage#dosage() dosage} list.
     * @param elements An array of dosage elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDosage(Dosage... elements) {
      for (Dosage element : elements) {
        this.dosage.add(Objects.requireNonNull(element, "dosage element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link MedicationKnowledge_Dosage#dosage() dosage} list.
     * @param elements An iterable of dosage elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDosage(Iterable<? extends Dosage> elements) {
      for (Dosage element : elements) {
        this.dosage.add(Objects.requireNonNull(element, "dosage element"));
      }
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge_Dosage MedicationKnowledge_Dosage}.
     * @return An immutable instance of MedicationKnowledge_Dosage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_Dosage build() {
      checkRequiredAttributes();
      return new ImmutableMedicationKnowledge_Dosage(type, id, modifierExtension, extension, createUnmodifiableList(true, dosage));
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_Dosage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build MedicationKnowledge_Dosage, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationKnowledge_Dosage", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationKnowledge_Dosage#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "MedicationKnowledge_Dosage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationKnowledge_Dosage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Dosage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Dosage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Dosage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Dosage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Dosage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Adds one element to {@link MedicationKnowledge_Dosage#dosage() dosage} list.
     * @param element A dosage element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addDosage(Dosage element);

    /**
     * Adds elements to {@link MedicationKnowledge_Dosage#dosage() dosage} list.
     * @param elements An array of dosage elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addDosage(Dosage... elements);

    /**
     * Adds elements to {@link MedicationKnowledge_Dosage#dosage() dosage} list.
     * @param elements An iterable of dosage elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllDosage(Iterable<? extends Dosage> elements);

    /**
     * Builds a new {@link MedicationKnowledge_Dosage MedicationKnowledge_Dosage}.
     * @return An immutable instance of MedicationKnowledge_Dosage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationKnowledge_Dosage build();
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
