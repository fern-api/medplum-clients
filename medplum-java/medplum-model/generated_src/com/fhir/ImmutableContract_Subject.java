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
 * Immutable implementation of {@link Contract_Subject}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Subject.builder()}.
 */
@Generated(from = "Contract_Subject", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Subject implements Contract_Subject {
  private final @Nullable List<Extension> modifierExtension;
  private final List<Reference> reference;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept role;

  private ImmutableContract_Subject(
      @Nullable List<Extension> modifierExtension,
      List<Reference> reference,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable CodeableConcept role) {
    this.modifierExtension = modifierExtension;
    this.reference = reference;
    this.extension = extension;
    this.id = id;
    this.role = role;
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
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public List<Reference> reference() {
    return reference;
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
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<CodeableConcept> role() {
    return Optional.ofNullable(role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Subject#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Subject withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Subject(newValue, this.reference, this.extension, this.id, this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Subject#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Subject withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Subject(value, this.reference, this.extension, this.id, this.role);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Contract_Subject#reference() reference}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Subject withReference(Reference... elements) {
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableContract_Subject(this.modifierExtension, newValue, this.extension, this.id, this.role);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Contract_Subject#reference() reference}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of reference elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Subject withReference(Iterable<? extends Reference> elements) {
    if (this.reference == elements) return this;
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableContract_Subject(this.modifierExtension, newValue, this.extension, this.id, this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Subject#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Subject withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Subject(this.modifierExtension, this.reference, newValue, this.id, this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Subject#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Subject withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Subject(this.modifierExtension, this.reference, value, this.id, this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Subject#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Subject withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Subject(this.modifierExtension, this.reference, this.extension, newValue, this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Subject#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Subject withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Subject(this.modifierExtension, this.reference, this.extension, value, this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Subject#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Subject withRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableContract_Subject(this.modifierExtension, this.reference, this.extension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Subject#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Subject withRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableContract_Subject(this.modifierExtension, this.reference, this.extension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Subject} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Subject
        && equalTo((ImmutableContract_Subject) another);
  }

  private boolean equalTo(ImmutableContract_Subject another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && reference.equals(another.reference)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(role, another.role);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code reference}, {@code extension}, {@code id}, {@code role}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(role);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Subject} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Subject{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("reference=").append(reference);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (role != null) {
      builder.append(", ");
      builder.append("role=").append(role);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_Subject", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Subject {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable List<Reference> reference = Collections.emptyList();
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> role = Optional.empty();
    boolean roleIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(List<Reference> reference) {
      this.reference = reference;
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
    @JsonProperty("role")
    public void setRole(Optional<CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public List<Reference> reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> role() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract_Subject fromJson(Json json) {
    ImmutableContract_Subject.Builder builder = ImmutableContract_Subject.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.reference != null) {
      builder.addAllReference(json.reference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    return (ImmutableContract_Subject) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Subject} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Subject instance
   */
  public static Contract_Subject copyOf(Contract_Subject instance) {
    if (instance instanceof ImmutableContract_Subject) {
      return (ImmutableContract_Subject) instance;
    }
    return ImmutableContract_Subject.builder()
        .modifierExtension(instance.modifierExtension())
        .addAllReference(instance.reference())
        .extension(instance.extension())
        .id(instance.id())
        .role(instance.role())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Subject Contract_Subject}.
   * <pre>
   * ImmutableContract_Subject.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_Subject#modifierExtension() modifierExtension}
   *    .addReference|addAllReference(com.fhir.Reference) // {@link Contract_Subject#reference() reference} elements
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_Subject#extension() extension}
   *    .id(String) // optional {@link Contract_Subject#id() id}
   *    .role(com.fhir.CodeableConcept) // optional {@link Contract_Subject#role() role}
   *    .build();
   * </pre>
   * @return A new Contract_Subject builder
   */
  public static ImmutableContract_Subject.Builder builder() {
    return new ImmutableContract_Subject.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Subject Contract_Subject}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Subject", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_ROLE = 0x8L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private final List<Reference> reference = new ArrayList<Reference>();
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable CodeableConcept role;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Subject#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Subject#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link Contract_Subject#reference() reference} list.
     * @param element A reference element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addReference(Reference element) {
      this.reference.add(Objects.requireNonNull(element, "reference element"));
      return this;
    }

    /**
     * Adds elements to {@link Contract_Subject#reference() reference} list.
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
     * Adds elements to {@link Contract_Subject#reference() reference} list.
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
     * Initializes the optional value {@link Contract_Subject#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Subject#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Subject#id() id} to id.
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
     * Initializes the optional value {@link Contract_Subject#id() id} to id.
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
     * Initializes the optional value {@link Contract_Subject#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Subject#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Builds a new {@link Contract_Subject Contract_Subject}.
     * @return An immutable instance of Contract_Subject
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Subject build() {
      return new ImmutableContract_Subject(modifierExtension, createUnmodifiableList(true, reference), extension, id, role);
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

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Subject is strict, attribute is already set: ".concat(name));
    }
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
