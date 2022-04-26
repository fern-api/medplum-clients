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
 * Immutable implementation of {@link StructureDefinition_Differential}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureDefinition_Differential.builder()}.
 */
@Generated(from = "StructureDefinition_Differential", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureDefinition_Differential
    implements StructureDefinition_Differential {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final List<ElementDefinition> element;

  private ImmutableStructureDefinition_Differential(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      List<ElementDefinition> element) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.element = element;
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
   * @return The value of the {@code element} attribute
   */
  @JsonProperty("element")
  @Override
  public List<ElementDefinition> element() {
    return element;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Differential#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Differential withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureDefinition_Differential(newValue, this.modifierExtension, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Differential#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Differential withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureDefinition_Differential(value, this.modifierExtension, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Differential#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Differential withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureDefinition_Differential(this.id, newValue, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Differential#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Differential withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureDefinition_Differential(this.id, value, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Differential#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Differential withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureDefinition_Differential(this.id, this.modifierExtension, newValue, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Differential#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Differential withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureDefinition_Differential(this.id, this.modifierExtension, value, this.element);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureDefinition_Differential#element() element}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Differential withElement(ElementDefinition... elements) {
    List<ElementDefinition> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableStructureDefinition_Differential(this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureDefinition_Differential#element() element}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of element elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Differential withElement(Iterable<? extends ElementDefinition> elements) {
    if (this.element == elements) return this;
    List<ElementDefinition> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureDefinition_Differential(this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureDefinition_Differential} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureDefinition_Differential
        && equalTo((ImmutableStructureDefinition_Differential) another);
  }

  private boolean equalTo(ImmutableStructureDefinition_Differential another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && element.equals(another.element);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code extension}, {@code element}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + element.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code StructureDefinition_Differential} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureDefinition_Differential{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 33) builder.append(", ");
    builder.append("element=").append(element);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureDefinition_Differential", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureDefinition_Differential {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable List<ElementDefinition> element = Collections.emptyList();
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
    @JsonProperty("element")
    public void setElement(List<ElementDefinition> element) {
      this.element = element;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public List<ElementDefinition> element() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureDefinition_Differential fromJson(Json json) {
    ImmutableStructureDefinition_Differential.Builder builder = ImmutableStructureDefinition_Differential.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.element != null) {
      builder.addAllElement(json.element);
    }
    return (ImmutableStructureDefinition_Differential) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureDefinition_Differential} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureDefinition_Differential instance
   */
  public static StructureDefinition_Differential copyOf(StructureDefinition_Differential instance) {
    if (instance instanceof ImmutableStructureDefinition_Differential) {
      return (ImmutableStructureDefinition_Differential) instance;
    }
    return ImmutableStructureDefinition_Differential.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .addAllElement(instance.element())
        .build();
  }

  /**
   * Creates a builder for {@link StructureDefinition_Differential StructureDefinition_Differential}.
   * <pre>
   * ImmutableStructureDefinition_Differential.builder()
   *    .id(String) // optional {@link StructureDefinition_Differential#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition_Differential#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition_Differential#extension() extension}
   *    .addElement|addAllElement(com.fhir.types.fhir.ElementDefinition) // {@link StructureDefinition_Differential#element() element} elements
   *    .build();
   * </pre>
   * @return A new StructureDefinition_Differential builder
   */
  public static ImmutableStructureDefinition_Differential.Builder builder() {
    return new ImmutableStructureDefinition_Differential.Builder();
  }

  /**
   * Builds instances of type {@link StructureDefinition_Differential StructureDefinition_Differential}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureDefinition_Differential", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private final List<ElementDefinition> element = new ArrayList<ElementDefinition>();

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Differential#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition_Differential#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition_Differential#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition_Differential#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition_Differential#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition_Differential#extension() extension} to extension.
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
     * Adds one element to {@link StructureDefinition_Differential#element() element} list.
     * @param element A element element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addElement(ElementDefinition element) {
      this.element.add(Objects.requireNonNull(element, "element element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureDefinition_Differential#element() element} list.
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
     * Adds elements to {@link StructureDefinition_Differential#element() element} list.
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
     * Builds a new {@link StructureDefinition_Differential StructureDefinition_Differential}.
     * @return An immutable instance of StructureDefinition_Differential
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureDefinition_Differential build() {
      return new ImmutableStructureDefinition_Differential(id, modifierExtension, extension, createUnmodifiableList(true, element));
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

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureDefinition_Differential is strict, attribute is already set: ".concat(name));
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
