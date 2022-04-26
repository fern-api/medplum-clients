package com.medplum.types.fhir;

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
 * Immutable implementation of {@link StructureDefinition_Snapshot}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureDefinition_Snapshot.builder()}.
 */
@Generated(from = "StructureDefinition_Snapshot", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureDefinition_Snapshot
    implements StructureDefinition_Snapshot {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final List<ElementDefinition> element;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableStructureDefinition_Snapshot(
      @Nullable String id,
      @Nullable List<Extension> extension,
      List<ElementDefinition> element,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.extension = extension;
    this.element = element;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code element} attribute
   */
  @JsonProperty("element")
  @Override
  public List<ElementDefinition> element() {
    return element;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Snapshot#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Snapshot withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureDefinition_Snapshot(newValue, this.extension, this.element, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Snapshot#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Snapshot withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureDefinition_Snapshot(value, this.extension, this.element, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Snapshot#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Snapshot withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureDefinition_Snapshot(this.id, newValue, this.element, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Snapshot#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Snapshot withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureDefinition_Snapshot(this.id, value, this.element, this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureDefinition_Snapshot#element() element}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Snapshot withElement(ElementDefinition... elements) {
    List<ElementDefinition> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableStructureDefinition_Snapshot(this.id, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureDefinition_Snapshot#element() element}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of element elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Snapshot withElement(Iterable<? extends ElementDefinition> elements) {
    if (this.element == elements) return this;
    List<ElementDefinition> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureDefinition_Snapshot(this.id, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Snapshot#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Snapshot withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureDefinition_Snapshot(this.id, this.extension, this.element, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Snapshot#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Snapshot withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureDefinition_Snapshot(this.id, this.extension, this.element, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureDefinition_Snapshot} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureDefinition_Snapshot
        && equalTo((ImmutableStructureDefinition_Snapshot) another);
  }

  private boolean equalTo(ImmutableStructureDefinition_Snapshot another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && element.equals(another.element)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code element}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + element.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureDefinition_Snapshot} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureDefinition_Snapshot{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("element=").append(element);
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
  @Generated(from = "StructureDefinition_Snapshot", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureDefinition_Snapshot {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable List<ElementDefinition> element = Collections.emptyList();
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("element")
    public void setElement(List<ElementDefinition> element) {
      this.element = element;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public List<ElementDefinition> element() { throw new UnsupportedOperationException(); }
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
  static ImmutableStructureDefinition_Snapshot fromJson(Json json) {
    ImmutableStructureDefinition_Snapshot.Builder builder = ImmutableStructureDefinition_Snapshot.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.element != null) {
      builder.addAllElement(json.element);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableStructureDefinition_Snapshot) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureDefinition_Snapshot} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureDefinition_Snapshot instance
   */
  public static StructureDefinition_Snapshot copyOf(StructureDefinition_Snapshot instance) {
    if (instance instanceof ImmutableStructureDefinition_Snapshot) {
      return (ImmutableStructureDefinition_Snapshot) instance;
    }
    return ImmutableStructureDefinition_Snapshot.builder()
        .id(instance.id())
        .extension(instance.extension())
        .addAllElement(instance.element())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link StructureDefinition_Snapshot StructureDefinition_Snapshot}.
   * <pre>
   * ImmutableStructureDefinition_Snapshot.builder()
   *    .id(String) // optional {@link StructureDefinition_Snapshot#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition_Snapshot#extension() extension}
   *    .addElement|addAllElement(com.medplum.types.fhir.ElementDefinition) // {@link StructureDefinition_Snapshot#element() element} elements
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition_Snapshot#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new StructureDefinition_Snapshot builder
   */
  public static ImmutableStructureDefinition_Snapshot.Builder builder() {
    return new ImmutableStructureDefinition_Snapshot.Builder();
  }

  /**
   * Builds instances of type {@link StructureDefinition_Snapshot StructureDefinition_Snapshot}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureDefinition_Snapshot", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private final List<ElementDefinition> element = new ArrayList<ElementDefinition>();
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Snapshot#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition_Snapshot#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition_Snapshot#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition_Snapshot#extension() extension} to extension.
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
     * Adds one element to {@link StructureDefinition_Snapshot#element() element} list.
     * @param element A element element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addElement(ElementDefinition element) {
      this.element.add(Objects.requireNonNull(element, "element element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureDefinition_Snapshot#element() element} list.
     * @param elements An array of element elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addElement(ElementDefinition... elements) {
      for (ElementDefinition element : elements) {
        this.element.add(Objects.requireNonNull(element, "element element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureDefinition_Snapshot#element() element} list.
     * @param elements An iterable of element elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllElement(Iterable<? extends ElementDefinition> elements) {
      for (ElementDefinition element : elements) {
        this.element.add(Objects.requireNonNull(element, "element element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Snapshot#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition_Snapshot#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link StructureDefinition_Snapshot StructureDefinition_Snapshot}.
     * @return An immutable instance of StructureDefinition_Snapshot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureDefinition_Snapshot build() {
      return new ImmutableStructureDefinition_Snapshot(id, extension, createUnmodifiableList(true, element), modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureDefinition_Snapshot is strict, attribute is already set: ".concat(name));
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
