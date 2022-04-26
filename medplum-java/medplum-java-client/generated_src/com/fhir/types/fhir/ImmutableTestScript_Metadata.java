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
 * Immutable implementation of {@link TestScript_Metadata}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Metadata.builder()}.
 */
@Generated(from = "TestScript_Metadata", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Metadata implements TestScript_Metadata {
  private final @Nullable List<TestScript_Link> link;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final List<TestScript_Capability> capability;
  private final @Nullable String id;

  private ImmutableTestScript_Metadata(
      @Nullable List<TestScript_Link> link,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      List<TestScript_Capability> capability,
      @Nullable String id) {
    this.link = link;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.capability = capability;
    this.id = id;
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<TestScript_Link>> link() {
    return Optional.ofNullable(link);
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
   * @return The value of the {@code capability} attribute
   */
  @JsonProperty("capability")
  @Override
  public List<TestScript_Capability> capability() {
    return capability;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Metadata#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Metadata withLink(List<TestScript_Link> value) {
    @Nullable List<TestScript_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableTestScript_Metadata(newValue, this.modifierExtension, this.extension, this.capability, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Metadata#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Metadata withLink(Optional<? extends List<TestScript_Link>> optional) {
    @Nullable List<TestScript_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableTestScript_Metadata(value, this.modifierExtension, this.extension, this.capability, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Metadata#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Metadata withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Metadata(this.link, newValue, this.extension, this.capability, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Metadata#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Metadata withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Metadata(this.link, value, this.extension, this.capability, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Metadata#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Metadata withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Metadata(this.link, this.modifierExtension, newValue, this.capability, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Metadata#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Metadata withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Metadata(this.link, this.modifierExtension, value, this.capability, this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestScript_Metadata#capability() capability}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Metadata withCapability(TestScript_Capability... elements) {
    List<TestScript_Capability> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTestScript_Metadata(this.link, this.modifierExtension, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestScript_Metadata#capability() capability}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of capability elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Metadata withCapability(Iterable<? extends TestScript_Capability> elements) {
    if (this.capability == elements) return this;
    List<TestScript_Capability> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTestScript_Metadata(this.link, this.modifierExtension, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Metadata#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Metadata withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Metadata(this.link, this.modifierExtension, this.extension, this.capability, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Metadata#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Metadata withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Metadata(this.link, this.modifierExtension, this.extension, this.capability, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Metadata} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Metadata
        && equalTo((ImmutableTestScript_Metadata) another);
  }

  private boolean equalTo(ImmutableTestScript_Metadata another) {
    return Objects.equals(link, another.link)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && capability.equals(another.capability)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code link}, {@code modifierExtension}, {@code extension}, {@code capability}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + capability.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Metadata} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Metadata{");
    if (link != null) {
      builder.append("link=").append(link);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("capability=").append(capability);
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
  @Generated(from = "TestScript_Metadata", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Metadata {
    @Nullable Optional<List<TestScript_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable List<TestScript_Capability> capability = Collections.emptyList();
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("link")
    public void setLink(Optional<List<TestScript_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
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
    @JsonProperty("capability")
    public void setCapability(List<TestScript_Capability> capability) {
      this.capability = capability;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<TestScript_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public List<TestScript_Capability> capability() { throw new UnsupportedOperationException(); }
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
  static ImmutableTestScript_Metadata fromJson(Json json) {
    ImmutableTestScript_Metadata.Builder builder = ImmutableTestScript_Metadata.builder();
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.capability != null) {
      builder.addAllCapability(json.capability);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableTestScript_Metadata) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Metadata} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Metadata instance
   */
  public static TestScript_Metadata copyOf(TestScript_Metadata instance) {
    if (instance instanceof ImmutableTestScript_Metadata) {
      return (ImmutableTestScript_Metadata) instance;
    }
    return ImmutableTestScript_Metadata.builder()
        .link(instance.link())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .addAllCapability(instance.capability())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Metadata TestScript_Metadata}.
   * <pre>
   * ImmutableTestScript_Metadata.builder()
   *    .link(List&amp;lt;com.fhir.types.fhir.TestScript_Link&amp;gt;) // optional {@link TestScript_Metadata#link() link}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Metadata#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Metadata#extension() extension}
   *    .addCapability|addAllCapability(com.fhir.types.fhir.TestScript_Capability) // {@link TestScript_Metadata#capability() capability} elements
   *    .id(String) // optional {@link TestScript_Metadata#id() id}
   *    .build();
   * </pre>
   * @return A new TestScript_Metadata builder
   */
  public static ImmutableTestScript_Metadata.Builder builder() {
    return new ImmutableTestScript_Metadata.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Metadata TestScript_Metadata}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_Metadata", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LINK = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long optBits;

    private @Nullable List<TestScript_Link> link;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private final List<TestScript_Capability> capability = new ArrayList<TestScript_Capability>();
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Metadata#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<TestScript_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Metadata#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<TestScript_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Metadata#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Metadata#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Metadata#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Metadata#extension() extension} to extension.
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
     * Adds one element to {@link TestScript_Metadata#capability() capability} list.
     * @param element A capability element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCapability(TestScript_Capability element) {
      this.capability.add(Objects.requireNonNull(element, "capability element"));
      return this;
    }

    /**
     * Adds elements to {@link TestScript_Metadata#capability() capability} list.
     * @param elements An array of capability elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCapability(TestScript_Capability... elements) {
      for (TestScript_Capability element : elements) {
        this.capability.add(Objects.requireNonNull(element, "capability element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link TestScript_Metadata#capability() capability} list.
     * @param elements An iterable of capability elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCapability(Iterable<? extends TestScript_Capability> elements) {
      for (TestScript_Capability element : elements) {
        this.capability.add(Objects.requireNonNull(element, "capability element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Metadata#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Metadata#id() id} to id.
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
     * Builds a new {@link TestScript_Metadata TestScript_Metadata}.
     * @return An immutable instance of TestScript_Metadata
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Metadata build() {
      return new ImmutableTestScript_Metadata(link, modifierExtension, extension, createUnmodifiableList(true, capability), id);
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
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

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Metadata is strict, attribute is already set: ".concat(name));
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
