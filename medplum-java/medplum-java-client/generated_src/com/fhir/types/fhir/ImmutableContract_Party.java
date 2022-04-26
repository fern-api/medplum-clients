package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Contract_Party}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Party.builder()}.
 */
@Generated(from = "Contract_Party", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Party implements Contract_Party {
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final List<Reference> reference;
  private final CodeableConcept role;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableContract_Party(
      @Nullable List<Extension> extension,
      @Nullable String id,
      List<Reference> reference,
      CodeableConcept role,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.id = id;
    this.reference = reference;
    this.role = role;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public List<Reference> reference() {
    return reference;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public CodeableConcept role() {
    return role;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Party#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Party withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Party(newValue, this.id, this.reference, this.role, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Party#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Party withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Party(value, this.id, this.reference, this.role, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Party#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Party withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Party(this.extension, newValue, this.reference, this.role, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Party#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Party withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Party(this.extension, value, this.reference, this.role, this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Contract_Party#reference() reference}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Party withReference(Reference... elements) {
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableContract_Party(this.extension, this.id, newValue, this.role, this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Contract_Party#reference() reference}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of reference elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Party withReference(Iterable<? extends Reference> elements) {
    if (this.reference == elements) return this;
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableContract_Party(this.extension, this.id, newValue, this.role, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Party#role() role} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Party withRole(CodeableConcept value) {
    if (this.role == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "role");
    return new ImmutableContract_Party(this.extension, this.id, this.reference, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Party#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Party withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Party(this.extension, this.id, this.reference, this.role, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Party#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Party withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Party(this.extension, this.id, this.reference, this.role, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Party} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Party
        && equalTo((ImmutableContract_Party) another);
  }

  private boolean equalTo(ImmutableContract_Party another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && reference.equals(another.reference)
        && role.equals(another.role)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code reference}, {@code role}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + role.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Party} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Party{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("reference=").append(reference);
    builder.append(", ");
    builder.append("role=").append(role);
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
  @Generated(from = "Contract_Party", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Party {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable List<Reference> reference = Collections.emptyList();
    @Nullable CodeableConcept role;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("reference")
    public void setReference(List<Reference> reference) {
      this.reference = reference;
    }
    @JsonProperty("role")
    public void setRole(CodeableConcept role) {
      this.role = role;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public List<Reference> reference() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept role() { throw new UnsupportedOperationException(); }
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
  static ImmutableContract_Party fromJson(Json json) {
    ImmutableContract_Party.Builder builder = ((ImmutableContract_Party.Builder) ImmutableContract_Party.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.reference != null) {
      builder.addAllReference(json.reference);
    }
    if (json.role != null) {
      builder.role(json.role);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableContract_Party) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Party} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Party instance
   */
  public static Contract_Party copyOf(Contract_Party instance) {
    if (instance instanceof ImmutableContract_Party) {
      return (ImmutableContract_Party) instance;
    }
    return ((ImmutableContract_Party.Builder) ImmutableContract_Party.builder())
        .extension(instance.extension())
        .id(instance.id())
        .addAllReference(instance.reference())
        .role(instance.role())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Party Contract_Party}.
   * <pre>
   * ImmutableContract_Party.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Party#extension() extension}
   *    .id(String) // optional {@link Contract_Party#id() id}
   *    .addReference|addAllReference(com.fhir.types.fhir.Reference) // {@link Contract_Party#reference() reference} elements
   *    .role(com.fhir.types.fhir.CodeableConcept) // required {@link Contract_Party#role() role}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Party#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Contract_Party builder
   */
  public static RoleBuildStage builder() {
    return new ImmutableContract_Party.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Party Contract_Party}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Party", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements RoleBuildStage, BuildFinal {
    private static final long INIT_BIT_ROLE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private final List<Reference> reference = new ArrayList<Reference>();
    private @Nullable CodeableConcept role;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Party#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Party#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Party#id() id} to id.
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
     * Initializes the optional value {@link Contract_Party#id() id} to id.
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
     * Adds one element to {@link Contract_Party#reference() reference} list.
     * @param element A reference element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addReference(Reference element) {
      this.reference.add(Objects.requireNonNull(element, "reference element"));
      return this;
    }

    /**
     * Adds elements to {@link Contract_Party#reference() reference} list.
     * @param elements An array of reference elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addReference(Reference... elements) {
      for (Reference element : elements) {
        this.reference.add(Objects.requireNonNull(element, "reference element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Contract_Party#reference() reference} list.
     * @param elements An iterable of reference elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllReference(Iterable<? extends Reference> elements) {
      for (Reference element : elements) {
        this.reference.add(Objects.requireNonNull(element, "reference element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Contract_Party#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Party#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Party#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Contract_Party Contract_Party}.
     * @return An immutable instance of Contract_Party
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Party build() {
      checkRequiredAttributes();
      return new ImmutableContract_Party(extension, id, createUnmodifiableList(true, reference), role, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean roleIsSet() {
      return (initBits & INIT_BIT_ROLE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Party is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!roleIsSet()) attributes.add("role");
      return "Cannot build Contract_Party, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Contract_Party", generator = "Immutables")
  public interface RoleBuildStage {
    /**
     * Initializes the value for the {@link Contract_Party#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(CodeableConcept role);
  }

  @Generated(from = "Contract_Party", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract_Party#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Contract_Party#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Contract_Party#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Contract_Party#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Adds one element to {@link Contract_Party#reference() reference} list.
     * @param element A reference element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addReference(Reference element);

    /**
     * Adds elements to {@link Contract_Party#reference() reference} list.
     * @param elements An array of reference elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addReference(Reference... elements);

    /**
     * Adds elements to {@link Contract_Party#reference() reference} list.
     * @param elements An iterable of reference elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllReference(Iterable<? extends Reference> elements);

    /**
     * Initializes the optional value {@link Contract_Party#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Party#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Contract_Party Contract_Party}.
     * @return An immutable instance of Contract_Party
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract_Party build();
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
